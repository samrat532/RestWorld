package com.college.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.college.pojo.StudentAddress;
import com.college.pojo.StudentPerInfo;
import com.college.utils.DBUtils;

//import com.mysql.jdbc.PreparedStatement;

@Path("getAllStudentsInfo")
public class StudentResource {
	StudentPerInfo studentPerInfo = null;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<StudentPerInfo> getStudentPersonnelInfo() {
		System.out.println("into getStudentPersonnelInfo get");

		DBUtils dbutil = new DBUtils();

		List<StudentPerInfo> StudentPerInfoList = new ArrayList<>();
		Connection con = dbutil.getDBConnection();
		try {
			PreparedStatement pstmt = con
					.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				studentPerInfo = new StudentPerInfo();
				studentPerInfo.setFullName(rs.getString(2));
				studentPerInfo.setFatherName(rs.getString(3));
				studentPerInfo.setMotherName(rs.getString(4));
				studentPerInfo.setMobileNumber(rs.getString(5));
				studentPerInfo.setState(rs.getString(7));
				studentPerInfo.setCity(rs.getString(8));
				StudentPerInfoList.add(studentPerInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return StudentPerInfoList;
	}

	@GET
	@Path("getById/{studentId}")
	@Produces({ MediaType.APPLICATION_JSON })
	public StudentPerInfo getStudentInfo(
			@PathParam("studentId") String studentId) {
		System.out
				.println("into getStudentPersonnelInfo getBY ID:" + studentId);
		DBUtils dbutil = new DBUtils();

		List<StudentPerInfo> StudentPerInfoList = new ArrayList<>();
		Connection con = dbutil.getDBConnection();
		try {
			PreparedStatement pstmt = con
					.prepareStatement("select * from student where stundentid="
							+ studentId);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				studentPerInfo = new StudentPerInfo();
				studentPerInfo.setFullName(rs.getString(2));
				studentPerInfo.setFatherName(rs.getString(3));
				studentPerInfo.setMotherName(rs.getString(4));
				studentPerInfo.setMobileNumber(rs.getString(5));
				studentPerInfo.setState(rs.getString(7));
				studentPerInfo.setCity(rs.getString(8));
				StudentPerInfoList.add(studentPerInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return studentPerInfo;
	}

}

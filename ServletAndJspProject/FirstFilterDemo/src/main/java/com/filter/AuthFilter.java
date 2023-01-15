package com.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.dbconfig.ConnectionProvider;


public class AuthFilter implements Filter {
	
	public Connection conn = null;

	public void init(FilterConfig filterConfig) throws ServletException {
		conn = ConnectionProvider.getConnection();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//response.getWriter().println("Welcome to Auth Filter");
		
		String username = request.getParameter("username");
		System.out.println(username);
		
		String password = request.getParameter("password");
		System.out.println(password);
		
		
		try {
			PreparedStatement ps =conn.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				chain.doFilter(request, response);
			}
			else {
				response.getWriter().println("User not Valid !!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void destroy() {

	}

}

package com.cg.migrationapp.dao;

import java.sql.Connection;




import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import com.cg.migrationapp.exception.MovieException;

//import oracle.ucp.jdbc.PoolDataSource;
//import oracle.ucp.jdbc.PoolDataSourceFactory;


public class DBUtil {
	
	static Connection conn;
    static  DataSource ds=null;
	public static Connection getConnection() throws MovieException {
		try {
		     Context ctx = new InitialContext();
			 Context envContext = (Context)ctx.lookup("java:comp/env");
			 ds=(DataSource)envContext.lookup ("jdbc/myapp");
			 System.out.println("get connection");
			 conn = ds.getConnection();
			 System.out.println(conn);
			} catch (NamingException e) {
			  throw new MovieException("Error while creating datascource::"
											+ e.getMessage());
			} catch (SQLException e) {
			throw new MovieException("Error while obtaining connection::"
											+ e.getMessage());
			}
		System.out.println(conn);
		return conn;
	}
}

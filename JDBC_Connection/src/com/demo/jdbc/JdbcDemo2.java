package com.demo.jdbc;

import java.sql.*;

public class JdbcDemo2 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/training";
		String userName="root";
		String pwd="root@1234";
//		load the register(mysql jdbc driver)
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			jvm is trying to load the jdbc class during the run time
//			if jar file is not found it will be getting error
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println("my sql driver not found");
			e.printStackTrace();
			return ;
		}
		try(Connection con=DriverManager.getConnection(url,userName,pwd);
//				getConnection is a interface  class
				Statement st=con.createStatement()){
			String user="create table users1(id int Auto_increment primary key,name varchar(100),number int)";
			st.executeUpdate(user);
			System.out.println("Table users1 is created at mysql ");
			String val="insert into users1(name,number) values(?,?)";
//			To add multiple parameters
			try(PreparedStatement ps=con.prepareStatement(val)){
//				prepared statement is a inbuilt statement in a interface class
				ps.setString(1,"omkareswar");
				ps.setInt(2, 7673);
				ps.addBatch();
				int[] arr=ps.executeBatch();
//				All the rows inserted into the database at a single batch
				System.out.printf("inserted rows %d %n",(int)java.util.stream.IntStream.of(arr).filter(c-> c>0).count());
				
				
			}
			String query="select * from users1";
			try(ResultSet rs=st.executeQuery(query)){
				while (rs.next()) {
//					int id=rs.getInt(1);
					String name=rs.getString(2);
					int number=rs.getInt(3);
					System.out.println(" Name: "+name+" number :"+number);
					
				}
				
			}
			
		}
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Data operation failed");
			e.printStackTrace();
		}
		

	}

}

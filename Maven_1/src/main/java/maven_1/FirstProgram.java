package maven_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstProgram 
{
	public static <Statment> void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur id");
		int id=sc.nextInt();
		System.out.println("enter ur name");
		String name=sc.next();
		System.out.println("enter ur course");
		String course=sc.next();
		System.out.println("enter ur phone");
		long phone=sc.nextLong();
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Maven_1?createDatabaseIfNotExist=true","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("create table if not exists student(student_id int primary key,name varchar(45),course varchar(45),phone bigint)");
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, course);
		ps.setLong(4, phone);
		
		if(ps.executeUpdate()>0)
		{
			System.out.println("DATA STORED SUCCESSFULLY");
		}
	}

}

package com.SpringBootPractice.SpringBootPrac;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMicroServices {
	private static final List List = null;
	@RequestMapping("print")
	public String check() {
		return chick();
	}
	@RequestMapping("display")
	public  String chick() {
		return "Hiii how";
	}
	@RequestMapping("chat")
	public  ArrayList<String> chicken() {
		ArrayList<String> a = new ArrayList<>();
		a.add("hii");
		a.add("Hello");
		a.add("Edhuku da  reply panala");
		return a;
	}
	@RequestMapping("loki/{name}")
	public  String chicks(@PathVariable String name) {
		if("loke".equals(name)) {
			return "kowsi";
		}
		return "loke";
	}
	@RequestMapping("jak")
	public  String checkchicks(@RequestBody String name) {
		if("loke".equals(name)) {
			return "kowsi";
		}
		return "loke";
	}
	@RequestMapping("clerk")
	public ArrayList<Clerk> arr(int id,String name,String work){
		ArrayList<Clerk> aa = new ArrayList<>();
		aa.add(new Clerk(id,name,work));
		return aa;
	}
	@RequestMapping("jdbc")
	public ArrayList<Clerk> str() throws ClassNotFoundException, SQLException {
		ArrayList<Clerk> clr = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","1234");
		Statement s = con.createStatement();
		String query = "select * from clerk;";
		ResultSet rs = s.executeQuery(query);
		while(rs.next()) {
		clr.addAll(arr(rs.getInt(1) ,rs.getString(2),rs.getString(3)));
		}	
		s.close();
		con.close();
		return clr;
	}
	@RequestMapping("welcome")
	public String welcome() throws Exception {
		String p = "C:\\Users\\Finzly\\csv\\Sample100.csv";
		String l = null;
		ArrayList abc = new ArrayList();
		BufferedReader bb = new BufferedReader(new FileReader(p));
		while ((l = bb.readLine())!=null) {
			
		}
	return "success";
	}
	
	
	
	
	
	
}

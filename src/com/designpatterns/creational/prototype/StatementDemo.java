package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class StatementDemo {

	public static void main(String[] args) {
		String sql = "Select * from movies where title='7'";
		List<String> parameters = new ArrayList<>();
		parameters.add("Star wars");
		 int record = 1;
		 Statement firstStatement  = new Statement(sql, parameters, record);
		 System.out.println(firstStatement.getSql());
		 System.out.println(firstStatement.getParameters());
		 System.out.println(firstStatement.getRecord());
		 Statement secondStatement  =  firstStatement.clone();
		 System.out.println(secondStatement.getSql());
		 System.out.println(secondStatement.getParameters());
		 System.out.println(secondStatement.getRecord());
	}

}

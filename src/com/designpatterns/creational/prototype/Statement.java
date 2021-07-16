package com.designpatterns.creational.prototype;

import java.util.List;

public class Statement implements Cloneable{
	private String sql;
	private List<String> parameters;
	private int record;
	
	public Statement(String sql, List<String> parameters, int record) {
		super();
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}
	
	public Statement clone() {
		try {
			return (Statement)super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return  null;
		}
	
	public List<String> getParameters(){
		return parameters;
	}

	public String getSql() {
		return sql;
	}


	public int getRecord() {
		return record;
	}

	
}



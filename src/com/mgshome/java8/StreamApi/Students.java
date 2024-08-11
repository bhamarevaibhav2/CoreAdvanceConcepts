package com.mgshome.java8.StreamApi;

public class Students {

	int stid;
	String name;

	public Students(int stid, String name) {
		super();
		this.stid = stid;
		this.name = name;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [stid=" + stid + ", name=" + name + "]";
	}

}

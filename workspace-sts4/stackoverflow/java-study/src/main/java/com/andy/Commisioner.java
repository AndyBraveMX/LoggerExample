package com.andy;

public class Commisioner implements Salesman {
	
	private int daysWorked;

	public Commisioner(int daysWorked) {
		super();
		this.daysWorked = daysWorked;
	}

	@Override
	public double calculateSalary() {
		return daysWorked * 200;
	}
	

}

package com.andy;

public class Commisioner implements Salesman {
	
	private int daysWorked;

	public Commisioner(int daysWorked) {
		super();
		this.daysWorked = daysWorked;
	}

	@Override
	public double calculateSalary() {
		double earn = daysWorked * 200;
		double tax = earn * .16;
		return earn - tax;
	}
	

}

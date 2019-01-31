package com.andy;

public class FeeRate implements Salesman{

	@Override
	public double calculateSalary() {
		double earn = 30 * 200;
		double tax = earn * .1;
		return earn - tax;
	}

}

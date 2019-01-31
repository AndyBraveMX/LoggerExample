package com.andy;

public class FeeRate implements Salesman{

	@Override
	public double calculateSalary() {
		return 300 * 1.1;
	}

}

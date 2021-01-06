package org.employee.domain;

public class PartTimeEmployee extends Employee {

	private int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay*workDay;
	}
	
	@Override
	public String toString() {
		return "PartTimeEmployee [workDay=" + workDay + "]";
	}

}

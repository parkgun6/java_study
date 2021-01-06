package org.employee.domain;

public class TempEmployee extends Employee {

	private int hireYear;


	public TempEmployee(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		return pay/(double)12;
	}
	
	@Override
	public String toString() {
		return "TempEmployee [hireYear=" + hireYear + "]";
	}
}

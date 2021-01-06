package org.employee.domain;

public abstract class Employee {
	
	protected String empno;//사번
	
	protected String name;//이름
	
	protected int pay;//급여
	
	public abstract double getMonthPay();//한달급여
	
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public String getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", pay=" + pay + "]";
	}
	
}

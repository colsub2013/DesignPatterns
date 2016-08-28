package generics.stackOverflow;

import java.util.Date;

public class Class1 extends GeneralClass {
	private int fieldint;
	private Date fieldDate;
	
	public Class1() {
		super();
	}

	public Class1(int fieldint, Date fieldDate) {
		super();
		this.fieldint = fieldint;
		this.fieldDate = fieldDate;
	}

	public int getFieldint() {
		return fieldint;
	}

	public void setFieldint(int fieldint) {
		this.fieldint = fieldint;
	}

	public Date getFieldDate() {
		return fieldDate;
	}

	public void setFieldDate(Date fieldDate) {
		this.fieldDate = fieldDate;
	}
	
	public void print() {
		System.out.println("Method Printed Class1 ... ");
	} 

}

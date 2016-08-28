package generics.stackOverflow;

import java.math.BigDecimal;

public class Class2 extends GeneralClass {
	private BigDecimal fieldBigDecimal;
	private char[] fieldChar;
	
	public Class2() {
		super();
	}
	
	public Class2(BigDecimal fieldBigDecimal, char[] fieldChar) {
		super();
		this.fieldBigDecimal = fieldBigDecimal;
		this.fieldChar = fieldChar;
	}

	public BigDecimal getFieldBigDecimal() {
		return fieldBigDecimal;
	}

	public void setFieldBigDecimal(BigDecimal fieldBigDecimal) {
		this.fieldBigDecimal = fieldBigDecimal;
	}

	public char[] getFieldChar() {
		return fieldChar;
	}

	public void setFieldChar(char[] fieldChar) {
		this.fieldChar = fieldChar;
	}

	public void print() {
		System.out.println("Method Printed Class2 ... ");
	} 

}

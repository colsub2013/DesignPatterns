package generics.stackOverflow;

import java.math.BigInteger;

public class Class3 extends GeneralClass {
	private BigInteger fieldBigInteger;
	private byte fieldbyte;

	public Class3() {
		super();
	}

	public Class3(BigInteger fieldBigInteger, byte fieldbyte) {
		super();
		this.fieldBigInteger = fieldBigInteger;
		this.fieldbyte = fieldbyte;
	}

	public BigInteger getFieldBigInteger() {
		return fieldBigInteger;
	}

	public void setFieldBigInteger(BigInteger fieldBigInteger) {
		this.fieldBigInteger = fieldBigInteger;
	}

	public byte getFieldbyte() {
		return fieldbyte;
	}

	public void setFieldbyte(byte fieldbyte) {
		this.fieldbyte = fieldbyte;
	}

	public void print() {
		System.out.println("Method Printed Class3 ... ");
	} 

}

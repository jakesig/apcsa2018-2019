public class ComplexNumber {
	private double real;
	private double imaginary;
	public ComplexNumber() {
		setReal(0);
		setImaginary(0);
	}
	
	public ComplexNumber(double real, double imaginary) {
		this.setReal(real);
		this.setImaginary(imaginary);
	}
	
	public ComplexNumber add(ComplexNumber other) {
		double realVal = getReal() + other.getReal();
		double imagVal = getImaginary() + other.getImaginary();
		return new ComplexNumber(realVal, imagVal);
	}
	
	public ComplexNumber multiply(ComplexNumber other) {
		double realVal = getReal()*other.getReal();
		double imagVal = getImaginary()*other.getImaginary();
		return new ComplexNumber(realVal, imagVal);
	}
	
	@Override public String toString() {
		String toReturn = ""+getReal()+" + "+getImaginary()+"i";
		if (getImaginary()<0)
			toReturn = ""+getReal()+" - "+(-1*getImaginary())+"i";
		return toReturn;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}
}

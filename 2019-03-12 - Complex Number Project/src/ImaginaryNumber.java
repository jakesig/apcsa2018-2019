public class ImaginaryNumber extends ComplexNumber {
	public ImaginaryNumber(double n) {
		super(0, n);
	}
	
	@Override public String toString() {
		return ""+getImaginary()+"i";
	}
	
	/*@Override public ComplexNumber add(ComplexNumber other) {
		if (other instanceof RealNumber)
			return new ComplexNumber(other.getReal(), getImaginary());
		return new ImaginaryNumber(other.getImaginary()+getImaginary());
	}*/
	
	public ComplexNumber add(RealNumber other) {
		return new ComplexNumber(other.getReal(), getImaginary());
	}
	
	public ImaginaryNumber add(ImaginaryNumber other) {
		return new ImaginaryNumber(other.getImaginary()+getImaginary());
	}
	

	/*@Override public ComplexNumber multiply(ComplexNumber other) {
		if (other instanceof RealNumber)
			return new ImaginaryNumber(getReal()*other.getImaginary());
		if (other instanceof ComplexNumber)
			return new ComplexNumber((getImaginary()*other.getImaginary()*-1), (getImaginary()*other.getReal()));
		return new RealNumber(other.getReal()*getReal()*-1);
	}*/
	
	public RealNumber multiply(ImaginaryNumber other) {
		return new RealNumber(getImaginary()*other.getImaginary()*-1);
	}
	
	public ComplexNumber multiply(ComplexNumber other) {
		return new ComplexNumber((getImaginary()*other.getImaginary()*-1), (getImaginary()*other.getReal()));
	}
	
	public ImaginaryNumber multiply(RealNumber other) {
		return new ImaginaryNumber(getReal()*other.getImaginary());
	}
	
}

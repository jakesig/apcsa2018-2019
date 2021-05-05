public class RealNumber extends ComplexNumber{
	public RealNumber(double n) {
		super(n, 0);
	}
	
	@Override public String toString() {
		return ""+getReal();
	}
	
	/*@Override public ComplexNumber add(ComplexNumber other) {
		if (other instanceof ImaginaryNumber)
			return new ComplexNumber(getReal(), other.getImaginary());
		return new RealNumber(other.getReal()+getReal());
	}*/
	
	public ComplexNumber add(ImaginaryNumber other) {
		return new ComplexNumber(getReal(), other.getImaginary());
	}
	
	public RealNumber add(RealNumber other) {
		return new RealNumber(other.getReal()+getReal());
	}
	
	/*@Override public ComplexNumber multiply(ComplexNumber other) {
		if (other instanceof ImaginaryNumber)
			return new ImaginaryNumber(getReal()*other.getImaginary());
		return new RealNumber(other.getReal()*getReal());
	}*/
	
	public ImaginaryNumber multiply(ImaginaryNumber other) {
		return new ImaginaryNumber(getReal()*other.getImaginary());
	}
	
	public RealNumber multiply(RealNumber other) {
		return new RealNumber(other.getReal()*getReal());
	}
	
	
}

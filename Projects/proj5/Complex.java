public class Complex extends Number implements Cloneable, Comparable<Complex> {
    double res = 0;
    double imag = 0;

    Complex(double res, double imag) {
        this.res = res;
        this.imag = imag;
    }

    Complex(double res) {
        this.res = res;
        this.imag = 0;
    }

    Complex() {
        this.imag = 0;
        this.res = 0;
    }

    // Gets the real part
    public double getRealPart() {
        return res;
    }

    // Gets the imaginary part
    public double getImaginaryPart() {
        return imag;
    }

    // add method
    public Complex add(Complex com1) {
        return new Complex(res + com1.res, imag + com1.imag);
    }

    // Subtract Method
    public Complex subtract(Complex com1) {
        return new Complex(res - com1.res, imag - com1.imag);
    }

    // Multiply Method
    public Complex Multiply(Complex com1) {
        return new Complex(res * com1.res, imag * com1.imag);
    }

    // Divide Method
    public Complex divide(Complex com1) {
        return new Complex((res * com1.res + imag * com1.imag) / (Math.pow(com1.res, 2) + Math.pow(com1.imag, 2)),
                (imag * com1.res - res * com1.imag) / (Math.pow(com1.res, 2) + Math.pow(com1.imag, 2)));
    }

    // abs Method
    public double abs() {
        return Math.sqrt(Math.pow(res, 2) + Math.pow(imag, 2));
    }

    // toString Override
    @Override
    public String toString() {
        // JA: What about when imag is 0?
        return imag == 0 ? res + "" : res + " + " + imag + "i";
    }

    @Override
    public int compareTo(Complex o) {
        if (this.getRealPart() + this.getImaginaryPart() == o.getRealPart() + o.getImaginaryPart())
            return 0;
        else if (this.getRealPart() + this.getImaginaryPart() > o.getRealPart() + o.getImaginaryPart())
            return 1;
        else
            return -1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Complex) super.clone();
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return abs();
    }

}
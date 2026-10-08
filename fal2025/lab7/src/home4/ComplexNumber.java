package home4;

public class ComplexNumber extends RealNumber{
    public double imaginaryValue;

    public ComplexNumber(){
        super(1.0);
        imaginaryValue= 1.0;
    }

    public ComplexNumber(Double real , double ime){
        super(real);
        this.imaginaryValue= ime;
    }

    public String details(){
        return getReal()+ "\nImaginaryPart: " + this.imaginaryValue;
    }
}

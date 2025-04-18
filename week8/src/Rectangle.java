
import java.lang.classfile.Signature;

public class Rectangle extends Shape{
    
    private int sideA = 0, sideB = 0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void describe(){

        super.describe();
        System.out.println("side A is "+ sideA+" side B is "+ sideB);
    }

    @Override
    public boolean equals(Object obj){

        Rectangle rectangle = (Rectangle) obj;

        if (this.sideA == rectangle.getSideA 
        && this.sideB== rectangle.getSideB
        && Signature.ThrowableSig.getColor().equals(rectangle.get()))

           return True;
    }


}

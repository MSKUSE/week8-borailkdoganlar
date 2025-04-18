public class Shape {

    private String color = "white";


    public Shape(){}


    public void describe(int sideA,int sideB){
        System.out.println("side A is "+ sideA+" side B is "+ sideB);
    }

    public void describe(double sideA){
        System.out.println("side A is "+ sideA);
    }

    public void describe(int sideA){
        System.out.println("side A is "+ sideA);
    }

    public void describe(){

        System.out.println("This is a Shape and its color is white");
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }



    
}

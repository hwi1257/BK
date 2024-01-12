package Class;

class Rectangle{
    double height;

    double width;
    // 필드 값.

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // 초기화


    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateArea(){
        return width*height;
    }

    public double calculatePerimeter(){
        return (width+height)*2;
    }

}

public class MainProgram {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0,3.0);
        System.out.println("너비: " + rectangle.getWidth());
        System.out.println("높이: " + rectangle.getHeight());
        System.out.println("넓이: " + rectangle.calculateArea());
        System.out.println("둘레: " + rectangle.calculatePerimeter());

        rectangle.setWidth(4.0);
        rectangle.setHeight(6.0);

        System.out.println("너비: " + rectangle.getWidth());
        System.out.println("높이: " + rectangle.getHeight());
        System.out.println("넓이: " + rectangle.calculateArea());
        System.out.println("둘레: " + rectangle.calculatePerimeter());

    }
}

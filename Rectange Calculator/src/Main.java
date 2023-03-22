import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.getData();
        rectangleArea.computeField();
        rectangleArea.fieldDisplay();
    }
}

class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = scanner.nextDouble();
        System.out.println("Enter width: ");
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}

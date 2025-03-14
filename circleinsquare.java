import java.util.*;

public class circleinsquare {
    public static void main(String[] args) {
        System.out.print("Enter side of Square: ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();  
        double radius = side/2;
        double areaofcircle = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the Circle inside the Square is " +areaofcircle);
        sc.close();
    }

}

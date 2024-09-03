import java.util.Scanner; // To read an input, include the scanner class

class Cylinder { // Declare the class name
    // Declare variables for radius, height, and area
    double radius;
    double height;
    double area;

    // Method to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();
    }

    // Method to compute the area of the cylinder
    public void area() {
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}

class CylinderVol extends Cylinder {
    double volume;

    // Method to compute the volume of the cylinder
    public void volume() {
        volume = Math.PI * radius * radius * height;
    }

    // Method to display the results
    public void display() {
        System.out.printf("Area of the cylinder: %.2f%n", area);
        System.out.printf("Volume of the cylinder: %.2f%n", volume);
    }
}

public class Main { // Declare the public class name
    public static void main(String[] args) {
        // Create an instance of CylinderVol
        CylinderVol cylinder = new CylinderVol();

        // Get input, calculate area and volume, and display results
        cylinder.getInput();
        cylinder.area();
        cylinder.volume();
        cylinder.display();
    }
}

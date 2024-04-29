import java.util.Scanner;

public class week2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Program to check whether a person can cast a vote or not
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String voteStatus = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";
        System.out.println(voteStatus);

        // 2. Program to calculate Simple Interest
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the interest rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        // 3. Program to calculate area of triangle, and volume of cube and cuboid
        System.out.print("Enter the length of the triangle's base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = (base * height) / 2;
        System.out.println("Area of the Triangle: " + triangleArea);

        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();
        double cubeVolume = side * side * side;
        System.out.println("Volume of the Cube: " + cubeVolume);

        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();
        double cuboidVolume = length * width * heightCuboid;
        System.out.println("Volume of the Cuboid: " + cuboidVolume);

        // 5. Program to take two integer inputs from the user and print the sum and product of them
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // 6. Take two integer inputs from the user, calculate the sum and product, and then calculate the division
        int sum2 = num1 + num2;
        int product2 = num1 * num2;
        double divisionResult = (double) sum2 / product2;
        System.out.println("Division Result: " + divisionResult);

        // 7. Take the name, roll number, and field of interest from the user and print in a specific format
        scanner.nextLine(); // consume the remaining newline character
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character
        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + fieldOfInterest);

        // 8. Take side of a square from user and print area and perimeter of it
        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        double squareArea = squareSide * squareSide;
        double squarePerimeter = 4 * squareSide;
        System.out.println("Area of the Square: " + squareArea);
        System.out.println("Perimeter of the Square: " + squarePerimeter);
        
        // Calculate Simple Interest, Area of Triangle and Volume of Cube and Cuboid
        double simpleInterest2 = (principal * rate * time) / 100;
        double triangleArea2 = (base * height) / 2;
        double cubeVolume2 = side * side * side;
        double cuboidVolume2 = length * width * heightCuboid;
        
        System.out.println("Simple Interest: " + simpleInterest2);
        System.out.println("Area of the Triangle: " + triangleArea2);
        System.out.println("Volume of the Cube: " + cubeVolume2);
        System.out.println("Volume of the Cuboid: " + cuboidVolume2);
        
        // 9. Ask the user to give two doubleinputs for the length and breadth of a rectangle and print the area type-casted to int
        System.out.print("Enter the length of the rectangle: ");
        double lengthRectangle = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadthRectangle = scanner.nextDouble();

        double areaRectangle = lengthRectangle * breadthRectangle;
        int areaInt = (int) areaRectangle;
        System.out.println("Area of the Rectangle (Type-casted to int): " + areaInt);

        // 10. Program to calculate the total marks of four subjects of a student and the total percentage secured
        System.out.print("Enter the marks obtained in subject 1: ");
        double marks1 = scanner.nextDouble();
        System.out.print("Enter the marks obtained in subject 2: ");
        double marks2 = scanner.nextDouble();
        System.out.print("Enter the marks obtained in subject 3: ");
        double marks3 = scanner.nextDouble();
        System.out.print("Enter the marks obtained in subject 4: ");
        double marks4 = scanner.nextDouble();

        double totalMarks = marks1 + marks2 + marks3 + marks4;
        double percentage = (totalMarks / 400) * 100;

        String result = (percentage >= 70) ? "First Class" :
                        (percentage >= 60) ? "Upper Second Class" :
                        (percentage >= 50) ? "Second Class" :
                        (percentage >= 40) ? "Third Class" : "Fail";

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        int numOfNums;
        System.out.println("Enter a positive integer for 3 random integers: ");
        numOfNums = scan.nextInt();
        printRandom3(numOfNums);

        
        double x1,x2,y1,y2;
        System.out.print("Calculating the slope of the next numbers:\ny2 = ");
        y2 = scan.nextDouble();
        System.out.print("\ny1 = ");
        y1 = scan.nextDouble();
        System.out.print("\nx2 = ");
        x2 = scan.nextDouble();
        System.out.print("\nx1 = ");
        x1 = scan.nextDouble();
        System.out.println("Your slope is: " + calcSlope(x1,x2,y1,y2));


        double num1,num2;
        System.out.print("Calculating distance of two numberss:\nnum1 = ");
        num1 = scan.nextDouble();
        System.out.print("\nnum2 = ");
        num2 = scan.nextDouble();
        System.out.println("Your rounded distance is " + roundedDist(num1, num2));


    }
    
    public static void printRandom3(int num)
    {
        System.out.println("Random Numbers: ");
        System.out.println((int) (Math.random()* (num + 1) + 2));
        System.out.println((int) (Math.random()* (num + 1) + 2));
        System.out.println((int) (Math.random()* (num + 1) + 2));
        
    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        // Do problem 2 here; replace code below
        double m = (y2-y1)/(x2-x1);


        return m;
    }
    
    public static int roundedDist(double a, double b)
    {
        int dist = (int)(Math.abs(a-b) + 0.5);
        return dist;
    }
}

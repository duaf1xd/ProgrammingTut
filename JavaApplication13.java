package javaapplication13;
import java.util.Scanner;
public class JavaApplication13 {
    public static void main(String[] args) {
        Scanner cyka= new Scanner(System.in);
        System.out.println("Enter a number");
        double input= cyka.nextDouble();
        double x=1, prevx, res;
        do
        {
            prevx= x;
            x= (x+ (input/x))/2;
        }
        while (x-prevx!=0);
        System.out.println("Square root of "+ input + " is " + x);
    }
}

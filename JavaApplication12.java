package javaapplication12;
import java.util.Scanner;
public class JavaApplication12 {
    public static void main(String[] args) {
        Scanner cyka= new Scanner(System.in);
        System.out.println("Please enter the password you wish to be evaluated");
        String password= cyka.nextLine();
        int strength= 0;
        boolean upper= false, lower= false, digit= false, symbol= false;
        if (password.length()>=8 && password.length()<=12)
        {
            strength+=1;
        }
        else if (password.length()>12)
        {
            strength+=2;
        }
        for (int i=0; i< password.length(); ++i) // uppercase checker
        {
            if (password.charAt(i)>= 'A' && password.charAt(i)<= 'Z')
            {
                upper= true;
                continue;
            }
            else if (password.charAt(i)>= 'a' && password.charAt(i)<= 'z')
            {
                lower= true;
                continue;
            }
            else if (password.charAt(i)>= '0' && password.charAt(i)<= '9')
            {
                digit= true;
                continue;
            }
            else
            {
                symbol= true;
            }
        }
        if (upper == true)
        {
            strength+=1;
        }
        if (lower == true)
        {
            strength+=1;
        }
        if (digit == true)
        {
            strength+=1;
        }
        if (symbol == true)
        {
            strength+=1;
        }
        if (strength<=2)
        {
            System.out.println("Your password strength: " + strength+ " (weak)");
        }
        else if (strength <=4)
        {
            System.out.println("Your password strength: " + strength+ " (medium)");
        }
        else
        {
            System.out.println("Your password strength: " + strength+ " (strong). Make sure you do not forget it.");
        }
    }
}

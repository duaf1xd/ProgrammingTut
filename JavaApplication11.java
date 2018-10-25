package javaapplication11;
import java.util.Scanner;
public class JavaApplication11 {
    public static void main(String[] args) {
        Scanner cyka= new Scanner(System.in);
        System.out.println("Please enter the password you wish to be evaluated");
        String password= cyka.nextLine();
        int strength= 0;
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
            if (password.charAt(i)>='A' && password.charAt(i)<='Z')
            {
                strength+=1;
                break;
            }
        }
        for (int i=0; i< password.length(); ++i) // lowercase checker
        {
            if (password.charAt(i)>= 'a' && password.charAt(i)<= 'z')
            {
                strength+=1;
                break;
            }
        }
        for (int i=0; i< password.length(); ++i) // digit checker
        {
            if (password.charAt(i)>= '0' && password.charAt(i)<= '9')
            {
                strength+=1;
                break;
            }
        }
        for (int i=0; i< password.length(); ++i) // non-alphanumerics checker
        {
            if ((password.charAt(i)>= ' ' && password.charAt(i)<= '/') || 
                (password.charAt(i)>= ':' && password.charAt(i)<= '@') ||
                (password.charAt(i)>= '[' && password.charAt(i) <= '\'') ||
                (password.charAt(i)>='{' && password.charAt(i)<= '~'))
            {
                strength+=1;
                break;
            }
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

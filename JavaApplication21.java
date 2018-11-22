package javaapplication21;
import java.util.Scanner;
import java.util.ArrayList;
public class JavaApplication21 {
    public static void main(String[] args) {
        Scanner cyka= new Scanner(System.in);
        System.out.println("[1] Add item");
        System.out.println("[2] Item list");
        System.out.println("[3] Edit an item");
        System.out.println("[4] Remove an item");
        System.out.println("[5] Rearrange the elements in the list from highest to lowest");
        System.out.println("[6] Rearrange the elements in the list from lowest to highest");
        System.out.println("[7] Quit");
        System.out.print("Choose an option: ");
        ArrayList<Double> blyat= new ArrayList<Double>(); 
        int func= cyka.nextInt();
        System.out.println();
        while (func!=7)
        {
            if (func==1)
            {
                System.out.println("Enter item to add: ");
                blyat.add(cyka.nextDouble());
                System.out.println("Done!");
            }
            else if(func==2)
            {
                for (int i=0; i<blyat.size(); ++i)
                {
                    System.out.print(blyat.get(i)+ " ");
                }
                System.out.println();
            }
            else if(func==3)
            {
                System.out.println("Here is the current list");
                for (int i=0; i<blyat.size(); ++i)
                {
                    System.out.print(blyat.get(i)+ "["+ i+ "]" + " ");
                }
                System.out.println();
                System.out.println("Which item do you wish to edit? (The index of each item is written next to it inside box brackets.)");
                System.out.println("For example, to edit the 2nd item in the list, type 1.");
                int edit= cyka.nextInt();
                blyat.remove(edit);
                System.out.println("Which value do you want to change it to?");
                blyat.add(edit, cyka.nextDouble());
                System.out.println("Done! Current list:");
                for (int i=0; i<blyat.size(); ++i)
                {
                    System.out.print(blyat.get(i)+ " ");
                }
                System.out.println();
            }
            else if(func==4)
            {
                System.out.println("Here is the current list:");
                for (int i=0; i<blyat.size(); ++i)
                {
                    System.out.print(blyat.get(i)+ "["+ i+ "]" + " ");
                }
                System.out.println();
                System.out.println("Which item do you wish to remove? (The item's index is written inside box brackets).");
                System.out.println("For example, to remove the 2nd item in the list, enter 1");
                blyat.remove(cyka.nextInt());
                System.out.println("Done! Current list:");
                for (int i=0; i<blyat.size(); ++i)
                {
                    System.out.print(blyat.get(i)+ " ");
                }
                System.out.println();
            }
            else if(func==5)
            {
                ArrayList<Double> copy= new ArrayList<Double>();
                for (int i=0; i<blyat.size(); ++i) // cloning original ArrayList
                {
                    copy.add(blyat.get(i));
                }
                for (int i=0; i<copy.size()-1; ++i) // rearranging
                {
                    if (copy.get(i)< copy.get(i+1))
                    {
                       double temp= copy.get(i);
                       double temp2= copy.get(i+1);
                       copy.remove(i);
                       copy.add(i, temp2);
                       copy.remove(i+1);
                       copy.add(i+1, temp);
                       i= -1;
                    }
                }
                System.out.println("Done! This is the rearranged array:");
                for (int i=0; i<copy.size(); ++i)
                {
                    System.out.print(copy.get(i)+ " ");
                }
                System.out.println();
                System.out.println("Do you wish to replace the original list with the rearranged list? Press y for yes or n for no.");
                char ok= cyka.next().charAt(0);
                if (ok=='y')
                {
                    while(blyat.size()!=0)
                    {
                        blyat.remove(0);
                    }
                    for (int i=0; i<copy.size(); ++i) // reconstruct
                    {
                        blyat.add(copy.get(i));
                    }
                }
            }
            else if(func==6)
            {
                ArrayList<Double> copy= new ArrayList<Double>();
                for (int i=0; i<blyat.size(); ++i) // cloning original ArrayList
                {
                    copy.add(blyat.get(i));
                }
                for (int i=0; i<copy.size()-1; ++i) // rearranging
                {
                    if (copy.get(i)> copy.get(i+1))
                    {
                       double temp= copy.get(i);
                       double temp2= copy.get(i+1);
                       copy.remove(i);
                       copy.add(i, temp2);
                       copy.remove(i+1);
                       copy.add(i+1, temp);
                       i= -1;
                    }
                }
                System.out.println("Done! This is the rearranged array:");
                for (int i=0; i<copy.size(); ++i)
                {
                    System.out.print(copy.get(i)+ " ");
                }
                System.out.println();
                System.out.println("Do you wish to replace the original list with the rearranged list? Press y for yes or n for no.");
                char ok= cyka.next().charAt(0);
                if (ok=='y')
                {
                    while(blyat.size()!=0)
                    {
                        blyat.remove(0);
                    }
                    for (int i=0; i<copy.size(); ++i) // reconstruct
                    {
                        blyat.add(copy.get(i));
                    }
                }
            }
            else
            {
                System.out.println("Invalid command");
            }
            System.out.println("[1] Add item");
            System.out.println("[2] Item list");
            System.out.println("[3] Edit an item");
            System.out.println("[4] Remove an item");
            System.out.println("[5] Rearrange the elements in the list from highest to lowest");
            System.out.println("[6] Rearrange the elements in the list from lowest to highest");
            System.out.println("[7] Quit");
            System.out.print("Choose an option: ");
            func= cyka.nextInt();
            System.out.println();
        }
        System.out.println("Program exited!");
    }
}
//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.Scanner;
public class BooleanOperation 
{
//Define main method
public static void main(String[] args)
  {
//Declare a variable and initialize it as true or false 
    //creating a object using  new keyword to scanner class 
Scanner s=new Scanner(System.in);
    //displaying message to the user for input
    System.out.println("Sample input:");
    boolean b=s.nextBoolean();
//Print the Result using not operator 
if(b!=true)
{
  System.out.println("Expected output:true");
}
    else
{
System.out.println("Expected output:false");
  }
    }
}
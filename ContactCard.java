// Code reviewed by @professorgordon
//Aimun Shahid

import java.util.Scanner;

public class ContactCard
{
public static void main(String[] args) 
   {
   Scanner input = new Scanner(System.in);
   
   String FirstName; 
   String LastName;
   String AddressLine1;
   String AddressLine2;
   String City;
   String State;
   String ZipCode;
   String PhoneNumber;
   String EmailAddress;
   String Age;
   String Height; 
   String Weight;
   String JobTitle;
   double AnnualIncome = 0;
   
   System.out.println("---------------------------------------");
   System.out.println("Please enter the following information:");
   System.out.println("---------------------------------------");
   System.out.print("First Name:");
   FirstName = input.nextLine();
   System.out.print("Last Name:");
   LastName = input.nextLine();
   System.out.print("Address Line 1:");
   AddressLine1 = input.nextLine();
   System.out.print("Address Line 2:");
   AddressLine2 = input.nextLine();
    System.out.print("City:");
    City = input.nextLine();
    System.out.print("State:");
    State= input.nextLine();
    System.out.print("Zip Code:");
    ZipCode = input.nextLine();
    System.out.print("Phone Number:");
    PhoneNumber = input.nextLine();
    System.out.print("Email Address:");
    EmailAddress = input.nextLine();
    System.out.print("Age:");
    Age = input.nextLine();
   System.out.print("Height:");
   Height = input.nextLine();
   System.out.print("Weight:");
   Weight = input.nextLine();
   System.out.print("Job Title:");
   JobTitle = input.nextLine();
   System.out.print("Annual Income:");
   AnnualIncome = input.nextInt();
   System.out.println("---------------------------------------");
   System.out.println("Thank You!");
   System.out.println("---------------------------------------\n\n"); 
   
   
   System.out.println("---------------------------------------");
    System.out.println("CONTACT CARD");
    System.out.println("---------------------------------------");
    System.out.println("Name:\t" + FirstName + LastName);
     System.out.println("Address Line 1:  " + AddressLine1);
      System.out.println("Address Line 2:  " + AddressLine2);
     System.out.println("City, ST Zip: " + City + ", "+ State + " " + ZipCode);
     System.out.println("---------------------------------------");
     System.out.println("Phone Number:  " + PhoneNumber);
     System.out.println("Email Address:  " + EmailAddress);
     System.out.println("---------------------------------------");
     System.out.println("Age: " + Age + "\tHeight: " + Height + "\tWeight:  " + Weight);
     System.out.println("---------------------------------------");
     System.out.println("Job Title:\t" + JobTitle);
     System.out.printf("Annual Income:  %,.2f \n" , AnnualIncome);
     System.out.printf("Monthly Income: %,.2f\n" , AnnualIncome/12);
     System.out.printf("Weekly Income:  %,.2f \n" , AnnualIncome/52);
     System.out.println("---------------------------------------");
     
     input.close();
   
   
   }
   
}

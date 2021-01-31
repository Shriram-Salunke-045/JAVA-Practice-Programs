/* Design a bank account class with constructor and methods to deposit, to
withdraw from, change the name, charge a fee and print a summary of the account using toString() method.
Use Account class to create and manage two bank accounts. */

import java.util.Scanner;

class Account
{
    String acc_name;
	long acc_id;
    double balance;
    static String bankname = "SBI";
    Scanner s = new Scanner(System.in);
    Account() {
    	acc_name = "None";
    	acc_id = 0;
    	balance = 0;
    }

  Account(long acc_id, String acc_name, double balance) {
    	this.acc_id = acc_id;
    	this.acc_name = acc_name;   	
    	this.balance = balance;
    }



    void withdraw() {
        System.out.print("\n\nEnter Amount to be Withdrawn : ");
        double amount = s.nextDouble();
        
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount Withdrawn !!!");
            System.out.println("Available Balance : "+balance);
        }
        else {
            System.out.println("ERROR : Insufficient Balance !!!");
        }
    }
    
    void deposit() {
        System.out.printf("\n\nEnter Amount to be Deposited : ");
        double amount = s.nextDouble();
        balance += amount;
        System.out.println("Account Balance : "+balance);
    }
    
    void chargeFee() {  
        double amount;
        if(balance >= 5000){
            balance = balance - 50;
            System.out.println("Service Charges (Rs. 50) Debited  !!!");
        }
        System.out.println("Available Balance : "+balance);
    }

  public String toString() {
    	return acc_id+" "+acc_name+" "+balance+" "+bankname;
  }
  
  
  static void changeBankName() {
      bankname = "HDFC";
  }
}


public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(231066, "Suraj", 10000);
        Account a2 = new Account(154050, "Rahul", 20000);
        
        System.out.printf("\nAccount Details of Person A : %s", a1.toString());
        System.out.printf("\nAccount Details of Person B : %s", a2.toString());
                
        a1.deposit();
        a1.chargeFee();
        a2.withdraw();
        a2.chargeFee();
        a1.changeBankName();
        a2.changeBankName();
        
        System.out.printf("\nNew Account Details of Person A : %s", a1.toString());
        System.out.printf("\nNew Account Details of Person B : %s", a2.toString());

    }
}

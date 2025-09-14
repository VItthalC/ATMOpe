package com.TestCICD.ATMOperations;

import java.util.Scanner;

public class MainClass {

	
		double balance;
	   public MainClass() {
		   //balance=1000.0;
		   //initialize the balance

		   //initialize the balance to new value
		   balance = 2000.0;

	   }
	    public void deposit(double money){
	        if(money>0)
	        this.balance += money;
	        else System.out.println("!!!!!Enter valid ammount to deposit");
	    }
	    public void withdraw(double money){
	        if(this.balance>=money && money>0)
	        this.balance-=money;
	        
	        else System.out.println("!!!!!Enter valid ammount to withdraw");
	    }
		public static void main(String[] args) {
			MainClass m = new MainClass();
	        Scanner sc = new Scanner(System.in);
	        while(true){
	            System.out.println("=============Enter your choice=============");
	            System.out.println("1.Balance check");
	            System.out.println("2.Deposit");
	            System.out.println("3.Withdraw");
	            System.out.println("4.Exit");
	            int choice = sc.nextInt();
	            switch(choice){
	                case 1: System.out.println("========Your Balance is: "+ m.balance+"=========");
	                break;
	                case 2: System.out.println("Enter ammount to deposit");
	                       m.deposit(sc.nextDouble());
	                       break;
	                case 3: System.out.println("Enter ammount to Withdraw");
	                       m.withdraw(sc.nextDouble());
	                       break;
	                case 4: sc.close();
	                	    System.exit(1);
	                
	                default : System.out.println("Enter valid option");
	            }
	        }
	    }

	

}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task №7 starts here
        Account ac2 = new Account("George", 1122, 1000);
        ac2.setAnnualInterestRate(1.5);
        ac2.deposit(30);
        ac2.deposit(40);
        ac2.deposit(50);
        ac2.withdraw(5);
        ac2.withdraw(4);
        ac2.withdraw(2);
        System.out.println("Account Summary: ");
        System.out.println("------------------------------------");
        System.out.println("Account owner name: " + ac2.getName());
        System.out.println("Annual interest rate: " + ac2.getAnnualInterestRate());
        System.out.printf("Balance: " + ac2.getBalance());
        System.out.println();
        System.out.println("List of transactions");
        System.out.println("------------------------------------");
        for (int i = 0; i < ac2.getTransactions().size(); i++) {
            System.out.println("Date: " + (ac2.getTransactions()).get(i).getDate());
            System.out.println("Type: " + (ac2.getTransactions()).get(i).getType());
            System.out.println("Amount: " + (ac2.getTransactions()).get(i).getAmount());
            System.out.println("Balance: " + (ac2.getTransactions()).get(i).getBalance());
            System.out.println("Description: " + (ac2.getTransactions()).get(i).getDescription());
            System.out.println();
        }
        //Task №7 ends here

        //Task №6 starts here
        Account ac0 = new Account("Account0", 0, 100);
        Account ac1 = new Account("Account1", 1, 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        boolean res = false;
        while(!checkId(id)){
            System.out.println("Enter the correct id: ");
            id = sc.nextInt();
        }
        int choice = 1;
        do {

            System.out.println("ENTER 1 TO CHECK THE CURRENT BALANCE");
            System.out.println("ENTER 2 TO WITHDRAW MONEY");
            System.out.println("ENTER 3 TO DEPOSIT MONEY");
            System.out.println("ENTER 4 TO EXIT TO THE MAIN MENU");
            choice = sc.nextInt();
            switch (choice){
                case 1: {
                    if(id == 1)
                        System.out.println(ac1.getBalance());
                    else
                        System.out.println(ac0.getBalance());
                    break;
                }
                case 2: {
                    System.out.println("Enter the amount you want to withdraw: ");
                    int money = sc.nextInt();
                    if(id == 1)
                        ac1.withdraw(money);
                    else
                        ac0.withdraw(money);
                    break;
                }
                case 3: {
                    System.out.println("Enter the amount you want to deposit: ");
                    int money = sc.nextInt();
                    if(id == 1)
                        ac1.deposit(money);
                    else
                        ac0.deposit(money);
                    break;
                }
                case 4: {
                    System.out.println("Enter id: ");
                    id = sc.nextInt();
                    res = false;
                    while(!checkId(id)){
                        System.out.println("Enter the correct id: ");
                        id = sc.nextInt();
                    }
                    break;
                }
            }
        }while(true);

    }
    public static boolean checkId(int id){
        return id == 0 || id == 1;
    }

    //Task №6 ends here
}

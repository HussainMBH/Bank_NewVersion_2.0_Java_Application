import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Team...");
        Scanner scn = new Scanner(System.in);
        boolean loop = true;
         // = null; // Declare objusr outside the switch statement
        ArrayList<Useraccount> userAccounts = new ArrayList<>(); // Store multiple user accounts


        while (loop){
            System.out.println("1. User Account Create \n2. Check Account Details \n3. Check Savings Type \n4. Deposit Money \n5. Exit");
            int k = scn.nextInt();
            switch (k){
                case 1:{
                    System.out.println("Enter Your ID Number: ");
                    int userid = scn.nextInt();
                    System.out.println("Enter Your name:");
                    String accountname = scn.next();
                    System.out.println("Enter your password:");
                    String accountpassword = scn.next();
                    System.out.println("Enter your Bank Balance:");
                    double accountbalance = scn.nextDouble();
                    Useraccount objusr = new Useraccount(accountname, accountpassword, accountbalance, userid);
                    userAccounts.add(objusr);
                }
                break;
                case 2:{
//                    if (objusr != null) { // Check if objusr is not null
//                        System.out.println("User Information:");
//                        System.out.println("Name: " + objusr.getAccountname());
//                        System.out.println("Password: " + objusr.getAccountpassword());
//                        System.out.println("Balance: " + objusr.getAccountbalance());
//                    } else {
//                        System.out.println("No user data entered yet.");
//                    }
                    //without using arraylist single data show
//                    Bankaccount bnk = new Bankaccount();
//                    bnk.showdetails(objusr);
//                    if (objusr != null) { // Check if objusr is not null
//                        bnk.showdetails(objusr); // Call showdetails method with objusr
//                    } else {
//                        System.out.println("No user data entered yet.");
//                    }
                    System.out.println("Enter Your ID: ");
                    int searchuserid = scn.nextInt();
                    boolean find = false;
                    for(Useraccount user : userAccounts){
                        if(user.getUserid() == searchuserid){
                            Bankaccount bnk = new Bankaccount();
                            bnk.showdetails(user);
                            find = true;
                            break;
                        }
                    }
                    if (!find) {
                        System.out.println("User account not found.");
                    }

                }
                break;
            }
        }
        scn.close(); // Close the scanner outside the loop
    }
}

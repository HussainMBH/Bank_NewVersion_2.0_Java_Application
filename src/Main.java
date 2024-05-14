import java.util.Scanner;
import java.util.*;

public class Main {
    private static int assignid = 0;
    public static void main(String[] args) {
        System.out.println("Hello Team...");
        Scanner scn = new Scanner(System.in);
        boolean loop = true;
         // = null; // Declare objusr outside the switch statement
        ArrayList<Useraccount> userAccounts = new ArrayList<>(); // Store multiple user accounts



        while (loop){
            System.out.println("1. User Account Create \n2. Check Account Details \n3. Show All Users Details \n4. Deposit Money \n5. Check Savings Type \n6. Update User Details \n7. Exit");
            int k = scn.nextInt();
            switch (k){
                case 1:{
                    System.out.println("Enter Your name:");
                    String accountname = scn.next();
                    System.out.println("Enter your password:");
                    String accountpassword = scn.next();
                    System.out.println("Enter your Bank Balance:");
                    double accountbalance = scn.nextDouble();

                    int userid = ++assignid;
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
                    int searchid = scn.nextInt();
                    Bankaccount bnk = new Bankaccount();
                    boolean found = false;
                    for (Useraccount usr : userAccounts) {
                        if (usr.getUserid() == searchid) {
                            bnk.eachshow(usr);
                            found = true;
                            break; // Once found, no need to iterate further
                        }
                    }
                    if (!found) {
                        System.out.println("User account not found.");
                    }
                }
                break;
                case 3:{
                    Bankaccount bnk = new Bankaccount();
                    for (Useraccount user : userAccounts) { // Iterate through the list of user accounts
                        bnk.showdetails(user); // Display details for each user account
                    }
                }
                break;
                case 4:{

                    Bankaccount bnk = new Bankaccount();
                    for (Useraccount user : userAccounts) { // Iterate through the list of user accounts
                        bnk.addmoney(user, 5000); // Display details for each user account
                    }

                }
                break;
                case 5:{
                    BankDetails bnkdetails = new BankDetails();
                    bnkdetails.SavingsType();
                }
                break;
                case 6:{
                    System.out.println("Enter User ID to Update Account Details:");
                    int updateID = scn.nextInt();
                    System.out.println("Enter New Name:");
                    String newAccountName = scn.next();
                    System.out.println("Enter New Password:");
                    String newAccountPassword = scn.next();
                    System.out.println("Enter New Balance:");
                    double newAccountBalance = scn.nextDouble();

                    Bankaccount bnk = new Bankaccount();
                    bnk.updateuser(userAccounts, updateID, newAccountName, newAccountPassword, newAccountBalance);
                }
                break;

            }
        }
        scn.close(); // Close the scanner outside the loop
    }
}

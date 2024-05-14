import java.util.HashMap;
import java.util.Map;

public class Bankaccount {

    public void eachshow(Useraccount objus) {
        if (objus != null) {
            System.out.println("User ID: " + objus.getUserid());
            System.out.println("Name: " + objus.getAccountname());
            System.out.println("Password: " + objus.getAccountpassword());
            System.out.println("Balance: " + objus.getAccountbalance());
        } else {
            System.out.println("Invalid user account.");
        }
    }


    public void showdetails(Useraccount objus ){ // in here created object objus is using for calling these get data only
        System.out.println("User Information:");
        System.out.println("User ID: " + objus.getUserid());
        System.out.println("Name: " + objus.getAccountname());
        System.out.println("Password: " + objus.getAccountpassword());
        System.out.println("Balance: " + objus.getAccountbalance());

    }

    public void addmoney(Useraccount objusr, double depositAmount) {
        System.out.println("Depositing Your Money...");

        double currentBalance = objusr.getAccountbalance();
        double newBalance = currentBalance + depositAmount;
        objusr.setAccountbalance(newBalance); // Update the account balance
        System.out.println("Deposit successful. New balance: " + newBalance);

    }

    public void updateuser(int userID, String newUsername, String newUserpassword, double newAccountbalance) {
        // Find the user with the given userID
        Useraccount existingUser = null;


        if (existingUser != null) {
            // Update user account details using setter methods
            existingUser.setAccountname(newUsername);
            existingUser.setAccountpassword(newUserpassword);
            existingUser.setAccountbalance(newAccountbalance);

            System.out.println("User Account Details Updated Successfully");
        } else {
            System.out.println("User Account ID " + userID + " Not Found");
        }
    }





}

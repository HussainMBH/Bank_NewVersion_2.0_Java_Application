public class Bankaccount {
    public void showdetails(Useraccount objus ){ // in here created object objus is using for calling these get data only
        System.out.println("User Information:");
        System.out.println("User ID: " + objus.getUserid());
        System.out.println("Name: " + objus.getAccountname());
        System.out.println("Password: " + objus.getAccountpassword());
        System.out.println("Balance: " + objus.getAccountbalance());

    }

}

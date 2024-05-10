public class Useraccount {
    private int userid;
    private String accountname;
    private String accountpassword;
    private double accountbalance;

    public Useraccount(String accountname, String accountpassword, double accountbalance, int userid){
        this.userid = userid;
        this.accountname = accountname;
        this.accountpassword = accountpassword;
        this.accountbalance = accountbalance;
    }

    public String getAccountname(){
        return accountname;
    }

    public String getAccountpassword(){
        return accountpassword;
    }
    public double getAccountbalance(){
        return accountbalance;
    }

    public int getUserid() {
        return userid;
    }
    public void setAccountbalance(double newAccountbalance) {
        this.accountbalance = newAccountbalance;
    }

    public void setAccountname(String newUsername) {
        this.accountname = newUsername;
    }

    public void setAccountpassword(String newUserpassword) {
        this.accountpassword = newUserpassword;
    }


}

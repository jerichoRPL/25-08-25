public class SavingAccount {
    public static void main(String[] args) {
        int balance1 = 1000;
        String name1 = "jericho";

        int balance2 = 2000;
        String name2 = "ilham";

    }
    
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void displayCustomer(){
        System.out.println("customer "+ name);
    }
 public double calcInterest(){
        double interest = balance * interestRate / 12;
        return interest;
}
}

    



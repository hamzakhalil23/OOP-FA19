
package lab04;
    public class Accounts {
    private int balance;
    private int x;
    private int y;
    public Accounts(){
        balance=1050;

    }
    
    public Accounts(int a){
        balance=a;
    }
    
    public void setbalance(int b){
        balance=b;
    }
    
    public int getbalance(){
        System.out.println("Your Current Balance is : "+balance);
        return balance;
    }
    
    public void Deposit(int a){
        balance=balance+a;
        System.out.println("You deposited "+ a+"Rs.\n New balance is : "+balance);
        
    }
    
    public void Withdraw(int a){
        balance=balance-a;
        System.out.println("You Withdrew "+ a+"Rs.\n New balance is : "+balance);
    }
}


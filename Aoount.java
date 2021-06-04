
public class Account {
    private float balance;
    private int account_number;
    public Account( int acc_num, float bal){
        account_number=acc_num;
        balance=bal;
    }
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
    public int getAccount_number() {
        return account_number;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    @Override
    public string tostring(){
        return string.format("account_number","balance");
    }
}
class SpecialAccount extends Account{

}
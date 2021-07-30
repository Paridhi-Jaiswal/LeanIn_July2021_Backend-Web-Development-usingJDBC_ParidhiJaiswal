
public class Driver {

	public static void main(String[] args){
	       BankAccount tom = new BankAccount("Tom");
	       tom.deposit(500.0);
	       BankAccount jerry = new BankAccount("Jerry");
	       jerry.deposit(200.0);
	       tom.transfer(100.0, jerry);
	       jerry.withdraw(50.0);
	       jerry.withdraw(100.0);
	       System.out.println(jerry.getBalance());
	}
}

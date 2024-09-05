package Task10;



public class AccountBalance {
		private double balance=0;
		public AccountBalance(double balance) {
	        this.balance = balance;
	        	
	        }
	    
	

	    public AccountBalance() {
	        this.balance = 0.0;
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println(amount + " deposited successfully.");
	        } else {
	            System.out.println("Invalid amount for deposit.");
	        }
	    }
	    

	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient funds or invalid amount for withdrawal.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	   

}
}



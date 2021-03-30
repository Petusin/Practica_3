
public class LyraCard {
	
	//Attributes
	private double balance;
	//clases añadidas Person y MyDate
	private Person owner;
	private MyDate date;
	
	
	//Constructor
	public LyraCard(double balance) {
		this.balance = balance;
	}
	
	//Methods
	public double balance() {
		return this.getBalance();
	}
	
	public void loadMoney(double amount) {
		if(amount > 0){
			this.balance += amount;
		}else{
			return;
		}	
	}
	
	//the method checks if the balance of the card is at least the amount given as parameter 
	//if not, the method returns false meaning that the card could not be used for the payment if the balance is enough, 
	//the given amount is taken from the balance and true is returned
	
	public boolean pay(double amount){
		if(amount < 0) {
			return false;
		}else if (this.getBalance()>amount) {
			this.balance -= amount;
			return true;
		}else {
			return false;
		}
		
	}
	
	//Getters and Setters

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	//toSgtring
	@Override
	public String toString() {
		return "LyraCard [balance=" + balance + ", owner=" + owner + ", date=" + date + "]";
	}


	
	
	
}

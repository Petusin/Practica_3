
public class CashRegister {
	//Atributes
	
	//amount of cash in the register
	private double cashInRegister;
	//amount economical lunches sold
	private int economicalSold;
	//amount gourmet luches sold
	private int gourmetSold;
	
	//Constructor
	
	public CashRegister() {
		this.cashInRegister = 1000;
		this.economicalSold = 0;
		this.gourmetSold = 0;

	}
	
	//Methods
	
	public double payEconomical(double cashGiven) {
		//the price of the economical Lunch is 2.50 euros
		double lunch = 2.5;
		//if the given cash is at Least the price of the Lunch
		if (cashGiven >= lunch) {
			//the amount of the sold lunches is incremented by one
			this.economicalSold += 1;
			//the method returns casGiven - lunch price
			this.cashInRegister += lunch;		
		}else {
			//if not enough money is given, all returner and nothing else happens
			System.out.println("You do not have enough money");
			return cashGiven;
		}
	}
	public double payGourmet(double cashGiven) {
		//the price of the gourmet Lunch is 4.00 euros
		double lunch = 4.0;
		//if the given cash is at Least the price of the Lunch
		if (cashGiven >= lunch) {
			//the amount of the sold lunches is incremented by one
			this.economicalSold += 1;
			//the method returns casGiven - lunch price
			this.cashInRegister += lunch;		
			}else {
				//if not enough money is given, all returner and nothing else happens
				System.out.println("You do not have enough money");
				return cashGiven;
			}
	}
	
	//Pay Economical with card
	public boolean payEconomical(LyraCard card) {
		//the price of the economical Lunch is 2.50 euros
		double lunch = 2.5;
		//if the balance of the card is at least the price of the lunch
		if(card.getBalance() >= lunch) {
			
			
		}else {
			
		}
							
	}
	
	//Pay Gourmet with card
	public boolean payGourmet(LyraCard card) {
		//the price of the gourmet Lunch is 4.00 euros
		double lunch = 4.0;
		
		
		
		
		
	}
	
	//Add money to the card
	public void loasMoneyToCard(LyraCard card,double sum) {
		
	}
	
	public String toString() {
		return "Money in register" + cashRegister + ", economical lunches" + economicalSold + ", gourmet lunches sold"
				+ gourmetSold;
	}
	
}


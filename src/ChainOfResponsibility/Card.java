package ChainOfResponsibility;

public class Card implements ApproveLoanChain{

	private ApproveLoanChain next;
	@Override
	public void setNext(ApproveLoanChain loan) {
		this.next = loan;
	}

	@Override
	public ApproveLoanChain getNext() {
		return this.next;
	}

	@Override
	public void creditCardRequest(int totalLoan) {
		Gold gold = new Gold();
		this.setNext(gold);
		
		Platinium platinium = new Platinium();
		gold.setNext(platinium);
		
		Black black = new Black();
		platinium.setNext(black);
		
		this.next.creditCardRequest(totalLoan);
		
	}

	
}

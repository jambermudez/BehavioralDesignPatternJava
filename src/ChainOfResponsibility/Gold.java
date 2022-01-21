package ChainOfResponsibility;

public class Gold implements ApproveLoanChain{

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
		if (totalLoan <= 10000) {
			System.out.println("Request credit card call GOLD Card");
		}else {
			this.next.creditCardRequest(totalLoan);
		}
	}
}

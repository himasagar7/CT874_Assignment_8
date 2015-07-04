package CT874_Assignment_8;

//Child class SalesAgent
class SalesAgent extends SalesEmployee {

	public SalesAgent() {
		super();
	}

	public SalesAgent(String employeeName, int PPS) {
		super(employeeName, PPS);
	}

	// Overriding
	public void computeCommission() {

		totalsale += COST_OF_CYCLE * getNoOfbikesSold();
		commission = totalsale * 0.10;

	}

}

package CT874_Assignment_8;

//Parent class
abstract class SalesEmployee{
	
//    Data Members
	//Assuming that average cost of cycle is 250 Euros
	protected   final static int COST_OF_CYCLE = 250;
	protected double           commission; 
	protected   double           totalsale;
    private   String           name;
	private   int              pps;
    private   int            noOfbikesSold;

//    Constructors
    public SalesEmployee( ) {
        this("No Name");
    }
    public SalesEmployee(String employeeName){
    	  name = employeeName;
    }

    public SalesEmployee(String employeeName,int PPS) {
        name = employeeName;
        pps = PPS;
        
    }
    
  // getters and setters
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPps() {
		return pps;
	}

	public void setPps(int pps) {
		this.pps = pps;
	}

	public int getNoOfbikesSold() {
		return noOfbikesSold;
	}

	public void setNoOfbikesSold(int noOfbikesSold) {
		this.noOfbikesSold = noOfbikesSold;
	}

	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getTotalsale() {
		return totalsale;
	}
	public void setTotalsale(double totalsale) {
		this.totalsale = totalsale;
	}



	 public abstract void computeCommission( );
	 //do nothing - override this method in the subclass
     //
  

}
package CT874_Assignment_8;

//Child class SalesPerson
class SalesPerson extends SalesEmployee {

public SalesPerson(){
	super();
}

public SalesPerson(String employeeName,int PPS){
	super(employeeName, PPS);
}

    public void computeCommission() {
      
    	totalsale += COST_OF_CYCLE * getNoOfbikesSold();
         commission = totalsale * 0.15;
         
      }

      
}
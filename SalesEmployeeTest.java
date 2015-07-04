package CT874_Assignment_8;

import java.util.Scanner;

//  Java application that calculates and displays the commission to be paid to each employee, the employees name, their PPS number and the total value of the sale.
public class SalesEmployeeTest {

	public static void main(String[] args) {
		
		SalesEmployee[] record = new SalesEmployee[5];
		Scanner input = new Scanner(System.in);
		// is-a mechanism. Through inheritance we are creating specialized objects from generalized parent object reference
		record[0] = new SalesPerson("Conor Ava", 1245);
		record[1] = new SalesAgent("Niamh Dylan", 1234);
		record[2] = new SalesAgent("Anna Saoirse", 1342);
		record[3] = new SalesPerson("George Oisin", 3212);
		record[4] = new SalesPerson("Siobhan Lennon", 1432);
		
		for (int i = 0; i < record.length; i++) {
			
				System.out.printf("Enter Number of cycles sold by  SalesEmployee %s : ",record[i].getName());
			record[i].setNoOfbikesSold(input.nextInt());
		}
		
		for (int i = 0; i < record.length; i++) {
			//polymorphism works here
			// Depending up on the type of object i.e SalesPerson or SalesAgent appropriate computeCommission is called here 
			record[i].computeCommission();
		}
		System.out.printf("\n%20s%10s%10s%10s\n","Employee Name","   PPS number"," Totalsale","  Commission");
		System.out.printf("---------------------------------------------------------------------------\n");
		for (int i = 0; i < record.length; i++) {
			System.out.printf("%20s%10d%10.2f%10.2f\n",record[i].getName(),record[i].getPps(),record[i].getTotalsale(),record[i].getCommission());
		}
		
		
	input.close();

	}

}

import static java.lang.System.out;

import java.util.Scanner;
class Assignment2Program{
	public static void main(String[] args){
		var scanner=new Scanner(System.in);
		out.print("Age: ");
		var age=scanner.nextInt();
			
		out.print("Monthly income: ");
		var income=scanner.nextInt();
		
		out.print("Credit score: ");
		var credit_score=scanner.nextInt();

		out.print("Existing EMI: ");
		var existing_emi=scanner.nextInt();

		out.print("Proposed EMI: ");
		var proposed_emi=scanner.nextInt();

		var emi=existing_emi+proposed_emi;
		var income_40=(income*40)/100;	
		
		
		if((income>0 && existing_emi>0) && proposed_emi>0){
			
			if(age>=21 || age<=60){
				if(income>=25000){
					if(credit_score>=650){
						if(emi<=income_40){ 
							var combined_emi=(emi*100.0)/income;
							out.printf("Combined EMI Percentage: %.2f%%%n",combined_emi);
							out.println("Loan status: Eligible");
							if(credit_score>650 && credit_score<=699){
								out.println("12.0%");
							}
							else if(credit_score<=749){
								out.println("10.0%");
							}	
							else if(credit_score>=750){
								out.println("Applicable annual interest rate: 8.5%");
							}
						}
						else{
							out.println(" Existing EMI plus proposed EMI does not exceed 40%");
						}	
					}
					else{
						out.println("Credit score is at least 650.");
					}		
				}
				else{
					out.println("Monthly income is at least Rs. 25,000.");
				}			
			}
			else{
				out.println("Age is between 21 and 60, both inclusive.");
			}
		}
		else{
			out.println("income and EMI values are not negative.");
		}		
				
	}
}
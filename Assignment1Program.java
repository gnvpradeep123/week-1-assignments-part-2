import static java.lang.System.out;

import java.util.Scanner;
class Assignment1Program{
	public static void main(String[] args){
		var scanner=new Scanner(System.in);
		out.print("Enter number of electricity units: ");
		var units=scanner.nextInt();
		double subtotal=0;
		double surcharge=0;
		double final_bill_amount=0; 
		
		if(units<0){
			out.println("Invalid");
		}
		else{	
			if(units<=100){
				subtotal=units*(1.50);
			}	
			else if(units<=200){
				subtotal=(units-100)*2.5;
				subtotal=subtotal+150;
			}	
			else if(units<=500){
				subtotal=(units-200)*4.00;
				subtotal=subtotal+400;
			}
			else if(units>500){
				subtotal=(units-500)*6.00;
				subtotal=subtotal+1600;
			}
		
			subtotal=subtotal+75;
			out.println("energy charge: "+units);
			out.println("fixed chage: "+75.00);
			final_bill_amount=subtotal;
			if(subtotal>1500.00){
				surcharge=(subtotal*5)/100;
				out.println("surcharge: "+surcharge);
				final_bill_amount=final_bill_amount+surcharge;
			}
			out.println("final bill amount : %.2f"+final_bill_amount);	
		}		
	}
}
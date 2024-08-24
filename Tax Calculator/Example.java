import java.util.*;
class Example{
	public static void printMain1(){
	Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println("                                               __  ______  ________ ________  ");
		System.out.println("                                              |  \\/      \\|        |        \\ ");
		System.out.println("                                               \\$|  $$$$$$| $$$$$$$$\\$$$$$$$$ ");
		System.out.println("                                              |  | $$   \\$| $$__      | $$    ");
		System.out.println("                                              | $| $$     | $$  \\     | $$    ");
		System.out.println("                                              | $| $$   __| $$$$$     | $$    ");
		System.out.println("                                              | $| $$__/  | $$_____   | $$    ");
		System.out.println("                                              | $$\\$$    $| $$     \\  | $$    ");
		System.out.println("                                               \\$$ \\$$$$$$ \\$$$$$$$$   \\$$    ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("    _______             __   __   _____              _         _____   _    _   _                   _______    ____    _____   ");
		System.out.println("   |__   __|     /\\     \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\  ");
		System.out.println("      | |       /  \\     \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) | ");
		System.out.println("      | |      / /\\ \\     > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  /  ");
		System.out.println("      | |     / ____ \\   / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\  ");
		System.out.println("      |_|    /_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\ ");
		System.out.println();
		System.out.println();
		System.out.println("=================================================================================================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("        [1] Withholding Tax");
		System.out.println();
		System.out.println("        [2] Payable Tax");
		System.out.println();
		System.out.println("        [3] Income Tax");
		System.out.println();
		System.out.println("        [4] Social Security Contribution Levy (SSCL) Tax");
		System.out.println();
		System.out.println("        [5] Leasing Payment");
		System.out.println();
		System.out.println("        [6] Exit");
		System.out.println();
		System.out.println();
		System.out.print("Enter an option to continue -> ");
		int number1=input.nextInt();
	}
	public static void printMain2(){
	Scanner input=new Scanner(System.in);
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                           WITHHOLDING TAX                           |");
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println();
			System.out.println("          [1] Rent Tax");
			System.out.println();
			System.out.println("          [2] Bank Inerest Tax");
			System.out.println();
			System.out.println("          [3] Dividend Tax");
			System.out.println();
			printExit();
			System.out.println();
			System.out.println();
			System.out.print("Enter an option to continue -> ");
			int number1=input.nextInt();
	}
	public static void printMain3(){
	Scanner input=new Scanner(System.in);
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                            Leasing Payment                          |");
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println();
			System.out.println("          [1] Calculate Monthly Installment");
			System.out.println();
			System.out.println("          [2] Search Leasing category");
			System.out.println();
			System.out.println("          [3] Find Leasing Amount");
			System.out.println();
			printExit();
			System.out.println();
			System.out.println();
			System.out.print("Enter an option to continue -> ");
			int number1=input.nextInt();
	}
	public static void printExit(){
			System.out.println("          [4] Exit");
	}
	public static void printRentTax(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                              RENT TAX                               |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void printBankInerestTax(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                         BANK INTEREST TAX                           |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void printDividendTax(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                            Dividend Tax                             |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void printPayableTax(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                             PAYABLE TAX                             |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void printIncomeTax(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                              INCOME TAX                             |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void printSocialTax(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|            SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX             |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void printLeasingPayment1(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                    Calculate Monthly Installment                    |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void printLeasingPayment2(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                        Search Leasing Category                      |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void printLeasingPayment3(){
			System.out.println("+---------------------------------------------------------------------+");
			System.out.println("|                         Find Leasing Amount                         |");
			System.out.println("+---------------------------------------------------------------------+");
	}
	public static void main(String []args){
	Scanner input=new Scanner(System.in);
		printMain1();
		printMain2();
		printRentTax();
				System.out.print(" Enter your rent          : ");    
				int rent=input.nextInt();
				System.out.println();
			if (rent>100000){
				rent=(((rent-100000)*10)/100);
				System.out.printf(" You have to pay Rent Tax : "+rent+".00");
			}
				System.out.println();
				System.out.println();
				printExit();
				System.out.println();	
			System.out.print("Enter an option to continue -> ");
			int c=input.nextInt();		
		if(c==4){
			printMain2();
		}
		printRentTax();
				System.out.print(" Enter your rent          : ");
				int rent2=input.nextInt();
			if (rent<100000){
				System.out.println();
				System.out.println("        You dont have to pay rent Tax...");
			}
				System.out.println();
				printExit();
				System.out.println();
				System.out.print("Enter an option to continue -> ");
				int e=input.nextInt();
		if(e==4){
			printMain2();
		}
				System.out.println();
			printBankInerestTax();
				System.out.print(" Enter your bank interest per year          : ");
				int bank=input.nextInt();
				bank*=0.05;
				System.out.println();
				System.out.println(" You have to pay Bank Interest Tax per year : "+bank+".00");
				System.out.println();
				System.out.println();
				printExit();
				System.out.println();
				System.out.print("Enter an option to continue -> ");
				int g=input.nextInt();
		if(g==4){
			printMain2();
		}
				System.out.println();
				printDividendTax();
				System.out.print(" Enter your dividend per year               : ");
				int dividend=input.nextInt();
			if (dividend>100000){
				dividend=(((dividend-100000)*14)/100);
				System.out.println();
				System.out.println(" You have to pay Bank Interest Tax per year : "+dividend+".00");
			}
				System.out.println();
				System.out.println();
				printExit();
				System.out.println();
				System.out.print("Enter an option to continue -> ");
				int i=input.nextInt();
		if(i==4){
			printMain2();
		}
				printDividendTax();
				System.out.print(" Enter your dividend per year          : ");
				int dividend1=input.nextInt();
			if(dividend<100000){
				System.out.println();
				System.out.println("        You dont have to pay Dividend Tax...");
			}
				System.out.println();
				System.out.println();
				printExit();
				System.out.println();
				System.out.print("Enter an option to continue -> ");
				int k=input.nextInt();
		if(k==4){
			printMain2();
		}
			printMain1();
				System.out.print("Enter an option to continue -> ");
				int m=input.nextInt();
		if(m==2){
			printPayableTax();
				System.out.print(" Enter your employee pament per month              : ");
				int payable=input.nextInt();
			if (payable>100000){
				if ((payable>100000)&&(payable<=141667)){
					payable=(((payable-100000)*6)/100);
					System.out.println();
					System.out.println(" You have to pay Payable Tax per month             : "+(payable+1)+".00");
				}
				if ((payable>141667)&&(payable<=183333)){
					payable=((41667*6)/100)+(((payable-141667)*12)/100);
					System.out.println();
					System.out.println(" You have to pay Payable Tax per month             : "+(payable+1)+".00");
				}
				if ((payable>183333)&&(payable<=225000)){
					payable=((41667*6)/100)+((41667*12)/100)+(((payable-183333)*18)/100);
					System.out.println();
					System.out.println(" You have to pay Payable Tax per month             : "+(payable+1)+".00");
				}
				if ((payable>225000)&&(payable<=266667)){
					payable=((41667*6)/100)+((41667*12)/100)+((41667*18)/100)+(((payable-225000)*24)/100);
					System.out.println();
					System.out.println(" You have to pay Payable Tax per month             : "+(payable+1)+".00");
				}
				if ((payable>266667)&&(payable<=308333)){
					payable=((41667*6)/100)+((41667*12)/100)+((41667*18)/100)+((41667*24)/100)+(((payable-266667)*30)/100);
					System.out.println();
					System.out.println(" You have to pay Payable Tax per month             : "+(payable+1)+".00");
				}
				if (payable>308333){
					payable=((41667*6)/100)+((41667*12)/100)+((41667*18)/100)+((41667*24)/100)+((41667*30)/100)+(((payable-266667)*36)/100);
					System.out.println();
					System.out.println(" You have to pay Payable Tax per month             : "+(payable+1)+".00");
				}
			}
				System.out.println();
				System.out.println();
				printExit();
				System.out.println();
		}
			printMain1();
				System.out.print("Enter an option to continue -> ");
				int o=input.nextInt();
		if (o==2){
			printPayableTax();
				System.out.print(" Enter your employee pament per month              : ");
				int payable=input.nextInt();
			if(payable<100000){
				System.out.println();
				System.out.println("        You dont have to pay Dividend Tax...");
			}
				System.out.println();
				System.out.println();
				printExit();
				System.out.println();
		}
			printMain1();
				System.out.print("Enter an option to continue -> ");
				int q=input.nextInt();
		if (q==3){
			printIncomeTax();
				System.out.print(" Enter your total income per year              : ");
				int income=input.nextInt();
			if (income>1200000){
				if ((income>1200000)&&(income<=1700000)){
					income=(((income-1200000)*6)/100);
					System.out.println();
					System.out.println(" You have to pay Income Tax per year           : "+income+".00");
				}
				if ((income>1700000)&&(income<=2200000)){
					income=((500000*6)/100)+(((income-1700000)*12)/100);
					System.out.println();
					System.out.println(" You have to pay Income Tax per year           : "+income+".00");
				}
				if ((income>2200000)&&(income<=2700000)){
					income=((500000*6)/100)+((500000*12)/100)+(((income-2200000)*18)/100);
					System.out.println();
					System.out.println(" You have to pay Income Tax per year           : "+income+".00");
				}
				if ((income>2700000)&&(income<=3200000)){
					income=((500000*6)/100)+((500000*12)/100)+((500000*18)/100)+(((income-2700000)*24)/100);
					System.out.println();
					System.out.println(" You have to pay Income Tax per year           : "+income+".00");
				}
				if ((income>3200000)&&(income<=3700000)){
					income=((500000*6)/100)+((500000*12)/100)+((500000*18)/100)+((500000*24)/100)+(((income-3200000)*30)/100);
					System.out.println();
					System.out.println(" You have to pay Income Tax per year           : "+income+".00");
				}
				if (income>3700000){
					income=((500000*6)/100)+((500000*12)/100)+((500000*18)/100)+((500000*24)/100)+((500000*30)/100)+(((income-3700000)*36)/100);
					System.out.println();
					System.out.println(" You have to pay Income Tax per year           : "+income+".00");
				}
			}
				System.out.println();
				System.out.println();
				printExit();
				System.out.println();
		}
			printMain1();
				System.out.print("Enter an option to continue -> ");
				int s=input.nextInt();
		if (s==3){
			printIncomeTax();
					System.out.print(" You have to pay Income Tax per year : ");
				int income=input.nextInt();
			if(income<1200000){
				System.out.println();
				System.out.println("        You don't have to income Tax...");
			}
				System.out.println();
				System.out.println();
				printExit();
				System.out.println();
		}
			printMain1();
				System.out.print("Enter an option to continue -> ");
				int u=input.nextInt();
		if(u==4){
			printSocialTax();
				System.out.print(" Enter value of Good or Service              : ");
				int good=input.nextInt();
					good=((good*25)/1000)+(((good+((good*25)/1000))*15)/100);
					System.out.println();
					System.out.println(" You have to pay Income Tax per year         : "+good+".00");
					System.out.println();
					System.out.println();
					printExit();
					System.out.println();
				}	
			printMain1();
				System.out.print("Enter an option to continue -> ");
				int w=input.nextInt();	
		if(w==5){
			printMain3();
		}
			printLeasingPayment1();
			System.out.println();
			System.out.print(" Enter lease amount         : ");
			double lease = input.nextDouble();
			System.out.println();
			System.out.print(" Enter annual interest rate : ");
			double rate = input.nextDouble();
			System.out.println();
			System.out.print(" Enter number of year       : ");
			double year = input.nextDouble();
			System.out.println();
			rate/=100;
			double i1 = rate/12.0;
			double num = Math.pow((1+i1),(year*12.0));
			double tax = lease * i1/(1-(1/num));
			System.out.printf(" Your monthly instalment    : %.2f",tax);
			System.out.println();
			System.out.println();
			printExit();
			System.out.println();
			printMain3();
				System.out.print("Enter an option to continue -> ");
				int z2=input.nextInt();
		if(z2==2){
			printLeasingPayment2();
			System.out.println();
			System.out.print(" Enter lease amount         : ");
			double lease1=input.nextDouble();
			System.out.println();
			System.out.print(" Enter annual interest rate : ");
			double rate1=input.nextDouble();
			System.out.println();
			double year1=3;
			double i11 = rate1/12.0;
			double num1 = Math.pow((1+i11),(year1*12.0));
			double tax1 = lease1 * i11/(1-(1/num1));
			System.out.printf("Your monthly instalment for 3 year leasing plan - %.2f",tax1);
			System.out.println();
			double year2=4;
			double i2 = rate/12.0;
			double num2 = Math.pow((1+i2),(year2*12.0));
			double tax2 = lease * i1/(1-(1/num2));
			System.out.printf("Your monthly instalment for 4 year leasing plan - %.2f",tax2);
			System.out.println();
			double year3=5;
			double i3 = rate/12.0;
			double num3 = Math.pow((1+i3),(year3*12.0));
			double tax3 = lease * i1/(1-(1/num3));
			System.out.printf("Your monthly instalment for 5 year leasing plan - %.2f",tax3);
			System.out.println();
		}
			System.out.println();
			printExit();
			System.out.println();
				System.out.print("Enter an option to continue -> ");
				int z3=input.nextInt();	
		if(z3==4){
			printMain3();
		}
			printLeasingPayment3();
			System.out.println();
			System.out.print(" Enter the monthly lease pament amount you can afford : ");
			double tax4=input.nextDouble();
			System.out.println();
			System.out.print(" Enter number of year                                 : ");
			double year1=input.nextDouble();
			System.out.println();
			System.out.print(" Enter annual interest rate                           : ");
			double rate1=input.nextDouble();
			System.out.println();
			double i4 = rate1/12.0;
			double num4 = Math.pow((1+i4),(year1*12.0));
			double lease4 =(tax4 * (1-(1/num4)))/i4;
			System.out.print(" Your can get Lease Amount                            : "+lease4+".00");
			System.out.println();
			System.out.println();
			printExit();
			System.out.println();
				System.out.print("Enter an option to continue -> ");
				int z5=input.nextInt();
		if(z5==4){
			printMain3();
			printMain1();
		}
	}
}


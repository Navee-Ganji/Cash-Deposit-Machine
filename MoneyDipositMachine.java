import java.util.Scanner;
class  MoneyDipositMachine
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello! Welcome to Money Deposit Machine");
		int status;
		    int pin=1432;
			long phNo=9542754321L;
			long accNo=36129668123L;
			double balance=14320.50;
			System.out.println(" Select Any Language : \n 1. English \n 2. Other");
			int lang=scan.nextInt();
		do	
		{
		    System.out.println(" 1 . Card Transaction");
		    System.out.println(" 2 . Cardless Transaction");
			System.out.println(" Enter Any Option to Continue");
			int option=scan.nextInt();
		    switch(option)
			{
                case 1:
				switch(1)
				{
				   case 1:System.out.println(" Please Insert Your Card \n Enter Your PIN");
				   int password=scan.nextInt();
				   if(password==pin)
					{
					   byte b1 = 0;
                        while(b1 == 0)
						{
							System.out.println(" Hello! Naveen Ganji, Welcome to ATM Centre. \n 1. Withdraw Money\n 2. Deposit Money\n 3. Balance Enquire\n 4. Transfer Money\n 5. PIN Change");
							int option1=scan.nextInt();
							switch(option1)
							{
								case 1:System.out.println(" Enter Money to be Withdraw");
								int withdraw=scan.nextInt();
								if(withdraw<=balance)
								{
									 System.out.println(" "+withdraw+" Rs Withdrawn Successfully");
									 balance=balance-withdraw;
									 System.out.println(" Available Balance = "+balance);
									 
								}
								break;
								case 2:System.out.println(" Enter Money to Deposit");
								int deposit=scan.nextInt();
								balance=balance+deposit;
								System.out.println(" "+deposit+" Rs Successfully Added to the Account\n Available Balance = "+balance);
								break;
								case 3:System.out.println(" Available Balance = "+balance);
								break;
								case 4:System.out.println(" Money Transfer Currently Out Service Try After Some Time");
								break;
								case 5:System.out.println(" Enter New PIN");
								int newPin=scan.nextInt();
								pin=newPin;
								break;
								default :System.err.println(" Enter Valid Input");
							}
							System.out.println("Enter 0 for continue and 1 for exit");
							b1 = scan.nextByte();
						}
				    }
					else
					{
					    System.err.println(" You are Entered Incorrect PIN, Please Enter Valid PIN");
					}
				}
				break;
				case 2: byte b = 0;
				while(b != 3)
				{
					System.out.println(" Enter Mobile Number");
					long mobile=scan.nextLong();
					System.out.println(" Enter Account Number");
					long accountNum=scan.nextLong();
					if((accountNum==accNo)&&(mobile==phNo))
					{
						byte b2 = 0;
						while(b2 == 0)
						{
							System.out.println(" Hello! Naveen Netha, Welcome to ATM Centre. \n 1. Withdraw Money\n 2. Deposit Money\n 3. Balance Enquire\n 4. Transfer Money\n 5. PIN Change");
							int option1=scan.nextInt();
							switch(option1)
							{
								case 1:System.out.println(" Enter Money to be Withdraw");
								int withdraw=scan.nextInt();
								if(withdraw<=balance)
								{
									System.out.println(" "+withdraw+" Rs Withdrawn Successfully");
									balance=balance-withdraw;
									System.out.println(" Available Balance = "+balance);
										 
								}
								break;
								case 2:System.out.println(" Enter Money to Deposit");
								int deposit=scan.nextInt();
								balance=balance+deposit;
								System.out.println(" "+deposit+" Rs Successfully Added to the Account\n Available Balance = "+balance);
								break;
								case 3:System.out.println(" Available Balance = "+balance);
								break;
								case 4:System.out.println(" Money Transfer Currently Out Service Try After Some Time");
								break;
								case 5:System.out.println(" Enter New PIN");
								int newPin=scan.nextInt();
								pin=newPin;
								break;
								default :System.err.println(" Enter Valid Input");
							} 
							b = 3;
							System.out.println("Enter 0 for continue and 1 for exit");
							b2 = scan.nextByte();
						}
					}
					else if(b != 3)
					{
						b++;
						System.err.println("Invalid Account Details, Please check Once and Enter Again !");
					}
					else
					{
						b++;
						System.err.println("Invalid Account Details, Please try After Some time !");
					}
				}
			}
			System.out.println(" If you want to Go Interface Press 0 Or Exit to Press 1");
			status=scan.nextInt();
		} while(status==0);
		System.out.println("Thank You for Using Cash Deposit Mashine..!");
	}
}

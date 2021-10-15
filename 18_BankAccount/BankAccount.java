/*
Trio number int x (Orion Roven, May Qiu, Lawrence Joa)
APCS
HW18_BankAccount (use UML diagram)
10/14/21
DISCO:
main must be static

QCC:
if main has to reference SetAcct, and SetAcct has to reference acctHolder, than wouldn't acctHolder have to be a static instance variable (it works if it is)
*/

public class BankAccount {
	private String acctHolder;
	private String password;
	private int pin;
	private int accountNum;
	private double bal;

	public void SetAcctHolder(String name){
		acctHolder=name;
	}

	public static void main(String[] args){
		BankAccount myDuck = new BankAccount();
		myDuck.SetAcctHolder("Von Geburt");

		System.out.println(myDuck.acctHolder);
	}
}

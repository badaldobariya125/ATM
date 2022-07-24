import java.util.Scanner;

public class mybank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 2000;
		boolean t = true;

		
		while (t) {
			System.out.println("Enter the password");
			int user = sc.nextInt();
			int pass = 123;
			if (pass == user) {
				System.out.println("Welcome to The Bank");
				System.out.format("1: Deposit The Amount \n2: Withdraw the ammount\n3: Check Balance\n4: Go to home\n");
				boolean k = true;
				while (k) {
					System.out.println("Enter your choice");
					int f = sc.nextInt();

					switch (f) {
					case 1:
						System.out.println("Enter the Amount To Deposit");
						int deposit = sc.nextInt();
						balance += deposit;
						System.out.println("Amount is Deposited");
						break;

					case 2:
						System.out.println("Enter ammount to Withdraw");
						int withdraw = sc.nextInt();
						if (withdraw >= balance) {
							System.out.println("Not sufficient balance");
						}
						balance = balance - withdraw;
						System.out.println("Amount is Withdraw");
						break;

					case 3:
						System.out.println("Balane is: " + balance);
						break;
					case 4:
						System.out.println("Thank you");
						k = false;

						break;
					default:
						System.out.println("Enter Valid Choice");

						break;
					}
				}
			}

		}

		System.out.println("Wrong Password");

	}
}
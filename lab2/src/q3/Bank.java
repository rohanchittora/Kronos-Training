package q3;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String memberName = sc.nextLine();
		System.out.print("Enter account type: ");
		String accountType = sc.nextLine();
		double initialBalance;
		if (accountType.equals("savings")) {
			System.out.print("Enter initial balance (>500): ");
			initialBalance = sc.nextDouble();
			if (initialBalance < 500.0)
				initialBalance = 500.0;
			System.out.print("Enter maximum withdraw limit: ");
			double maxWithdraw = sc.nextDouble();
			SavingsAccount savings = new SavingsAccount(memberName, maxWithdraw, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+savings.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					savings.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+savings.getAccountBalance());
				}
				else if(choice==2) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+savings.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					savings.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+savings.getAccountBalance());
				}
				else if(choice==3) {
					System.out.println("Balance = "+savings.getAccountBalance());
				}
				else if(choice==0) {
					break;
				}
			}

		} else if (accountType.equals("current")) {
			System.out.print("Enter initial balance: ");
			initialBalance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter trade license number: ");
			String tradeLicenseNumber = sc.nextLine();
			CurrentAccount current = new CurrentAccount(memberName, tradeLicenseNumber, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+current.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					current.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+current.getAccountBalance());
				}
				else if(choice==2) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+current.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					current.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+current.getAccountBalance());
				}
				else if(choice==3) {
					System.out.println("Balance = "+current.getAccountBalance());
				}
				else if(choice==0) {
					break;
				}
			}
		}
		sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (Y/N)?");
		String choise = sc.next();
		
		while ((!choise.contains("Y")) && (!choise.contains("y")) && (!choise.contains("n")) && (!choise.contains("N"))){
			choise = sc.next("Is there na initial deposit (Y/N)?");
		}
		
		if ((choise.contains("Y")) || (choise.contains("y"))){
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new ContaBancaria(number, holder, initialDeposit);
		} else {
			account = new ContaBancaria(number, holder);
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposito(sc.nextDouble());	
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.saque(sc.nextDouble());	
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}

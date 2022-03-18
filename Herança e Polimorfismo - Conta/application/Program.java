package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Conta> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			} else {
				System.out.print("Number of employees: ");
				int numFunc = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numFunc));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for (Conta cont : list) {
			sum += cont.calculoImposto();
			System.out.println(cont.getName() + ": $" + String.format("%.2f", cont.calculoImposto()));
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();
	}
}

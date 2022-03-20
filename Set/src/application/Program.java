package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A?" + " ");
        int studentsA = sc.nextInt();

        for (int i = 0; i < studentsA; i++){

            int cod = sc.nextInt();
            a.add(cod);
        }
        
        System.out.print("How many students for course B?" + " ");
        int studentsB = sc.nextInt();

        for (int i = 0; i < studentsB; i++){

            int cod = sc.nextInt();
            b.add(cod);
        }

        System.out.print("How many students for course C?" + " ");
        int studentsC = sc.nextInt();

        for (int i = 0; i < studentsC; i++){

            int cod = sc.nextInt();
            c.add(cod);
        }

        Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());
        
        sc.close();
    }
}
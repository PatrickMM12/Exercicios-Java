import java.time.LocalDate;

public class Teste {
	public static void main(String[] args) {
		SecretariaExecutiva sx01 = new SecretariaExecutiva ("Ana", "1", LocalDate.of(1989, 1, 15), "2", 5782.32);
		System.out.println(sx01);
		
		SecretariaAdministrativa sa01 = new SecretariaAdministrativa ("Julia", "2", LocalDate.of(1994, 7, 21), "3", 4982.59);
		System.out.println(sa01);

		Presidente p01 = new Presidente ("Pedro", "5", LocalDate.of(1990, 10, 16), "4", 40280.89, sx01);
		System.out.println(p01);
		
		Gerente g01 = new Gerente ("Alex", "50", LocalDate.of(1975, 01, 27), "10", 35657.90, sa01);
		System.out.println(g01);
		
		Supervisor s01 = new Supervisor ("Marcos", "570", LocalDate.of(1984, 03, 26), "245", 16389.76, sa01);
		System.out.println(s01);
	}

}

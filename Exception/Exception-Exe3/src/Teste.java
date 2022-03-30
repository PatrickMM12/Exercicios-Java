import java.io.FileNotFoundException;

public class Teste {

	public static void main (String []args) {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado!!!");
			e.printStackTrace();
		}
	} 
	
}

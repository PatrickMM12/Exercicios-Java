import javax.swing.JOptionPane;

public class Teste1 {
    public static void main(String[] args) {

        int n = 0, d = 0;
        System.out.println("Inicio do Programa \n" );
        boolean erro = false;
        int[] v = {5, 3, 2, 9, 1};
        
       try {
        	for (int i=0; i<= v.length; i++)
        		System.out.println(v[i]);
       } catch (Exception e) {
    	   System.out.println("Tentativa de ler item inexistente!\n" + e.getMessage());
       } finally {
    	   System.out.println("Passei no finally!");
       }
        
       Pessoa [] pessoas = new Pessoa[3];
       pessoas[0] = new Pessoa ("João","1556484-9");
       pessoas[1] = new Pessoa ("Maria","1465546-5");
       pessoas[2] = new Pessoa ("Ana","035668-4");
       for (int i=0; i<pessoas.length; i++)
       		System.out.println(pessoas[i].toString()+ "\t");
        
 /*       
        do {
	        try {
	        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
	        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de D:"));
	        erro = false;
	        } catch (NumberFormatException e) {
	        	System.out.println("Error\n" + e.getMessage()+"\n");
	        	erro = true;
	        }
        } while(erro);
        	
        try {
            System.out.println("Divisão N/D = \n" + (n/d));
            System.out.println("Depois da divisão");
        } catch (ArithmeticException e) {
            System.out.println("Error\n" + e.getMessage()+"\n");
        }
*/

        System.out.println("Fim do Programa");
    }
}
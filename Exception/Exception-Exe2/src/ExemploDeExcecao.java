
public class ExemploDeExcecao {
	public static void main(String[] args) {

		String var = "ABC";
		try {
			int i = Integer.parseInt(var);
			System.out.println("A vari�vel i vale " + i);
			}
		catch (NumberFormatException e) {
			System.out.println("N�o � poss�vel atribuir a string " + var
			+ " a um Objeto Inteiro.\n"
			+ "A seguinte mensagem foi retornada:\n\n"
			+ e.getMessage());
			}
	    catch(InputMismatchException e){
	    	System.out.println("Somente inteiros s�o permitidos!");
		       
		    System.out.println("Erro: " + e.getMessage());
		}
		
	    Circulo circulo = new Circulo(); 
	    circulo.solicitaRaioDoCirculo();
	    circulo.calculaAreaDoCirculo();
	    circulo.calculaPerimetroDoCirculo();
	    System.out.println();
	    System.out.println();

		boolean excecao = false;
	    while(!excecao){
	      Divisao divisao = new Divisao();
	      excecao = divisao.calculaDivisao();
	    }
	    System.out.println();
	    System.out.println("FIM DO PROGRAMA");
	}
}

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Divisao {
	  private int divisor, dividendo; 
	  public boolean calculaDivisao(){
	    int divisao;
	    boolean resultado;
	    String erro;
	    try{
	      dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do dividendo: "));	    	
	      divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do divisor: "));
	      divisao = (dividendo/divisor);
	      JOptionPane.showMessageDialog(null,"Divisão: " + divisao);
	      resultado = true;
	    }

	    catch(ArithmeticException e){
	      JOptionPane.showMessageDialog(null,"Divisão por zero n�o permitida!");
	      erro = e.getMessage();
	      System.out.println("Erro: " + erro);
	      resultado = false;
	    }

	    catch(NumberFormatException | InputMismatchException e){
	      JOptionPane.showMessageDialog(null,"Somente inteiros s�o permitidos!");
	      erro = e.getMessage();
	      System.out.println("Erro: " + erro);
	      resultado = false;
	    }
	    return resultado;
	  }
}

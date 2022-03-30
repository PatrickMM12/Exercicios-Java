import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{
	String cpf;
	double salario;
	
	public Funcionario (String nome, String rg, LocalDate dtnascimento, String cpf, double salario) {
		super (nome, rg, dtnascimento);
		this.cpf = cpf;
		this.salario = salario;
	}
	public abstract double getBonificacao();

}

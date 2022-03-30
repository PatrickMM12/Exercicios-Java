import java.time.LocalDate;
public abstract class Secretaria extends Funcionario{
	public Secretaria (String nome, String rg, LocalDate dtnascimento, String cpf, double salario) {
		super (nome, rg, dtnascimento, cpf, salario);
	}

}

import java.time.LocalDate;

public abstract class Pessoa {
	//Atributos
	String nome, rg;
	LocalDate dtNascimento;
	
	//Construtores
	public Pessoa(String nome, String rg, LocalDate dtnascimento) {
		this.nome = nome;
		this.rg = rg;
		this.dtNascimento = dtnascimento;
	}
	
	// M�todos Abstratos
	public abstract String toString();
}

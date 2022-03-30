
public class Pessoa {
	String nome, rg;
	
	public Pessoa (String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + "]";
	}
}

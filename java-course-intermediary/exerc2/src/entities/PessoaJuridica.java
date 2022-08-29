package entities;

public class PessoaJuridica extends Contribuinte {
	private int numFuncionarios;
	
	public PessoaJuridica( ) {
		super();
	}

	public PessoaJuridica(String nome, Double renda, int numFuncionarios) {
		super(nome, renda);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double calculoImposto() {
		double impostoBasico = getNumFuncionarios() < 10 ? getRenda() * 0.14 : getRenda() * 0.16;
		
		return impostoBasico;
	}
	
}

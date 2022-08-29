package entities;

public class PessoaFisica extends Contribuinte {
	private Double gastosSaude;
	
	public PessoaFisica( ) {
		super();
	}

	public PessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculoImposto() {
		double impostoBasico = getRenda() < 2000.0 ? getRenda() * 0.15 : getRenda() * 0.25;
		
		impostoBasico -= getGastosSaude() * 0.5;
		
		if(impostoBasico < 0.0) {
			impostoBasico = 0.0;
		}
		
		return impostoBasico;
	}
	
}

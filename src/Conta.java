
public  class Conta {
	
	
	
	protected int numero;
	protected double saldo;
	protected String dono;
	
	
	
	public int getNumero() {
		return this.numero;
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	 void saca(double quantidade) {
		 double novoSaldo = this.saldo - quantidade;
		 this.saldo = novoSaldo;

	}
	void atualizar(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	

}

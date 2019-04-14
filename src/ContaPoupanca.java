
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	String nomeDocliente;
	
	
	
	public String getNomeDocliente() {
		return nomeDocliente;
	}
	
	public void atualiza(double taxa) {
		super.atualizar(3*taxa);
	}

	public int compareTo(ContaPoupanca outraConta) {
		return this.nomeDocliente.compareTo(outraConta.getNomeDocliente());
	
		
	}

	
	
		
	
	
	

}

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaOrdenacao {
	public void imprime (List<ContaPoupanca>T) {
		
	
		for(int i = 0; i < T.size(); i++) {
			Conta cc = T.get(i);
			System.out.println(cc.getNumero()+"");
		}
	}
	public static void main(String[] args) {
		
		TestaOrdenacao t = new TestaOrdenacao();
		
		List<ContaPoupanca> contas = new LinkedList<>();
	
		//Instancias de ContaPoupança
		ContaPoupanca a = new ContaPoupanca();
		a.numero = 1234;
		
		ContaPoupanca c = new ContaPoupanca();
		c.numero = 1973;
		
		ContaPoupanca d = new ContaPoupanca();
	    d.numero = 1462;
		
	    ContaPoupanca e = new ContaPoupanca();
		e.numero = 1854;
		
		contas.add(a);
		contas.add(c);
		contas.add(d);
		contas.add(e);
		
		
		//PROCESSO DE ORDENAÇÃO 
		Collections.sort(contas);
		
		// adicionando a lista
		
		
		System.out.println("Depois da Ordenação");
		t.imprime(contas);
		
		System.out.println();
		Collections.reverse(contas);
		
		t.imprime(contas);
		
		System.out.println();
		Collections.shuffle(contas);
		
		t.imprime(contas);
		
		System.out.println();
		Collections.rotate(contas,2);
		
		t.imprime(contas);
		
		
			
		
	
	}		
}
 
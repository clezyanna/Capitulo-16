import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
	public static void main(String[] args) {
		
		Conta c1 = new ContaPoupanca();
		c1.deposita(10000);
		Conta c2 = new ContaPoupanca();
		c2.deposita(3000);
		
		// cria o mapa
		//Map mapaDeContas = new HashMap();
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		// qual a conta do diretor?
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		
		
	}

}

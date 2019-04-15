import java.util.Set;
import java.util.TreeSet;

public class TestaTreeSet {
	public static void main(String[] args){

        //Criando Lista TreeSet.
        Set<Integer> lista = new TreeSet<Integer>();

        //Adicionando elementos de 1 a 1000.
        for(int i = 1 ; i < 1001 ; i++){
            lista.add(i);
        }

        //Imprimindo a lista em ordem crescente, mais uma segunda quebra de linha.
        System.out.println(lista+"\n");

        //Salva o último elemento da lista e exclui o mesmo logo após salvar.
        int b = ((TreeSet<Integer>) lista).pollLast();

        //Salva o primeiro elemento da lista e exclui o mesmo logo após salvar.
        int a = ((TreeSet<Integer>) lista).pollFirst();

        //exclui todos os elementos da lista.
        lista.clear();

        //laço, adicionando todos os elementos da lista inversamente.
        while(b >= a){
            lista.add(b);
            b--;
        }

        //Imprime a lista novamente em ordem crescente.
        System.out.println(lista);
    }
}



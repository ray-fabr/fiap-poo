package br.com.fiapride.main;

//import br.com.fiapride.model.Passageir
import br.com.fiapride.model.Tv;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
	        // INSTANCIAÇÃO
	        // O comando 'new' aloca memória para um novo objeto.
	        // Criando o primeiro passageiro (Objeto 1)
	        //Passageiro passageiro1 = new Passageiro();
	        //passageiro1.nome = "Ana Silva";
	        //passageiro1.saldo = 50.0;

	        // Criando o segundo passageiro (Objeto 2)
	        //Passageiro passageiro2 = new Passageiro();
	        //passageiro2.nome = "Carlos Souza";
	        //passageiro2.saldo = 12.50;

	        // Exibindo os dados no Console
	        //System.out.println("--- Sistema FiapRide ---");
	        //System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
	        //System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
	        
	        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
	   
		
		
		Tv tv1 = new Tv();
        tv1.polegadas = 95;
        tv1.smart = true;
        tv1.canalAtual = 5;
        tv1.ligada = true;
        tv1.tamanho = 241;

        Tv tv2 = new Tv();
        tv2.polegadas = 85;
        tv2.smart = false;
        tv2.canalAtual = 4;
        tv2.ligada = true;
        tv2.tamanho = 180;

        // Exibindo os dados no Console
        System.out.println("--- Sistema TV 1 ---");
        System.out.println("Polegadas: " + tv1.polegadas);
        System.out.println("Tv smart:" + tv1.smart);
        System.out.println("A tv está ligada:" + tv1.ligada);
        System.out.println("Canal Atual:" + tv1.canalAtual);
        System.out.println("O tamanho da tv em cm:" + tv1.tamanho);
        System.out.println("--- Sistema TV 2 ---");
        System.out.println("Polegadas:" + tv2.polegadas);
        System.out.println("Tv smart:" + tv2.smart);
        System.out.println("A tv está ligada:" + tv2.ligada);
        System.out.println("Canal Atual:" + tv2.canalAtual);
        System.out.println("O tamanho da tv em cm:" + tv2.tamanho);
	}

}
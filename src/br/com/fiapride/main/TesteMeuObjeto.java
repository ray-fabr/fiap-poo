package br.com.fiapride.main;

import br.com.fiapride.model.Tv;

public class TesteMeuObjeto {

	public static void main(String[] args) {
		
		
		Tv tv1 = new Tv(0,true,100);

        Tv tv2 = new Tv(95,true,90);
        
        
        


        System.out.println("--- Sistema TV 1 ---");
        System.out.println("Polegadas: " + tv1.getPolegadas());
        System.out.println("Tv smart:" + tv1.getSmart());
        tv1.setLigarTv(true);
        System.out.println("Canal Atual: " + tv1.getCanalAtual());
        tv1.setMudarCanal(7);
        System.out.println("Novo Canal: " + tv1.getCanalAtual());
        System.out.println("O tamanho da tv em cm:" + tv1.getTamanho());
        System.out.println("--- Sistema TV 2 ---");
        System.out.println("Polegadas:" + tv2.getPolegadas());
        System.out.println("Tv smart:" + tv2.getSmart());
        tv2.setLigarTv(false);
        System.out.println("Canal Atual: " + tv2.getCanalAtual());
        tv2.setMudarCanal(5);
        System.out.println("O tamanho da tv em cm:" + tv2.getTamanho());
	}

}

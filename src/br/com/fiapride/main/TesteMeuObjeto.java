package br.com.fiapride.main;

import br.com.fiapride.model.Tv;

public class TesteMeuObjeto {

	public static void main(String[] args) {
		
		
		Tv tv1 = new Tv(95,true,100,false,5);

        Tv tv2 = new Tv(95,true,100,true,5);
        
        
        


        System.out.println("--- Sistema TV 1 ---");
        System.out.println("Polegadas: " + tv1.getPolegadas());
        System.out.println("Tv smart:" + tv1.getSmart());
        System.out.println("A tv está ligada: " + tv1.getLigada());
        tv1.setLigarTv(true);
        System.out.println("Canal Atual: " + tv1.getCanalAtual());
        tv1.setMudarCanal(7);
        System.out.println("Novo Canal: " + tv1.getCanalAtual());
        System.out.println("O tamanho da tv em cm:" + tv1.getTamanho());
        System.out.println("--- Sistema TV 2 ---");
        System.out.println("Polegadas:" + tv2.getPolegadas());
        System.out.println("Tv smart:" + tv2.getSmart());
        System.out.println("A tv está ligada: " + tv2.getLigada());
        tv2.setLigarTv(true);
        System.out.println("Canal Atual: " + tv2.getCanalAtual());
        tv2.setMudarCanal(7);
	}

}

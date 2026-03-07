package br.com.fiapride.model;

public class Tv {
	public int polegadas;
    public boolean smart;
    public double tamanho;
    public boolean ligada;
    public int canalAtual;
    
    public Tv(int polegadas, boolean smart, double tamanho, boolean ligada, int canalAtual) {
    	this.polegadas = polegadas;
    	this.smart = smart;
    	this.tamanho = tamanho;
    	this.ligada = ligada;
    }
    
    public void ligarTv(boolean lagada) {
    	if (this.ligada == false) {
    		System.out.println("Eror: A tv está desligada");
    	}
    	else {
    		System.out.println("Tv ligada");
    	}
    }
    
    public void mudarCanal(int canalAtual) {
    	if (this.ligada == false) {
    		System.out.println("Eror:Não é possivel mudar de canal pois a tv está desligada");
    		return;
    	}
    	else {
    		this.canalAtual = canalAtual;
    		System.out.println("Tv ligada no canal " + this.canalAtual);
    	}
    }
}
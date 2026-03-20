package br.com.fiapride.model;

public class Tv {
	private int polegadas;
    private boolean smart;
    private double tamanho;
    public boolean ligada;
    public int canalAtual;
    
    public Tv(int polegadas, boolean smart, double tamanho) {
    	this.setPolegadas(polegadas);
    	this.setSmart(smart);
    	this.setTamanho(tamanho);
    }
    
// --- MÉTODOS GET (PRECISAM SER PUBLIC E TER RETORNO) ---
    
    public int getPolegadas() { // Era void, agora é int
        return this.polegadas;
    }

    public boolean getSmart() { // Era void, agora é boolean
        return this.smart;
    }

    public double getTamanho() { // Era void, agora é double
        return this.tamanho;
    }

    public boolean getLigada() {
        return this.ligada;
    }

    public int getCanalAtual() {
        return this.canalAtual;
    }

    // --- MÉTODOS SET (PODEM SER PRIVATE) ---
    
    private void setPolegadas(int polegadas) {
        if (polegadas <= 0) {
        	System.out.println("Erro polegadas inexistente");
        	return;
        }
        this.polegadas = polegadas;
    }

    private void setSmart(boolean smart) {
        this.smart = smart;
    }

    private void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    
    public void setLigarTv(boolean status) {
    	this.ligada = status;
    	
    	if (this.ligada) {
    		System.out.println("Tv ligada");
    	}
    	else {
    		System.out.println("Eror: A tv está desligada");
    	}
    }
    
    public void setMudarCanal(int canal) {
    	this.canalAtual = canal;
    	
    	if (this.ligada == false) {
    		System.out.println("Eror:Não é possivel mudar de canal pois a tv está desligada");
    		return;
    	}
    	else {
    		System.out.println("Tv ligada no canal " + this.canalAtual);
    	}
    }
}
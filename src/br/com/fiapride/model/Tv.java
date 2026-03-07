package br.com.fiapride.model;

public class Tv {
	private int polegadas;
    private boolean smart;
    private double tamanho;
    public boolean ligada;
    public int canalAtual;
    
    public Tv(int polegadas, boolean smart, double tamanho, boolean ligada, int canalAtual) {
    	this.setPolegadas(polegadas);
    	this.setSmart(smart);
    	this.setTamanho(tamanho);
    	this.setLigada(ligada);
    	this.setCanalAtual(canalAtual);
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
        this.polegadas = polegadas;
    }

    private void setSmart(boolean smart) {
        this.smart = smart;
    }

    private void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    private void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    private void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }
    
    public void setLigarTv(boolean lagada) {
    	if (this.ligada == false) {
    		System.out.println("Eror: A tv está desligada");
    	}
    	else {
    		System.out.println("Tv ligada");
    	}
    }
    
    public void setMudarCanal(int canalAtual) {
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
package ex01_extra;

public class Carro {
	
	private String modelo;
	private int ano;
	private double tanque;
	
	public Carro (String aModelo, int aAno, double aTanque) {
		this.modelo = aModelo;
		this.ano = aAno;
		this.tanque = aTanque;
		
	}
	//
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo; 
	}
	
	public int getAno () {
		return ano;
	}
	
	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public double getTanque() {
		return tanque;
	}
	
	public void setTanque(double tanque) {
		this.tanque = tanque;
	}
	// Método toString() sobrescrito para retornar uma representação textual do objeto Carro
    @Override
    public String toString() {
        String res = "";
        res += "Carro: \n";
        res += "Modelo: " + modelo + "\n";
        res += "Ano: " + ano + "\n";
        res += "Tanque: " + tanque+ "\n";
        return res;
    }
}

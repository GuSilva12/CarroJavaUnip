package lab01_02_extra;

public class Carro {
	//definição de variáveis, privadas para que acesso seja permitido apenas se constar requisição no devido código
	private String modelo;
	private int ano;
	private double tanque;
	
	//constructor, 'puxa' os valores das variaveis das instancias na classe TestePosto, para invocar quando solicitado nessa classe
	public Carro (String aModelo, int aAno, double aTanque) {
		this.modelo = aModelo;
		this.ano = aAno;
		this.tanque = aTanque;
		
	}
	
	//get retorna o valor do respectivo campo
	public String getModelo() {
		return modelo;
	}
	
	//set define o valor do campo com o valor fornecido
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

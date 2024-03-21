package ex01_extra;

public class TesteTanque {
	public static void main (String [] args) {
			
			Carro carro1 = new Carro("bmw", 2010, 10);
			
			System.out.println("\nCarro criado:");
			System.out.println(carro1);
			
			Posto.abastecerCarro(carro1, 25);
			
			System.out.println("\nDepois de abastecer com abastecerCarro:");
			System.out.println(carro1);
			
			Posto.abastecerTanque(carro1.getTanque(), 25);
			
			System.out.println("\nDepois de abastecer com abastecerTanque:");
			System.out.println(carro1);
			
		}
}

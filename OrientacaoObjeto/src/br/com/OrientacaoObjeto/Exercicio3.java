package br.com.OrientacaoObjeto;

public class Exercicio3 {

public static void main(String[] args) {

	
	Exercicio2 a1 = new Exercicio2();
		
		a1.modelo  = "Thiaguin";
		a1.capacidade = 180;
		a1.distanciadochao = 0;
		
		
		
		System.out.println("Modelo do avi?o: " + a1.modelo);
		System.out.println("Capacidade de pessoas: " + a1.capacidade + " pessoas");
		System.out.println("Distancia do ch?o na decolagem: " + a1.distanciadochao);
		
		System.out.println("");
		
		a1.voando(50);
				
		System.out.println("Distancia do ch?o quando no ar: " + a1.distanciadochao);
		
		a1.viajando();
	}
}
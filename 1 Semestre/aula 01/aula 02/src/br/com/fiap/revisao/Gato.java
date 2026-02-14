package br.com.fiap.revisao;

public class Gato extends Animal implements AnimalInterface{

	public Gato() {

	}

	public Gato(String nome,Integer qtdPatas, Double peso, Double altura, CorEnum cor, ClasseEnum classe, DietaEnum dieta,
			HabitatEnum habitat) {
		super(nome, qtdPatas, peso, altura, cor, classe, dieta, habitat);

	}

	@Override
	public void comunicar() {
		System.out.println("Gato mia");
	}
	
	@Override
	public void comunicarInterface() {
		System.out.println("Cão lati (via Interface)");
	}

}

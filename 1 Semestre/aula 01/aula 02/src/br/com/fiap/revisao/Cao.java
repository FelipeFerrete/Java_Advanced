package br.com.fiap.revisao;

public class Cao extends Animal implements AnimalInterface{

	public Cao() {

	}

	public Cao(String nome,Integer qtdPatas, Double peso, Double altura, CorEnum cor, ClasseEnum classe, DietaEnum dieta,
			HabitatEnum habitat) {
		super(nome, qtdPatas, peso, altura, cor, classe, dieta, habitat);

	}

	@Override
	public void comunicar() {
		System.out.println("Cao lati");
	}
	
	@Override
	public void comunicarInterface() {
		System.out.println("Cão lati (via Interface)");
	}

}

package br.com.fiap.revisao;

public class Gato extends Animal {

	public Gato() {

	}

	public Gato(Integer qtdPatas, Double peso, Double alura, CorEnum cor, ClasseEnum classe, DietaEnum dieta,
			HabitatEnum habitat) {

	}

	@Override
	public void comunicar() {
		System.out.println("Gato mia");
	}

}

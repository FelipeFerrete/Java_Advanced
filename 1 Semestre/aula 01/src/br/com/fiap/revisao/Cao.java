package br.com.fiap.revisao;

public class Cao extends Animal {

	public Cao() {

	}

	public Cao(Integer qtdPatas, Double peso, Double altura, CorEnum cor, ClasseEnum classe, DietaEnum dieta,
			HabitatEnum habitat) {
		super(qtdPatas, peso, altura, cor, classe, dieta, habitat);

	}

	@Override
	public void comunicar() {
		System.out.println("Cao lati");
	}

}

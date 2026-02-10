package br.com.fiap.revisao;

public class Main {

	public static void main(String[] args) {

		Animal a1 = new Cao(4, 22.32, 40.431, CorEnum.CARAMELO,ClasseEnum.MAMIFERO, DietaEnum.CARIVORO,HabitatEnum.TERRESTRE);
		Animal a2 = new Gato(4, 5.4, 15.1, CorEnum.PRETO, ClasseEnum.MAMIFERO, DietaEnum.ONIVARO, HabitatEnum.TERRESTRE);
		
		a1.comunicar();
		a2.comunicar();
	}

}

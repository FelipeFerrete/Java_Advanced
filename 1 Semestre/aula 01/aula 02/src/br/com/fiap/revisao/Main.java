package br.com.fiap.revisao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Animal a1 = new Cao("Sascha", 4, 22.32, 40.431, CorEnum.CARAMELO,ClasseEnum.MAMIFERO, DietaEnum.CARIVORO,HabitatEnum.TERRESTRE);
		Animal a2 = new Gato("Melao",4, 5.4, 15.1, CorEnum.PRETO, ClasseEnum.MAMIFERO, DietaEnum.ONIVARO, HabitatEnum.TERRESTRE);
		Cao a3 = new Cao("Trovao",4, 22.32, 40.431, CorEnum.CARAMELO,ClasseEnum.MAMIFERO, DietaEnum.CARIVORO,HabitatEnum.TERRESTRE);
		
		//Herdando Super/Interface
		a1.comunicar();
		a2.comunicar();
		a3.comunicarInterface();
		
		// LIST
		List<Animal> lista = new  ArrayList<Animal>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		
		for(Animal a : lista) {
			System.out.println("Nome: " + a.getNome() +"\nPeso: " + a.getPeso() + "\nCor: " + a.getCor());
			
		}
		
		System.out.print(lista.contains(a2)? "SIM":"NAO");
		
		lista.remove(a2);
		
		System.out.print(lista.contains(a2)? "SIM":"NAO");
		
		//DATE FORMAT
		
		Date dt = new Date();
		
		System.out.print(dt);
		
		System.out.print(new SimpleDateFormat("\ndd/MM/yyyy 'as' HH:mm:ss").format(dt));
		
		Calendar cal1 = Calendar.getInstance();
		
		cal1.set(Calendar.DAY_OF_MONTH, 8);
		cal1.set(Calendar.MONTH,10);
		cal1.set(Calendar.YEAR, 2005);
		
		System.out.print(new SimpleDateFormat("\n EEEE, dd 'de' MMMM").format(cal1.getTime()));
		
	}

}

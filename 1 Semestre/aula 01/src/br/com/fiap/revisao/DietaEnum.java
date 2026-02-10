package br.com.fiap.revisao;

public enum DietaEnum {
	
	CARIVORO("Carnivoro"), HERBIVORO("Herbivoro"), ONIVARO("Onivaro");
	
	private String descricao;
	
	DietaEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}


}

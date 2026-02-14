package br.com.fiap.revisao;

public enum ClasseEnum {
	
	MAMIFERO("Mamifeo"), ANFIOBIO("Anfibio"), REPTIL("Reptil"), PEIXE("Peixe"), AVE("Ave");
	
	private String descricao;
	
	ClasseEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}

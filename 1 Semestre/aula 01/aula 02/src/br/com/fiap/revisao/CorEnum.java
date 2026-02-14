package br.com.fiap.revisao;

public enum CorEnum {
	
	MARROM("Marrom"),PRETO("Preto"),BRANCO("Branco"),RAJADO("Rajado"), CARAMELO("Caramelo");
	
	private String descricao;
	
	CorEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}

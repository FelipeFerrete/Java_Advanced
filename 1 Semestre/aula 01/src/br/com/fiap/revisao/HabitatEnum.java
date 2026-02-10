package br.com.fiap.revisao;

public enum HabitatEnum {
	
	TERRESTRE("Terrestre"),AEREO("AEREO");
	
	private String descricao;
	
	HabitatEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}


}

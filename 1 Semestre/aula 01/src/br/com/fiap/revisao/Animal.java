package br.com.fiap.revisao;

public class Animal {
	private Integer qtdPatas;
	private Double peso;
	private Double altura;
	private CorEnum cor;
	private ClasseEnum classe;
	private DietaEnum dieta;
	private HabitatEnum habitat;

	public Animal() {
	}

	public Animal(Integer qtdPatas, Double peso, Double altura, CorEnum cor, ClasseEnum classe, DietaEnum dieta,
			HabitatEnum habitat) {
		setQtdPatas(qtdPatas);
		setPeso(peso);
		setAltura(altura);
		setCor(cor);
		setClasse(classe);
		setDieta(dieta);
		setHabitat(habitat);

	}

	public void comunicar() {

	}

	public Integer getQtdPatas() {
		return this.qtdPatas;
	}

	public void setQtdPatas(Integer qtdPatas) {

		if (qtdPatas <= 1 && qtdPatas <= 1306)
			this.qtdPatas = qtdPatas;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public CorEnum getCor() {
		return cor;
	}

	public void setCor(CorEnum cor) {
		this.cor = cor;
	}

	public ClasseEnum getClasse() {
		return classe;
	}

	public void setClasse(ClasseEnum classe) {
		this.classe = classe;
	}

	public DietaEnum getDieta() {
		return dieta;
	}

	public void setDieta(DietaEnum dieta) {
		this.dieta = dieta;
	}

	public HabitatEnum getHabitat() {
		return habitat;
	}

	public void setHabitat(HabitatEnum habitat) {
		this.habitat = habitat;
	}

}

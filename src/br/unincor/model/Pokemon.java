package br.unincor.model;

public class Pokemon {
	
	private String nome; //Nome do pokemon - sem validação
	private String tipo; //Tipo do pokemon - sem validação
	private Double peso; //Peso do pokemon - deve ser um valor positivo
	private Double altura; //Altura do pokemon - deve ser um valor positivo
	private Long cp; //Pontos de combate - deve ser um valor positivo
	
	public Pokemon(String nome, String tipo, Double peso, Double altura) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		if(peso>=0){
			this.peso = peso;
		}else{
			this.peso=0.0;
		}
		if(altura>=0){
			this.altura = altura;
		}else{
			this.altura=0.0;
		}
		this.cp = (long) ((Math.random()*(50-1))+1);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		if(peso>=0){
			this.peso = peso;
		}else{
			this.peso=0.0;
			}
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		if(altura>=0){
			this.altura = altura;
		}else{
			this.altura=0.0;
		}
	}
	public Long getCp() {
		return cp;
	}
	public void setCp(Long cp) {
		if(cp>=0){
			this.cp = cp;
		}else{
			this.cp=0L;
		}
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", tipo=" + tipo + ", peso=" + peso + ", altura=" + altura + ", cp=" + cp
				+ "]";
	}

	/** Implementar este método para retornar os dados do pokemon **/
	public String verDados() {
		return toString();
	}
}

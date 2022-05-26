package PrimeiroDesafio;

public class Pessoa {

	private String nome;
	private String genero;
	private String corDosOlhos;
	private String corDoCabelo;
	private int anoDeNascimento;
	private String dataDeNascimento;
	private String tipoSanguineo;
	private String fatorRH;
	
	public void calcularIdade(int anoDeNascimento) {
		int idadeAtual = 2022 - anoDeNascimento;
		System.out.println(idadeAtual);
	}
	
	public void probabilidade(String corDosOlhos1, String corDosOlhos2) {
		if (corDosOlhos1.equals("Castanho")  && corDosOlhos2.equals("Castanho")) {
			System.out.println("75% castanho/19% verdes/6% azuis");
		} else if (corDosOlhos1.equals("Verde")  && corDosOlhos2.equals("Castanho")) {
			System.out.println("50% castanho/37% verdes/12% azuis");
		} else if(corDosOlhos1.equals("Azul")  && corDosOlhos2.equals("Castanho")) {
			System.out.println("50% castanho/0% verdes/50% azuis");
		} else if(corDosOlhos1.equals("Verde")  && corDosOlhos2.equals("Verde")) {
			System.out.println("-1% castanho/75% verdes/25% azuis");
		} else if(corDosOlhos1.equals("Verde")  && corDosOlhos2.equals("Azul")) {
			System.out.println("0% castanho/50% verdes/50% azuis");
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCorDosOlhos() {
		return corDosOlhos;
	}
	public void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}
	public String getCorDoCabelo() {
		return corDoCabelo;
	}
	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getFatorRH() {
		return fatorRH;
	}
	public void setFatorRH(String fatorRH) {
		this.fatorRH = fatorRH;
	}
	
	
}

package it.generationitaly.app.entity;

public class Persona {

	private int id;
	private String codiceFiscale;
	private String nome;
	private String cognome;

	public Persona(int id, String codiceFiscale, String nome, String cognome) {
		super();
		this.id = id;
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome
				+ "]";
	}

}

package it.generationitaly.app.repository;

import java.util.List;

import it.generationitaly.app.entity.Utente;

public interface UtenteRepository {

	void save(Utente utente);
	void update(Utente utente);
	void delete(Utente utente);
	Utente findById(int id);
	List<Utente> findAll();
}

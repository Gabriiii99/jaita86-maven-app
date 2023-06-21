package it.generationitaly.app.repository;

import java.util.List;

public interface UtenteRepository {

	void save(Utente utente);
	void update(utente utente);
	void delete(Utente utente);
	Utente findById(int id);
	List<Utente> findAll();
}

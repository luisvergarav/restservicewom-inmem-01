package domain.model.service;

import java.util.Collection;

import domain.model.entities.DefaultEntity;
import domain.model.repository.Repository;


/**
 *
 * @author Luis Vergara
 * @param <TE>
 * @param <T>
 */
public abstract class ReadOnlyBaseService<TE, T> {

	private Repository<TE, T> repository;

	ReadOnlyBaseService(Repository<TE, T> repository) {
		this.repository = repository;
	}

	ReadOnlyBaseService() {
	
	}
	public abstract DefaultEntity get(T id) throws Exception;

	public abstract Collection<TE> getAll(T t) throws Exception;
}

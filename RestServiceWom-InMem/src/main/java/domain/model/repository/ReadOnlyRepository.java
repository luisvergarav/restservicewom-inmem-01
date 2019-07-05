package domain.model.repository;


import java.util.Collection;

import domain.model.entities.DefaultEntity;


/**
 *
 * @author Luis Vergara
 * @param <TE>
 * @param <T>
 */
public interface ReadOnlyRepository<TE, T> {

    //long Count;
    /**
     *
     * @param id
     * @return
     */
    boolean contains(T id);

    /**
     *
     * @param id
     * @return
     */
    DefaultEntity get(T id) throws Exception;

    /**
     *
     * @return
     */
    Collection<TE> getAll(T t) throws Exception;
}

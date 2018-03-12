package ro.springhotel.hotel.dao;

import ro.springhotel.hotel.domain.AbstractModel;

import java.util.Collection;

/**
 * @author Raul
 * @param <T> Generic parameter
 */
public interface BaseDAO<T extends AbstractModel> {

    Collection<T> getAll();

    T findById(Long id);

    T update(T model);

    boolean delete(T model);
}

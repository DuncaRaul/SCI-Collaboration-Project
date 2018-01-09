package ro.springhotel.hotel.dao;

import ro.springhotel.hotel.domain.AbstractModel;

import java.util.Collection;

public interface BaseDAO <T extends AbstractModel> {

    Collection<T> getAll();

    AbstractModel findById(Long id);

    T update(T model);

    boolean delete(T model);
}

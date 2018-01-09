package ro.springhotel.hotel.dao.inmemory;

import ro.springhotel.hotel.dao.BaseDAO;
import ro.springhotel.hotel.domain.AbstractModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Raul Dunca
 */
public class IMBaseDAO<T extends AbstractModel> implements BaseDAO<T>{

    private Map<Long, T> models = new HashMap<Long, T>();

    private static AtomicLong ID = new AtomicLong(System.currentTimeMillis());

    @Override
    public Collection<T> getAll() {
        return models.values();
    }

    @Override

    public T findById(long id) {

        return models.get(id);
    }

    @Override
    public T update(T model) {
        if (model.getId() <= 0) {
            model.setId(ID.getAndIncrement());
        }

        models.put(model.getId(), model);
        return model;
    }

    @Override
    public boolean delete(AbstractModel model) {
        boolean result = models.containsKey(model.getId());

        if (result)
            models.remove(model.getId());
        return result;
    }
}

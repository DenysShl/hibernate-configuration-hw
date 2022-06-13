package mate.academy.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {
    T add(T element);

    Optional<T> get(Long id);

    List<T> getAll();

    T update(T element);

    boolean delete(Long id);
}

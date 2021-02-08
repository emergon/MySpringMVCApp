package emergon.repository;

import java.util.List;

public interface CrudRepo<E> {
    
    E save(E e);
    boolean delete(int id);
    E findById(int id);
    List<E> findAll();
}

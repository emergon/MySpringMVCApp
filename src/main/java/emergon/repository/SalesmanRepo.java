package emergon.repository;

import emergon.entity.Salesman;
import emergon.entity.Salesman;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class SalesmanRepo extends HibernateUtil<Salesman> implements CrudRepo<Salesman>{

    @Override
    public Salesman save(Salesman s) {
        return super.save(s);
    }

    @Override
    public boolean delete(int id) {
        return super.delete(Salesman.class, id);
    }

    @Override
    public Salesman findById(int id) {
        return super.find(Salesman.class, id);
    }

    @Override
    public List<Salesman> findAll() {
        return super.findAll("Salesman.findAll");
    }
    
}

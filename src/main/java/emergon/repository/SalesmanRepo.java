package emergon.repository;

import emergon.entity.Salesman;
import emergon.entity.Salesman;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class SalesmanRepo extends HibernateUtil<Salesman> implements CrudRepo<Salesman>{

    @Override
    public Salesman save(Salesman s) {
        return super.save(s);
    }

    @Override
    public void delete(int id) {
        super.delete(Salesman.class, id);
    }

    @Override
    public Salesman findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Salesman> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public List<Salesman> findAll(){
//        return super.findAll("Salesman.findAll");
//    }
//    
//    public Salesman find(int id){
//        return super.find(Salesman.class, id);
//    }
    
}

package emergon.service;

import emergon.entity.Salesman;
import emergon.repository.SalesmanRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SalesmanService {

    @Autowired
    SalesmanRepo salesmanRepo;
    
    public List<Salesman> getSalesmen() {
        List<Salesman> salesmen = salesmanRepo.findAll();
        return salesmen;
    }

    public Salesman saveSalesman(Salesman salesman) {
        return salesmanRepo.save(salesman);
    }

    public String deleteSalesman(int id) {
        boolean deleted = salesmanRepo.delete(Salesman.class, id);
        String message;
        if(deleted == true){
            message = "Salesman deleted successfully";
        }else{
            message = "Salesman cannot be deleted. Referenced from another table!!";
        }
        return message;
    }

    public Salesman getSalesmanById(int id) {
        return salesmanRepo.findById(id);
    }
    
    public List<String> getCities(){
        List<String> cities = new ArrayList();
        cities.add("Athens");
        cities.add("Patra");
        cities.add("Irakleio");
        cities.add("Sparta");
        cities.add("Larissa");
        cities.add("Kalamata");
        return cities;
    }
}

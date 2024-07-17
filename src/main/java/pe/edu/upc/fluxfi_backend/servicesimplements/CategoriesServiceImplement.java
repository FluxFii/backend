package pe.edu.upc.fluxfi_backend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fluxfi_backend.entities.Categories;
import pe.edu.upc.fluxfi_backend.repositories.CategoriesRepository;
import pe.edu.upc.fluxfi_backend.servicesinterfaces.CategoriesService;

import java.util.List;

@Service
public class CategoriesServiceImplement implements CategoriesService {

    @Autowired
    private CategoriesRepository cr;

    @Override
    public void insert(Categories categories) {
        cr.save(categories);
    }

    @Override
    public void delete(int idCategories) {
        cr.deleteById(idCategories);
    }

    @Override
    public Categories listarId(int idCategories) {
        return cr.findById(idCategories).orElse(new Categories());
    }

    @Override
    public List<Categories> list() {
        return cr.findAll();
    }


}

package pe.edu.upc.fluxfi_backend.servicesinterfaces;

import pe.edu.upc.fluxfi_backend.entities.Categories;

import java.util.List;

public interface CategoriesService {

    public void insert(Categories categories);

    public void delete(int idCategories);

    public Categories listarId(int idCategories);

    public List<Categories> list();




}

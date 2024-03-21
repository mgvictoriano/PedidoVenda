package tech.mgaia.repository;


import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import tech.mgaia.model.Categoria;

import java.io.Serializable;
import java.util.List;

public class CategoriaRepository implements Serializable {

    @Inject
    private EntityManager entityManager;

    public List<Categoria> buscarCategoriasRaizes() {
        return entityManager.createQuery("from Categoria", Categoria.class).getResultList();
    }

    public Categoria porId(Long id) {
        return entityManager.find(Categoria.class, id);
    }



}

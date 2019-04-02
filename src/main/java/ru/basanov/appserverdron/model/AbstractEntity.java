package ru.basanov.appserverdron.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class AbstractEntity {

    @PersistenceContext
    protected EntityManager entityManager;

    public <T> T getEntity(TypedQuery<T> query) {
        final List<T> resutList = query.getResultList();
        if (resutList.isEmpty()) {
            return null;
        }
        return resutList.get(0);
    }

    public void persist(Object o) {
        entityManager.persist(o);
    }
}

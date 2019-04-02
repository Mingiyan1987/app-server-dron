package ru.basanov.appserverdron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.basanov.appserverdron.repository.AdressRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class AdressService {

    @Autowired
    private AdressRepository adressRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void persist(Object o) {
        entityManager.persist(o);
    }
}

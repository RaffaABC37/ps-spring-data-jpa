package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class SessionCustomJpaRepositoryImpl implements SessionCustomJpaRepository {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public List<Session> customGetSessions() {
    return entityManager.createQuery("select s from Session s").getResultList();
  }
}

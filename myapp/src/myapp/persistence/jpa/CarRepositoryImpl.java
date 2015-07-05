package myapp.persistence.jpa;

import persistence.jpa.JpaRepository;
import myapp.domain.Car;
import myapp.persistence.CarRepository;
import myapp.domain.Car;
import myapp.persistence.CarRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Created by brunodevesa on 16/04/15.
 */
public class CarRepositoryImpl
        extends JpaRepository<Car, Integer>
        implements CarRepository {


    public CarRepositoryImpl() {

    }

    @Override
    protected String persistenceUnitName() {
        return PersistenceSettings.PERSISTENCE_UNIT_NAME;
    }



    public boolean add(Car entity) {
        if (entity == null) {
            throw new IllegalArgumentException();
        }

        EntityManager em = entityManager();
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(entity);
            tx.commit();
        } finally {

            em.close();
            return true;
        }
    }



}




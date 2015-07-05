/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.persistence.jpa;


import myapp.persistence.CarRepository;
import myapp.persistence.RepositoryFactory;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class JpaRepositoryFactory implements RepositoryFactory {

    @Override
    public CarRepository getCarRepository() {
        return new CarRepositoryImpl();
    }


}

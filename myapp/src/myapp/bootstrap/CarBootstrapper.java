/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.bootstrap;

import myapp.aplication.RegisterCarController;
import myapp.domain.CarType;

/**
 *
 * @author Paulo Gandra Sousa
 */
class CarBootstrapper {

    public void execute() {
        final RegisterCarController registerCarController = new RegisterCarController();

        // FIXME rever como devemos por este código mais elegante
        try {
            registerCarController.registerCar("Peugeot", 90, CarType.SMALL);
        } catch (IllegalStateException ex) {
            //nothing to do
        }
        // FIXME rever como devemos por este código mais elegante
        try {
            registerCarController.registerCar("Lamborghini", 490, CarType.LUXURY);
        } catch (IllegalStateException ex) {
            //nothing to do
        }
    }
}

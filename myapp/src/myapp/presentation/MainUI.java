package myapp.presentation;


import myapp.aplication.ListCarsController;
import myapp.bootstrap.Bootstraper;
import myapp.domain.Car;
import util.Colors;

import java.util.List;

/**
 * Created by bruno.devesa on 04-07-2015.
 */
public class MainUI {


    public MainUI() {

    }

    public void run() {
        System.out.print(Colors.ANSI_GREEN);
        System.out.println("beggining .. bootstrap is putting some cars in database");
        System.out.print(Colors.ANSI_RESET);

    /*    RegisterCarController registerCarController = new RegisterCarController();

        registerCarController.registerCar("Fiat", 90, CarType.SMALL);
        registerCarController.registerCar("Maserati", 300, CarType.LUXURY);*/

        Bootstraper bootstraper = new Bootstraper();
        bootstraper.execute();

        System.out.print(Colors.ANSI_BLUE);
        System.out.println("list of cars created by Factory pattern and stored in database:");
        System.out.print(Colors.ANSI_RESET);

        ListCarsController listCarsController = new ListCarsController();
        List<Car> carlist = listCarsController.getAllCars();

        for (int i = 0; i < carlist.size(); i++) {
            System.out.println(carlist.get(i).toString());
        }

        System.out.println("\ncars driving...");
        for (int i = 0; i <carlist.size() ; i++) {
            carlist.get(i).riding();
        }




    }


}

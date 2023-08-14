package inc.codeman.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
    //Car car;
    //Bike bike;
    Vehicle vehicle;
    @Autowired
    public Traveller(@Qualifier("bike") Vehicle vehicle){
        //this.car = new Car();
        this.vehicle = vehicle;
    }

    public  void  startJourney(){
        //this.car.move();
        this.vehicle.move();
    }
}

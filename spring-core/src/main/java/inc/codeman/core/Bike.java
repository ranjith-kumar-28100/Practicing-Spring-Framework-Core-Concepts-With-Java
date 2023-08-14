package inc.codeman.core;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle {
    @Override
    public  void  move(){
        System.out.println("Bike is moving!!!");
    }
}

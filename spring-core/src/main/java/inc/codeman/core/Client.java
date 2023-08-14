package inc.codeman.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //Traveller traveller = new Traveller(new Bike());
        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.startJourney();
    }
}

package inc.codeman.core.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{
    private Address address;

    Student(Address address) {
        this.address = address;
    }
    public void print(){
        System.out.println("Student's Method is invoked");
    }
}
class Address{
    public void print(){
        System.out.println("Address's Method is invoked");
    }
    public void init(){
        System.out.println("Doing some Initialization Work!!!");
    }
    public void destroy(){
        System.out.println("Destruction Going on!!!!");
    }
}
@Configuration
class AppConfig{
@Bean(name="addressBean",initMethod = "init",destroyMethod = "destroy")
public Address address(){
    return new Address();
}
@Bean
public Student student(){
    return new Student(address());
}
}
public class BeanAnnotationDemo {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Address address = (Address) context.getBean("addressBean");
            Student student = context.getBean(Student.class);
            address.print();
            student.print();
            String[] beanDefinitionNames = context.getBeanDefinitionNames();
            for (String name : beanDefinitionNames) {
                System.out.println(name);
            }
        }
    }
}

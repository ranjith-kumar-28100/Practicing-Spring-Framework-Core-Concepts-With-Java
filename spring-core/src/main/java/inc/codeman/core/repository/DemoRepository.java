package inc.codeman.core.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public void run(){
        System.out.println("Hello from Repository");
    }
}

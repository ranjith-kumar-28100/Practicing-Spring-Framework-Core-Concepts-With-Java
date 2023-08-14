package inc.codeman.core;

import inc.codeman.core.controller.DemoController;
import inc.codeman.core.repository.DemoRepository;
import inc.codeman.core.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoController demoController=context.getBean(DemoController.class);
        demoController.run();
        DemoRepository demoRepository = context.getBean(DemoRepository.class);
        demoRepository.run();
        DemoService demoService = context.getBean(DemoService.class);
        demoService.run();
    }


}

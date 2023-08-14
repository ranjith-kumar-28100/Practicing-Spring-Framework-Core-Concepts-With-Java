package inc.codeman.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = context.getBean(EmailService.class);
        String[] emails = emailService.sendEmail();
        for (String mail:emails)
            System.out.println(mail);
    }
}

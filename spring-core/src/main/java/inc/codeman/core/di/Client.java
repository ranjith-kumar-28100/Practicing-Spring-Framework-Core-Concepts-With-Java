package inc.codeman.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
//        SMSService smsService = new SMSService();
//        EmailService emailService = new EmailService();
//        MessageSender messageSender1 = new MessageSender(smsService);
//        MessageSender messageSender1 = new MessageSender(emailService);
//        messageSender1.sendMessage("Hi There, Whatsupp!!");
//        messageSender1.sendMessage("Hi There, Whatsupp!!");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage("I Love You!!!");
    }
}

package inc.codeman.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
//    @Autowired
//    @Qualifier("emailService")
    private MessageService messageService;

    @Autowired
    public MessageSender(MessageService messageService) {
        System.out.println("Constructor Based Dependency Injection");
        this.messageService = messageService;
    }

//    @Autowired
//    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
//        System.out.println("Setter Based Dependency Injection");
//        this.messageService = messageService;
//    }

    public void sendMessage(String msg){
        messageService.sendMessage(msg);
    }
}

package inc.codeman.core.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SMSService implements MessageService{
    @Override
    public void sendMessage(String message){
        System.out.println("Message: "+message+" is sent via SMS");
    }
}

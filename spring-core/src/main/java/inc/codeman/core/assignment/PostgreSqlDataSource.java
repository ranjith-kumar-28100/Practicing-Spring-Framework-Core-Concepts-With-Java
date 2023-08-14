package inc.codeman.core.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSqlDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String[] emails = {"abc@yahoo.com","545@yyy.com"};
        return emails;
    }
}

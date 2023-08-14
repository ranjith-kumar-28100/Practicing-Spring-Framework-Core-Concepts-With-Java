package inc.codeman.core.assignment;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String[] emails = {"aknkna@gmail.com","sdkscj@yahoo.com"};
        return emails;
    }
}

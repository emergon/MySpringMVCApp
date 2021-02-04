package emergon.config;


import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement//Inform Spring container to take into account annotations about @Transactional
public class DatabaseConfig {
    
    //datasource
    public DataSource datasource(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/sales?serverTimezone=Europe/Athens");
        datasource.setUsername("root");
        datasource.setPassword("root");
        return datasource;
    }
    
    //hibernate properties 
    private Properties hibernateProperties(){
        //Properties object is something like a HashMap
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");
        return null;
    }
    //SessionFactory
    
    //method to take care of transactions
}

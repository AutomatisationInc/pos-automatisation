package ua.automatisationInc.pos.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Man on 21.03.2017.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("ua.automatisationInc.pos.dao")
public class PersistenceConfig {
}

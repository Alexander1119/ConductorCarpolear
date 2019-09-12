package Carpoolear;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {


    @Bean
    CommandLineRunner initDatabase(ConductorRepositorio repositorio){
        return args -> {
          log.info("Precaraga"+ repositorio.save(new Conductor("Miguel Rollano","123456","78945612")));
          log.info("Precaraga"+ repositorio.save(new Conductor("Wilson Gironda","485412","78921563")));
        };
    }
}

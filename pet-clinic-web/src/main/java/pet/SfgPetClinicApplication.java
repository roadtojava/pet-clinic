package pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "guru.springframework.sfgpetclinic.*","pet.*" })
@EntityScan("guru.springframework.sfgpetclinic.*")
@EnableJpaRepositories("guru.springframework.sfgpetclinic.*")
//@EnableAutoConfiguration
@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }
}

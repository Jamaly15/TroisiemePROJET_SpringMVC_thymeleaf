
package yann.projet.bdccspringmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import yann.projet.bdccspringmvc.entities.Product;
import yann.projet.bdccspringmvc.repository.ProductRepository;

@SpringBootApplication
public class BdccSpringMvcApplication {

    private final ProductRepository productRepository;

    public BdccSpringMvcApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BdccSpringMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner start() {
        return args -> {

            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(5400)
                    .quantity(12)
                    .build());

            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(4400)
                    .quantity(11)
                    .build());

            productRepository.save(Product.builder()
                    .name("Smartphone")
                    .price(8800)
                    .quantity(22)
                    .build());
            productRepository.findAll().forEach(product -> {
                System.out.println(product.toString());
            });
        };
    }
}

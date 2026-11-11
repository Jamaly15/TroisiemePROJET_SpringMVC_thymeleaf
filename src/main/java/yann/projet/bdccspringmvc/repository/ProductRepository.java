package yann.projet.bdccspringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yann.projet.bdccspringmvc.entities.Product;


public interface ProductRepository  extends JpaRepository<Product, Long> {

}

package za.ac.cput.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.store.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

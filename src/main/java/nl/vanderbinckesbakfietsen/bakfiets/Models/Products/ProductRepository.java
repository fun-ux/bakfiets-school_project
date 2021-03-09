package nl.vanderbinckesbakfietsen.bakfiets.Models.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
   @Query("SELECT u FROM Product u WHERE u.Naam = ?1")
   Product findByNaam(String Naam);

   @Query("SELECT u FROM Product u WHERE u.productId = ?1")
   Product findById(int id);
}

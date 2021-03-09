package nl.vanderbinckesbakfietsen.bakfiets.Models.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OptionalsRepository extends JpaRepository<Optionals, Long> {
    @Query("SELECT u FROM Optionals u WHERE u.Naam = ?1")
    Optionals findByNaam(String Naam);

    @Query("SELECT u FROM Optionals u WHERE u.productId = ?1")
    Optionals findById(int id);
}


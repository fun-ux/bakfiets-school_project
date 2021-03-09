package nl.vanderbinckesbakfietsen.bakfiets.Models.Products;

  import org.springframework.data.jpa.repository.JpaRepository;
  import org.springframework.data.jpa.repository.Query;
  import org.springframework.data.repository.CrudRepository;

public interface HuurtariefRepository extends JpaRepository<Huurtarief, Long> {

    @Query("SELECT u FROM Huurtarief u WHERE u.Dagen = ?1")
    Huurtarief findByDag(int Dagen);

    @Query("SELECT u FROM Huurtarief u WHERE u.id = ?1")
    Huurtarief findById(int id);
}

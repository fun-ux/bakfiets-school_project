package nl.vanderbinckesbakfietsen.bakfiets.Models.Products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Huurtarief {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Integer Dagen;
    private Double Huurprijs;

    protected Huurtarief() {
    }

    public Huurtarief(Integer dagen, Double huurprijs) {
        Dagen = dagen;
        Huurprijs = huurprijs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getDagen() {
        return Dagen;
    }

    public void setDagen(Integer dagen) {
        Dagen = dagen;
    }

    public Double getHuurprijs() {
        return Huurprijs;
    }

    public void setHuurprijs(Double huurprijs) {
        Huurprijs = huurprijs;
    }

    @Override
    public String toString() {
        return "Huurtarief{" +
                "id=" + id +
                ", Dagen=" + Dagen +
                ", Huurprijs=" + Huurprijs +
                '}';
    }
}

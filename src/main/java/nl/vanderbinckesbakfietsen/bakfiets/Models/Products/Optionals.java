package nl.vanderbinckesbakfietsen.bakfiets.Models.Products;

        import javax.persistence.*;

@Entity
@Table(name = "Optionals")
public class Optionals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String Naam;
    private Double Prijs;
    private String productDescription;
    private String uniqueName;


    protected Optionals() {
    }

    public Optionals(String naam, Double prijs, String productDescription, String uniqueName) {
        this.Naam = naam;
        this.Prijs = prijs;
        this.productDescription = productDescription;
        this.uniqueName = uniqueName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public Double getPrijs() {
        return Prijs;
    }

    public void setPrijs(Double prijs) {
        Prijs = prijs;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public String toString() {
        return "Optionals{" +
                "productId=" + productId +
                ", Naam='" + Naam + '\'' +
                ", Prijs=" + Prijs +
                ", productDescription='" + productDescription + '\'' +
                ", uniqueName='" + uniqueName + '\'' +
                '}';
    }
}

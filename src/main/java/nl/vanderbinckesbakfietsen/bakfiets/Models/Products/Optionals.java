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
    private String image;


    protected Optionals() {
    }

    public Optionals(String naam, Double prijs, String productDescription, String uniqueName, String image) {
        this.Naam = naam;
        this.Prijs = prijs;
        this.productDescription = productDescription;
        this.uniqueName = uniqueName;
        this.image = image;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Optionals{" +
                "productId=" + productId +
                ", Naam='" + Naam + '\'' +
                ", Prijs=" + Prijs +
                ", productDescription='" + productDescription + '\'' +
                ", uniqueName='" + uniqueName + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

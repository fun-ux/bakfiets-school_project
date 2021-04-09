package nl.vanderbinckesbakfietsen.bakfiets.Models.Products;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String Naam;
    private Double Prijs;
    private String productDescription;
    private String uniqueName;
    private String slide;
    private String image;

    protected Product() {
    }

    public Product(String naam, Double prijs, String productDescription, String uniqueName, String slide, String image) {
        this.Naam = naam;
        this.Prijs = prijs;
        this.productDescription = productDescription;
        this.uniqueName = uniqueName;
        this.slide = slide;
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


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getSlide() {
        return slide;
    }

    public void setSlide(String slide) {
        this.slide = slide;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", Naam='" + Naam + '\'' +
                ", Prijs=" + Prijs +
                ", productDescription='" + productDescription + '\'' +
                ", uniqueName='" + uniqueName + '\'' +
                ", slide='" + slide + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

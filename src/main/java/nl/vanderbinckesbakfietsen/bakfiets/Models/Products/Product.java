package nl.vanderbinckesbakfietsen.bakfiets.Models.Products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String Naam;
    private Double Prijs;
    private String productDescription;

    protected Product() {
    }

    public Product(String naam, Double prijs, String productDescription) {
        this.Naam = naam;
        this.Prijs = prijs;
        this.productDescription = productDescription;
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", Naam='" + Naam + '\'' +
                ", Prijs=" + Prijs +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}

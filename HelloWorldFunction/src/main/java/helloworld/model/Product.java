package helloworld.model;
import org.springframework.data.annotation.*;
import javax.persistence.Id;
import org.springframework.data.repository.*;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @Column
    private String productName;
    @Column
    private String description;

    @Column
    private double price;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getPrice() {
    	return price;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
}
package pl.jsql.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "car")
class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String model;

    String type;

    BigDecimal price;

    Integer year;

    Integer owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }
}

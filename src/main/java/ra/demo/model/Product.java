package ra.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String name;
    private double price;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id",foreignKey = @ForeignKey(name="fk_1"))
    private Catalog catalog;
    @ManyToMany
    @JoinTable(
            name = "product_size",
            joinColumns = @JoinColumn(name = "product_id",foreignKey = @ForeignKey(name="fkey_1")),
            inverseJoinColumns = @JoinColumn(name = "size_id",foreignKey = @ForeignKey(name = "fkey_2"))
    )
    private List<Size> sizes;
    @OneToOne
    private Image image;

}

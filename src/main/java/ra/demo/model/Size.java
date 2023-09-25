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
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "sizes")
    private List<Product> productList;
}

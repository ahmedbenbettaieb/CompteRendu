package Demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Item_entity")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private float weight;
    private String description;
    private float price;
    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderdet;

}

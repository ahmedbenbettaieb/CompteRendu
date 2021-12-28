package Demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "OrderDetail_entity")

public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int qty;
    private float tax;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;


}

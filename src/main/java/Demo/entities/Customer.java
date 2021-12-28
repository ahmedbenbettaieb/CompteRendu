package Demo.entities;
import java.util.*;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
@Data
@Table(name = "Customer_entity")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String deliveryAdress;
    private String contact;
    private boolean active;
    @OneToMany(mappedBy = "customer")
    private List<Order> order;




}

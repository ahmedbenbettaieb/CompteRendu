package Demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Order_entity")


class Order {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 private Date createdate;
@ManyToOne
@JoinColumn(name = "customer_id")
private Customer customer;
 @OneToMany(mappedBy = "order")
 private List<OrderDetail> orderdetail;
 @OneToMany
private List<Delivery> delivery;
 @OneToOne(mappedBy = "order")
 private OrderStatus orderStatus;


 public void setId(Integer id) {
  this.id = id;
 }

 public Date getCreatedate() {
  return createdate;
 }

 public void setCreatedate(Date createdate) {
  this.createdate = createdate;
 }

 public Customer getCustomer() {
  return customer;
 }

 public void setCustomer(Customer customer) {
  this.customer = customer;
 }

 public Integer getId() {
  return id;
 }
}

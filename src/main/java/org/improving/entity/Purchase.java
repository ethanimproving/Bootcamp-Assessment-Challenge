package org.improving.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "purchases")
public class Purchase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchaseId", unique = true)
    private int purchaseId;

    @Column(name = "product")
    private String product;

    @Column(name = "purchaser")
    private String purchaser;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "costPerProduct")
    private double costPerProduct;

    @Override
    public String toString() {
        return "{" + this.purchaser + ", " + this.product + ": " + this.costPerProduct + " * " + this.quantity + "}";
    }
}

package org.improving.entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Immutable
@Table(name = "totalamountspent")
public class Purchaser implements Serializable {

    @Id
    @Column(name = "purchaser")
    private String purchaser;

    @Column(name = "totalAmountSpent")
    private double totalAmountSpent;

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public double getTotalAmountSpent() {
        return totalAmountSpent;
    }

    public void setTotalAmountSpent(double totalAmountSpent) {
        this.totalAmountSpent = totalAmountSpent;
    }

    @Override
    public String toString() {
        return "\"" + this.purchaser + "\": " + this.totalAmountSpent;
    }
}

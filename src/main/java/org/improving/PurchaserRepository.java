package org.improving;

import org.improving.database.JPAUtility;
import org.improving.entity.Purchase;
import org.improving.entity.Purchaser;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class PurchaserRepository {

    public List<Purchase> getPurchaseList() {
        EntityManager em = JPAUtility.getEntityManager();
        String query = "select p from Purchase as p where p.id is not null";
        TypedQuery<Purchase> tq = em.createQuery(query, Purchase.class);
        List<Purchase> products;
        try {
            products = tq.getResultList();
            return products;
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<Purchaser> getTotalAmountSpent() {
        EntityManager em = JPAUtility.getEntityManager();
        String query = "select p from Purchaser as p";
        TypedQuery<Purchaser> tq = em.createQuery(query, Purchaser.class);
        List<Purchaser> products;
        try {
            products = tq.getResultList();
            return products;
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}

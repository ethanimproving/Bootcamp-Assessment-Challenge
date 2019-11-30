package org.improving;

import org.improving.database.JPAUtility;
import org.improving.entity.Purchase;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class PurchaserRepository {

//    public String getData() {
//        EntityManager em = JPAUtility.getEntityManager();
//        Query query = em.createQuery("select o from purchases o FUNCTION('JSON_EXTRACT', o.des, '$.org') = :org");
//    }

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
}

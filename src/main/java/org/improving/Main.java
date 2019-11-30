package org.improving;

import org.improving.client.PurchaseClient;


public class Main {

    public static void main(String[] args) {
        var purchaseClient = new PurchaseClient();
        var purchaseRepository = new PurchaserRepository();
        System.out.println(purchaseRepository.getPurchaseList());
    }
}

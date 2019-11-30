package org.improving;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.improving.client.PurchaseClient;
import org.improving.entity.Purchaser;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        var purchaseClient = new PurchaseClient();
        var purchaseRepository = new PurchaserRepository();
        var dataList = purchaseRepository.getTotalAmountSpent();
        var jsonString = convertObjectsToProperties(dataList);
        System.out.println(jsonString);
    }

    public static String convertObjectsToProperties(List<Purchaser> list) {
        var sb = new StringBuilder();
        sb.append("{");

        var i = 0;
        for (var purchaser : list) {
            sb.append("\n    \"" + purchaser.getPurchaser() + "\": " + purchaser.getTotalAmountSpent());
            if (i < list.size()-1) sb.append(",");
            i++;
        }

        sb.append("\n}");

        return sb.toString();
    }
}

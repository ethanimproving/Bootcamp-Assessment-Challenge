package org.improving.client;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PurchaseClient {
    private final RestTemplate restTemplate;

    public PurchaseClient() {
        this.restTemplate = new RestTemplate();
    }

    public ResponseEntity<String> getPurchases() {
        var headers = new HttpHeaders();
        headers.add("Authorization", "Bearer YzkzOTRjY2EtMmE0Yy00ZjkxLTlmMmItNzU4MTM3YWQ0OWI1");
        var request = new HttpEntity<String>(headers);

        return restTemplate.exchange("https://quizpoint.azurewebsites.net" +
                        "/Participants/332167c3-ca5d-47a3-b77a-19ce4f94d884/Assessment/Data",
                HttpMethod.GET, request, String.class);
    }
}
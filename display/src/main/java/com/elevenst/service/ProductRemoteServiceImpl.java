package com.elevenst.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductRemoteServiceImpl implements ProductRemoteService {

    private static final String HTTP_LOCALHOST_8082_PRODUCTS = "http://localhost:8082/products/";
    private final RestTemplate restTemplate;

    public ProductRemoteServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getProductInfo(String productId) {
        return restTemplate.getForObject(HTTP_LOCALHOST_8082_PRODUCTS + productId, String.class);
    }
}

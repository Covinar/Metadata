package org.example.domain.entity;

public class UrlAddressInfoEntity {
    private final String url;
    private final int status;
    private final String name;
    private final String description;

    public UrlAddressInfoEntity(String url, int status, String name, String description) {
        this.url = url;
        this.status = status;
        this.name = name;
        this.description = description;
    }
}

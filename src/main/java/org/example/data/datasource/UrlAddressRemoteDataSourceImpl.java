package org.example.data.datasource;

import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.dto.UrlAddressInfoDto;

import java.io.IOException;

public class UrlAddressRemoteDataSourceImpl implements UrlAddressRemoteDataSource{
    private final ApiService apiService;

    public UrlAddressRemoteDataSourceImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public UrlAddressInfoDto getMetadata(String url) {
        try {
            return apiService.getMetadata(url).execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

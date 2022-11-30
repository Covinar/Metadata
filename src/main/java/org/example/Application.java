package org.example;

import org.example.data.datasource.UrlAddressRemoteDataSource;
import org.example.data.datasource.UrlAddressRemoteDataSourceImpl;
import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.api.RetrofitClient;
import org.example.data.mapper.UrlAddressInfoMapper;
import org.example.data.repository.UrlAddressInfoRepository;
import org.example.data.repository.UrlAddressInfoRepositoryImpl;
import org.example.domain.usecase.GetUrlAddressInfoUceCase;
import org.example.domain.usecase.GetUrlAddressInfoUceCaseImpl;
import org.example.presentation.UrlAddressScreen;

public class Application {
    public static void main(String[] args) {
        ApiService api = RetrofitClient.getClient().create(ApiService.class);
        UrlAddressInfoMapper mapper = new UrlAddressInfoMapper();
        UrlAddressRemoteDataSource remoteDataSource = new UrlAddressRemoteDataSourceImpl(api);
        UrlAddressInfoRepository repository = new UrlAddressInfoRepositoryImpl(remoteDataSource, mapper);
        GetUrlAddressInfoUceCase uceCase = new GetUrlAddressInfoUceCaseImpl(repository);
        UrlAddressScreen urlAddressScreen = new UrlAddressScreen(uceCase);
        urlAddressScreen.start();
    }
}
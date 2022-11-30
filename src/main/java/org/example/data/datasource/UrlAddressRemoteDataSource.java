package org.example.data.datasource;

import org.example.data.datasource.remote.dto.UrlAddressInfoDto;

public interface UrlAddressRemoteDataSource {

    UrlAddressInfoDto getMetadata(String url);

}

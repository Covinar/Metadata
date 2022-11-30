package org.example.data.datasource.remote.api;

import org.example.data.datasource.remote.dto.UrlAddressInfoDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/api/v4/meta")
    Call<UrlAddressInfoDto> getMetadata(@Query(value = "url", encoded = true) String url);

}

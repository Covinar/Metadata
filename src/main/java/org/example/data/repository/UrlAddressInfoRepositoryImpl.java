package org.example.data.repository;

import org.example.data.datasource.UrlAddressRemoteDataSource;
import org.example.data.datasource.remote.dto.UrlAddressInfoDto;
import org.example.data.mapper.UrlAddressInfoMapper;
import org.example.domain.entity.UrlAddressInfoEntity;

public class UrlAddressInfoRepositoryImpl implements UrlAddressInfoRepository{

    private final UrlAddressRemoteDataSource remote;
    private final UrlAddressInfoMapper mapper;

    public UrlAddressInfoRepositoryImpl(UrlAddressRemoteDataSource remote, UrlAddressInfoMapper mapper) {
        this.remote = remote;
        this.mapper = mapper;
    }

    @Override
    public UrlAddressInfoEntity getMetadata(String url) {
        UrlAddressInfoDto dto = remote.getMetadata(url);
        return mapper.map(dto);
    }
}

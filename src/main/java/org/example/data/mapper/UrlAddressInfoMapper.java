package org.example.data.mapper;

import org.example.data.datasource.remote.dto.UrlAddressInfoDto;
import org.example.domain.entity.UrlAddressInfoEntity;

public class UrlAddressInfoMapper {
    public UrlAddressInfoEntity map(UrlAddressInfoDto dto){
        UrlAddressInfoEntity entity = new UrlAddressInfoEntity(dto.getUrl(),
                dto.getMetadataDto().getStatus(),
                dto.getMetadataDto().getName(),
                dto.getMetadataDto().getDescription()
        );
        return entity;
    }

}

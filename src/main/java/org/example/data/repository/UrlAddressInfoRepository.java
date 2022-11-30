package org.example.data.repository;

import org.example.domain.entity.UrlAddressInfoEntity;

public interface UrlAddressInfoRepository {
    UrlAddressInfoEntity getMetadata(String url);
}

package org.example.domain.usecase;

import org.example.domain.entity.UrlAddressInfoEntity;

public interface GetUrlAddressInfoUceCase {
    UrlAddressInfoEntity getMetadata(String url);
}

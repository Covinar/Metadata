package org.example.domain.usecase;

import org.example.data.repository.UrlAddressInfoRepository;
import org.example.domain.entity.UrlAddressInfoEntity;

public class GetUrlAddressInfoUceCaseImpl implements GetUrlAddressInfoUceCase {
    private final UrlAddressInfoRepository repository;

    public GetUrlAddressInfoUceCaseImpl(UrlAddressInfoRepository repository) {
        this.repository = repository;
    }

    @Override
    public UrlAddressInfoEntity getMetadata(String url) {

        return repository.getMetadata(url);
    }
}

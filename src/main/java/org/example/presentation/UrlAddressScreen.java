package org.example.presentation;

import org.example.domain.usecase.GetUrlAddressInfoUceCase;

public class UrlAddressScreen {
    private final GetUrlAddressInfoUceCase uceCase;

    public UrlAddressScreen(GetUrlAddressInfoUceCase uceCase) {
        this.uceCase = uceCase;
    }

    public void start(){
        System.out.println(uceCase.getMetadata("http://facebook.com"));
    }
}

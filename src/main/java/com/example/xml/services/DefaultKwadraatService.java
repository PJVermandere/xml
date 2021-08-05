package com.example.xml.services;

public class DefaultKwadraatService implements KwadraatService {
    @Override
    public int kwadraatVan(int getal) {
        return getal*getal;
    }
}

package com.example.pokedex_to_hexagonal.domain.model;

public class Photo {
    private Long id;
    private byte[] photo;

    public Photo(Long id, byte[] photo) {
        this.id = id;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}

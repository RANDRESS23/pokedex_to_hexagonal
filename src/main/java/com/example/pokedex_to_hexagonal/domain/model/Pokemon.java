package com.example.pokedex_to_hexagonal.domain.model;

public class Pokemon {
    private Long id;
    private Long number;
    private String name;
    private Long typeId;
    private Long photoId;

    public Pokemon(Long id, Long number, String name, Long typeId, Long photoId) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.typeId = typeId;
        this.photoId = photoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }
}

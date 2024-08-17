package com.example.pokedex_to_hexagonal.domain.spi;

import com.example.pokedex_to_hexagonal.domain.model.Photo;

import java.util.List;

public interface IPhotoPersistencePort {

    Photo savePhoto(Photo photo);

    List<Photo> getAllPhotos();

    Photo getPhoto(Long photoId);

    void updatePhoto(Photo photo);

    void deletePhoto(Long photoId);

}

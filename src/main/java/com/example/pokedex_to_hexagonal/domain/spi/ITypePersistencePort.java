package com.example.pokedex_to_hexagonal.domain.spi;

import com.example.pokedex_to_hexagonal.domain.model.Type;

import java.util.List;

public interface ITypePersistencePort {

    Type saveType(Type type);

    List<Type> getAllTypes();

    Type getType(Long typeId);

    void updateType(Type type);

    void deleteType(Long typeId);

}

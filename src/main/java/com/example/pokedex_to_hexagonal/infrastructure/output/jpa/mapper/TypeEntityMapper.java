package com.example.pokedex_to_hexagonal.infrastructure.output.jpa.mapper;

import com.example.pokedex_to_hexagonal.domain.model.Type;
import com.example.pokedex_to_hexagonal.infrastructure.output.jpa.entity.TypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TypeEntityMapper {

    TypeEntity toEntity(Type type);

    Type toType(TypeEntity typeEntity);

    List<Type> toTypeList(List<TypeEntity> typeEntityList);

}

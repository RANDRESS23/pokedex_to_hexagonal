package com.example.pokedex_to_hexagonal.aplication.mapper;

import com.example.pokedex_to_hexagonal.aplication.dto.TypeDto;
import com.example.pokedex_to_hexagonal.domain.model.Type;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TypeDtoMapper {
    TypeDto toDto(Type type);
}

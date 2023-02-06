package com.example.demo.mapping;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DMapper {
    Domain toDomain(DTO dto);
    DTO toDTO(Domain domain);
}

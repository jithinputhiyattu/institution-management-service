package com.school.app.ims.mapper;

import com.school.app.ims.domain.Institution;
import com.school.app.ims.dto.InstitutionDto;
import com.school.app.ims.utils.CommonUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = {CommonUtils.class})
public interface InstitutionMapper {

    @Mapping(target = "institutionId", source = "institutionId")
    @Mapping(target = "address", source = "address")
    Institution toInstitution(InstitutionDto institutionDto);

    @Mapping(target = "institutionId", source = "institutionId")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "institutionKey", expression = "java(CommonUtils.getHashIndex(institution.getInstitutionId()))")
    InstitutionDto toInstitutionDto(Institution institution);
}

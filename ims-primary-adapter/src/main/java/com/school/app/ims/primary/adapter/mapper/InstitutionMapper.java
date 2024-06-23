package com.school.app.ims.primary.adapter.mapper;

import com.school.app.ims.domain.institution.Institution;
import com.school.app.ims.primary.adapter.model.response.InstitutionResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InstitutionMapper {

    @Mapping(target = "institutionId", source = "institutionId")
    InstitutionResponseModel toInstitutionResponse(Institution institution);
}

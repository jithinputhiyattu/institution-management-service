package com.school.app.ims.mapper;

import com.school.app.ims.domain.InstitutionGroup;
import com.school.app.ims.dto.InstitutionGroupDto;
import com.school.app.ims.model.response.InstitutionGroupResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IMSGroupMapper {

    @Mapping(target = "groupId", source = "groupId")
    InstitutionGroup toInstitutionGroupResponse(InstitutionGroupDto ig);
}

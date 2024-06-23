package com.school.app.ims.primary.adapter.mapper;

import com.school.app.ims.domain.group.InstitutionGroup;
import com.school.app.ims.primary.adapter.model.response.InstitutionGroupResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Service;

@Mapper(componentModel = "spring")
public interface IMSGroupMapper {

    @Mapping(target = "groupId", source = "groupId")
    InstitutionGroupResponse toInstitutionGroupResponse(InstitutionGroup ig);
}

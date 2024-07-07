package com.school.app.ims.mapper;

import com.school.app.ims.domain.InstitutionGroup;
import com.school.app.ims.dto.InstitutionGroupDto;
import com.school.app.ims.utils.CommonUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = {CommonUtils.class})
public interface IMSGroupMapper {

    @Mapping(target = "groupId", source = "groupId")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "moto", source = "moto")
    @Mapping(target = "address", source = "address")
    InstitutionGroup toInstitutionGroup(InstitutionGroupDto ig);

    @Mapping(target = "groupId", source = "groupId")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "moto", source = "moto")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "groupKey", expression = "java(CommonUtils.getHashIndex(group.getGroupId()))")
    InstitutionGroupDto toInstitutionGroupDto(InstitutionGroup group);
}

package com.school.app.ims.mapper;

import com.school.app.ims.domain.InstitutionRole;
import com.school.app.ims.dto.InstitutionRoleDto;
import com.school.app.ims.model.request.InstitutionRolePostRequestModel;
import com.school.app.ims.utils.CommonUtils;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", imports = {CommonUtils.class})
public interface InstitutionRoleMapper {

    InstitutionRole toInstitutionRole(InstitutionRoleDto institutionRoleDto);

    InstitutionRoleDto toInstitutionRoleDto(InstitutionRolePostRequestModel institutionRole);
}

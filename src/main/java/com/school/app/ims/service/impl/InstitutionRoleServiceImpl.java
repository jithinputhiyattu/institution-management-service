package com.school.app.ims.service.impl;

import com.school.app.ims.domain.InstitutionRole;
import com.school.app.ims.dto.InstitutionRoleDto;
import com.school.app.ims.enums.RoleStatus;
import com.school.app.ims.exceptions.IMSValidationException;
import com.school.app.ims.mapper.InstitutionRoleMapper;
import com.school.app.ims.model.request.InstitutionRolePostRequestModel;
import com.school.app.ims.model.request.InstitutionRolePutRequestModel;
import com.school.app.ims.repository.InstitutionRoleRepository;
import com.school.app.ims.service.ServiceApi;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class InstitutionRoleServiceImpl implements ServiceApi.InstitutionRoleService {

    InstitutionRoleRepository repository;
    InstitutionRoleMapper mapper;

    public InstitutionRoleServiceImpl(InstitutionRoleRepository repository, InstitutionRoleMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Mono<InstitutionRole> createRole(InstitutionRolePostRequestModel institutionRolePostRequestModel) {
        InstitutionRoleDto institutionRoleDto = mapper.toInstitutionRoleDto(institutionRolePostRequestModel);
        institutionRoleDto.setId(UUID.randomUUID().toString());
        return repository.save(institutionRoleDto)
                .map(mapper::toInstitutionRole);
    }

    @Override
    public Mono<InstitutionRole> updateRole(InstitutionRolePutRequestModel institutionRolePutRequestModel) throws IMSValidationException {
        if (institutionRolePutRequestModel.getId() == null) {
            throw new IMSValidationException("Payload without id");
        }
        InstitutionRoleDto current = repository.findById(institutionRolePutRequestModel.getId()).block();
        if (current == null) {
            throw new IMSValidationException("Role request not present");
        }
        current.setRoleStatus(institutionRolePutRequestModel.getRoleStatus());
        return repository.save(current)
                .map(mapper::toInstitutionRole);
    }

    @Override
    public Flux<InstitutionRole> getAllRoleByRoleStatus(RoleStatus roleStatus) {
        return repository.findAllByRoleStatus(roleStatus).map(mapper::toInstitutionRole);
    }


}

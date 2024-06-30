package com.school.app.ims.service.impl;

import com.school.app.ims.domain.InstitutionRole;
import com.school.app.ims.mapper.InstitutionRoleMapper;
import com.school.app.ims.repository.InstitutionRoleRepository;
import com.school.app.ims.service.ServiceApi;
import org.springframework.stereotype.Service;
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
    public Mono<InstitutionRole> createRole(InstitutionRole institutionRole) {
        institutionRole.setId(UUID.randomUUID().toString());
        return repository.save(mapper.toInstitutionRoleDto(institutionRole))
                .map(mapper::toInstitutionRole);
    }

    @Override
    public Mono<InstitutionRole> updateRole(InstitutionRole institutionRole) {
        return repository.save(mapper.toInstitutionRoleDto(institutionRole))
                .map(mapper::toInstitutionRole);
    }
}

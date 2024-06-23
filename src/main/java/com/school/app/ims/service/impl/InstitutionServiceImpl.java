package com.school.app.ims.service.impl;

import com.school.app.ims.domain.institution.Institution;
import com.school.app.ims.mapper.IMSGroupMapper;
import com.school.app.ims.mapper.InstitutionMapper;
import com.school.app.ims.repository.InstitutionGroupRepository;
import com.school.app.ims.repository.InstitutionRepository;
import com.school.app.ims.service.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InstitutionServiceImpl implements ServiceApi.InstitutionService {


    InstitutionRepository institutionRepository;


    InstitutionMapper institutionMapper;


    public InstitutionServiceImpl(InstitutionRepository repository,   InstitutionMapper mapper) {
        this.institutionMapper = mapper;
        this.institutionRepository = repository;
    }

    @Override
    public Mono<Institution> findInstitutionById(String groupId) {
        return Mono.empty();
    }

    @Override
    public Flux<Institution> findInstitutionForProfile(String profileId) {
        return Flux.empty();
    }

    @Override
    public Mono<Institution> createInstitution(Institution institution) {
        return institutionRepository.save(institutionMapper.toInstitutionDto(institution)).map(institutionMapper::toInstitution);
    }
}

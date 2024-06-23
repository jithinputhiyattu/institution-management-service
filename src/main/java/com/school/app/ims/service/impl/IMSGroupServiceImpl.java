package com.school.app.ims.service.impl;

import com.school.app.ims.domain.InstitutionGroup;
import com.school.app.ims.mapper.IMSGroupMapper;
import com.school.app.ims.repository.InstitutionGroupRepository;
import com.school.app.ims.service.ServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class IMSGroupServiceImpl implements ServiceApi.IMSGroupService {

    InstitutionGroupRepository repository;
    IMSGroupMapper mapper;

    public IMSGroupServiceImpl(InstitutionGroupRepository repository, IMSGroupMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Mono<InstitutionGroup> findImsGroupById(String groupId) {
        return repository
                .findById(groupId).map(institutionGroupDto ->
                        mapper.toInstitutionGroup(institutionGroupDto))
                .switchIfEmpty(Mono.defer(() -> Mono.just(new InstitutionGroup())));
    }

    @Override
    public Flux<InstitutionGroup> findInstitutionGroupForProfile(String profileId) {
        return Flux.empty();
    }

    @Override
    public Mono<InstitutionGroup> createImsGroup(InstitutionGroup group) {
        return repository.save(mapper.toInstitutionGroupDto(group))
           .map(mapper::toInstitutionGroup);
    }
}

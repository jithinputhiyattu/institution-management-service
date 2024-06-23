package com.school.app.ims.service.impl;

import com.school.app.ims.domain.group.InstitutionGroup;
import com.school.app.ims.service.service.IMSGroupService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class IMSGroupServiceImpl implements IMSGroupService {

    @Override
    public Mono<InstitutionGroup> findImsGroupById(String groupId) {
        return Mono.empty();
    }

    @Override
    public Flux<InstitutionGroup> findInstitutionGroupForProfile(String profileId) {
        return Flux.empty();
    }
}

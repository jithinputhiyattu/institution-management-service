package com.school.app.ims.service.service;

import com.school.app.ims.domain.group.InstitutionGroup;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface IMSGroupService {
    Mono<InstitutionGroup> findImsGroupById(String groupId);

    Flux<InstitutionGroup> findInstitutionGroupForProfile(String profileId);
}

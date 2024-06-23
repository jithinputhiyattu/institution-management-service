package com.school.app.ims.service;

import com.school.app.ims.domain.InstitutionGroup;
import com.school.app.ims.domain.institution.Institution;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceApi {

    public interface IMSGroupService {

        Mono<InstitutionGroup> findImsGroupById(String groupId);

        Flux<InstitutionGroup> findInstitutionGroupForProfile(String profileId);
    }

    public interface InstitutionService {

        Mono<Institution> findInstitutionById(String groupId);

        Flux<Institution> findInstitutionForProfile(String profileId);
    }
}

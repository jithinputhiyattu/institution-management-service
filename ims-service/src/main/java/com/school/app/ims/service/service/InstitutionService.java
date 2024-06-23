package com.school.app.ims.service.service;

import com.school.app.ims.domain.institution.Institution;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import java.util.Optional;

public interface InstitutionService {
    Mono<Institution> findInstitutionById(String groupId);
    Flux<Institution> findInstitutionForProfile(String profileId);
}

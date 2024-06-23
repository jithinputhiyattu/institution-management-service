package com.school.app.ims.service.impl;

import com.school.app.ims.domain.institution.Institution;
import com.school.app.ims.service.service.InstitutionService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class InstitutionServiceImpl implements InstitutionService {
    @Override
    public Mono<Institution> findInstitutionById(String groupId) {
        return Mono.empty();
    }

    @Override
    public Flux<Institution> findInstitutionForProfile(String profileId) {
        return Flux.empty();
    }
}

package com.school.app.ims.service.service;

import com.school.app.ims.domain.group.InstitutionGroup;
import reactor.core.publisher.Mono;

public interface IMSGroupService {
    Mono<InstitutionGroup> findImsGroupById(String groupId);
}

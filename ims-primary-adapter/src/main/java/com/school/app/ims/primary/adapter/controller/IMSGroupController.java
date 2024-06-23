package com.school.app.ims.primary.adapter.controller;

import com.school.app.ims.primary.adapter.mapper.IMSGroupMapper;
import com.school.app.ims.primary.adapter.model.response.InstitutionGroupResponse;
import com.school.app.ims.service.service.IMSGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/ims-api/group")
@Slf4j
public class IMSGroupController {

    @Autowired
    IMSGroupService imsGroupService;

    @Autowired
    IMSGroupMapper imsGroupMapper;

    @RequestMapping(method = RequestMethod.GET)
    public Mono<ResponseEntity<InstitutionGroupResponse>> findImsGroupById(String groupId) {
        log.info("IMSGroupController:findImsGroupById Request: {} ", groupId);
        return  imsGroupService.findImsGroupById(groupId).map(institutionGroup -> {
            InstitutionGroupResponse igs = imsGroupMapper.toInstitutionGroupResponse(institutionGroup);
            log.info("IMSGroupController:findImsGroupById Response: {} ", igs);
            return ResponseEntity.status(HttpStatus.OK).body(igs);
        });
    }

    @RequestMapping(value = "using-profile-id", method = RequestMethod.GET)
    public Flux<ResponseEntity<InstitutionGroupResponse>> findInstitutionGroupForProfile(String profileId) {
        log.info("IMSGroupController:findInstitutionGroupForProfile Request: {} ", profileId);
        return  imsGroupService.findInstitutionGroupForProfile(profileId).map(institutionGroup -> {
            InstitutionGroupResponse igs = imsGroupMapper.toInstitutionGroupResponse(institutionGroup);
            log.info("IMSGroupController:findInstitutionGroupForProfile Response: {} ", igs);
            return ResponseEntity.ok(igs);
        });
    }
}

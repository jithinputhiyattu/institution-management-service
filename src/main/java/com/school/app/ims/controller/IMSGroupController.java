package com.school.app.ims.controller;

import com.school.app.ims.domain.InstitutionGroup;
import com.school.app.ims.mapper.IMSGroupMapper;
import com.school.app.ims.model.response.InstitutionGroupResponse;
import com.school.app.ims.service.ServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/ims/group")
@Slf4j
public class IMSGroupController {

    @Autowired
    ServiceApi.IMSGroupService imsGroupService;

    @Autowired
    IMSGroupMapper imsGroupMapper;

    @RequestMapping(method = RequestMethod.GET)
    public Mono<ResponseEntity<InstitutionGroup>> findImsGroupById(String groupId) {
        log.info("IMSGroupController:findImsGroupById Request: {} ", groupId);
        return  imsGroupService.findImsGroupById(groupId).map(igs -> {
            log.info("IMSGroupController:findImsGroupById Response: {} ", igs);
            return ResponseEntity.status(HttpStatus.OK).body(igs);
        });
    }

    @RequestMapping(method = RequestMethod.POST)
    public Mono<ResponseEntity<InstitutionGroup>> createImsGroup(@RequestBody InstitutionGroup group) {
        log.info("IMSGroupController:createImsGroup Request: {} ", group);
        return  imsGroupService.createImsGroup(group).map(igs -> {
            log.info("IMSGroupController:createImsGroup Response: {} ", igs);
            return ResponseEntity.status(HttpStatus.OK).body(igs);
        });
    }

    @RequestMapping(value = "using-profile-id", method = RequestMethod.GET)
    public Flux<ResponseEntity<InstitutionGroup>> findInstitutionGroupForProfile(String profileId) {
        log.info("IMSGroupController:findInstitutionGroupForProfile Request: {} ", profileId);
        return  imsGroupService.findInstitutionGroupForProfile(profileId).map(group -> {
            log.info("IMSGroupController:findInstitutionGroupForProfile Response: {} ", group);
            return ResponseEntity.ok(group);
        });

    }
}

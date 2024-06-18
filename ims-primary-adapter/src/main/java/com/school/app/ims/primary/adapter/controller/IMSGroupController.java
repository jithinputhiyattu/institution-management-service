package com.school.app.ims.primary.adapter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ims/api/book")
public class IMSGroupController {

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String findById(long id) {
        return "Test";
    }
}

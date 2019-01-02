package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-01-02T15:16:30.548Z")

@RestSchema(schemaId = "projectz0w8")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectz0w8Impl {

    @Autowired
    private Projectz0w8Delegate userProjectz0w8Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectz0w8Delegate.helloworld(name);
    }

}

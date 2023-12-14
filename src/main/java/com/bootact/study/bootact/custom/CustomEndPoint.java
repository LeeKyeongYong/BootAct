package com.bootact.study.bootact.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id="customendpoint")
@Component
public class CustomEndPoint {
    @ReadOperation
    public String customInfo(){
        return "this is a custom endpoint";
    }
}

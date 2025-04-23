package com.example.restapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class RestAPIController {

   @GetMapping("/healthcheck")
    public String healthCheck(){
       return "checking Health";
   }
   @GetMapping("/healthcheck2")
    public String healthCheckk(){
       return  "Checking health 2";
   }
    @GetMapping("/healthcheck3")
    public String healthChecker()
    {
        return  " continuously again and again started gitChecking health3";
    }






}

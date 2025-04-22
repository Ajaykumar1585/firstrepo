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



}

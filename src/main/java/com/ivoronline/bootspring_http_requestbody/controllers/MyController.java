package com.ivoronline.bootspring_http_requestbody.controllers;

import com.ivoronline.bootspring_http_requestbody.DTO.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/addAuthor")
  public String addAuthor(@RequestBody PersonDTO personDTO) {

    //GET DATA FROM PersonDTO
    String  name = personDTO.name;
    Integer age  = personDTO.age;

    //RETURN SOMETHING
    return name + " is " + age + " years old";

  }

}





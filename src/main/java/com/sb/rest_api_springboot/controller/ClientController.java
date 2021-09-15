package com.sb.rest_api_springboot.controller;

import com.sb.rest_api_springboot.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

   @GetMapping
   public List<Client> listar(){

  }
}

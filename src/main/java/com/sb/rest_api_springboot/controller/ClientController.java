package com.sb.rest_api_springboot.controller;

import com.sb.rest_api_springboot.model.Client;
import com.sb.rest_api_springboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

   @Autowired
   private ClientRepository clientRepository;

   @GetMapping
   public List<Client> listar(){

       return clientRepository.findAll();
   }
   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
   public Client addClient(@RequestBody Client client){
       return clientRepository.save(client);
   }
}

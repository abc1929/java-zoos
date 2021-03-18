package com.lambdaschool.zoos.controllers;


import com.lambdaschool.zoos.repositories.ZooRepository;
import com.lambdaschool.zoos.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoos")
public class ZooController {
   @Autowired
   ZooService zooService;

   // http://localhost:2019/zoos/zoos
   @GetMapping(value = "/zoos", produces = "application/json")
   public ResponseEntity<?> getAllZoos(){



      return new ResponseEntity<>(zooService.getAllZoos() , HttpStatus.OK);

   }


   // http://localhost:2019/zoos/zoo/5
   @GetMapping(value = "/zoo/{zooid}" ,produces = "application/json")
   public ResponseEntity<?> getZooByID(@PathVariable long zooid){

      return new ResponseEntity<>(zooService.getZooByID(zooid),HttpStatus.OK);

   }



}

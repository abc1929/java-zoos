package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repositories.ZooRepository;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService {

   @Autowired
   private ZooRepository zooRepository;

   @Override
   public List<Zoo> getAllZoos() {
      return StreamSupport.stream(zooRepository.findAll().spliterator(), false).collect(Collectors.toList());

   }

@Override
   public Zoo getZooByID(long zooid){

      Zoo res = zooRepository.findById(zooid).get();

      return res;
}


}

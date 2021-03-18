package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements  AnimalService{

   @Autowired
   private AnimalRepository animalRepository;

   @Override
   public List<?> getAnimalsCount() {



      return animalRepository.getAnimalsCount();
   }
}

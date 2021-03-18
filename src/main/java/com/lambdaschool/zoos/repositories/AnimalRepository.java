package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.views.AnimalsCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {




   @Query(value = "select a.animaltype, a.animalid , count(za.animalid) as animalcounts from \n" +
           "animals a left join zooanimals as za \n" +
           "on za.animalid = a.animalid\n" +
           "group by a.animaltype", nativeQuery = true)
   List<AnimalsCounts> getAnimalsCount();

}

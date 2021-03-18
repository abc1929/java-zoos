package com.lambdaschool.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lambdaschool.zoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "zooanimals")
public class ZooAnimal extends Auditable implements Serializable {



   @Id
   @ManyToOne()
   @JoinColumn(name = "zooid")
   @JsonIgnoreProperties(value = "animals", allowSetters = true)
   private Zoo zoo;

   public ZooAnimal() {
   }

//   public ZooAnimal(long zooid, long animalid, String incomingzoo) {
//      this.zooid =  zooid;
//      this.animalid = animalid;
//      this.incomingzoo = incomingzoo;
//   }




   @Id
   @ManyToOne
   @JoinColumn(name = "animalid")
   @JsonIgnoreProperties(value = "zoos", allowSetters = true)
   private Animal animal;


   private String incomingzoo;

   public Zoo getZoo() {
      return zoo;
   }

   public void setZoo(Zoo zoo) {
      this.zoo = zoo;
   }

   public Animal getAnimal() {
      return animal;
   }

   public void setAnimal(Animal animal) {
      this.animal = animal;
   }

   public String getIncomingzoo() {
      return incomingzoo;
   }


   public void setIncomingzoo(String incomingzoo) {
      this.incomingzoo = incomingzoo;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ZooAnimal that = (ZooAnimal) o;
      return ((this.getZoo()==null) ? 0 : this.getZoo().getZooid()) == ((that.getZoo()==null) ? 0 : that.getZoo().getZooid()) && (this.getAnimal()==null?0:this.getAnimal().getAnimalid()) == (that.getAnimal()==null?0:that.getAnimal().getAnimalid());
   }

   @Override
   public int hashCode() {
//      return Objects.hash(zoo, animal, incomingzoo);
      return 1929;
   }



}

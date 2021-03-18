package com.lambdaschool.zoos.models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;


@Embeddable
public class ZooAnimalId implements Serializable {

   private long zoo;
   private long animal;

   public long getZoo() {
      return zoo;
   }

   public void setZoo(long zoo) {
      this.zoo = zoo;
   }

   public long getAnimal() {
      return animal;
   }

   public void setAnimal(long animal) {
      this.animal = animal;
   }

   public String getIncomingzoo() {
      return incomingzoo;
   }

   public void setIncomingzoo(String incomingzoo) {
      this.incomingzoo = incomingzoo;
   }

   public ZooAnimalId() {
   }

   public ZooAnimalId(long zoo, long animal, String incomingzoo) {
      this.zoo = zoo;
      this.animal = animal;
      this.incomingzoo = incomingzoo;
   }

   private String incomingzoo;



   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ZooAnimalId that = (ZooAnimalId) o;
      return zoo == that.zoo && Objects.equals(incomingzoo, that.incomingzoo);
   }

   @Override
   public int hashCode() {
      return Objects.hash(zoo, incomingzoo);
   }
}

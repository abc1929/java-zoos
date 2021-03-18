package com.lambdaschool.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "zoos")
public class Zoo extends Auditable{

   public Zoo(long zooid, String zooname) {
      this.zooid = zooid;
      this.zooname = zooname;

   }

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long zooid;

   @Column(nullable = false)
   private String zooname;



   @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
   @JsonIgnoreProperties(value = "zoo", allowSetters = true)
   private Set<ZooAnimal> animals = new HashSet<>();








   public long getZooid() {
      return zooid;
   }

   public void setZooid(long zooid) {
      this.zooid = zooid;
   }

   public String getZooname() {
      return zooname;
   }

   public void setZooname(String zooname) {
      this.zooname = zooname;
   }

   public Zoo() {
   }

   public Zoo(String zooname) {
      this.zooname = zooname;
   }
}

package com.lambdaschool.zoos.models;


import javax.persistence.*;

@Entity
@Table(name = "telephones")
public class Telephone extends Auditable{

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long phoneid;

   private String phonetype;

   private String phonenumber;

   private long zooid;


   public Telephone(long phoneid, String phonetype, String phonenumber, long zooid) {
      this.phoneid = phoneid;
      this.phonetype = phonetype;
      this.phonenumber = phonenumber;
      this.zooid = zooid;
   }

   public Telephone(String phonetype, String phonenumber, long zooid) {
      this.phonetype = phonetype;
      this.phonenumber = phonenumber;
      this.zooid = zooid;
   }

   public Telephone() {
   }

   public long getPhoneid() {
      return phoneid;
   }

   public void setPhoneid(long phoneid) {
      this.phoneid = phoneid;
   }

   public String getPhonetype() {
      return phonetype;
   }

   public void setPhonetype(String phonetype) {
      this.phonetype = phonetype;
   }

   public String getPhonenumber() {
      return phonenumber;
   }

   public void setPhonenumber(String phonenumber) {
      this.phonenumber = phonenumber;
   }

   public long getZooid() {
      return zooid;
   }

   public void setZooid(long zooid) {
      this.zooid = zooid;
   }
}

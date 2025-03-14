package com.ShareBite.Entity;


import jakarta.persistence.*;


@Entity
public class Donnor {


    @Column(nullable =false,unique = true)
    @Id
   private  long DonnerId ;


    @Column(nullable = false)
    private String name;


    @Column(nullable = false)
    private long phoneNumber;


    private String typeOfDonner;


    private String email;


    public void setEmail(String email){

        this.email = email;
    }

    public String getEmail(){

        return this.email;
    }


    public void setTypeOfDonner(String type){

        this.typeOfDonner = type;
    }

    public String getTypeOfDonner(){

        return this.typeOfDonner;
    }

    public void setPhoneNumber(long number){

        this.phoneNumber = number;
    }


    public long getPhoneNumber(){

        return this.phoneNumber;
    }




    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }


    public void setDonnerId(long id){

        this.DonnerId = id;
    }

    public long getDonnerId(){

        return this.DonnerId;
    }




}

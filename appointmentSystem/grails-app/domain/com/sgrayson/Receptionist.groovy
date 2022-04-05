package com.sgrayson

class Receptionist {

    //Variables
    String recepName
    String recepEmail
    String username
    String password
    String recepPhone

    String toString(){
        return recepName; //Removes com. when creating a new receptionist.
    }

    static constraints = {
        //contraints
        recepName blank:false, nullable:false
        recepEmail blank:false, nullable:false, email:true, unique:true
        username blank:false, nullable:false, unique:true
        password blank:false, nullable:false, size:8..15
        recepPhone blank:false, nullable:false, size:0..15
    }
    static belongsTo = [surgery:Surgery] //belongsTo Relationship
}
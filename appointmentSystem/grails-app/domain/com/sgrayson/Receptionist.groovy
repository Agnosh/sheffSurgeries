package com.sgrayson

class Receptionist {

    //Variables
    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    String recepPhone

    static constraints = {
        //contraints
        recepName blank:false, nullable:false
        recepEmail blank:false, nullable:false, email:true, unique:true
        recepUsername blank:false, nullable:false, unique:true
        recepPassword blank:false, nullable:false, size:8..15
        recepPhone blank:false, nullable:false, size:0..15
    }
    static belongsTo = [surgery:Surgery] //belongsTo Relationship
}
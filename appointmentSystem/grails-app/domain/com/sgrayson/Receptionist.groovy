package com.sgrayson

class Receptionist {

    //Variables
    String recapName
    String recapEmail
    String recapUsername
    String recapPassword
    int recapPhone

    static constraints = {
        //contraints
        recapName blank:false, nullable:false
        recapEmail blank:false, nullable:false, email:true, unique:true
        recapUsername blank:false, nullable:false, unique:true
        recapPassword blank:false, nullable:false, size:8..15
        recapPhone blank:false, nullable:false, size:0..15
    }
}

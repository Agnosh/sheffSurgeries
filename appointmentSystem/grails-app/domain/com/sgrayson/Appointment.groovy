package com.sgrayson

class Appointment {

    //Variables
    Date appDate
    String appTime
    int appDuration
    String roomNumber

    String toString(){
        return appDate; //Removes com. when creating a new appoinment.
    }

    static constraints = {
        //contraints
        appDate blank:false, nullable:false
        appTime blank:false, nullable:false
        appDuration blank:false, nullable:false
        roomNumber blank:false, nullable:false
    }
    static hasOne = [surgery:Surgery, doctor:Doctor, patient:Patient] //hasOne Relationship
}
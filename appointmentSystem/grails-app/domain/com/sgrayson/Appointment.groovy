package com.sgrayson

class Appointment {

    //Variables
    Date appDate
    String appTime
    int appDuration
    String roomNumber

    static constraints = {
        //contraints
        appDate blank:false, nullable:false
        appTime blank:false, nullable:false
        appDuration blank:false, nullable:false
        roomNumber blank:false, nullable:false
    }
    static belongsTo = [surgery:Surgery, doctor:Doctor, patient:Patient] //belongsTo Relationships
}
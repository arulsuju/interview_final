package org.org.designpattern;

public class CoachFactory {

    public Coach getCoach(String objectName){
        if(objectName==null){
            return null;
        }
        else if(objectName.equalsIgnoreCase("cricket")){
            return new CricketCoach();
        }
        else{
            return new FootballCoach();
        }
    }
}

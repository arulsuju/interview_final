package org.org.designpattern;

public class MainDemo {
    public static void main(String[] args) {

        CoachFactory coachFactory=new CoachFactory();
        Coach coach=coachFactory.getCoach("cricket");
        System.out.println(coach.getFees());
        System.out.println(coach.getName());

        Coach coach1=coachFactory.getCoach("football");
        System.out.println(coach1.getName());
        System.out.println(coach1.getFees());

    }
}

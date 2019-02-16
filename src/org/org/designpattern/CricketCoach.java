package org.org.designpattern;

public class CricketCoach implements Coach {
    @Override
    public String getName() {
        return "Suju";
    }

    @Override
    public double getFees() {
        return 30000;
    }
}

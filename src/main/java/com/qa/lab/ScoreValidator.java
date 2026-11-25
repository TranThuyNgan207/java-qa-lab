package com.qa.lab;

public class ScoreValidator {

    public boolean isPassed(Integer score) {
        if (score == null) {
            return false;
        }
        return score >= 5 && score <= 10;
    }
}
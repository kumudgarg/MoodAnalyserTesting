package com.moodanalyser;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.contains("Sad"))
                return "SAD";
            return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("please enter proper mood message");
        }
    }
}

















































































package com.moodanalyser;

public class MoodAnalyserException extends Exception{

    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY,NO_SUCH_CLASS_ERROR,NO_SUCH_CLASS_METHOD_ERROR;
    }
    ExceptionType type;

    public MoodAnalyserException(String message) {
        super(message);
    }

    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }

}

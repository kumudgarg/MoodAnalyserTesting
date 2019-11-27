package com.moodanalyser;

public class MoodAnalyserException extends Exception{

    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY, NO_SUCH_CLASS, NO_SUCH_METHOD, NO_SUCH_FIELD,
        FIELD_SETTING_ISSUE,NO_ACCESS,OBJECT_CREATED_ISSUE,METHOD_INVOCATION_ISSUE;
    }
    ExceptionType type;

    public MoodAnalyserException(String message) {
        super(message);
    }

    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }

    public MoodAnalyserException(ExceptionType type, String message, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}

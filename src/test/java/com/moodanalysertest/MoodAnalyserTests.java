package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyserException;
import com.moodanalyser.MoodAnalyserFactory;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTests {

    @Test
    public void givenMesage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMesage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMesage_WhenNull_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMesage_WhenNull_ShouldReturnNullException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("please enter not null mood",e.getMessage());
        }
    }

    @Test
    public void givenMesage_WhenEmpty_ShouldReturnEmptyException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = "";
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("please enter non empty mood",e.getMessage());
        }
    }


    @Test
    public void givenMoodAnalyserEqulasMethod_WhenProper_ShouldReturnTrue() throws NoSuchMethodException {
        MoodAnalyser moodAnalyser = null;
        try {
            moodAnalyser = MoodAnalyserFactory.createMoodAnalyser();
            boolean mood = moodAnalyser.equals(new MoodAnalyser());
            Assert.assertEquals(false,mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenMoodAnalyserClassNotFound_WhenNotFound_ShouldReturnExceptionType() throws NoSuchMethodException {
        MoodAnalyser moodAnalyser = null;
        try {
             moodAnalyser = MoodAnalyserFactory.createMoodAnalyserNoSuchClass();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("NO_SUCH_CLASS_ERROR",e.getMessage());
        }

    }
    @Test
    public void givenMoodAnalyserMethodNotFound_WhenNotFound_ShouldReturnExceptionType() throws NoSuchMethodException {
        MoodAnalyser moodAnalyser = null;
        try {
             moodAnalyser = MoodAnalyserFactory.createMoodAnalyserNoSuchClass();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("NO_SUCH_METHOD_ERROR",e.getMessage());
        }

    }

    @Test
    public void givenMoodAnalyserEqulasMethodForParameterizedConstructor_WhenProper_ShouldReturnTrue() throws NoSuchMethodException {
        MoodAnalyser moodAnalyser = null;
        try {
            moodAnalyser = MoodAnalyserFactory.createMoodAnalyser("I am in Happy mood");
            boolean mood = moodAnalyser.equals(new MoodAnalyser());
            Assert.assertEquals(false,mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenMoodAnalyserClassNotFoundForParameterConstructor_WhenNotFound_ShouldReturnExceptionType() throws NoSuchMethodException {
        MoodAnalyser moodAnalyser = null;
        try {
            moodAnalyser = MoodAnalyserFactory.createMoodAnalyserExceptionThrows("I am in Happy mood");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("Class name is Improper",e.getMessage());
        }

    }

    @Test
    public void givenMoodAnalyserMethodNotFoundForParameterConstructor_WhenNotFound_ShouldReturnExceptionType() throws NoSuchMethodException {
        MoodAnalyser moodAnalyser = null;
        try {
            moodAnalyser = MoodAnalyserFactory.createMoodAnalyserExceptionThrows("I am in Happy mood");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("Method Not Found",e.getMessage());
        }

    }


}

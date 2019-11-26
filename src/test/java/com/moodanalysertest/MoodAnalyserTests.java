package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyserException;
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

}

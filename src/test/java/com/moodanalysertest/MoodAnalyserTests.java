package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTests {

    @Test
    public void givenMesage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("“I am in Sad Mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMesage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("“I am in Happy Mood");
        Assert.assertEquals("Happy",mood);
    }

}

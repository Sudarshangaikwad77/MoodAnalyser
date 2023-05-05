package com.bl.MoodAnalyser;

import java.security.InvalidParameterException;

public class MoodAnalyser
{
    private String message;
        public MoodAnalyser(String message) {
            this.message = message;
        }

        public String moodAnalyze() {

            try {
                if (message.trim().toLowerCase().contains("sad")) {
                    return "SAD";
                }
                else if (message.trim().toLowerCase().contains("happy")){
                    return "HAPPY";
                }
                else {
                throw new Exception("happy");
            }
            }
            catch (Exception e)
            {
              return "HAPPY";
            }
        }
        public static void main(String[] args) {
         MoodAnalyser analyzer = new MoodAnalyser("I am in Happy Mood");

            String hAnalyse = analyzer.moodAnalyze();
            System.out.println("Mood Is: " + hAnalyse);

           MoodAnalyser analyser = new MoodAnalyser("I am in SAD mood");

            String sAnalyse = analyser.moodAnalyze();
            System.out.println("Mood Is: " + sAnalyse);

           MoodAnalyser check = new MoodAnalyser(" ");
            String any = check.moodAnalyze();
            System.out.println("Mood Is: " + any);
        }
    }


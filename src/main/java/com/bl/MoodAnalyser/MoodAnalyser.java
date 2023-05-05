package com.bl.MoodAnalyser;

public class MoodAnalyser
{
    private String message;
        public MoodAnalyser(String message) {
            this.message = message;
        }

        public String moodAnalyze() {
            if (message.trim().toLowerCase().contains("sad")) {
                return "SAD";
            }else {
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

           MoodAnalyser check = new MoodAnalyser("I am Not in any mood");
            String any = check.moodAnalyze();
            System.out.println("Mood Is: " + any);
        }
    }


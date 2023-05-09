package com.bl.MoodAnalyser;

// Main class that uses MoodAnalyser class to analyse the mood
public class Main {
    public static void main(String[] args) {
        try {
            // Create MoodAnalyser object
            MoodAnalyser analyzer = new MoodAnalyser("I am in happy Mood");
            String hAnalyse = analyzer.analyseMood();
            System.out.println("Mood Is: " + hAnalyse);

            MoodAnalyser analyser = new MoodAnalyser("I am in sad mood");
            String sAnalyse = analyser.analyseMood();
            System.out.println("Mood Is: " + sAnalyse);

            MoodAnalyser check = new MoodAnalyser(" ");
            String any = check.analyseMood();
            System.out.println("Mood Is: " + any);

            MoodAnalyser analyzer_null = new MoodAnalyser("null");
            String NullAnalyse = analyzer_null.analyseMood();
            System.out.println("Mood Is: " + hAnalyse);

        } catch (MoodAnalysisException e) {
            // Handle MoodAnalysisException and inform the user if entered invalid mood
            if (e.getError() == MoodAnalysisError.NULL_MESSAGE_ERROR) {
                System.out.println("Invalid Mood: Message is null.");
            } else if (e.getError() == MoodAnalysisError.EMPTY_MESSAGE_ERROR) {
                System.out.println("Invalid Mood: Message is empty.");
            }
        }
    }
}

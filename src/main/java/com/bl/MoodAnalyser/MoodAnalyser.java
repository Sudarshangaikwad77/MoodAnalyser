package com.bl.MoodAnalyser;

public class MoodAnalyser
{
    private String message;

        public MoodAnalyser(String message) {
            this.message = message;
        }
        public String analyseMood() throws MoodAnalysisException {
            try {
                if (message.contains("happy")) {
                    return "Happy";
                } else if (message.contains("sad")) {
                    return "Sad";
                } else {
                    throw new MoodAnalysisException("Invalid mood");
                }
            } catch (NullPointerException e) {
                throw new MoodAnalysisException("Invalid mood");
            }
        }

        public static void main(String[] args) {
            MoodAnalyser analyser1 = new MoodAnalyser("I am happy today");
            try {
                System.out.println(analyser1.analyseMood()); // Output: Happy
            } catch (MoodAnalysisException e) {
                e.printStackTrace();
            }

            MoodAnalyser analyser2 = new MoodAnalyser("I am not feeling good");
            try {
                System.out.println(analyser2.analyseMood()); // Output: Sad
            } catch (MoodAnalysisException e) {
                e.printStackTrace();
            }

            MoodAnalyser analyser3 = new MoodAnalyser(null);
            try {
                System.out.println(analyser3.analyseMood());
            } catch (MoodAnalysisException e) {
                e.printStackTrace(); // Output: Invalid mood
            }
        }

    }

    class MoodAnalysisException extends Exception {
        public MoodAnalysisException(String message) {
            super(message);
        }
    }

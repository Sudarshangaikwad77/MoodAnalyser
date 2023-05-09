package com.bl.MoodAnalyser;

import java.util.Objects;

// MoodAnalyser class that analyses the mood based on the message
public class MoodAnalyser {

    // Method to analyse the mood based on the message

    private static String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
            // Throw MoodAnalysisException if message is null or empty
            if (Objects.isNull(message)) {
                throw new MoodAnalysisException(MoodAnalysisError.NULL_MESSAGE_ERROR);
            } else if (message.trim().isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MESSAGE_ERROR);
            }

            // Analyse the mood based on the message
            if (message.contains("happy")) {
                return "happy";
            } else if (message.contains("sad")) {
                return "sad";
            } else {
                return "unknown";
            }
        }
    }







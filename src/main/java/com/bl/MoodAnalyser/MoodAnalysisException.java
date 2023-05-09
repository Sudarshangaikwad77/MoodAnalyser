package com.bl.MoodAnalyser;


 // Custom exception for Mood Analysis
  public   class MoodAnalysisException extends Exception {
        private MoodAnalysisError error;

        public MoodAnalysisException(MoodAnalysisError error) {
            this.error = error;
        }

        public MoodAnalysisError getError() {
            return error;
        }
    }


import com.bl.MoodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Test_Mood
{
    //TC1.1
    @Test
        public void testAnalyseMoodForSad() {
            MoodAnalyser analyser = new MoodAnalyser("I am in Sad Mood");
            String mood = analyser.moodAnalyze();
            assertEquals("SAD", mood);
            System.out.println(mood);
        }

        @Test
        public void testAnalyseMoodForHappy() {
            MoodAnalyser analyser = new MoodAnalyser("I am feeling happy today");
            String mood = analyser.moodAnalyze();
            assertEquals("HAPPY", mood);
            System.out.println(mood);
        }

        @Test
        public void testAnalyseMoodForAny(){
            MoodAnalyser analyzer = new MoodAnalyser("I am Not in any Mood");
            String mood = analyzer.moodAnalyze();
            assertEquals("HAPPY", mood);
            System.out.println(mood);
        }
    }


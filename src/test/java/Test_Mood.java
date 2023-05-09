import com.bl.MoodAnalyser.MoodAnalyser;
import com.bl.MoodAnalyser.MoodAnalysisException;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Test_Mood
{

    @Test
    public void testAnalyseMoodForSad() throws MoodAnalysisException {
        MoodAnalyser analyser = new MoodAnalyser("sad");
        String mood = analyser.analyseMood();
        assertEquals("sad", mood);
        System.out.println(mood);
    }

    @Test
    public void testAnalyseMoodForHappy() throws MoodAnalysisException {
        MoodAnalyser analyser = new MoodAnalyser("happy");
        String mood = analyser.analyseMood();
        try {
            mood = analyser.analyseMood();
        } catch (MoodAnalysisException e) {
            throw new RuntimeException(e);
        }
        assertEquals("happy", mood);
        System.out.println(mood);
    }

    @Test
    public void testAnalyseMoodForAny() throws MoodAnalysisException {
        MoodAnalyser analyzer = new MoodAnalyser("null");
        String mood = null;
        try {
            mood = analyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            throw new RuntimeException(e);
        }
        assertEquals("unknown", mood);
        System.out.println(mood);
    }
    @Test
    public void testAnalyseMoodNull() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("null");
        try {
            assertEquals("unknown", moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            throw new RuntimeException(e);
        }
    }
}



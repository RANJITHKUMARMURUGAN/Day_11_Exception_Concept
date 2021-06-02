import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad Message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Happy Messgae");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

     @Test
     public void givenNullMood_ShouldThrow_Exception() {
        MoodAnalyserUC3 moodAnalyzer = new MoodAnalyserUC3(null);
        try {
            moodAnalyzer.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.exceptionType.ENTERED_NULL, e.type);
    }
}

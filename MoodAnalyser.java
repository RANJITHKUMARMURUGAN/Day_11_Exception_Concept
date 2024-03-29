import java.util.*;
public class MoodAnalyser {
    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }

     public String analyseMood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyseMood();
    }
     public String analyseMood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_EMPTY, "Please enter Proper Mood");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_NULL, "Please enter Proper Mood");
      }
   }
}

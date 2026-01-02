public class StudySession
  {
    private String subject;
    private int minutes;

    public StudySession(String subject, int minutes)
    {
      this.subject = subject;
      this.minutes = minutes;
    }

    public String getSubject()
    {
      return subject;
    }

    public int getMinutes()
    {
      return minutes;
    }

    @Override
    public String toString()
    {
      return string + " - " + minutes + " minutes";
    }
  }

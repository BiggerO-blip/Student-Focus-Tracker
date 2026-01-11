public class FocusSession
{
  private String subject;
  private int minutes;
  private boolean distracted;

public FocusSession(String subjct, int minutes, boolean disracted)
{
this.subject = subject;
this.minutes = minutes;
this.distracted = distracted;
}

public int getMinutes()
{
return minutes;
}

public boolean wasDistracted()
{
return distracted;
}

public String toString()
{
return subject + " - " + minutes + " minutes" + (distracted ? " (distracted)" : " (focused)");

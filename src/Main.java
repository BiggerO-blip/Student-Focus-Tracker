import java.util.ArrayList;

public class Main
  {
    public static void main(String[] args)
    {
      ArrayList sessions = new ArrayList();
      
      sessions.add(new StudySessions("Computer Science", 30));
      sessions.add(new StudySessions("Math", 25));

      System.out.print("Study Sessions Logged:");

      for( int i = 0; i < sessions.size(); i++)
        {
          StudySession s = (StudySession) sessions.get(i);

          System.out.print(s);
        }
    }
  }

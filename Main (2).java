import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine ();
    String strArray[] = str.split (" ");
    StringBuffer sb = new StringBuffer (str);
      sb.reverse ();
    for (int i = 0; i < str.length (); i++)
      {
	if (str.charAt (i) == ' ')
	  {
	    sb.insert (i, " ");
	  }
      }
    sb.append ("");
    System.out.println (sb);
  }
}

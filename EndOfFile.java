/* Sample Iput: 
Hello world
I am a file
Read me until end-of-file.
Sample Output:
1 Hello world
2 I am a file
3 Read me until end-of-file.*/
import java.io.*;
import java.util.*;

public class EndOfFile {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (sc.hasNext()) {
        	String s=sc.nextLine();
        	System.out.println(i + " " + s);
        	i++;
        }
    }
}

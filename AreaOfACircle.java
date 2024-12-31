import java.io.*;
public class AreaOfACircle {
    static BufferedReader in;
    static PrintWriter out;
    public static void main(String[] args) throws IOException
    {
        in=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
        int radius=Integer.parseInt(in.readLine());
        float pi=3.1416f;
        float ans=pi*(float)Math.pow(radius,2);
        out.print(ans);
        out.close();
    }
}

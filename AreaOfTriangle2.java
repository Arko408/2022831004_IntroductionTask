import java.io.*;
public class AreaOfTriangle2
{
    static BufferedReader in;
    static PrintWriter out;
    public static void main(String[] args) throws IOException
    {
        in=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
        int a=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());
        int c=Integer.parseInt(in.readLine());
        float s=(a+b+c)/3f;
        //float s2=s*(s-a)*(s-b)*(s-c);
        float ans=(float)Math.pow(s,1f/2f);
        out.print(ans);
        out.close();
    }
}

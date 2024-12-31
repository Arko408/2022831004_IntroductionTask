import java.io.*;
public class EquilateralTriangle
{
    static BufferedReader in;
    static PrintWriter out;
    public static void main(String[] args) throws IOException
    {
        in=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
        float arm=Float.parseFloat(in.readLine());
        float ans=(float)Math.pow(3,1f/2f) * (float)Math.pow(arm,2);
        ans=ans/4f;
        out.print(ans);
        out.close();
    }
}

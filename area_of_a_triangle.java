import java.io.*;
public class area_of_a_triangle
{
    static BufferedReader in;
    static PrintWriter out;
    public static void main(String[] args) throws IOException
    {
        in=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
        int base=Integer.parseInt(in.readLine());
        int height=Integer.parseInt(in.readLine());
        float ans=base*height;
        ans=ans/2;
        out.print(ans);
        out.close();
    }
}

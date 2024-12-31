import java.io.*;
public class CelsiustoFahrenheit {
    static BufferedReader in;
    static PrintWriter out;
    public static void main(String[] args) throws IOException
    {
        in=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
        float celcius=Float.parseFloat(in.readLine());
        float pi=(9f/5f)*celcius;
        float ans=pi+32;
        out.print(ans);
        out.close();
    }
}

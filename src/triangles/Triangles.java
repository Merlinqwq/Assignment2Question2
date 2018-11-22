
package triangles;
import java.io.*;
import java.util.*;
/**
 *
 * @author Merlin
 */
public class Triangles {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
       String strin;

       File data=new File("data.txt");
       File output=new File("output.txt");
       BufferedReader BR=null;
       try{
           BR=new BufferedReader(new FileReader("data.txt"));
       }
       catch(IOException e)
       {
           System.err.println("file is not found");
       }
       FileWriter FW=new FileWriter("output.txt");
       PrintWriter PW=new PrintWriter(FW);
       strin=BR.readLine();
       PW.println("Angle1 Angle2 Angle3 Triangle Type");
       while(strin!=null){
           PW.print(strin);
           String[] tokens=strin.split("[ ]+");
           int angle1;
           angle1=Integer.parseInt(tokens[0]);
           int angle2;
           angle2=Integer.parseInt(tokens[1]);
           int angle3;
           angle3=Integer.parseInt(tokens[2]);
           int sum=angle1+angle2+angle3;
           if(sum==180){
           if(angle1==60&&angle2==60&&angle3==60){
               PW.print("     YES      Equilateral\n");}
           else if(angle1==angle2||angle1==angle3||angle2==angle3&&angle1!=60){
               PW.print("    YES      Isosceles\n");}
           else if(angle1!=angle2&&angle2!=angle3&&angle1!=angle3){
               PW.print("     YES      Scalene\n");}
           }
           else{PW.print("     NO       NA\n");}
           strin=BR.readLine();
       }
       PW.close();

       System.out.println("Pleas check result in output file");
       
    }
    }
    


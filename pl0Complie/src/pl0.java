import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lh
 * on 2017/4/27.
 */
public class pl0 {
    private static List<String> exp = new LinkedList<>();
    public static void main(String[] args){
        getTxt();
        double re;
        for (String s:exp){
            re = Calculator.conversion(s);
            if (Double.isNaN(re)){
                System.out.println(s+":error");
            }else {
                System.out.println(s+" = "+re);
            }

        }
        //System.out.println(0.0/0.0);
    }
   private static void getTxt() {
       File fileR = new File("pl0Complie/res/test.txt");
       FileReader fileReader = null;
       BufferedReader bufferedReader = null;
       try {
           fileReader = new FileReader(fileR);
           bufferedReader = new BufferedReader(fileReader);
           String str = null;
           while ((str = bufferedReader.readLine()) != null) {
               exp.add(str);
           }
           bufferedReader.close();
           fileReader.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}

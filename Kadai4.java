import java.io.*;
class Kadai4{
public static void main(String[]args) throws IOException {
    System.out.println("整数を入力してください");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    String str=br.readLine();
    int num=Integer.parseInt(str);
    System.out.println(num+"が入力されました");
    //int result;
    //result=Math.pow(num,2);
    System.out.println("その値の2乗は"+num*num+"です");
    }    
}

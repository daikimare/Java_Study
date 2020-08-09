import java.io.*;
class Fwrite{
  public static void  main(String[] args){
    try{
      PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("text1.txt")));
      pw.println("Hello");
      pw.println("GoodBye");
      System.out.println("ファイルに書き込みました");
      pw.close();
    }catch(IOException e){
      System.out.println("入出力エラーです");
    }
  }
}
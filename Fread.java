import java.io.*;
class Fread{
  public static void main(String[] args){
    try{
      BufferedReader br= new BufferedReader(new FileReader("text1.txt"));
      String str1= br.readLine();
      String str2= br.readLine();
      System.out.println("ファイルに以下の文字列が書き込まれています");
      System.out.println(str1+"です");
      System.out.println(str2+"です");
      br.close();
    }catch(IOException e){
      System.out.println("入出力エラーです");
    }
  }
}
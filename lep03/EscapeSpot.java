import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class EscapeSpot {
   public static void main(String[] args){

  //クラスの定義
  try{
     //読み込むファイルのインスタンス作成
     //fileName作成
     FileInputStream fi = new FileInputStream("shisetsu_hinan.csv");
     InputStreamReader is = new InputStreamReader(fi);
     BufferedReader br = new BufferedReader(is);
     //読み込み行の設定
     String line;

     //読み込む行数の管理
     int i = 0;

     //読み込む列名を管理する配列
     String[] arr = null;

     //１行ずつ読み込みを行う
     while ((line = br.readLine()) != null){
       //先頭行は列
       if(i == 0){
         //分割してある内容を配列に格納
         //
         arr = line.split(",");

       }else{
         //コンソールに出力
         System.out.println("-------------------------------");

         //データ内容を表示
         System.out.println("データ"+i+"件目");

         //間まで分割した内容を配列に格納
         String[] data = line.split(",");

         //配列の内容を順番に表示（列数分繰り返し行う）
         int colno =0;
         for (String column : arr){
           System.out.println(column+":"+data[colno]);
           colno++;
         }
       }

       //行数をインクリメントし次の行へ
       i++;
      }

    }catch(Exception e){
      e.printStackTrace();
    }
}
}
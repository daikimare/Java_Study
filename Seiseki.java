public class Seiseki{
  protected String name;  //名前
  protected int eng;  //英語得点
  protected int math; //数学得点
  protected int sci;  //理科得点

  //コンストラクタ（データを受け取る）
  public Seiseki(String n,int e,int m,int s){
    name = n;
    eng = e;
    math = m;
    sci = s;
  }
  //データの見出しを１行の文字列にして返す
  public String getHeader(){
    return "名前\t英語\t数学\t理科";
  }
  //データを１行の文字列にして返す
  public String getData(){
    return name+"\t"+eng+"\t"+math+"\t"+sci;
  }
}
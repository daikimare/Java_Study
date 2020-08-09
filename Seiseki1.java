public class Seiseki1 extends Seiseki{
  protected double ave;
  //コンストラクタ（データを受け取る）
  public Seiseki1(String n,int e,int m,int s){
    super(n,e,m,s);
    ave = (int)((e+m+s)*10)/10.0;
  }
  //データの見出しを１行の文字列にして返す
  public String getHeader(){
    return super.getHeader()+"\t平均";
  }
  //データを１行の文字列にして返す
  public String getData(){
    return super.getData()+"\t"+ave;
  }
}
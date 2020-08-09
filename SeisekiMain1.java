//メイン関数
public class SeisekiMain1{
    public static void main(String args[]) {
        //データ初期設定
        Seiseki1 seiseki[]=new Seiseki1[3];
        seiseki[0]=new Seiseki1("太郎",91,75,93);
        seiseki[1]=new Seiseki1("次郎",89,92,85);
        seiseki[2]=new Seiseki1("花子",93,91,97);
        //データの表示
        System.out.println("番号\t" + seiseki[0].getHeader());
        for (int i = 0; i < seiseki.length;i++)
            System.out.println( i+1 + "\t" + seiseki[i].getData());
    }
}
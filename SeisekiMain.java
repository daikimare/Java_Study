//メイン関数
public class SeisekiMain{
    public static void main(String args[]) {
        //データ初期設定
        Seiseki seiseki[]=new Seiseki[3];
        seiseki[0]=new Seiseki("太郎",91,75,93);
        seiseki[1]=new Seiseki("次郎",89,92,85);
        seiseki[2]=new Seiseki("花子",93,91,97);
        //データの表示
        System.out.println("番号\t" + seiseki[0].getHeader());
        for (int i = 0; i < seiseki.length;i++)
            System.out.println( i+1 + "\t" + seiseki[i].getData());
    }
}
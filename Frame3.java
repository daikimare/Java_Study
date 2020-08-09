import java.awt.*;
import java.awt.event.*;
public class Frame3 extends Frame{
  private Button bt;
  public static void main(String[] arg){
    Frame3 sm = new Frame3();
  }
  public Frame3(){
    super("サンプル");
    bt = new Button("ようこそ");
    add(bt);
    addWindowListener(new SampleWindowListener());
    bt.addActionListener(new SampleActionListener());
    setSize(250,200);
    setVisible(true);
  }
  class SampleWindowListener extends WindowAdapter{
    public void WindowClosing(WindowEvent e){
      System.exit(0);
    }
  }
  class SampleActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      bt.setLabel("こんにちは");
    }
  }
}
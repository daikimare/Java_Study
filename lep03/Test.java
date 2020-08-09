import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame implements ActionListener{
  JPanel panel;
  CardLayout layout;
  
  public static void main(String[] args) {
    Test frame = new Test();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }
  Test(){
    /* View1 */
    JPanel card1 = new JPanel();
    card1.add(new JLabel("View1"));
    card1.add(new JButton("button"));

    /* View2 */
    JPanel card2 = new JPanel();
    card2.add(new JLabel("View2"));
    card2.add(new JCheckBox("checkbox1"));
    card2.add(new JCheckBox("checkbox2"));
    
    /* CardLayout準備 */
    this.panel = new JPanel();
    this.layout = new CardLayout();//CardLayoutの作成
    this.panel.setLayout(this.layout);
    /* panelにViewを追加 */
    this.panel.add(card1, "View1");
    this.panel.add(card2, "View2");
    
    /* カード移動用ボタン */
    JButton button1 = new JButton("View1");
    button1.addActionListener(this);
    button1.setActionCommand("View1");

    JButton button2 = new JButton("View2");
    button2.addActionListener(this);
    button2.setActionCommand("View2");

    JPanel btnPanel = new JPanel();
    btnPanel.add(button1);
    btnPanel.add(button2);

    getContentPane().add(this.panel, BorderLayout.CENTER);
    getContentPane().add(btnPanel, BorderLayout.PAGE_END);
  }
  public void actionPerformed(ActionEvent e) {
    // TODO 自動生成されたメソッド・スタブ
    String cmd = e.getActionCommand();
    layout.show(this.panel,cmd);
  }
}
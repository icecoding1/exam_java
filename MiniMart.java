import java.awt.*;
import java.awt.event.*;

class MiniMart extends Frame implements ActionListener {

  Panel top = new Panel();
  Panel bottom = new Panel();
  Panel nameText = new Panel();

  Checkbox c1 = new Checkbox("Coke 12");
  Checkbox c2 = new Checkbox("Pepsi 12");
  Checkbox c3 = new Checkbox("Lays 20");
  Checkbox c4 = new Checkbox("Lays Stax 55");
  Checkbox c5 = new Checkbox("Snack Jack 25");
  Checkbox c6 = new Checkbox("Cup Cake  20");
  Checkbox c7 = new Checkbox("Wate 10");
  Checkbox c8 = new Checkbox("Hot Coffee 55");
  Checkbox c9 = new Checkbox("Lime Juice 25");
  Checkbox c10 = new Checkbox("Orange Juice 20");

  Button clear = new Button("clear");
  Button enter = new Button("enter");
  Button exit = new Button("exit");

  Label text1 = new Label("Subtotal");
  Label text2 = new Label("Tax");
  Label text3 = new Label("Total");

  double p1 = 0,
      p2 = 0,
      p3 = 0;

  TextField pricesub = new TextField(p1 + "");
  TextField pricetax = new TextField(p2 + "");
  TextField priceall = new TextField(p3 + "");

  public MiniMart() {
    super("Coffee shop managerment");

    top.setLayout(new GridLayout(5, 2));
    bottom.setLayout(new GridLayout(3, 3));
    add(nameText, BorderLayout.NORTH);
    add(top, BorderLayout.CENTER);
    add(bottom, BorderLayout.SOUTH);
    nameText.setFont(new Font("Arial", Font.BOLD, 20));

    nameText.add(new Label("coffee shop"));
    top.setBackground(new Color(225, 245, 94));
    top.add(c1);
    top.add(c2);
    top.add(c3);
    top.add(c4);
    top.add(c5);
    top.add(c6);
    top.add(c7);
    top.add(c8);
    top.add(c9);
    top.add(c10);

    bottom.add(clear);
    bottom.add(text1);
    bottom.add(pricesub);

    bottom.add(enter);
    bottom.add(text2);
    bottom.add(pricetax);

    bottom.add(exit);
    bottom.add(text3);
    bottom.add(priceall);

    setSize(550, 450);

    setFont(new Font("Arial", Font.BOLD, 16));
    setVisible(true);

    clear.addActionListener(this);
    enter.addActionListener(this);
    exit.addActionListener(this);

    pricesub.setEnabled(false);
    pricetax.setEnabled(false);
    priceall.setEnabled(false);

    CodeToHandleWinClose m = new CodeToHandleWinClose();
    addWindowListener(m);
  }

  public static void main(String[] args) {
    new MiniMart();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if (e.getSource() == enter) {

      if (c1.getState()) {
        p1 += 12;
      }
      if (c2.getState()) {
        p1 += 12;
      }
      if (c3.getState()) {
        p1 += 20;
      }
      if (c4.getState()) {
        p1 += 55;
      }
      if (c5.getState()) {
        p1 += 25;
      }
      if (c6.getState()) {
        p1 += 20;
      }
      if (c7.getState()) {
        p1 += 10;
      }
      if (c8.getState()) {
        p1 += 55;
      }
      if (c9.getState()) {
        p1 += 25;
      }
      if (c10.getState()) {
        p1 += 20;
      }
      p2 = 7 * p1 / 100;
      p3 = p1 + p2;
      pricesub.setText(p1 + "");
      pricetax.setText(p2 + "");
      priceall.setText(p3 + "");

      // pricesub.setEnabled(true);
      // pricetax.setEnabled(true);
      // priceall.setEnabled(true);

    }
    if (e.getSource() == clear) {
      p1 = 0;
      p2 = 0;
      p3 = 0;
      pricesub.setText(p1 + "");
      pricetax.setText(p2 + "");
      priceall.setText(p3 + "");

    }
    if (e.getSource() == exit) {
      System.exit(0);
    }
  }

}

class CodeToHandleWinClose implements WindowListener {

  @Override
  public void windowOpened(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowClosing(WindowEvent e) {
    // TODO Auto-generated method stub
    System.exit(0);

  }

  @Override
  public void windowClosed(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowIconified(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowDeiconified(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowActivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }

}

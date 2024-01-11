import javax.swing.*;
import javax.swing.text.StyledEditorKit.StyledTextAction;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.net.http.WebSocket.Listener;

class Miniproject implements ActionListener {

  Miniproject() {
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(750, 400);
    Container c = frame.getContentPane();
    JLabel jl2 = new JLabel("Online Shopping");
    jl2.setBounds(250, 5, 200, 50);
    // formatting online shoping
    jl2.setFont(new Font("Serif", Font.BOLD, 26));
    JLabel jb = new JLabel("User name");
    // formatting user name
    jb.setFont(new Font("Serif", Font.PLAIN, 17));
    JLabel jb1 = new JLabel("Enter add.");
    // fromatting address
    jb1.setFont(new Font("Serif", Font.PLAIN, 17));

    JTextField tf = new JTextField("Enter address");

    JTextField tf1 = new JTextField("Enter username");
    // Female
    JLabel female = new JLabel("Female");
    // female checkbox
    JCheckBox bx2 = new JCheckBox();
    bx2.setBounds(150, 150, 60, 30);
    female.setBounds(100, 150, 110, 30);
    JLabel jl3 = new JLabel("Male");
    // male
    jl3.setBounds(100, 120, 110, 30);
    // user name
    tf1.setBounds(175, 50, 110, 30);
    // address
    tf.setBounds(175, 85, 110, 30);
    jb1.setBounds(100, 70, 110, 60);
    jb.setBounds(100, 50, 100, 30);
    JButton button = new JButton("Submit");
    // Button
    button.setBounds(100, 230, 90, 40);
    // clear button
    JButton clearButton = new JButton("Clear");
    clearButton.setBounds(195, 230, 90, 40);
    // Check box
    JCheckBox bx = new JCheckBox();
    bx.setBounds(150, 115, 30, 40);
    // contact number
    JLabel contact = new JLabel("Contact No.");
    contact.setBounds(300, 50, 110, 30);
    // fromatting contact
    contact.setFont(new Font("Serif", Font.PLAIN, 17));
    // contact number text field
    JTextField ctxf = new JTextField("Enter contact no.");
    ctxf.setBounds(390, 50, 120, 30);
    // pin code
    JLabel pnc = new JLabel("Enter Pincode");
    pnc.setBounds(300, 87, 110, 30);
    // formatting pin code
    pnc.setFont(new Font("Serif", Font.PLAIN, 16));
    // pin code text area
    JTextField pctf = new JTextField("Enter pincode");
    // text area
    JTextArea txta = new JTextArea("      Give us a feedback :-)");
    txta.setBounds(300, 130, 200, 200);
    pctf.setBounds(390, 87, 120, 30);
    c.setLayout(null);
    c.add(jb);
    c.add(jb1);
    c.add(tf);
    c.add(tf1);
    c.add(button);
    c.add(jl2);
    c.add(bx);
    c.add(jl3);
    c.add(female);
    c.add(bx2);
    c.add(contact);
    c.add(ctxf);
    c.add(pnc);
    c.add(pctf);
    c.add(txta);
    c.add(clearButton);

    // menu . java
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("Electronics");
    JMenuItem i1 = new JMenuItem("Accessories");

    JMenuItem i2 = new JMenuItem("Camera");
    JMenuItem i3 = new JMenuItem("Cell phone");
    JMenuItem i4 = new JMenuItem("Computers");
    JMenuItem i5 = new JMenuItem("Headphones");
    menu.add(i1);
    menu.add(i2);
    menu.add(i3);
    menu.add(i4);
    menu.add(i5);
    menubar.add(menu);
    frame.setJMenuBar(menubar);
    // menu . java 2
    JMenu m2 = new JMenu("Art & Craft");
    JMenuItem j1 = new JMenuItem("Painting");
    JMenuItem j2 = new JMenuItem("Drawing");
    JMenuItem j3 = new JMenuItem("Photo");
    JMenuItem j4 = new JMenuItem("Printmaking");
    JMenuItem j5 = new JMenuItem("Craft");
    m2.add(j1);
    m2.add(j2);
    m2.add(j3);
    m2.add(j4);
    m2.add(j5);
    menubar.add(m2);
    // menu . java 3
    JMenu m3 = new JMenu("Smart Home");
    JMenuItem k1 = new JMenuItem("Security");
    JMenuItem k2 = new JMenuItem("Camera");
    JMenuItem k3 = new JMenuItem("Heating");
    JMenuItem k4 = new JMenuItem("Kitchen");
    JMenuItem k5 = new JMenuItem("Wi-Fi");
    m3.add(k1);
    m3.add(k2);
    m3.add(k3);
    m3.add(k4);
    m3.add(k5);
    menubar.add(m3);
    // menu . java 3
    JMenu m4 = new JMenu("Women Fashion");
    JMenuItem l1 = new JMenuItem("Clothing");
    JMenuItem l2 = new JMenuItem("Shoes");
    JMenuItem l3 = new JMenuItem("Jwelery");
    JMenuItem l4 = new JMenuItem("Watches");
    JMenuItem l5 = new JMenuItem("Hand bags");
    m4.add(l1);
    m4.add(l2);
    m4.add(l3);
    m4.add(l4);
    m4.add(l5);
    menubar.add(m4);
    // menu . java 4
    JMenu m5 = new JMenu("Boys Fashion");
    JMenuItem n1 = new JMenuItem("Clothing");
    JMenuItem n2 = new JMenuItem("Shoes");
    JMenuItem n3 = new JMenuItem("Jacket");
    JMenuItem n4 = new JMenuItem("Jean");
    JMenuItem n5 = new JMenuItem("Shots");
    m5.add(n1);
    m5.add(n2);
    m5.add(n3);
    m5.add(n4);
    m5.add(n5);
    menubar.add(m5);

    // third step is to add action listener
    button.addActionListener(this);

    // implements the action listener to the menu items
    i1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    i2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    i3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    i4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    i5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    j1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    j2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    j3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    j4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    j5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    k1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    k2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    k3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    k4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    k5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    l1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    l2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    l3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    l4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    l5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    n1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    n2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    n3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    n4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });
    n5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        System.out.println("Selected item: " + menuItem.getText());
      }
    });

    // 03 taking input from the user
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name = tf1.getText();
        String contact = ctxf.getText();
        String address = tf.getText();
        String pincode = pctf.getText();
        String feedback = txta.getText();
        System.out.println("Name : " + name);
        System.out.println("Contact number : " + contact);
        System.out.println("Address : " + address);
        System.out.println("Pincode : " + pincode);
        System.out.println("Feedback : " + feedback);
      }
    });
    // Taking check box input from the user
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (bx.isSelected()) {
          System.out.println("Male customer");
        } else {
          System.out.println("Female customer");
        }
      }
    });
    // Creating a new button and assign clear property to it
    clearButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        tf1.setText("");
        ctxf.setText("");
        pctf.setText("");
        tf.setText("");
        txta.setText("");
      }
    });
    // button formatting
    button.setFont(new Font("Serif", Font.BOLD, 14));
    button.setForeground(Color.WHITE);
    button.setBackground(Color.BLUE);
    button.setOpaque(true);
    button.setBorderPainted(false);
    // clear button formatting
    clearButton.setFont(new Font("Serif", Font.BOLD, 14));
    clearButton.setForeground(Color.WHITE);
    clearButton.setBackground(Color.RED);
    clearButton.setOpaque(true);
    clearButton.setBorderPainted(false);

    jl2.setForeground(Color.MAGENTA);     
  
  }


  public static void main(String args[]) {
    new Miniproject();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    // TODO Auto-generated method stub
    JFrame jb = new JFrame();
    jb.setVisible(true);
    jb.setSize(400, 400);
    
    JLabel njb = new JLabel("You have successfully placed your order");
    jb.add(njb);
    njb.setBounds(30, 40, 70, 30);
  
  
 

  }

}
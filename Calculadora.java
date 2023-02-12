/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class Vista extends JFrame {

    private JMenuBar menuBar;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnRetroceso;
    private JButton btnC;
    private JButton btnCE;
    private JButton btnIgual;
    private JButton btnPunto;
    private JLabel lblResultado;
    private JTextField txtfResultado;
    private double total;
    private boolean igual;

    //Constructor 
    public Vista(){

        setTitle("Sumadora grafica");
        setSize(290,245);
        //menu generate method
        generateMenu();
        setJMenuBar(menuBar);
        total = 0.0;
        igual = false;

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(290,245));
        contentPane.setBackground(new Color(192,192,192));

        btn0 = new JButton();
        btn0.setBounds(20,150,45,35);
        btn0.setBackground(new Color(214,217,223));
        btn0.setForeground(new Color(0,0,0));
        btn0.setEnabled(true);
        btn0.setFont(new Font("sansserif",0,12));
        btn0.setText("0");
        btn0.setVisible(true);
        //Set action for button click
        //Call defined method
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn0(evt);
            }
        });

        btn1 = new JButton();
        btn1.setBounds(71,150,45,35);
        btn1.setBackground(new Color(214,217,223));
        btn1.setForeground(new Color(0,0,0));
        btn1.setEnabled(true);
        btn1.setFont(new Font("sansserif",0,12));
        btn1.setText("1");
        btn1.setVisible(true);
        //Set action for button click
        //Call defined method
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1(evt);
            }
        });

        btn2 = new JButton();
        btn2.setBounds(120,150,45,35);
        btn2.setBackground(new Color(214,217,223));
        btn2.setForeground(new Color(0,0,0));
        btn2.setEnabled(true);
        btn2.setFont(new Font("sansserif",0,12));
        btn2.setText("2");
        btn2.setVisible(true);
        //Set action for button click
        //Call defined method
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2(evt);
            }
        });

        btn3 = new JButton();
        btn3.setBounds(168,150,45,35);
        btn3.setBackground(new Color(214,217,223));
        btn3.setForeground(new Color(0,0,0));
        btn3.setEnabled(true);
        btn3.setFont(new Font("sansserif",0,12));
        btn3.setText("3");
        btn3.setVisible(true);
        //Set action for button click
        //Call defined method
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3(evt);
            }
        });
        
        btn4 = new JButton();
        btn4.setBounds(215,150,45,35);
        btn4.setBackground(new Color(214,217,223));
        btn4.setForeground(new Color(0,0,0));
        btn4.setEnabled(true);
        btn4.setFont(new Font("sansserif",0,12));
        btn4.setText("4");
        btn4.setVisible(true);
        //Set action for button click
        //Call defined method
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4(evt);
            }
        });

        btn5 = new JButton();
        btn5.setBounds(20,110,45,35);
        btn5.setBackground(new Color(214,217,223));
        btn5.setForeground(new Color(0,0,0));
        btn5.setEnabled(true);
        btn5.setFont(new Font("sansserif",0,12));
        btn5.setText("5");
        btn5.setVisible(true);
        //Set action for button click
        //Call defined method
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5(evt);
            }
        });

        btn6 = new JButton();
        btn6.setBounds(71,110,45,35);
        btn6.setBackground(new Color(214,217,223));
        btn6.setForeground(new Color(0,0,0));
        btn6.setEnabled(true);
        btn6.setFont(new Font("sansserif",0,12));
        btn6.setText("6");
        btn6.setVisible(true);
        //Set action for button click
        //Call defined method
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn6(evt);
            }
        });

        btn7 = new JButton();
        btn7.setBounds(120,110,45,35);
        btn7.setBackground(new Color(214,217,223));
        btn7.setForeground(new Color(0,0,0));
        btn7.setEnabled(true);
        btn7.setFont(new Font("sansserif",0,12));
        btn7.setText("7");
        btn7.setVisible(true);
        //Set action for button click
        //Call defined method
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn7(evt);
            }
        });
        
        btn8 = new JButton();
        btn8.setBounds(168,110,45,35);
        btn8.setBackground(new Color(214,217,223));
        btn8.setForeground(new Color(0,0,0));
        btn8.setEnabled(true);
        btn8.setFont(new Font("sansserif",0,12));
        btn8.setText("8");
        btn8.setVisible(true);
        //Set action for button click
        //Call defined method
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn8(evt);
            }
        });
        
        btn9 = new JButton();
        btn9.setBounds(215,110,45,35);
        btn9.setBackground(new Color(214,217,223));
        btn9.setForeground(new Color(0,0,0));
        btn9.setEnabled(true);
        btn9.setFont(new Font("sansserif",0,12));
        btn9.setText("9");
        btn9.setVisible(true);
        //Set action for button click
        //Call defined method
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn9(evt);
            }
        });

        btnPunto = new JButton();
        btnPunto.setBounds(20,190,45,35);
        btnPunto.setBackground(new Color(214,217,223));
        btnPunto.setForeground(new Color(0,0,0));
        btnPunto.setEnabled(true);
        btnPunto.setFont(new Font("sansserif",0,12));
        btnPunto.setText(".");
        btnPunto.setVisible(true);
        //Set action for button click
        //Call defined method
        btnPunto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPunto(evt);
            }
        });     

        btnRetroceso= new JButton();
        btnRetroceso.setBounds(71,190,45,35);
        btnRetroceso.setBackground(new Color(214,217,223));
        btnRetroceso.setForeground(new Color(0,0,0));
        btnRetroceso.setEnabled(true);
        btnRetroceso.setFont(new Font("sansserif",0,12));
        btnRetroceso.setText("<-");
        btnRetroceso.setVisible(true);
        //Set action for button click
        //Call defined method
        btnRetroceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRetroceso(evt);
            }
        });

        btnIgual = new JButton();
        btnIgual.setBounds(120,190,45,35);
        btnIgual.setBackground(new Color(214,217,223));
        btnIgual.setForeground(new Color(0,0,0));
        btnIgual.setEnabled(true);
        btnIgual.setFont(new Font("sansserif",0,12));
        btnIgual.setText("=");
        btnIgual.setVisible(true);
        //Set action for button click
        //Call defined method
        btnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIgual(evt);
            }
        });     

        btnC = new JButton();
        btnC.setBounds(168,190,45,35);
        btnC.setBackground(new Color(214,217,223));
        btnC.setForeground(new Color(0,0,0));
        btnC.setEnabled(true);
        btnC.setFont(new Font("sansserif",0,12));
        btnC.setText("C");
        btnC.setVisible(true);
        //Set action for button click
        //Call defined method
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnC(evt);
            }
        });


        btnCE = new JButton();
        btnCE.setBounds(215,190,45,35);
        btnCE.setBackground(new Color(214,217,223));
        btnCE.setForeground(new Color(0,0,0));
        btnCE.setEnabled(true);
        btnCE.setFont(new Font("sansserif",0,12));
        btnCE.setText("CE");
        btnCE.setVisible(true);
        //Set action for button click
        //Call defined method
        btnCE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCE(evt);
            }
        });



        lblResultado = new JLabel();
        lblResultado.setBounds(30,30,250,35);
        lblResultado.setBackground(new Color(214,217,223));
        lblResultado.setForeground(new Color(0,0,0));
        lblResultado.setEnabled(true);
        lblResultado.setFont(new Font("sansserif",0,12));
        lblResultado.setText("Resultados");
        lblResultado.setVisible(true);

        txtfResultado = new JTextField();
        txtfResultado.setBounds(20,75,250,35);
        txtfResultado.setBackground(new Color(255,255,255));
        txtfResultado.setForeground(new Color(0,0,0));
        txtfResultado.setEnabled(true);
        txtfResultado.setFont(new Font("sansserif",0,12));
        txtfResultado.setVisible(true);
        //Set action for key events
        //Call defined method
        txtfResultado.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                teclado(evt);
            }
        });


        //adding components to contentPane panel
        contentPane.add(btn0);
        contentPane.add(btn1);
        contentPane.add(btn2);
        contentPane.add(btn3);
        contentPane.add(btn4);
        contentPane.add(btn5);
        contentPane.add(btn6);
        contentPane.add(btn7);
        contentPane.add(btn8);
        contentPane.add(btn9);
        contentPane.add(btnRetroceso);
        contentPane.add(btnC);
        contentPane.add(btnCE);
        contentPane.add(btnIgual);
        contentPane.add(btnPunto);
        contentPane.add(lblResultado);
        contentPane.add(txtfResultado);

        //adding panel to JFrame and seting of window position and close operation
        getContentPane().add(contentPane);
        setDefaultCloseOperation(   JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    //Method actionPerformed for btn0
    private void btn0 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"0");
    }

    //Method actionPerformed for btn1
    private void btn1 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"1");
    }

    //Method actionPerformed for btn2
    private void btn2 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"2");
    }

    //Method actionPerformed for btn3
    private void btn3 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"3");
    }
    //Method actionPerformed for btn4
    private void btn4 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"4");
    }

    //Method actionPerformed for btn5
    private void btn5 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"5");
    }

    //Method actionPerformed for btn6
    private void btn6 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"6");
    }

    //Method actionPerformed for btn7
    private void btn7 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"7");
    }

    //Method actionPerformed for btn8
    private void btn8 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"8");
    }

    //Method actionPerformed for btn9
    private void btn9 (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            txtfResultado.setText(txtfResultado.getText()+"9");
    }

    //Method actionPerformed for btnBack
    private void btnRetroceso(ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            if(txtfResultado.getText().length()!=0){ //Solo retrocede si existe algo                
                txtfResultado.setText(txtfResultado.getText().substring(0,txtfResultado.getText().length()-1));
             }
    }

    //Method actionPerformed for btnC
    private void btnC (ActionEvent evt) {
            txtfResultado.setText("");
    }

    //Method actionPerformed for btnCE
    private void btnCE (ActionEvent evt) {
            lblResultado.setText("Resultados");
            txtfResultado.setText("");
            total = 0.0;
    }

    //Method actionPerformed for btnIgual
    private void btnIgual (ActionEvent evt) {
            if(lblResultado.getText().compareTo("Resultados") == 0){
                 lblResultado.setText(txtfResultado.getText());
                 total = Double.parseDouble(txtfResultado.getText());
            }else{
                lblResultado.setText(lblResultado.getText()+" + "+ txtfResultado.getText());
                total += Double.parseDouble(txtfResultado.getText());
                txtfResultado.setText(""+total);
            }
            igual=true;
    }

    //Method actionPerformed for btnPunto
    private void btnPunto (ActionEvent evt) {
            if(igual==true){
                txtfResultado.setText("");
                igual = false;
            }
            if(txtfResultado.getText().length()==0){
                txtfResultado.setText("0.");
             }
             else if(txtfResultado.getText().indexOf(".")==-1){
                 txtfResultado.setText(txtfResultado.getText()+".");                 
             }
    }

    //Method keyPressed for txtfResultado
    private void teclado (KeyEvent evt) {
        int tecla = evt.getKeyCode();
        if(tecla>47 && tecla<58)//De 0 a9
        {
                if(igual==true){
                    txtfResultado.setText("");
                    igual = false;
                }            
        }
        else
        switch(tecla){
            case 8: //Retroceso
                if(igual==true){
                    txtfResultado.setText("");
                    igual = false;
                }
                if(txtfResultado.getText().length()!=0){ //Solo retrocede si existe algo                
                    txtfResultado.setText(txtfResultado.getText().substring(0,txtfResultado.getText().length()-1));
                 } break;
            case 10: //Enter en vez de igual
                if(lblResultado.getText().compareTo("Resultados") == 0){
                     lblResultado.setText(txtfResultado.getText());
                     total = Double.parseDouble(txtfResultado.getText());
                }else{
                    lblResultado.setText(lblResultado.getText()+" + "+ txtfResultado.getText());
                    total += Double.parseDouble(txtfResultado.getText());
                    txtfResultado.setText(""+total);
                }
                igual=true;  break;
            case 46:    //punto   
                if(igual==true){
                    txtfResultado.setText("");
                    igual = false;
                }
                if(txtfResultado.getText().length()==0){
                    txtfResultado.setText("0");
                 }
                 else if(txtfResultado.getText().indexOf(".")==-1){
                     ;              
                 } break;
            case 67: //C 
                txtfResultado.setText(""); break;
            case 76: //L en lugar de 
            lblResultado.setText("Resultados");
            txtfResultado.setText("");
            total = 0.0; break;
            default:
                lblResultado.setText(""+tecla);
        }
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();
   }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Vista();
            }
        });
    }

}
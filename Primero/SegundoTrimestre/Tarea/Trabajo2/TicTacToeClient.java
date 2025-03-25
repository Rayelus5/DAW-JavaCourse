package Primero.SegundoTrimestre.Tarea.Trabajo2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TicTacToeClient {
    protected JFrame frame;
    protected static JButton btnNewButton_1;
    protected static JButton btnNewButton_2;
    protected static JButton btnNewButton_3;
    protected static JButton btnNewButton_4;
    protected static JButton btnNewButton_5;
    protected static JButton btnNewButton_6;
    protected static JButton btnNewButton_7;
    protected static JButton btnNewButton_8;
    protected static JButton btnNewButton_9;
    protected JLabel lblNewLabel_player1;
    protected JLabel lblNewLabel_player2;
    protected static JLabel lblNewLabel_score1;
    protected static JLabel lblNewLabel_score2;
    protected JLabel lblNewLabel_entry;

    protected static int z=0;
    protected static int p1=0;
    protected static int p2=0;
    protected static String name1="";
    protected static String name2="";


    protected static Socket client;
    protected static DataInputStream in;
    protected static DataOutputStream out;
    private JLabel lblNewLabel_title;
    private static JLabel lblNewLabel_1_connected;

    private JTextField textField;
    private static JTextArea textArea;
    private JScrollPane scrollPane;

    public static void player_1_win(){
        JOptionPane.showMessageDialog(null, "You Lose The Match");
        p1++;

        lblNewLabel_score1.setText(""+p1);

        retry();
    }

    public static void player_2_win(){
        JOptionPane.showMessageDialog(null, "You Won The Match");
        p2++;

        lblNewLabel_score2.setText(""+p2);

        retry();
    }
    protected static void retry() {
        // TODO Auto-generated method stub
        btnNewButton_1.setText("");
        btnNewButton_2.setText("");
        btnNewButton_3.setText("");
        btnNewButton_4.setText("");
        btnNewButton_5.setText("");
        btnNewButton_6.setText("");
        btnNewButton_7.setText("");
        btnNewButton_8.setText("");
        btnNewButton_9.setText("");
        z=0;
        enableButtons();

    }
    public static void enableButtons(){
        btnNewButton_1.setEnabled(true);
        btnNewButton_2.setEnabled(true);
        btnNewButton_3.setEnabled(true);
        btnNewButton_4.setEnabled(true);
        btnNewButton_5.setEnabled(true);
        btnNewButton_6.setEnabled(true);
        btnNewButton_7.setEnabled(true);
        btnNewButton_8.setEnabled(true);
        btnNewButton_9.setEnabled(true);
    }
    public static void disableButtons(){
        btnNewButton_1.setEnabled(false);
        btnNewButton_2.setEnabled(false);
        btnNewButton_3.setEnabled(false);
        btnNewButton_4.setEnabled(false);
        btnNewButton_5.setEnabled(false);
        btnNewButton_6.setEnabled(false);
        btnNewButton_7.setEnabled(false);
        btnNewButton_8.setEnabled(false);
        btnNewButton_9.setEnabled(false);

    }
    public static void disableRandomButtons(){
        if(btnNewButton_1.getText()=="X" || btnNewButton_1.getText()=="O"){

            btnNewButton_1.setEnabled(false);
        }
        if(btnNewButton_2.getText()=="X" || btnNewButton_2.getText()=="O"){

            btnNewButton_2.setEnabled(false);
        }
        if(btnNewButton_3.getText()=="X" || btnNewButton_3.getText()=="O"){

            btnNewButton_3.setEnabled(false);
        }
        if(btnNewButton_4.getText()=="X" || btnNewButton_4.getText()=="O"){

            btnNewButton_4.setEnabled(false);
        }
        if(btnNewButton_5.getText()=="X" || btnNewButton_5.getText()=="O"){

            btnNewButton_5.setEnabled(false);
        }
        if(btnNewButton_6.getText()=="X" || btnNewButton_6.getText()=="O"){

            btnNewButton_6.setEnabled(false);
        }
        if(btnNewButton_7.getText()=="X" || btnNewButton_7.getText()=="O"){

            btnNewButton_7.setEnabled(false);
        }
        if(btnNewButton_8.getText()=="X" || btnNewButton_8.getText()=="O"){

            btnNewButton_8.setEnabled(false);
        }
        if(btnNewButton_9.getText()=="X" || btnNewButton_9.getText()=="O"){

            btnNewButton_9.setEnabled(false);
        }
    }
    public static void Checkwin(){
        z++;
        if(btnNewButton_1.getText().equals("X") && btnNewButton_2.getText().equals("X") && btnNewButton_3.getText().equals("X")){


            player_1_win();
        }
        else if(btnNewButton_4.getText().equals("X") && btnNewButton_5.getText().equals("X") && btnNewButton_6.getText().equals("X")){


            player_1_win();
        }
        else if(btnNewButton_7.getText().equals("X") && btnNewButton_8.getText().equals("X") && btnNewButton_9.getText().equals("X")){


            player_1_win();
        }
        else if(btnNewButton_1.getText().equals("X") && btnNewButton_4.getText().equals("X") && btnNewButton_7.getText().equals("X")){


            player_1_win();
        }
        else if(btnNewButton_2.getText().equals("X") && btnNewButton_5.getText().equals("X") && btnNewButton_8.getText().equals("X")){


            player_1_win();
        }
        else if(btnNewButton_3.getText().equals("X") && btnNewButton_6.getText().equals("X") && btnNewButton_9.getText().equals("X")){


            player_1_win();
        }
        else if(btnNewButton_1.getText().equals("X") && btnNewButton_5.getText().equals("X") && btnNewButton_9.getText().equals("X")){


            player_1_win();
        }
        else if(btnNewButton_3.getText().equals("X") && btnNewButton_5.getText().equals("X") && btnNewButton_7.getText().equals("X")){


            player_1_win();
        }

        //Second Player Wins

        else if (btnNewButton_1.getText().equals("O") && btnNewButton_2.getText().equals("O") && btnNewButton_3.getText().equals("O")) {


            player_2_win();
        }
        else if (btnNewButton_4.getText().equals("O") && btnNewButton_5.getText().equals("O") && btnNewButton_6.getText().equals("O")) {


            player_2_win();
        }
        else if (btnNewButton_7.getText().equals("O") && btnNewButton_8.getText().equals("O") && btnNewButton_9.getText().equals("O")) {


            player_2_win();
        }
        else if (btnNewButton_1.getText().equals("O") && btnNewButton_4.getText().equals("O") && btnNewButton_7.getText().equals("O")) {


            player_2_win();
        }
        else if (btnNewButton_2.getText().equals("O") && btnNewButton_5.getText().equals("O") && btnNewButton_8.getText().equals("O")) {


            player_2_win();
        }
        else if (btnNewButton_3.getText().equals("O") && btnNewButton_6.getText().equals("O") && btnNewButton_9.getText().equals("O")) {

            player_2_win();
        }
        else if (btnNewButton_1.getText().equals("O") && btnNewButton_5.getText().equals("O") && btnNewButton_9.getText().equals("O")) {


            player_2_win();
        }
        else if (btnNewButton_3.getText().equals("O") && btnNewButton_5.getText().equals("O") && btnNewButton_7.getText().equals("O")) {


            player_2_win();
        }
        else if(z==9){
            Ties();
        }
    }
    private static void Ties() {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Nobody Wins");
        retry();

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TicTacToeClient window = new TicTacToeClient();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        try {
            String ip = JOptionPane.showInputDialog("Enter IP address:");
            client = new Socket(ip,5000);
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
            lblNewLabel_1_connected.setText("Connected");
            lblNewLabel_1_connected.setVisible(true);

            while(true){
                String btn=in.readUTF();

                if(btn.equals("1")==true){
                    btnNewButton_1.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else if(btn.equals("2")==true){
                    btnNewButton_2.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else if(btn.equals("3")==true){
                    btnNewButton_3.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else if(btn.equals("4")==true){
                    btnNewButton_4.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else if(btn.equals("5")==true){
                    btnNewButton_5.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else if(btn.equals("6")==true){
                    btnNewButton_6.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else if(btn.equals("7")==true){
                    btnNewButton_7.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else if(btn.equals("8")==true){
                    btnNewButton_8.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else if(btn.equals("9")==true){
                    btnNewButton_9.setText("X");
                    enableButtons();
                    disableRandomButtons();
                    Checkwin();
                }
                else{
                    textArea.setText(textArea.getText().trim()+"\nServer:\t"+btn);
                }

            }

        }
        catch(UnknownHostException e1){
            lblNewLabel_1_connected.setText("IP address is wrong");
            lblNewLabel_1_connected.setVisible(true);

        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            lblNewLabel_1_connected.setText("Server is not longer available");
            lblNewLabel_1_connected.setVisible(true);

        }

    }
    /**
     * Create the application.
     * @throws IOException
     */
    public TicTacToeClient() throws IOException {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     * @throws IOException
     */
    protected void initialize() throws IOException {
        frame = new JFrame();
        frame.setBounds(100, 100, 1050, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(570, 88, 464, 276);
        frame.getContentPane().add(scrollPane);

        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
        scrollPane.setViewportView(textArea);
        textArea.setEditable(false);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode==KeyEvent.VK_ENTER){
                    try {
                        String msgout ="";
                        msgout = textField.getText().trim();
                        out.writeUTF(msgout);
                        textArea.setText(textArea.getText().trim()+"\nMe:\t"+msgout);


                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    textField.setText("");
                }
            }
        });
        textField.setBounds(570, 368, 367, 55);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        btnNewButton_1 = new JButton("");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btnNewButton_1.setText("O");
                disableButtons();
                String btn1 = "1";
                try {
                    out.writeUTF(btn1);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_1.setBounds(90, 90, 138, 92);
        frame.getContentPane().add(btnNewButton_1);
        btnNewButton_1.setFocusPainted(false);



        btnNewButton_2 = new JButton("");
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_2.setText("O");
                disableButtons();
                String btn2 = "2";
                try {
                    out.writeUTF(btn2);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_2.setBounds(228, 90, 122, 92);
        frame.getContentPane().add(btnNewButton_2);
        btnNewButton_2.setFocusPainted(false);

        btnNewButton_3 = new JButton("");
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_3.setText("O");
                disableButtons();
                String btn3 = "3";
                try {
                    out.writeUTF(btn3);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_3.setBounds(350, 90, 122, 92);
        frame.getContentPane().add(btnNewButton_3);
        btnNewButton_3.setFocusPainted(false);

        btnNewButton_4 = new JButton("");
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_4.setText("O");
                disableButtons();
                String btn4 = "4";
                try {
                    out.writeUTF(btn4);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_4.setBounds(90, 181, 138, 92);
        frame.getContentPane().add(btnNewButton_4);
        btnNewButton_4.setFocusPainted(false);

        btnNewButton_5 = new JButton("");
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_5.setText("O");
                disableButtons();
                String btn5 = "5";
                try {
                    out.writeUTF(btn5);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_5.setBounds(228, 181, 122, 92);
        frame.getContentPane().add(btnNewButton_5);
        btnNewButton_5.setFocusPainted(false);

        btnNewButton_6 = new JButton("");
        btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_6.setText("O");
                disableButtons();
                String btn6 = "6";
                try {
                    out.writeUTF(btn6);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_6.setBounds(350, 181, 122, 92);
        frame.getContentPane().add(btnNewButton_6);
        btnNewButton_6.setFocusPainted(false);

        btnNewButton_7 = new JButton("");
        btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_7.setText("O");
                disableButtons();
                String btn7 = "7";
                try {
                    out.writeUTF(btn7);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_7.setBounds(90, 272, 138, 92);
        frame.getContentPane().add(btnNewButton_7);
        btnNewButton_7.setFocusPainted(false);

        btnNewButton_8 = new JButton("");
        btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_8.setText("O");
                disableButtons();
                String btn8 = "8";
                try {
                    out.writeUTF(btn8);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_8.setBounds(228, 272, 122, 92);
        frame.getContentPane().add(btnNewButton_8);
        btnNewButton_8.setFocusPainted(false);

        btnNewButton_9 = new JButton("");
        btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 60));
        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_9.setText("O");
                disableButtons();
                String btn9 = "9";
                try {
                    out.writeUTF(btn9);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Checkwin();
            }
        });
        btnNewButton_9.setBounds(350, 272, 122, 92);
        frame.getContentPane().add(btnNewButton_9);
        btnNewButton_9.setFocusPainted(false);

        JButton btnNewButton = new JButton("OK");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try {
                    String msgout ="";
                    msgout = textField.getText().trim();
                    out.writeUTF(msgout);
                    textArea.setText(textArea.getText().trim()+"\nMe:\t"+msgout);


                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                textField.setText("");

            }
        });
        btnNewButton.setBackground(Color.RED);
        btnNewButton.setBounds(936, 368, 98, 55);
        frame.getContentPane().add(btnNewButton);

        lblNewLabel_player1 = new JLabel("OTHER PLAYER");
        lblNewLabel_player1.setForeground(Color.RED);
        lblNewLabel_player1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_player1.setBounds(114, 467, 114, 41);
        frame.getContentPane().add(lblNewLabel_player1);

        lblNewLabel_player2 = new JLabel("YOUR SCORE");
        lblNewLabel_player2.setForeground(Color.RED);
        lblNewLabel_player2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_player2.setBounds(130, 519, 98, 41);
        frame.getContentPane().add(lblNewLabel_player2);

        lblNewLabel_score1 = new JLabel("");
        lblNewLabel_score1.setForeground(Color.RED);
        lblNewLabel_score1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_score1.setBounds(228, 467, 109, 41);
        frame.getContentPane().add(lblNewLabel_score1);

        lblNewLabel_score2 = new JLabel("");
        lblNewLabel_score2.setForeground(Color.RED);
        lblNewLabel_score2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_score2.setBounds(228, 519, 109, 41);
        frame.getContentPane().add(lblNewLabel_score2);

        lblNewLabel_entry = new JLabel("O");
        lblNewLabel_entry.setFont(new Font("Tahoma", Font.PLAIN, 99));
        lblNewLabel_entry.setForeground(Color.RED);
        lblNewLabel_entry.setBounds(482, 90, 84, 274);
        frame.getContentPane().add(lblNewLabel_entry);

        lblNewLabel_title = new JLabel("LETS PLAY TICTACTOE");
        lblNewLabel_title.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel_title.setForeground(Color.RED);
        lblNewLabel_title.setBounds(121, 11, 327, 71);
        frame.getContentPane().add(lblNewLabel_title);

        lblNewLabel_1_connected = new JLabel("CONNECTED");
        lblNewLabel_1_connected.setForeground(Color.RED);
        lblNewLabel_1_connected.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel_1_connected.setBounds(90, 375, 470, 52);
        frame.getContentPane().add(lblNewLabel_1_connected);
        lblNewLabel_1_connected.setVisible(false);
    }
}


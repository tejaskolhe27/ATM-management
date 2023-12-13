
package Trial_GUI;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class testing extends javax.swing.JFrame {

    String to;
    public testing() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - TERNA ATM");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 102));
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 200, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trial_GUI/Debit.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trial_GUI/lock.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 154, 530, 10));

        jButton1.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 110, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 322, 530, -1));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Enter Card Number  : :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 40));

        jButton2.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Proceed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 130, -1));

        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 200, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 170, 20));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Enter PIN                       : :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 200, 30));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Savings To Empower");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 190, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trial_GUI/transparent.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 190, 100));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 200, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 260, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trial_GUI/abstract-white-gray-gradient-color-curve-background_48946-64.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPasswordField1.setText("");
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
              
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jPasswordField1.requestFocus();
        
        //getting password entered in pin3
        String card = jTextField1.getText();
        
        //getting length of string
        int length = card.length();
        
        char c = evt.getKeyChar();
        
        //Check for Number 0 to 9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<16)
            {
                jTextField1.setEditable(true);
            }
            else
            {
                jTextField1.setEditable(false);
            }
        }//end of if
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||
                    evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                jTextField1.setEditable(true);
            }
            else
            {
                jTextField1.setEditable(false);
            }
        }//end of else
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton2.requestFocus();
        
        String pin1 = jPasswordField1.getText();
        
        //getting length of string
        int length = pin1.length();
        
        char c = evt.getKeyChar();
        
        //Check for Number 0 to 9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<4)
            {
                jPasswordField1.setEditable(true);
            }
            else
            {
                jPasswordField1.setEditable(false);
            }
        }//end of if
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||
                    evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                jPasswordField1.setEditable(true);
            }
            else
            {
                jPasswordField1.setEditable(false);
            }
        }//end of else
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jPasswordField1.setText("");
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                       
        if((jTextField1.getText()).equals(""))
        {
            jLabel8.setText("Please enter the Card Number");
        }
        if((jPasswordField1.getText()).equals(""))
        {
            jLabel9.setText("Please enter the PIN");
        }
        
        String card = jTextField1.getText();
        //getting length of string
        int length = card.length();
        if(length!=16)
        {
            jLabel10.setText("Please enter valid 16 digit Card Number");
        }
        else
        {
            try
            {
                //STEP 1:
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver Loaded");
            
                //STEP 2:
                Connection conn=DriverManager.getConnection
                        ("jdbc:mysql://localhost"
                       + ":3306/ATM","root","Lavesh@2002");
                System.out.println("Connection Established");
            
                String sql="select * from login where card_number=? and pin=?";
                
                //STEP 3:
                PreparedStatement pst=conn.prepareStatement(sql);
                pst.setString(1,jTextField1.getText());
                pst.setString(2,jPasswordField1.getText());
                
                //STEP 4:
                ResultSet rs = pst.executeQuery();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this,"Login Successfull!");
                    
                    Statement st=conn.createStatement();
                    ResultSet rss=st.executeQuery
                     ("select email_id from login where "
                    + "card_number = '"+jTextField1.getText()+"'");
            
                    while(rss.next())
                    {
                        to=rs.getString("email_id");
                    }//end of while

                    //Add sender
                    String from = "jainlavesh14@gmail.com";
                    final String username = "jainlavesh14@gmail.com";//your Gmail username 
                    final String password = "ParshwaJewellers";//your Gmail password

                    String host = "smtp.gmail.com";

                    Properties props = new Properties();
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.enable", "true"); 
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");

                    // Get the Session object
                    Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                    }
                 });

                try 
                {
                // Create a default MimeMessage object
                Message message = new MimeMessage(session);

                message.setFrom(new InternetAddress(from));

                message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));

                // Set Subject
                message.setSubject("Bank Alerts - TERNA BANK");

                // Put the content of your message
                message.setText("Dear Customer,\nThank you for banking with Terna Bank.\n\nIf"
                        + " you observe any discrepancy on this transaction, you can contact us on"
                        + " our 24-hour Customer Care number 1800 2000 1911/7977730070. Please provide "
                        + "us your valuable feedback on your banking experience, by Email on "
                        + "customerfeedback@ternabank.co.in\n\nWarm regards,\nTeam Terna Bank.");

                    // Send message
                    Transport.send(message);

                    System.out.println("Sent message successfully!");
                    }

                    catch(MessagingException e)
                    {
                        throw new RuntimeException(e);
                    }//end of catch

                    Main_Menu m= new Main_Menu(jTextField1.getText());
                    m.setVisible(true);
                    dispose();
                }//end of if
                else
                {
                    JOptionPane.showMessageDialog(this,"Wrong Credentials,Please try again");
                    jTextField1.setText("");
                    jPasswordField1.setText("");
                }//end of else
                
                //STEP 5:
                conn.close();
            }//end of try
            catch(ClassNotFoundException c)
            {
                System.out.println("Driver not Loaded");
            }//end of catch
            catch(SQLException s)
            {
                System.out.println("Connection not established");
            }//end of catch
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jLabel8.setText(" ");
        jLabel9.setText(" ");
        jLabel10.setText("");
        jTextField1.setText("");
        jPasswordField1.setText("");
        jTextField1.setEditable(true);
        
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        jPasswordField1.setEditable(true);
    }//GEN-LAST:event_jPasswordField1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

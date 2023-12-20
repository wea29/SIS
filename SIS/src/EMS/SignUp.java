/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EMS;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author maquiling
 */
public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        
        txtPass.setEchoChar((char)0);
        txtPass2.setEchoChar((char)0);
        cbShow.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSignUp = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        cbShow = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        lblEM = new javax.swing.JLabel();
        txtPass2 = new javax.swing.JPasswordField();
        cbShow2 = new javax.swing.JCheckBox();
        txtFirstname = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        btnSignUp.setBackground(new java.awt.Color(0, 153, 153));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPass.setForeground(java.awt.Color.gray);
        txtPass.setText("Password");
        txtPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        cbShow.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cbShow.setText("Show ");
        cbShow.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbShowItemStateChanged(evt);
            }
        });
        cbShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign Up");

        lblEM.setBackground(new java.awt.Color(255, 255, 255));
        lblEM.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblEM.setForeground(new java.awt.Color(255, 0, 0));

        txtPass2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPass2.setForeground(java.awt.Color.gray);
        txtPass2.setText("Password");
        txtPass2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPass2FocusLost(evt);
            }
        });
        txtPass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPass2MouseClicked(evt);
            }
        });
        txtPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass2ActionPerformed(evt);
            }
        });
        txtPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPass2KeyPressed(evt);
            }
        });

        cbShow2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cbShow2.setText("Show ");
        cbShow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShow2ActionPerformed(evt);
            }
        });

        txtFirstname.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtFirstname.setForeground(java.awt.Color.gray);
        txtFirstname.setText("First name");
        txtFirstname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        txtFirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusLost(evt);
            }
        });
        txtFirstname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFirstnameMouseClicked(evt);
            }
        });
        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });
        txtFirstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFirstnameKeyPressed(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBack.setText("x");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        txtLastname.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtLastname.setForeground(java.awt.Color.gray);
        txtLastname.setText("Last name");
        txtLastname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        txtLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastnameFocusLost(evt);
            }
        });
        txtLastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLastnameMouseClicked(evt);
            }
        });
        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });
        txtLastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastnameKeyPressed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtUser.setForeground(java.awt.Color.gray);
        txtUser.setText("Username");
        txtUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbShow2)
                    .addComponent(cbShow)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblEM, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPass2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtPass)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblBack)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbShow2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEM, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(430, 40, 390, 430);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 33)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("System");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 100, 350, 45);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 33)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Student Information");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 60, 360, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\maquiling\\EMILY\\Downloads\\GG2.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 150, 370, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void isValidSignUp(){
        String fname = txtFirstname.getText().trim();
        String lname = txtLastname.getText().trim();
        String username = txtUser.getText().trim();
        String pass = new String(txtPass.getPassword());
        String pass2 = new String(txtPass2.getPassword());
        
        File f = new File(username +".txt");
        
        if(isRequired()){
            lblEM.setText("Fill up all required Fields");
            lblEM.setOpaque(true);
            lblEM.setBackground(Color.white);
        }else{
            if(!(pass.equals(pass2))){
                lblEM.setText("Password mismatch");
                lblEM.setOpaque(true);
                lblEM.setBackground(Color.white);
            }else if(f.exists()){
                lblEM.setText("Username Already Exist");
                lblEM.setOpaque(true);
                lblEM.setBackground(Color.white);
            }else{
                try {
                    
                    int result = JOptionPane.showConfirmDialog(
                                null,
                                "Do you want to proceed?",
                                "Confirmation",
                                JOptionPane.YES_NO_OPTION
                        );

                        // Check the user's choice
                        if (result == JOptionPane.YES_OPTION) {
                            FileWriter writer = new FileWriter(f);
                            writer.write(username);
                            writer.write("\n");
                            writer.write(pass);
                            writer.write("\n");
                            writer.write(fname);
                            writer.write("\n");
                            writer.write(lname);
                            writer.write("\n");
                            
                            writer.close();
                            JOptionPane.showMessageDialog(null, "Registered Successfully");
                            setDefault();
                        } else {
                            
                        }
                    
                } catch (IOException e) {
                    e.printStackTrace();
        }
            }
        }
    }
    
    private void setDefault(){
        txtUser.setText(""); 
    }
    private boolean isRequired(){
        String username = txtUser.getText().trim();
        String pass = new String(txtPass.getPassword());
        String pass2 = new String(txtPass2.getPassword());
        String fname = txtFirstname.getText().trim();
        String lname = txtLastname.getText().trim();
        
        if(username.equals("username")){
            return true;
        }else if(pass.equals("password")){
            return true;
        }else if(pass2.equals("confirm password")){
            return true;
        }else if(fname.equals("firstname")){
            return true;
        }else if(lname.equals("lastname")){
            return true;
        }
        
        return false;
    }
    private void setErrorMessage(){
        lblEM.setText("");
        lblEM.setOpaque(false);
    }
    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
       setErrorMessage();
        txtUser.setForeground(Color.black);
        txtUser.selectAll();
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        String user = txtUser.getText().trim();
        if(user.isEmpty()){
            txtUser.setForeground(Color.LIGHT_GRAY);
            txtUser.setText("username");
        }
    }//GEN-LAST:event_txtUserFocusLost
    
    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        txtUser.setBackground(Color.white);
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed
   
    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        isValidSignUp();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        setErrorMessage();
        txtPass.setForeground(Color.black);
        txtPass.selectAll();
        if(!cbShow.isSelected()){
            txtPass.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        char [] pass = txtPass.getPassword();
        if(pass.length == 0){
            txtPass.setForeground(Color.LIGHT_GRAY);
            txtPass.setText("password");
            txtPass.setEchoChar((char)0);
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        try {
            char[] password = txtPass.getPassword();

            if (password.length == 0) {
                txtPass.setBackground(Color.RED);
                lblEM.setText("Please enter your password ");
                txtPass2.setEnabled(false);
            } else {
                txtPass.setBackground(Color.WHITE);
                lblEM.setText("");
                txtPass2.setEnabled(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtPassActionPerformed

    private void cbShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowActionPerformed
        if(cbShow.isSelected()){
            txtPass.setEchoChar((char)0);
        }else{
            txtPass.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_cbShowActionPerformed

    private void txtPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusGained
        setErrorMessage();
        txtPass2.setForeground(Color.black);
        txtPass2.selectAll();
        if(!cbShow.isSelected()){
            txtPass2.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_txtPass2FocusGained

    private void txtPass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusLost
        char [] pass = txtPass2.getPassword();
        if(pass.length == 0){
            txtPass2.setForeground(Color.LIGHT_GRAY);
            txtPass2.setText("confirm password");
            txtPass2.setEchoChar((char)0);
        }
    }//GEN-LAST:event_txtPass2FocusLost

    private void txtPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass2ActionPerformed

    }//GEN-LAST:event_txtPass2ActionPerformed

    private void cbShow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShow2ActionPerformed
        if(cbShow.isSelected()){
            txtPass2.setEchoChar((char)0);
        }else{
            txtPass2.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_cbShow2ActionPerformed

    private void txtFirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusGained
        setErrorMessage();
        txtFirstname.setForeground(Color.black);
        txtFirstname.selectAll();
    }//GEN-LAST:event_txtFirstnameFocusGained

    private void txtFirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusLost
        String first = txtFirstname.getText().trim();
        if(first.isEmpty()){
            txtFirstname.setForeground(Color.LIGHT_GRAY);
            txtFirstname.setText("firstname");
        }
    }//GEN-LAST:event_txtFirstnameFocusLost

    private void txtFirstnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstnameMouseClicked
        txtFirstname.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtFirstnameMouseClicked

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        if (txtFirstname.getText().equals("")) {
            lblEM.setText("What's your full name?");
        } else {
            lblEM.setText("");
        }
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPass.requestFocus();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPass2.requestFocus();
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtPass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFirstname.requestFocus();
        }
    }//GEN-LAST:event_txtPass2KeyPressed

    private void txtFirstnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSignUp.requestFocus();
        }
    }//GEN-LAST:event_txtFirstnameKeyPressed

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        txtPass.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPassMouseClicked

    private void txtPass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPass2MouseClicked
         txtPass2.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPass2MouseClicked

    private void txtLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusGained
        setErrorMessage();
        txtLastname.setForeground(Color.black);
        txtLastname.selectAll();
    }//GEN-LAST:event_txtLastnameFocusGained

    private void txtLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusLost
        String last = txtLastname.getText().trim();
        if(last.isEmpty()){
            txtLastname.setForeground(Color.LIGHT_GRAY);
            txtLastname.setText("lastname");
        }
    }//GEN-LAST:event_txtLastnameFocusLost

    private void txtLastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameMouseClicked

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtLastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameKeyPressed

    private void cbShowItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbShowItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbShowItemStateChanged
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JCheckBox cbShow;
    private javax.swing.JCheckBox cbShow2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblEM;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

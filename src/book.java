/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class book extends javax.swing.JFrame {

    /**
     * Creates new form book
     */
    public book() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cb1 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rt1 = new javax.swing.JRadioButton();
        rt2 = new javax.swing.JRadioButton();
        rt3 = new javax.swing.JRadioButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 32767));
        Count = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Transylvania");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("ROOM NO.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 127, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 159, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("AGE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 194, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 226, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("CHECKIN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 272, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("CHECKOUT");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 316, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("ADDRESS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("CONTACT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 405, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 119, 196, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 156, 196, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 191, 196, -1));

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 269, 196, -1));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 313, 196, -1));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 357, 196, -1));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 402, 196, -1));

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rb1.setText("MALE");
        rb1.setOpaque(false);
        getContentPane().add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 222, -1, -1));

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rb2.setText("FEMALE");
        rb2.setOpaque(false);
        getContentPane().add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 222, -1, -1));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jButton1.setText("PROCEED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jButton2.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jButton3.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 76, -1));

        cb1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cb1.setText("SPECIAL GUEST");
        cb1.setOpaque(false);
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 448, -1, -1));

        jButton4.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setText("Hotel Transylvania");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 16, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Room Types");

        buttonGroup2.add(rt1);
        rt1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rt1.setText("Regular");
        rt1.setOpaque(false);
        rt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rt2);
        rt2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rt2.setText("Suite");
        rt2.setOpaque(false);

        buttonGroup2.add(rt3);
        rt3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rt3.setText("Studio");
        rt3.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rt3)
                    .addComponent(rt2)
                    .addComponent(jLabel1)
                    .addComponent(rt1))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rt3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 140, 160));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 30, 160));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 400, -1));

        Count.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        Count.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CountPropertyChange(evt);
            }
        });
        getContentPane().add(Count, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 210, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\light-1282314_1280.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       t1.setText(null); t2.setText(null); t3.setText(null); t4.setText(null); t5.setText(null); t6.setText(null); t7.setText(null);
      // rb1.setSelected(false); rb2.setSelected(false);
      buttonGroup1.clearSelection();
      cb1.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        mainMenu m = new mainMenu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Proceed
       String url  = "jdbc:mysql://localhost/project";
       String user = "root";
       String password = "abhishek";
       try{
           Connection con = DriverManager.getConnection(url, user,password);
           
           String q = "Insert into reservation values (?,?,?,?,?,?,?,?,?,?)";
           
           PreparedStatement pstm = con.prepareStatement(q);
           
           String room = t1.getText();
           String name  = t2.getText();
           int age = Integer.parseInt(t3.getText());
           String checkin = t4.getText();
           String checkout = t5.getText();
           String address = t6.getText();
           String contact = t7.getText();
           int spl = 0;
           String gender = "";
           int room_type = 0;
           
           if(rb1.isSelected()){
               gender = "M";
           }else { gender = "F"; }
           
           if(cb1.isSelected()){
               spl = 1;
           }
           if(rt1.isSelected()){
               room_type = 1;
           }else if(rt2.isSelected()){
               room_type = 2;
           }else{
               room_type = 3;
           }
           
           
           pstm.setString(1, room);
           pstm.setString(2, name);
           pstm.setInt(3, age);
           pstm.setString(4, gender);
           pstm.setDate(5, Date.valueOf(checkin));
           pstm.setDate(6, Date.valueOf(checkout));
           pstm.setString(7, address);
           pstm.setString(8, contact);
           pstm.setInt(9, spl);
           pstm.setInt(10, room_type);
           
           pstm.execute();
           JOptionPane.showMessageDialog(null, "One booking successful");
           
           pstm.close();
           con.close();
           
           //For count to work I change it's property here ! 
           Count.setEnabled(false);
           Count.setEnabled(true);
           
       }catch( Exception e ){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CountPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CountPropertyChange
        // TODO add your handling code here
       String url  = "jdbc:mysql://localhost/project";
       String user = "root";
       String password = "abhishek";
       try{
           Connection con = DriverManager.getConnection(url, user,password);
           String q = "Select count(*) from reservation";
           Statement stm = con.createStatement();
           ResultSet rs = stm.executeQuery(q);
           if(rs.next()){
               Count.setText("Total Rooms Booked: " + rs.getString("count(*)"));
           }
           rs.close();
           stm.close();
           con.close();
         }catch( Exception e ){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_CountPropertyChange

    private void rt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rt1ActionPerformed

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
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Count;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cb1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rt1;
    private javax.swing.JRadioButton rt2;
    private javax.swing.JRadioButton rt3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}

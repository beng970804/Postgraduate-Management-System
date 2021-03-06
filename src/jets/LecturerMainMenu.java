/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class LecturerMainMenu extends javax.swing.JFrame {

    LinkedList<Notification> notificationList = new LinkedList<>();
    DefaultTableModel notificationModel = new DefaultTableModel();
    String url = "jdbc:db2:PMS";
    /**
     * Creates new form MainMenu
     */
    public LecturerMainMenu() {
        initComponents();
        jLabel24.setText(Jets.UserID);
        jLabel23.setText(Jets.UserName);
        notificationRefresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnProgress = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNotification = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnProfile = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnFeedback = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        NotificationPop = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lecturer - Main Menu");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1280, 720));
        bg.setMinimumSize(new java.awt.Dimension(1280, 720));
        bg.setPreferredSize(new java.awt.Dimension(1280, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(60, 100, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Lecturer Info");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 38)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Multimedia University");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mmu.png"))); // NOI18N
        jLabel13.setName(""); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Name   :  ");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("_____________________________________");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("_____________________________________");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("ID         :  ");
        jLabel7.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(646, 646, 646))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnProgress.setPreferredSize(new java.awt.Dimension(155, 155));
        btnProgress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProgressMousePressed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Report_Card_64px.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(48, 118, 232));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(48, 118, 232));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Progress");

        javax.swing.GroupLayout btnProgressLayout = new javax.swing.GroupLayout(btnProgress);
        btnProgress.setLayout(btnProgressLayout);
        btnProgressLayout.setHorizontalGroup(
            btnProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProgressLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(btnProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        btnProgressLayout.setVerticalGroup(
            btnProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProgressLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bg.add(btnProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        btnNotification.setPreferredSize(new java.awt.Dimension(155, 155));
        btnNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNotificationMousePressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Notification_64px.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(48, 118, 232));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(48, 118, 232));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Notification");

        javax.swing.GroupLayout btnNotificationLayout = new javax.swing.GroupLayout(btnNotification);
        btnNotification.setLayout(btnNotificationLayout);
        btnNotificationLayout.setHorizontalGroup(
            btnNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNotificationLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(btnNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        btnNotificationLayout.setVerticalGroup(
            btnNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNotificationLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bg.add(btnNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        btnProfile.setPreferredSize(new java.awt.Dimension(155, 155));
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProfileMousePressed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_User_64px.png"))); // NOI18N

        jLabel15.setBackground(new java.awt.Color(48, 118, 232));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(48, 118, 232));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Profile");

        javax.swing.GroupLayout btnProfileLayout = new javax.swing.GroupLayout(btnProfile);
        btnProfile.setLayout(btnProfileLayout);
        btnProfileLayout.setHorizontalGroup(
            btnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProfileLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(btnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        btnProfileLayout.setVerticalGroup(
            btnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfileLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bg.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        btnFeedback.setPreferredSize(new java.awt.Dimension(155, 155));
        btnFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFeedbackMousePressed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Feedback_64px.png"))); // NOI18N

        jLabel18.setBackground(new java.awt.Color(48, 118, 232));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(48, 118, 232));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Feedback");

        javax.swing.GroupLayout btnFeedbackLayout = new javax.swing.GroupLayout(btnFeedback);
        btnFeedback.setLayout(btnFeedbackLayout);
        btnFeedbackLayout.setHorizontalGroup(
            btnFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFeedbackLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(btnFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        btnFeedbackLayout.setVerticalGroup(
            btnFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFeedbackLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bg.add(btnFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        btnLogout.setPreferredSize(new java.awt.Dimension(155, 155));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutMousePressed(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Logout_Rounded_Up_64px.png"))); // NOI18N

        jLabel22.setBackground(new java.awt.Color(48, 118, 232));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(48, 118, 232));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Logout");

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogoutLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bg.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, -1, -1));

        NotificationPop.setEditable(false);
        NotificationPop.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NotificationPop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bg.add(NotificationPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1240, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProgressMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProgressMousePressed
        //new StudentProgressReport().show();
        //new LecturerProgressRreport().setVisible(true);
        //JOptionPane.showMessageDialog(new JFrame(), "Under debugging!!!");
        new LecProgressReport().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProgressMousePressed

    private void btnProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMousePressed
        // TODO add your handling code here:
        new ProfileManagement().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProfileMousePressed

    private void btnFeedbackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFeedbackMousePressed
        // TODO add your handling code here:
        new LecturerViewFeedback().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFeedbackMousePressed

    private void btnLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMousePressed
        // TODO add your handling code here:
        new UserLogout().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutMousePressed

    private void btnNotificationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotificationMousePressed
        // TODO add your handling code here:
        new StudentNotification().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNotificationMousePressed

    public void notificationRefresh(){
        notificationList.clear();
        String id;
        String type;
        String date;
        String description;
        
        Connection con;
        
        try{
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            con = DriverManager.getConnection(url);
            Statement sql1;
            ResultSet rs;

            String s1 = "select * from notification";
            sql1 = con.createStatement();
            rs = sql1.executeQuery(s1);
            
            while (rs.next()){
                id = rs.getString("notification_id");
                type = rs.getString("notification_type");
                description = rs.getString("notification_description");
                date = rs.getString("notification_date");
                notificationList.add(new Notification(id,type,description,date));            
            }
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.now();
            String d1 = localDate.format(dtf);
            int counter=1;
            String longString = "Today's Notification: ";
            for (int i=0;i<notificationList.size();i++){
                if(d1.equals(notificationList.get(i).getDate())){
                    longString = longString + counter + ".[" + notificationList.get(i).getType() + "<" + 
                            notificationList.get(i).getDate() + "> " +
                            notificationList.get(i).getDescription() + "] ";
                    counter+=1;
                }
            }
            
            NotificationPop.setText(longString);

            rs.close();
            sql1.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }      
        
    }
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
            java.util.logging.Logger.getLogger(LecturerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NotificationPop;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnFeedback;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnNotification;
    private javax.swing.JPanel btnProfile;
    private javax.swing.JPanel btnProgress;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

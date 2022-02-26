package railwayreservation;

import java.util.Random;
import javax.swing.JOptionPane;

public class Frame2 extends javax.swing.JFrame {

    public Frame2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        lPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        lStart = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lAge = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        bBook2 = new javax.swing.JButton();
        tfEnd = new javax.swing.JTextField();
        tfStart = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        lEnd = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        lState = new javax.swing.JLabel();
        tfState = new javax.swing.JTextField();
        lCity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOKING TICKET");

        lPhone.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lPhone.setText("PHONE NO.");

        tfPhone.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lStart.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lStart.setText("START");

        tfAge.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lAge.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lAge.setText("AGE");

        lName.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lName.setText("NAME");

        bBook2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        bBook2.setText("BOOK TICKET");
        bBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBook2ActionPerformed(evt);
            }
        });

        tfEnd.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        tfStart.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        tfName.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lEnd.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lEnd.setText("END");

        tfCity.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lState.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lState.setText("STATE");

        tfState.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N

        lCity.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lCity.setText("CITY");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lState, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCity)
                            .addComponent(tfState, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lStart, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(bBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName))
                .addGap(33, 33, 33)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAge))
                .addGap(35, 35, 35)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPhone))
                .addGap(31, 31, 31)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lStart))
                .addGap(34, 34, 34)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEnd))
                .addGap(36, 36, 36)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCity))
                .addGap(34, 34, 34)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(bBook2)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBook2ActionPerformed
        Random random = new Random();
        String name, age, phno, start, end, city, state;

        int ticketno;
        name = tfName.getText();
        age = tfAge.getText();
        phno = tfPhone.getText();
        start = tfStart.getText();
        end = tfEnd.getText();
        city = tfCity.getText();
        state = tfState.getText();

//do dbms function instead of normal stuff here
//add all these to database and book ticket
//this can be used as an if option
/*if(name.equals("")||age.equals("")||phno.equals("")||start.equals("")||end.equals("")||city.equals("")||state.equals("")){
JOptionPane.showMessageDialog(null, "Please fill all fields " );

}

///THERE IS A PROBLEM HERE WHICH MAKES YOU SHOW THE OPTION PANE SAYING  
//FILL IN ALL FIELDS, AFTER YOU DONT INPUT ALL FIELDS THE FIRST TIME
else
{
         */
        ticketno = random.nextInt(9999);
        JOptionPane.showMessageDialog(null, "Ticket booked successfully\nYour TICKET NUMBER is " + ticketno);
        this.setVisible(false);
        Frame1 f1 = new Frame1();
        f1.setVisible(true);
//}

        tfName.setText("");
        tfAge.setText("");
        tfPhone.setText("");
        tfStart.setText("");
        tfEnd.setText("");
        tfCity.setText("");
        tfState.setText("");
    }//GEN-LAST:event_bBook2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBook2;
    private javax.swing.JLabel lAge;
    private javax.swing.JLabel lCity;
    private javax.swing.JLabel lEnd;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel lStart;
    private javax.swing.JLabel lState;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfEnd;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfStart;
    private javax.swing.JTextField tfState;
    // End of variables declaration//GEN-END:variables
}
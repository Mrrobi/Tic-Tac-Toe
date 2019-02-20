
import java.util.logging.Level;
import java.util.logging.Logger;


public class HumanToHuman extends javax.swing.JFrame {

    String T1, T2, T3, T4, T5, T6, T7, T8, T9,winText;
    boolean player = true;
    boolean winner = false;

    Thread one = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                //System.out.println("one running");
                if (winner) {
                    System.out.println("Winner Find");
                    if (winText.matches("O")) {
                        TA1.setEnabled(true);
                        TA1.setText("Player 2 wins!!!");
                        jPanel1.setVisible(false);
                        one.stop();
                    } else {
                        TA1.setEnabled(true);
                        TA1.setText("Player 1 wins!!!");
                        jPanel1.setVisible(false);
                        one.stop();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HumanToHuman.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
    Thread two = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                //System.out.println("two running");
                try {
                    if (T1 == T2 && T2 == T3 && !T1.isEmpty()) {
                        winner = true;
                        winText = T1;
                        System.out.println("W");
                        two.stop();
                    } else if (T1 == T4 && T4 == T7 && !T1.isEmpty()) {
                        winner = true;
                        winText = T1;
                        System.out.println("W");
                        two.stop();
                        break;
                    } else if (T1 == T5 && T5 == T9 && !T1.isEmpty()) {
                        winner = true;
                        winText = T1;
                        System.out.println("W");
                        two.stop();
                        break;
                    } else if (T2 == T5 && T5 == T8 && !T2.isEmpty()) {
                        winner = true;
                        winText = T2;
                        System.out.println("w");
                        two.stop();
                        break;
                    } else if (T4 == T5 && T5 == T6 && !T4.isEmpty()) {
                        winner = true;
                        winText = T4;
                        System.out.println("W");
                        two.stop();
                        break;
                    } else if (T7 == T8 && T8 == T9 && !T7.isEmpty()) {
                        winner = true;
                        winText = T7;
                        System.out.println("W");
                        two.stop();
                        break;
                    } else if (T3 == T5 && T5 == T7 && !T3.isEmpty()) {
                        winner = true;
                        winText = T3;
                        System.out.println("W");
                        two.stop();
                        break;
                    }
                } catch (NullPointerException e) {
                    e.getMessage();
                }
            }
        }
    });

    public HumanToHuman() {

        initComponents();
        setLocationRelativeTo(null);
        TA1.setText("Player 1's Turn");
        one.start();
        two.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        B1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);

        TA1.setEditable(false);
        TA1.setColumns(20);
        TA1.setRows(5);
        TA1.setEnabled(false);
        jScrollPane1.setViewportView(TA1);

        jLabel1.setText("< Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B2.setText("X");
            T2 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B2.setText("O");
            T2 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B9.setText("X");
            T9 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B9.setText("O");
            T9 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B1.setText("X");
            T1 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B1.setText("O");
            T1 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B3.setText("X");
            T3 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B3.setText("O");
            T3 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B4.setText("X");
            T4 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B4.setText("O");
            T4 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B5.setText("X");
            T5 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B5.setText("O");
            T5 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B6.setText("X");
            T6 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B6.setText("O");
            T6 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B7.setText("X");
            T7 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B7.setText("O");
            T7 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        if (player) {
            B8.setText("X");
            T8 = "X";
            player = false;
            TA1.setText("Player 2's Turn");
        } else {
            B8.setText("O");
            T8 = "O";
            player = true;
            TA1.setText("Player 1's Turn");
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Welcome w = new Welcome();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(HumanToHuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HumanToHuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HumanToHuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HumanToHuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HumanToHuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JTextArea TA1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

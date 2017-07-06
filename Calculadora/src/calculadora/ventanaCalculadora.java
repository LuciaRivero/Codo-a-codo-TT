
package calculadora;

public class ventanaCalculadora extends javax.swing.JFrame {

    public ventanaCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Calculo = new javax.swing.JTextArea();
        Resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        Calculo.setColumns(20);
        Calculo.setRows(5);
        jScrollPane1.setViewportView(Calculo);

        Resultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ocho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nueve))
                                    .addComponent(cero))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dividir)
                                    .addComponent(multiplicar)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(cuatro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cinco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(seis)
                                    .addGap(18, 18, 18)
                                    .addComponent(resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(uno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tres)
                                    .addGap(18, 18, 18)
                                    .addComponent(suma))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uno)
                            .addComponent(dos)
                            .addComponent(tres)
                            .addComponent(suma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuatro)
                            .addComponent(cinco)
                            .addComponent(seis)
                            .addComponent(resta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ocho)
                            .addComponent(nueve)
                            .addComponent(multiplicar)
                            .addComponent(siete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dividir)
                            .addComponent(cero))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
       this.Calculo.setText(this.Calculo.getText()+ "2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "3");
    }//GEN-LAST:event_tresActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "/");
    }//GEN-LAST:event_dividirActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
       this.Calculo.setText(this.Calculo.getText()+ "1");   
    }//GEN-LAST:event_unoActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
       this.Calculo.setText(this.Calculo.getText()+ "6");
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "9");
    }//GEN-LAST:event_nueveActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
       this.Calculo.setText(this.Calculo.getText()+ "0");
    }//GEN-LAST:event_ceroActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "+");
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "-");
    }//GEN-LAST:event_restaActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        this.Calculo.setText(this.Calculo.getText()+ "*");
    }//GEN-LAST:event_multiplicarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Calculo;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton resta;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}

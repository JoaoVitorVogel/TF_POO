package org.example.InterfaceGrafica;

import org.example.Garagem;

/**
 * @author JoãoVitorVogel
 */
public class CriaTrem extends javax.swing.JFrame {

    public CriaTrem() {
        initComponents();
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSlider3 = new javax.swing.JSlider();

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Insira um ID para o Trem");

        jLabel2.setText("Quantidade locomotivas");

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 0, 8));
        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(Garagem.getQuantiaLocomotivas());
        jSlider1.setMinimum(0);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("FEWG");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade Vagões");

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 36));
        jLabel4.setText("CRIAÇÃO DE TRENS");

        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jSlider3.setBackground(new java.awt.Color(255, 255, 255));
        jSlider3.setFont(new java.awt.Font("Segoe UI", 0, 8));
        jSlider3.setMajorTickSpacing(1);
        jSlider3.setMaximum(Garagem.getQuantiaVagao());
        jSlider3.setMinimum(0);
        jSlider3.setMinorTickSpacing(1);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setToolTipText("FEWG");
        jSlider3.setAlignmentX(0.0F);
        jSlider3.setAlignmentY(0.0F);
        jSlider3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider3.setRequestFocusEnabled(false);
        jSlider3.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSlider1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 600,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                81,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addGap(33, 33, 33)
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        layout.createSequentialGroup()
                                                                                                .addComponent(jButton2)
                                                                                                .addPreferredGap(
                                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jButton1))
                                                                                .addComponent(jSlider3,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        600,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                .addContainerGap()));

        pack();
    }

    // ação salvar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int idTrem = Integer.parseInt(jTextField1.getText());
        int quantiaLocomotiva = jSlider1.getValue();
        int quantiaVagao = jSlider3.getValue();
        Garagem.criaTrem(idTrem, quantiaLocomotiva, quantiaVagao);
        Menu.AtualizaTela();
        CriaTrem.this.dispose();
    }

    // ação cancelar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        CriaTrem.this.dispose();
    }

    // ação insere id trem
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriaTrem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriaTrem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriaTrem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriaTrem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriaTrem().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JTextField jTextField1;
}

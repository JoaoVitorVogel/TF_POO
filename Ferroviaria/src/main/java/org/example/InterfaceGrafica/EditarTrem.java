package org.example.InterfaceGrafica;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.example.Garagem;

/**
 * @author JoãoVitorVogel
 */
public class EditarTrem extends javax.swing.JFrame {

    public EditarTrem() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sliderLocomotiva = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sliderVagao = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        IDTrem = new javax.swing.JComboBox<>();


        jLabel1.setText("Selecione um trem");

        jLabel2.setText("Quantidade locomotivas");

        sliderLocomotiva.setBackground(new java.awt.Color(255, 255, 255));
        sliderLocomotiva.setFont(new java.awt.Font("Segoe UI", 0, 8)); 
        sliderLocomotiva.setMajorTickSpacing(1);
        sliderLocomotiva.setMaximum(1);
        sliderLocomotiva.setMinimum(1);
        sliderLocomotiva.setMinorTickSpacing(1);
        sliderLocomotiva.setPaintLabels(true);
        sliderLocomotiva.setPaintTicks(true);
        sliderLocomotiva.setToolTipText("FEWG");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade Vagões");

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 36)); 
        jLabel4.setText("EDIÇÃO DE TRENS");

        sliderVagao.setBackground(new java.awt.Color(255, 255, 255));
        sliderVagao.setFont(new java.awt.Font("Segoe UI", 0, 8)); 
        sliderVagao.setMajorTickSpacing(1);
        sliderVagao.setMaximum(0);
        sliderVagao.setMinimum(0);
        sliderVagao.setMinorTickSpacing(1);
        sliderVagao.setPaintLabels(true);
        sliderVagao.setPaintTicks(true);
        sliderVagao.setToolTipText("FEWG");
        sliderVagao.setAlignmentX(0.0F);
        sliderVagao.setAlignmentY(0.0F);
        sliderVagao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sliderVagao.setRequestFocusEnabled(false);
        sliderVagao.setVerifyInputWhenFocusTarget(false);

        sliderVagao.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                setaVisibilidadeLocomotiva();
            }
         });

        sliderLocomotiva.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                setaVisibilidadeVagao();
            }
         });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        IDTrem.setModel(new javax.swing.DefaultComboBoxModel<>(Garagem.getStringIds()));
        IDTrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                idTremActionPerfomed(evt);
            }
        });

        atualizaSliders();
        setaVisibilidadeLocomotiva();
        setaVisibilidadeVagao();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderLocomotiva, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addComponent(sliderVagao, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(IDTrem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDTrem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(sliderLocomotiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sliderVagao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }

    private void setaVisibilidadeLocomotiva(){
        if(sliderVagao.getValue() != 0){
            sliderLocomotiva.setEnabled(false);
        } else {
            sliderLocomotiva.setEnabled(true);
        }
    }

    private void setaVisibilidadeVagao(){
        if(sliderLocomotiva.getValue() != valorIniciaLocomotiva){
            sliderVagao.setEnabled(false);
        } else {
            sliderVagao.setEnabled(true);
        }
    }
    //atualiza sliders
    int valorIniciaLocomotiva;
    private void atualizaSliders(){
        int idTrem = Integer.parseInt((String) IDTrem.getSelectedItem());

        int totalVagao = Garagem.contaVagaoById(idTrem) + Garagem.getQuantiaVagao();
        int totalLocomotiva = Garagem.contaLocomotivaById(idTrem) + Garagem.getQuantiaLocomotivas();
        sliderVagao.setMaximum(totalVagao);
        sliderLocomotiva.setMaximum(totalLocomotiva);

        sliderVagao.setValue(Garagem.contaVagaoById(idTrem));
        sliderLocomotiva.setValue(Garagem.contaLocomotivaById(idTrem));
        valorIniciaLocomotiva = sliderLocomotiva.getValue();
    }
    
    //ação selecionar id
    private void idTremActionPerfomed(java.awt.event.ActionEvent evt) {
        atualizaSliders();
    }

    //ação cancelar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        EditarTrem.this.dispose();
    }

    //ação salvar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int idTrem = Integer.parseInt((String) IDTrem.getSelectedItem());
        int quantiaLocomotiva = sliderLocomotiva.getValue();
        int quantiaVagao = sliderVagao.getValue();
        Garagem.atualizaTrem(idTrem, quantiaLocomotiva, quantiaVagao);
        Menu.AtualizaTela();
        EditarTrem.this.dispose();
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
            java.util.logging.Logger.getLogger(EditarTrem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarTrem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarTrem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarTrem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarTrem().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox<String> IDTrem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider sliderLocomotiva;
    private javax.swing.JSlider sliderVagao;
}

package apresentacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinicius
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        Janela = new javax.swing.JTabbedPane();
        RegistraAluguel = new javax.swing.JPanel();
        ButtonRegistrarRA = new javax.swing.JButton();
        ButtonCancelarRA = new javax.swing.JButton();
        LabelCpfRA = new javax.swing.JLabel();
        LabelLivroRA = new javax.swing.JLabel();
        LabelDadosRA = new javax.swing.JLabel();
        ListLivrosRA = new java.awt.Choice();
        ListUsuariosRA = new java.awt.Choice();
        TabelDadosUsuarioRA = new javax.swing.JScrollPane();
        DadosRA = new javax.swing.JTable();
        RegistraEntrega = new javax.swing.JPanel();
        ListUsuariosRE = new java.awt.Choice();
        ButtonRegistrarRE = new javax.swing.JButton();
        ButtonCancelarRE = new javax.swing.JButton();
        LabelCpfRE = new javax.swing.JLabel();
        LabelDadosRE = new javax.swing.JLabel();
        TableDadosRE = new javax.swing.JScrollPane();
        DadosRE = new javax.swing.JTable();
        LabelDadosRE1 = new javax.swing.JLabel();
        TableDadosRE1 = new javax.swing.JScrollPane();
        DadosRE1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setMaximumSize(new java.awt.Dimension(1200, 500));
        setMinimumSize(new java.awt.Dimension(800, 300));
        setPreferredSize(new java.awt.Dimension(800, 300));

        Janela.setMaximumSize(getMaximumSize());
        Janela.setMinimumSize(getMinimumSize());
        Janela.setPreferredSize(getPreferredSize());

        RegistraAluguel.setMaximumSize(Janela.getMaximumSize());
        RegistraAluguel.setMinimumSize(Janela.getMinimumSize());

        ButtonRegistrarRA.setText("Registrar");
        ButtonRegistrarRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarRAActionPerformed(evt);
            }
        });

        ButtonCancelarRA.setText("Cancelar");

        LabelCpfRA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelCpfRA.setText("CPF");

        LabelLivroRA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelLivroRA.setText("Livro");

        LabelDadosRA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelDadosRA.setText("Dados");

        ListLivrosRA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ListUsuariosRA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DadosRA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelDadosUsuarioRA.setViewportView(DadosRA);

        javax.swing.GroupLayout RegistraAluguelLayout = new javax.swing.GroupLayout(RegistraAluguel);
        RegistraAluguel.setLayout(RegistraAluguelLayout);
        RegistraAluguelLayout.setHorizontalGroup(
            RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistraAluguelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistraAluguelLayout.createSequentialGroup()
                        .addComponent(TabelDadosUsuarioRA, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                        .addGap(15, 15, 15)
                        .addComponent(ButtonRegistrarRA)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCancelarRA))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistraAluguelLayout.createSequentialGroup()
                        .addComponent(LabelDadosRA)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(RegistraAluguelLayout.createSequentialGroup()
                        .addGroup(RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelLivroRA)
                            .addComponent(LabelCpfRA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListLivrosRA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListUsuariosRA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        RegistraAluguelLayout.setVerticalGroup(
            RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistraAluguelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListUsuariosRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCpfRA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelLivroRA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListLivrosRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LabelDadosRA)
                .addGap(18, 18, 18)
                .addGroup(RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistraAluguelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonRegistrarRA)
                        .addComponent(ButtonCancelarRA))
                    .addComponent(TabelDadosUsuarioRA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        Janela.addTab("Registrar Alugel", RegistraAluguel);

        RegistraEntrega.setMaximumSize(Janela.getMaximumSize());
        RegistraEntrega.setMinimumSize(Janela.getMinimumSize());

        ListUsuariosRE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ButtonRegistrarRE.setText("Registrar");
        ButtonRegistrarRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarREActionPerformed(evt);
            }
        });

        ButtonCancelarRE.setText("Cancelar");

        LabelCpfRE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelCpfRE.setText("CPF");

        LabelDadosRE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelDadosRE.setText("Dados do Usuario");

        DadosRE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableDadosRE.setViewportView(DadosRE);
        if (DadosRE.getColumnModel().getColumnCount() > 0) {
            DadosRE.getColumnModel().getColumn(0).setHeaderValue("Nome");
            DadosRE.getColumnModel().getColumn(1).setHeaderValue("CPF");
            DadosRE.getColumnModel().getColumn(2).setHeaderValue("Telefone");
            DadosRE.getColumnModel().getColumn(3).setHeaderValue("Status");
        }

        LabelDadosRE1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelDadosRE1.setText("Alugueis Pendentes");

        DadosRE1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Livro", "Autor", "Data do Aluguel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableDadosRE1.setViewportView(DadosRE1);

        javax.swing.GroupLayout RegistraEntregaLayout = new javax.swing.GroupLayout(RegistraEntrega);
        RegistraEntrega.setLayout(RegistraEntregaLayout);
        RegistraEntregaLayout.setHorizontalGroup(
            RegistraEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistraEntregaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegistraEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistraEntregaLayout.createSequentialGroup()
                        .addComponent(LabelDadosRE1)
                        .addGap(40, 607, Short.MAX_VALUE))
                    .addGroup(RegistraEntregaLayout.createSequentialGroup()
                        .addGroup(RegistraEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(RegistraEntregaLayout.createSequentialGroup()
                                .addComponent(LabelCpfRE)
                                .addGap(18, 18, 18)
                                .addComponent(ListUsuariosRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TableDadosRE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistraEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelDadosRE)
                                .addGroup(RegistraEntregaLayout.createSequentialGroup()
                                    .addComponent(TableDadosRE1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtonRegistrarRE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtonCancelarRE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        RegistraEntregaLayout.setVerticalGroup(
            RegistraEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistraEntregaLayout.createSequentialGroup()
                .addGroup(RegistraEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistraEntregaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LabelCpfRE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistraEntregaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ListUsuariosRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(LabelDadosRE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TableDadosRE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(LabelDadosRE1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistraEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegistraEntregaLayout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addGroup(RegistraEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonRegistrarRE)
                            .addComponent(ButtonCancelarRE)))
                    .addComponent(TableDadosRE1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Janela.addTab("Registrar Entrega", RegistraEntrega);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Janela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Janela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistrarREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegistrarREActionPerformed

    private void ButtonRegistrarRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegistrarRAActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarRA;
    private javax.swing.JButton ButtonCancelarRE;
    private javax.swing.JButton ButtonRegistrarRA;
    private javax.swing.JButton ButtonRegistrarRE;
    private javax.swing.JTable DadosRA;
    private javax.swing.JTable DadosRE;
    private javax.swing.JTable DadosRE1;
    private javax.swing.JTabbedPane Janela;
    private javax.swing.JLabel LabelCpfRA;
    private javax.swing.JLabel LabelCpfRE;
    private javax.swing.JLabel LabelDadosRA;
    private javax.swing.JLabel LabelDadosRE;
    private javax.swing.JLabel LabelDadosRE1;
    private javax.swing.JLabel LabelLivroRA;
    private java.awt.Choice ListLivrosRA;
    private java.awt.Choice ListUsuariosRA;
    private java.awt.Choice ListUsuariosRE;
    private javax.swing.JPanel RegistraAluguel;
    private javax.swing.JPanel RegistraEntrega;
    private javax.swing.JScrollPane TabelDadosUsuarioRA;
    private javax.swing.JScrollPane TableDadosRE;
    private javax.swing.JScrollPane TableDadosRE1;
    // End of variables declaration//GEN-END:variables
}

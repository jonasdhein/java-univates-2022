package aula05;

import ferramentas.CaixaDeDialogo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jdhein
 */
public class TelaBanco extends javax.swing.JFrame {

    ContaBanco objConta1;
    ContaBanco objConta2;
    DefaultComboBoxModel modelContas;
        
    public TelaBanco() {
        initComponents();     
        
        ArrayList<ContaBanco> listaContas = new ArrayList<>();
        
        ContaBanco objConta = new ContaBanco();
        objConta.setNomeTitular("Jonas Dhein");
        objConta.setNumero(111);
        objConta.setSaldo(300);        
        objConta.setChequeEspecial(1000);
        
        listaContas.add(objConta);
        
        objConta = new ContaBanco();
        objConta.setNomeTitular("Leila Lopes");
        objConta.setNumero(222);
        objConta.setSaldo(900);
        objConta.setChequeEspecial(2000);
        
        listaContas.add(objConta);
        
        modelContas = new DefaultComboBoxModel();
        for (ContaBanco objeto : listaContas) {
            modelContas.addElement(objeto);
        }
        cmbContas1.setModel(modelContas);        
        
        modelContas = new DefaultComboBoxModel();
        for (ContaBanco objeto : listaContas) {
            modelContas.addElement(objeto);
        }   
        cmbContas2.setModel(modelContas);

        
    }
    
    private void atualizarSaldos(){
        lblSaldoConta1.setText("Saldo: R$ " + objConta1.getSaldo());
        txtValorConta1.setText("");
        
        lblSaldoConta2.setText("Saldo: R$ " + objConta2.getSaldo());
        txtValorConta2.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblNomeConta1 = new javax.swing.JLabel();
        lblNumeroConta1 = new javax.swing.JLabel();
        lblSaldoConta1 = new javax.swing.JLabel();
        lblNomeConta2 = new javax.swing.JLabel();
        lblNumeroConta2 = new javax.swing.JLabel();
        lblSaldoConta2 = new javax.swing.JLabel();
        btnSacarConta1 = new javax.swing.JButton();
        btnDepositarConta1 = new javax.swing.JButton();
        btnTransferirConta1 = new javax.swing.JButton();
        txtValorConta1 = new javax.swing.JTextField();
        txtValorConta2 = new javax.swing.JTextField();
        btnSacarConta2 = new javax.swing.JButton();
        btnDepositarConta2 = new javax.swing.JButton();
        btnTransferirConta2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblChequeEspecialConta1 = new javax.swing.JLabel();
        lblChequeEspecialConta2 = new javax.swing.JLabel();
        cmbContas1 = new javax.swing.JComboBox<>();
        cmbContas2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("CONTA 1");

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo1.setText("CONTA 2");

        lblNomeConta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeConta1.setText("Nome: xxxxxx");

        lblNumeroConta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumeroConta1.setText("Conta: xxx");

        lblSaldoConta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSaldoConta1.setText("Saldo: R$ xxx");

        lblNomeConta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeConta2.setText("Nome: xxxxxx");

        lblNumeroConta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumeroConta2.setText("Conta: xxxx");

        lblSaldoConta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSaldoConta2.setText("Saldo: R$ xxxx");

        btnSacarConta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSacarConta1.setText("Sacar");
        btnSacarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta1ActionPerformed(evt);
            }
        });

        btnDepositarConta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDepositarConta1.setText("Depositar");
        btnDepositarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta1ActionPerformed(evt);
            }
        });

        btnTransferirConta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTransferirConta1.setText("Transferir");
        btnTransferirConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirConta1ActionPerformed(evt);
            }
        });

        txtValorConta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtValorConta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSacarConta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSacarConta2.setText("Sacar");
        btnSacarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta2ActionPerformed(evt);
            }
        });

        btnDepositarConta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDepositarConta2.setText("Depositar");
        btnDepositarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta2ActionPerformed(evt);
            }
        });

        btnTransferirConta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTransferirConta2.setText("Transferir");
        btnTransferirConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirConta2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sicredi-logo.png"))); // NOI18N

        lblChequeEspecialConta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChequeEspecialConta1.setText("CE: R$ xxx");

        lblChequeEspecialConta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChequeEspecialConta2.setText("CE: R$ xxxx");

        cmbContas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContas1ActionPerformed(evt);
            }
        });

        cmbContas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNomeConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(lblSaldoConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumeroConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValorConta1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSacarConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDepositarConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTransferirConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblChequeEspecialConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbContas1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtValorConta2)
                        .addComponent(btnSacarConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDepositarConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTransferirConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSaldoConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumeroConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblChequeEspecialConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbContas2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbContas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbContas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeConta2)
                        .addGap(6, 6, 6)
                        .addComponent(lblNumeroConta2)
                        .addGap(6, 6, 6)
                        .addComponent(lblSaldoConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblChequeEspecialConta2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeConta1)
                        .addGap(6, 6, 6)
                        .addComponent(lblNumeroConta1)
                        .addGap(6, 6, 6)
                        .addComponent(lblSaldoConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblChequeEspecialConta1)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValorConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSacarConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepositarConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransferirConta1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValorConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSacarConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepositarConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransferirConta2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta1ActionPerformed
        try{
            double valorSaque = Double.parseDouble(txtValorConta1.getText());
            
            boolean resposta = CaixaDeDialogo.obterinstancia()
                    .pedirConfirmacao("Confirma o saque no valor de "+ 
                            valorSaque +"?", "Confirmação", 'p');
            if(resposta == true){
                //sacar da conta 1
                if(objConta1.sacar(valorSaque)){
                    //sucesso
                    atualizarSaldos();
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
                }else{
                    //mostrar um erro
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo Insuficiente", 'e');
                }
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação cancelada pelo usuário", 'i');
            }
            
        }catch(Exception ex){
            System.out.println("ERRO: " + ex.getMessage());
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnSacarConta1ActionPerformed

    private void btnDepositarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta1ActionPerformed
        //depositar na conta 1
        double valorDeposito = Double.parseDouble(txtValorConta1.getText());
        objConta1.depositar(valorDeposito);
        atualizarSaldos();
        CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
            
    }//GEN-LAST:event_btnDepositarConta1ActionPerformed

    private void btnTransferirConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirConta1ActionPerformed
        //transferir da conta 1 para a conta 2
        double valorTransferencia = Double.parseDouble(txtValorConta1.getText());
        
        boolean retorno = CaixaDeDialogo.obterinstancia().pedirConfirmacao(
                "Deseja transferir R$ " + valorTransferencia +
                " para a conta " + objConta2.getNomeTitular() + 
                "?", "Confirmação", 'p');
        if(retorno){
            if(objConta1.transferir(valorTransferencia, objConta2)){
                atualizarSaldos();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
            }
        }
    }//GEN-LAST:event_btnTransferirConta1ActionPerformed

    private void btnSacarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta2ActionPerformed
        try{
            double valorSaque = Double.parseDouble(txtValorConta2.getText());
            
            boolean resposta = CaixaDeDialogo.obterinstancia()
                    .pedirConfirmacao("Confirma o saque no valor de "+ 
                            valorSaque +"?", "Confirmação", 'p');
            if(resposta == true){
                //sacar da conta 1
                if(objConta2.sacar(valorSaque)){
                    //sucesso
                    atualizarSaldos();
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
                }else{
                    //mostrar um erro
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo Insuficiente", 'e');
                }
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação cancelada pelo usuário", 'i');
            }
            
        }catch(Exception ex){
            System.out.println("ERRO: " + ex.getMessage());
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnSacarConta2ActionPerformed

    private void btnDepositarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta2ActionPerformed
        //depositar na conta 2
        double valorDeposito = Double.parseDouble(txtValorConta2.getText());
        objConta2.depositar(valorDeposito);
        atualizarSaldos();
        CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
    
    }//GEN-LAST:event_btnDepositarConta2ActionPerformed

    private void btnTransferirConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirConta2ActionPerformed
        //transferir da conta 2 para a conta 1
        double valorTransferencia = Double.parseDouble(txtValorConta2.getText());
        if(objConta2.transferir(valorTransferencia, objConta1)){
            atualizarSaldos();
            CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
        }
    }//GEN-LAST:event_btnTransferirConta2ActionPerformed

    private void cmbContas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContas1ActionPerformed
        objConta1 = (ContaBanco) cmbContas1.getSelectedItem();
        
        //preencher os campos na tela
        lblNomeConta1.setText("Nome: " + objConta1.getNomeTitular());
        lblNumeroConta1.setText("Conta: " + objConta1.getNumero());        
        lblChequeEspecialConta1.setText("Cheque: " + objConta1.getChequeEspecial());
        lblSaldoConta1.setText("Saldo: R$ " + objConta1.getSaldo());
        txtValorConta1.setText("");
    }//GEN-LAST:event_cmbContas1ActionPerformed

    private void cmbContas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContas2ActionPerformed
        objConta2 = (ContaBanco) cmbContas2.getSelectedItem();
        
        //preencher os campos na tela
        lblNomeConta2.setText("Nome: " + objConta2.getNomeTitular());
        lblNumeroConta2.setText("Conta: " + objConta2.getNumero());        
        lblChequeEspecialConta2.setText("Cheque: " + objConta2.getChequeEspecial());
        lblSaldoConta2.setText("Saldo: R$ " + objConta2.getSaldo());
        txtValorConta2.setText("");
    }//GEN-LAST:event_cmbContas2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositarConta1;
    private javax.swing.JButton btnDepositarConta2;
    private javax.swing.JButton btnSacarConta1;
    private javax.swing.JButton btnSacarConta2;
    private javax.swing.JButton btnTransferirConta1;
    private javax.swing.JButton btnTransferirConta2;
    private javax.swing.JComboBox<String> cmbContas1;
    private javax.swing.JComboBox<String> cmbContas2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblChequeEspecialConta1;
    private javax.swing.JLabel lblChequeEspecialConta2;
    private javax.swing.JLabel lblNomeConta1;
    private javax.swing.JLabel lblNomeConta2;
    private javax.swing.JLabel lblNumeroConta1;
    private javax.swing.JLabel lblNumeroConta2;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextField txtValorConta1;
    private javax.swing.JTextField txtValorConta2;
    // End of variables declaration//GEN-END:variables
}

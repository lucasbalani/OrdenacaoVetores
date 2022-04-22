package Main;

import Methods.BubbleSort;
import Methods.InsertionSort;
import Methods.MergeSort;
import Methods.QuickSort;
import Methods.SelectionSort;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmInicio extends javax.swing.JFrame {

    ArrayList<Integer> _listaNumerosVetor = new ArrayList<>();
    ArrayList<Integer> _listaVetorOrdenado = new ArrayList<>();
    int tamanhoArray;
    
    public frmInicio() {
        
        //Inicia os componentes do formulario
        initComponents();
        
        //Seta a visibilidade do botao Limpar para false
        btnLimparVetor.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTamanhoVetor = new javax.swing.JTextField();
        cmbMetodosOrdenadores = new javax.swing.JComboBox<>();
        txtNumeroVetor = new javax.swing.JTextField();
        lblTxtNumeroVetor = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnLimparVetor = new javax.swing.JButton();
        lblTxtTempoExec = new javax.swing.JLabel();
        lblValoresVetor = new javax.swing.JLabel();
        lblTempoExec = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Tamanho do Vetor:");

        cmbMetodosOrdenadores.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cmbMetodosOrdenadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BubbleSort", "InsertionSort", "SelectionSort", "ShellSort", "QuickSort", "MergeSort" }));

        lblTxtNumeroVetor.setText("Insira o numero do vetor:");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnLimparVetor.setText("Limpar");
        btnLimparVetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparVetorActionPerformed(evt);
            }
        });

        lblTempoExec.setText("Tempo de execução -");

        jLabel4.setText("Escolha o Metodo desejado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTxtNumeroVetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroVetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTxtTempoExec)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(btnLimparVetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txtTamanhoVetor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblValoresVetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(lblTempoExec, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMetodosOrdenadores, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTamanhoVetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxtNumeroVetor)
                    .addComponent(txtNumeroVetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnLimparVetor))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValoresVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMetodosOrdenadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTxtTempoExec)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTempoExec, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1))
        );

        jLabel3.setText("Ordenador de Vetores");

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnOrdenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnOrdenar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Evento lançado ao clicar no botao "Ordenar"
    */
    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        if(txtTamanhoVetor.getText().equals("")){JOptionPane.showMessageDialog(null, "Preencha o tamanho primeiro.", "Erro", JOptionPane.ERROR_MESSAGE); return;}
        if(txtNumeroVetor.getText().equals("")){JOptionPane.showMessageDialog(null, "Preencha o numero primeiro.", "Erro", JOptionPane.ERROR_MESSAGE); return;}
        if(_listaNumerosVetor.isEmpty()){JOptionPane.showMessageDialog(null, "Primeiro preencha os numeros do vetor.", "Erro", JOptionPane.ERROR_MESSAGE); return;}
        
        switch(cmbMetodosOrdenadores.getSelectedItem().toString()){
            case "BubbleSort" :
                Long tempoInicialMetodoBubble = System.currentTimeMillis();
                    tamanhoArray = Integer.parseInt(txtTamanhoVetor.getText());
                    
                    int vetorMetodoBubble[] = new int[tamanhoArray]; // Vetor de inteiro
                    int vetorOrdenadoMetodoBubble[] = new int[tamanhoArray]; // Vetor que representa a resposta do metodo BubbleSort.Method()


                    //Mapeando ArrayList para vetor
                    vetorMetodoBubble = _listaNumerosVetor.stream().mapToInt(i -> i).toArray();
                    
                    //Ordenando Vetor
                    vetorOrdenadoMetodoBubble = BubbleSort.Method(vetorMetodoBubble);
                    
                    
                    //Mostra vetor ordenado
                    _listaVetorOrdenado.clear();
                    for(int i = 0; i < vetorOrdenadoMetodoBubble.length; i++ ){
                        _listaVetorOrdenado.add(vetorOrdenadoMetodoBubble[i]);
                    }
                    txtResultado.setText("======== [ METODO - BubbleSort ] ========\n" + 
                                         "Vetor Desordenado - " + _listaNumerosVetor + 
                                         "\nVetor Ordenado - " + _listaVetorOrdenado);
                    
                    lblTempoExec.setText("Tempo de execução - " + (System.currentTimeMillis() - tempoInicialMetodoBubble) + "ms");
                    break;
            case "InsertionSort" :
                Long tempoInicialMetodoInsertion = System.currentTimeMillis();
                    tamanhoArray = Integer.parseInt(txtTamanhoVetor.getText());
                    
                    int vetorMetodoInsertion[] = new int[tamanhoArray]; // Vetor de inteiro
                    int vetorOrdenadoMetodoInsertion[] = new int[tamanhoArray]; // Vetor que representa a resposta do metodo BubbleSort.Method()

                    //Mapeando ArrayList para vetor
                    vetorMetodoInsertion = _listaNumerosVetor.stream().mapToInt(i -> i).toArray();
                    
                    //Ordenando Vetor
                    vetorOrdenadoMetodoInsertion = InsertionSort.Method(vetorMetodoInsertion);
                    
                    
                    //Mostra vetor ordenado
                    _listaVetorOrdenado.clear();
                    for(int i = 0; i < vetorOrdenadoMetodoInsertion.length; i++ ){
                        _listaVetorOrdenado.add(vetorOrdenadoMetodoInsertion[i]);
                    }
                    
                    
                    txtResultado.setText("======== [ METODO - InsertionSort ] ========\n" + 
                                         "Vetor Desordenado - " + _listaNumerosVetor + 
                                         "\nVetor Ordenado - " + _listaVetorOrdenado);
                    
                    lblTempoExec.setText("Tempo de execução - " + (System.currentTimeMillis() - tempoInicialMetodoInsertion) + "ms");
                    break;
            case "ShellSort" :
                Long tempoInicialMetodoShell = System.currentTimeMillis();
                    tamanhoArray = Integer.parseInt(txtTamanhoVetor.getText());
                    int vetorMetodoShell[] = new int[tamanhoArray]; // Vetor de inteiro
                    int vetorOrdenadoMetodoShell[] = new int[tamanhoArray]; // Vetor que representa a resposta do metodo BubbleSort.Method()

                    //Mapeando ArrayList para vetor
                    vetorMetodoShell = _listaNumerosVetor.stream().mapToInt(i -> i).toArray();
                    
                    //Ordenando Vetor
                    vetorOrdenadoMetodoShell = InsertionSort.Method(vetorMetodoShell);
                    
                    
                    //Mostra vetor ordenado
                    _listaVetorOrdenado.clear();
                    for(int i = 0; i < vetorOrdenadoMetodoShell.length; i++ ){
                        _listaVetorOrdenado.add(vetorOrdenadoMetodoShell[i]);
                    }
                    
                    txtResultado.setText("======== [ METODO - ShellSort ] ========\n" + 
                                         "Vetor Desordenado - " + _listaNumerosVetor + 
                                         "\nVetor Ordenado - " + _listaVetorOrdenado);
                    
                    lblTempoExec.setText("Tempo de execução - " + (System.currentTimeMillis() - tempoInicialMetodoShell) + "ms");
                    break;
            case "QuickSort" :
                Long tempoInicialMetodoQuick = System.currentTimeMillis();
                    tamanhoArray = Integer.parseInt(txtTamanhoVetor.getText());
                    
                    int vetorMetodoQuick[] = new int[tamanhoArray]; // Vetor de inteiro
                    int vetorOrdenadoMetodoQuick[] = new int[tamanhoArray]; // Vetor que representa a resposta do metodo BubbleSort.Method()

                    //Mapeando ArrayList para vetor
                    vetorMetodoQuick = _listaNumerosVetor.stream().mapToInt(i -> i).toArray();
                    
                    //Ordenando Vetor
                    vetorOrdenadoMetodoQuick = QuickSort.Method(vetorMetodoQuick, 0, vetorMetodoQuick.length - 1);
                    
                    //Mostra vetor ordenado
                    _listaVetorOrdenado.clear();
                    for(int i = 0; i < vetorOrdenadoMetodoQuick.length; i++ ){
                        _listaVetorOrdenado.add(vetorOrdenadoMetodoQuick[i]);
                    }
                    
                    txtResultado.setText("======== [ METODO - QuickSort ] ========\n" + 
                                         "Vetor Desordenado - " + _listaNumerosVetor + 
                                         "\nVetor Ordenado - " + _listaVetorOrdenado);
                    
                    lblTempoExec.setText("Tempo de execução - " + (System.currentTimeMillis() - tempoInicialMetodoQuick) + "ms");
                    break;
            case "MergeSort" :
                Long tempoInicialMetodoMerge = System.currentTimeMillis();
                    tamanhoArray = Integer.parseInt(txtTamanhoVetor.getText());
                    
                    int vetorMetodoMerge[] = new int[tamanhoArray]; // Vetor de inteiro
                    int vetorOrdenadoMetodoMerge[] = new int[tamanhoArray]; // Vetor que representa a resposta do metodo BubbleSort.Method()
                    
                    //Mapeando ArrayList para vetor
                    vetorMetodoMerge = _listaNumerosVetor.stream().mapToInt(i -> i).toArray();
                    
                    //Ordenando Vetor
                    vetorOrdenadoMetodoMerge = MergeSort.Method(vetorMetodoMerge, 0, vetorMetodoMerge.length);
                    
                    //Mostra vetor ordenado
                    _listaVetorOrdenado.clear();
                    for(int i = 0; i < vetorOrdenadoMetodoMerge.length; i++ ){
                        _listaVetorOrdenado.add(vetorOrdenadoMetodoMerge[i]);
                    }                  
                    txtResultado.setText("======== [ METODO - MergeSort ] ========\n" + 
                                         "Vetor Desordenado - " + _listaNumerosVetor + 
                                         "\nVetor Ordenado - " + _listaVetorOrdenado);
                    
                    lblTempoExec.setText("Tempo de execução - " + (System.currentTimeMillis() - tempoInicialMetodoMerge) + "ms");
                    break;
            case "SelectionSort" :
                Long tempoInicialMetodoSelection = System.currentTimeMillis();
                    tamanhoArray = Integer.parseInt(txtTamanhoVetor.getText());
                    
                    int vetorMetodoSelection[] = new int[tamanhoArray]; // Vetor de inteiro
                    int vetorOrdenadoMetodoSelection[] = new int[tamanhoArray]; // Vetor que representa a resposta do metodo BubbleSort.Method()
                    
                    //Mapeando ArrayList para vetor
                    vetorMetodoSelection = _listaNumerosVetor.stream().mapToInt(i -> i).toArray();
                    
                    //Ordenando Vetor
                    vetorOrdenadoMetodoSelection = SelectionSort.Method(vetorMetodoSelection);
                    
                    //Mostra vetor ordenado
                    /*
                        Professor se estiver vendo esse for, nao liga para minha gambiarra, 
                        foi o unico jeito que achei de colocar as virgulas corretamente. XD
                    */
                    _listaVetorOrdenado.clear();
                    for(int i = 0; i < vetorOrdenadoMetodoSelection.length; i++ ){
                        _listaVetorOrdenado.add(vetorOrdenadoMetodoSelection[i]);
                    }                    
                    
                    
                    txtResultado.setText("======== [ METODO - SelectionSort ] ========\n" + 
                                         "Vetor Desordenado - " + _listaNumerosVetor + 
                                         "\nVetor Ordenado - " + _listaVetorOrdenado);
                    
                    lblTempoExec.setText("Tempo de execução - " + (System.currentTimeMillis() - tempoInicialMetodoSelection) + "ms");
                    break;
            
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed
    
    /*
        Evento lançado ao clicar no botao "Limpar"
    */
    private void btnLimparVetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparVetorActionPerformed
        _listaNumerosVetor.clear();
        lblValoresVetor.setText("");
        txtNumeroVetor.setText("");
        btnLimparVetor.setVisible(false);
    }//GEN-LAST:event_btnLimparVetorActionPerformed

    /*
        Evento lançado ao clicar no botao "Adicionar"
    */
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        //Validações
        if(txtTamanhoVetor.getText().equals("")){JOptionPane.showMessageDialog(null, "Preencha o tamanho primeiro.", "Erro", JOptionPane.ERROR_MESSAGE); return;}
        if(txtNumeroVetor.getText().equals("")){JOptionPane.showMessageDialog(null, "Preencha o numero primeiro.", "Erro", JOptionPane.ERROR_MESSAGE); return;}
        tamanhoArray = Integer.parseInt(txtTamanhoVetor.getText());
        int numeroTxt = Integer.parseInt(txtNumeroVetor.getText());
        if(_listaNumerosVetor.size() >= tamanhoArray){ JOptionPane.showMessageDialog(null, "Ja foram inseridos " + tamanhoArray + " registros.", "Erro", JOptionPane.ERROR_MESSAGE); return;}

        _listaNumerosVetor.add(numeroTxt);
        btnLimparVetor.setVisible(true);
        lblValoresVetor.setText(_listaNumerosVetor.toString());

    }//GEN-LAST:event_btnAdicionarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnLimparVetor;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JComboBox<String> cmbMetodosOrdenadores;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTempoExec;
    private javax.swing.JLabel lblTxtNumeroVetor;
    private javax.swing.JLabel lblTxtTempoExec;
    private javax.swing.JLabel lblValoresVetor;
    private javax.swing.JTextField txtNumeroVetor;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtTamanhoVetor;
    // End of variables declaration//GEN-END:variables
}

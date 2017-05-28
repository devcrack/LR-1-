/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import first_follow.C_First_Follow;
import grammar_things.C_Grammar;
import grammar_things.C_Production;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import symbol.C_Symbol;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author devcrack
 */
public class main extends javax.swing.JFrame {
    int n_error;
    C_Grammar grammar;
    C_First_Follow first_follow;
    
    /**
     * Creates new form main
     */
    public main() {
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

        jPanel_Work_Field = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxt_Area_wrk_field = new javax.swing.JTextArea();
        jBtt_Iniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtable_First_Set = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTxt_Aux_Area = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMen_It_Nw = new javax.swing.JMenuItem();
        jMenItem_Abrir = new javax.swing.JMenuItem();
        jMenIt_guardar = new javax.swing.JMenuItem();
        jMen_It_Cerrar = new javax.swing.JMenuItem();
        jMenu_Aiuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_Work_Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Work Area"));

        jTxt_Area_wrk_field.setColumns(20);
        jTxt_Area_wrk_field.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        jTxt_Area_wrk_field.setRows(5);
        jTxt_Area_wrk_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxt_Area_wrk_fieldKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTxt_Area_wrk_field);

        javax.swing.GroupLayout jPanel_Work_FieldLayout = new javax.swing.GroupLayout(jPanel_Work_Field);
        jPanel_Work_Field.setLayout(jPanel_Work_FieldLayout);
        jPanel_Work_FieldLayout.setHorizontalGroup(
            jPanel_Work_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel_Work_FieldLayout.setVerticalGroup(
            jPanel_Work_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jBtt_Iniciar.setText("Start");
        jBtt_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtt_StartActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("First Set"));

        Jtable_First_Set.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        Jtable_First_Set.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Jtable_First_Set);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTree1.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTxt_Aux_Area.setEditable(false);
        jTxt_Aux_Area.setColumns(20);
        jTxt_Aux_Area.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        jTxt_Aux_Area.setRows(5);
        jScrollPane4.setViewportView(jTxt_Aux_Area);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        jMenu1.setText("File");

        jMen_It_Nw.setText("New");
        jMen_It_Nw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMen_It_NwActionPerformed(evt);
            }
        });
        jMenu1.add(jMen_It_Nw);

        jMenItem_Abrir.setText("Abrir");
        jMenItem_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenItem_AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenItem_Abrir);

        jMenIt_guardar.setText("Guardar");
        jMenIt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenIt_guardarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenIt_guardar);

        jMen_It_Cerrar.setText("Cerrar");
        jMenu1.add(jMen_It_Cerrar);

        jMenuBar1.add(jMenu1);

        jMenu_Aiuda.setText("Ayuda");

        jMenuItem1.setText("Aks for help Here!");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_Aiuda.add(jMenuItem1);

        jMenuBar1.add(jMenu_Aiuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jBtt_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel_Work_Field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Work_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(245, 245, 245)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtt_Iniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMen_It_NwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMen_It_NwActionPerformed
        this.jTxt_Area_wrk_field.setText(null);
        this.jTxt_Aux_Area.setText(null);
    }//GEN-LAST:event_jMen_It_NwActionPerformed

    private void jMenItem_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenItem_AbrirActionPerformed
        JFileChooser jFrame_openFile = new JFileChooser();
        String str;

        jFrame_openFile.setCurrentDirectory(new File("./Gramaticas"));
        jFrame_openFile.showOpenDialog(this);

        File f = jFrame_openFile.getSelectedFile();
        FileReader f_rd = null;

        if(f != null)
        {
            try { f_rd = new FileReader(f);}
            catch(FileNotFoundException ex)
            {
                Object[] options = {"OK"};
                this.n_error = JOptionPane.showOptionDialog(this,
                    ex.getMessage(),
                    "ERROR", JOptionPane.PLAIN_MESSAGE,
                    JOptionPane.ERROR_MESSAGE, null, options, options[0]);
            }
            BufferedReader reader = new BufferedReader(f_rd);

            try
            {
                this.jTxt_Area_wrk_field.setText(null);
                this.jTxt_Aux_Area.setText(null);
                while((str = reader.readLine())!=null)
                    this.jTxt_Area_wrk_field.append(str + "\n");
            }
            catch(IOException ex)
            {
                Object[] options = {"OK"};
                this.n_error = JOptionPane.showOptionDialog(this,
                    ex.getMessage(),
                    "ERROR", JOptionPane.PLAIN_MESSAGE,
                    JOptionPane.ERROR_MESSAGE, null, options, options[0]);
            }
        }
    }//GEN-LAST:event_jMenItem_AbrirActionPerformed

    private void jMenIt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenIt_guardarActionPerformed
        JFileChooser jFrame_f_save = new JFileChooser();

        jFrame_f_save.setApproveButtonText("Guardar");
        jFrame_f_save.setCurrentDirectory(new File("./Gramaticas"));
        if(jFrame_f_save.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            File file = jFrame_f_save.getSelectedFile();
            if(!file.getName().endsWith(".g"))
            file = new File(file.getAbsolutePath() + ".g");
            BufferedWriter out_file = null;

            try
            {
                out_file = new BufferedWriter(new FileWriter(file));
                this.jTxt_Area_wrk_field.write(out_file);
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
            finally
            {
                if(out_file != null)
                {
                    try
                    {
                        out_file.close();
                    }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_jMenIt_guardarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Aiuda dlg;

        dlg = new Aiuda(this, rootPaneCheckingEnabled);
        dlg.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTxt_Area_wrk_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_Area_wrk_fieldKeyPressed
        if
        (
            evt.getKeyChar() == '('
                ||
                evt.getKeyChar() == ')'
            ||
            evt.getKeyChar() =='\''
            ||
            evt.getKeyChar() ==':'
            ||
            evt.getKeyChar() ==';'
            ||
            evt.getKeyChar() ==','
            ||
            evt.getKeyChar() =='.'
            ||
            evt.getKeyChar() =='['
            ||
            evt.getKeyChar() ==']'                
            ||
            evt.getKeyChar() =='?'                
            ||
            evt.getKeyChar() =='¿'                
            ||                    
            evt.getKeyChar() =='¡'                
            ||                   
            evt.getKeyChar() =='!'                
            ||                   
            evt.getKeyChar() =='#'                
            ||                      
            evt.getKeyChar() =='%'                
            ||                   
            evt.getKeyChar() =='&'                              
            ||                   
            evt.getKeyChar() == '-'
            ||
            evt.getKeyChar() == '\\'
            ||
            evt.getKeyChar() == '_'
            ||
            evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'
            ||
            evt.getKeyChar() == '>'
            ||
            evt.getKeyChar() == '<'
            ||
            evt.getKeyChar() == '~'
            ||
            evt.getKeyChar() == '|'
            ||
            evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z'
            ||
            evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z'
            ||
            evt.getKeyChar() =='*'
            ||
            evt.getKeyChar() =='+'
            ||
            evt.getKeyChar() == '/'
            ||
            evt.getKeyCode() == 8
            ||
            evt.getKeyCode() == 10
        )
        {
            if(evt.getKeyCode() == 10)
            {
                String lines[];
                boolean flag;

                lines = this.jTxt_Area_wrk_field.getText().split("\n");
                flag = C_Production.check_production(lines[lines.length - 1]);
                this.jTxt_Area_wrk_field.setEditable(flag);
                if(!flag)
                {
                    Object[] options = {"OK"};
                    this.n_error = JOptionPane.showOptionDialog(this,
                        "Error en el formato de la produccion",
                        "ERROR", JOptionPane.PLAIN_MESSAGE,
                        JOptionPane.ERROR_MESSAGE, null, options, options[0]);
                    if( n_error == JOptionPane.OK_OPTION)
                        this.jTxt_Area_wrk_field.getCaret().setVisible(true);
                }
            }
            else
                this.jTxt_Area_wrk_field.setEditable(true);
        }
        else
            this.jTxt_Area_wrk_field.setEditable(false);
    }//GEN-LAST:event_jTxt_Area_wrk_fieldKeyPressed

    private void jBtt_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtt_StartActionPerformed
        this.load_grammar();
        if(!this.grammar.is_valid_grammar())
            this.show_Error();            
        else 
        {
            this.print_grammar();
            this.first_follow = new C_First_Follow(this.grammar);
            this.first_follow.calculate_first_set();
            this.load_first_Set_iN_Grid();
        }
    }//GEN-LAST:event_jBtt_StartActionPerformed

    
    private void load_first_Set_iN_Grid() {        
        DefaultTableModel mdl = new DefaultTableModel();  
        mdl.setRowCount(this.first_follow.get_Max_Numberof_Symbol());
        Iterator it = this.first_follow.getFirst_set().entrySet().iterator(); 
        int index_row;
        Map.Entry entry;
        
        while(it.hasNext()) { //Loading the header of the Grid
            entry =(Map.Entry)it.next();
            mdl.addColumn((String)entry.getKey());
            index_row = 0;
                        
            for(C_Symbol symbol : ((ArrayList<C_Symbol>)entry.getValue())) { 
                if(!symbol.is_T_EMPTY())
                    if(symbol.TERMINAL_is_Metacharecter())
                        mdl.setValueAt("\\" +symbol.getT(), index_row, mdl.getColumnCount() -1 );
                    else
                        mdl.setValueAt(symbol.getT(), index_row, mdl.getColumnCount() -1 );
                else
                    mdl.setValueAt(symbol.getEpsilon(), index_row, mdl.getColumnCount() -1 );
                index_row++;
            }                           
        }                
        this.Jtable_First_Set.setModel(mdl);  
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }//GEN-LAST:event_formWindowOpened

    
    /**
     * Start with the process of load of grammar.
     */
    private void load_grammar()
    {
        C_Production nw_pr;
        String[] split_production; 
        
        this.grammar = new C_Grammar();
        for(String line : this.jTxt_Area_wrk_field.getText().split("\n")) { //Start to read lines for characters flow and load these in a production.
            split_production = line.split("-(\\s)*>");            
            this.grammar.load_grammar(split_production[0], split_production[1]);
        }
    }
    
    
    private void show_Error()
    {
        Object[] options = {"OK"};
        this.n_error = JOptionPane.showOptionDialog(this,
                "Error Gramatica NO Valida",
                "ERROR", JOptionPane.PLAIN_MESSAGE,
                JOptionPane.ERROR_MESSAGE, null, options, options[0]);
        if( n_error == JOptionPane.OK_OPTION)
            this.jTxt_Area_wrk_field.getCaret().setVisible(true);   
    }
    
    /**
     * Prints the grammar that has been loaded by the program. in the main Window Frame.
     */
    private void print_grammar()
    {
        for(C_Production pr : this.grammar.getGrammar())
        {
            //print the left side of the production;
            this.jTxt_Aux_Area.append(pr.getLeft());
            //printing the script and arrow
            this.jTxt_Aux_Area.append("->");
            //printing the rest of grammar
            for(C_Symbol smbl : pr.getRight()) {
                if(!smbl.is_NT_EMPTY()) 
                    this.jTxt_Aux_Area.append("<" + smbl.getNt() + ">");
                else    
                    if( !smbl.is_T_EMPTY()) 
                        if(smbl.TERMINAL_is_Metacharecter()) 
                            this.jTxt_Aux_Area.append("\\"+smbl.getT());
                        else 
                            this.jTxt_Aux_Area.append(smbl.getT());
                    else 
                        this.jTxt_Aux_Area.append(smbl.getEpsilon());                                            
            }
            this.jTxt_Aux_Area.append("\n");        
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_First_Set;
    private javax.swing.JButton jBtt_Iniciar;
    private javax.swing.JMenuItem jMenIt_guardar;
    private javax.swing.JMenuItem jMenItem_Abrir;
    private javax.swing.JMenuItem jMen_It_Cerrar;
    private javax.swing.JMenuItem jMen_It_Nw;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenu_Aiuda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Work_Field;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextArea jTxt_Area_wrk_field;
    private javax.swing.JTextArea jTxt_Aux_Area;
    // End of variables declaration//GEN-END:variables
}

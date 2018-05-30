
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import jogodominoo.Domino;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFMS
 */
public class mao extends javax.swing.JFrame {

    /**
     * Creates new form mao
     */
    ArrayList sorteio;
    ArrayList <Domino> lista;
    public mao() {
        
        initComponents();
        	 lista	= new ArrayList();
//              for (int i = 1; i <= 28; i++){
//                  Domino domino;
//                  domino= new Domino();
//                  domino.setId(i);
//                  lista.add(domino);
//              }
//                sorteio=new ArrayList();
//              Random gerador = new Random();
//              for (int i=0;i<7;i++){
//                  
//                            
//                  int math=(Math.abs((gerador.nextInt()%28)+1));
//                  
//                  while(sorteio.contains(math)){
//                      math=(Math.abs(gerador.nextInt()%28+1));
//                  }
//                  
//                  sorteio.add(math);
//                  System.out.println(math)   ;
//                  
//                }      
  
    }
    public void Colocarimg(){
              String nomeimg = String.valueOf( sorteio.get(0));
              nomeimg+=".png";
              Domino domino = new Domino();
              domino.setNome(nomeimg);
              //domino.setFormula();            
              System.out.println(nomeimg);              
              domino.setNn( new ImageIcon( getClass().getResource( "jogodominoo/imagens/"+nomeimg )) );
              pedra1.setIcon(domino.getNn());  
               
               
              nomeimg = String.valueOf( sorteio.get(1));
              nomeimg+=".png";               
              Domino domino1 = new Domino();
              domino1.setNome(nomeimg);
              System.out.println(nomeimg);
              domino1.setNn(new ImageIcon( getClass().getResource( "jogodominoo/imagens/"+nomeimg )));               
              pedra2.setIcon(domino1.getNn()); 
               
              nomeimg = String.valueOf( sorteio.get(2));
              nomeimg+=".png";              
              Domino domino2 = new Domino();
              domino2.setNome(nomeimg);
              System.out.println(nomeimg);
              domino2.setNn( new ImageIcon( getClass().getResource( "jogodominoo/imagens/"+nomeimg )));
              pedra3.setIcon(domino2.getNn());
               
              nomeimg = String.valueOf( sorteio.get(3));                
              nomeimg+=".png";                
              Domino domino3 = new Domino();
              domino3.setNome(nomeimg);
              System.out.println(nomeimg);
              domino3.setNn( new ImageIcon( getClass().getResource( "jogodominoo/imagens/"+nomeimg )));
              pedra4.setIcon(domino3.getNn());
               
              nomeimg = String.valueOf( sorteio.get(4));
              nomeimg+=".png";              
              Domino domino4 = new Domino();
              domino4.setNome(nomeimg);
              System.out.println(nomeimg);
              domino4.setNn ( new ImageIcon( getClass().getResource( "jogodominoo/imagens/"+nomeimg )));
              pedra5.setIcon(domino4.getNn());
               
              nomeimg = String.valueOf( sorteio.get(5));
              nomeimg+=".png";              
              Domino domino5 = new Domino();
              domino5.setNome(nomeimg);
              System.out.println(nomeimg);
              domino5.setNn( new ImageIcon( getClass().getResource( "jogodominoo/imagens/"+nomeimg )));
              pedra6.setIcon(domino5.getNn());
               
               
              nomeimg = String.valueOf( sorteio.get(6));
              nomeimg+=".png";             
              Domino domino6 = new Domino();
              domino6.setNome(nomeimg);
              System.out.println(nomeimg);
              domino6.setNn( new ImageIcon( getClass().getResource( "jogodominoo/imagens/"+nomeimg )));
              pedra7.setIcon(domino6.getNn());
               
            
               
               
               
               
          
               
               
             lista.add(domino);
             lista.add(domino1);
             lista.add(domino2);
             lista.add(domino3);
             lista.add(domino4);
             lista.add(domino5);
             lista.add(domino6);
    }
    

    public ArrayList getSorteio() {
        return sorteio;
    }

    public void setSorteio(ArrayList sorteio) {
        this.sorteio = sorteio;
    }

    public JButton getPedra1() {
        return pedra1;
    }

    public void setPedra1(JButton pedra1) {
        this.pedra1 = pedra1;
    }

    public JButton getPedra2() {
        return pedra2;
    }

    public void setPedra2(JButton pedra2) {
        this.pedra2 = pedra2;
    }

    public JButton getPedra3() {
        return pedra3;
    }

    public void setPedra3(JButton pedra3) {
        this.pedra3 = pedra3;
    }

    public JButton getPedra4() {
        return pedra4;
    }

    public void setPedra4(JButton pedra4) {
        this.pedra4 = pedra4;
    }

    public JButton getPedra5() {
        return pedra5;
    }

    public void setPedra5(JButton pedra5) {
        this.pedra5 = pedra5;
    }

    public JButton getPedra6() {
        return pedra6;
    }

    public void setPedra6(JButton pedra6) {
        this.pedra6 = pedra6;
    }

    public JButton getPedra7() {
        return pedra7;
    }

    public void setPedra7(JButton pedra7) {
        this.pedra7 = pedra7;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pedra4 = new javax.swing.JButton();
        pedra3 = new javax.swing.JButton();
        pedra7 = new javax.swing.JButton();
        pedra6 = new javax.swing.JButton();
        pedra2 = new javax.swing.JButton();
        pedra5 = new javax.swing.JButton();
        pedra1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pedra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodominoo/imagens/1.png"))); // NOI18N
        pedra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedra4ActionPerformed(evt);
            }
        });

        pedra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodominoo/imagens/2.png"))); // NOI18N
        pedra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedra3ActionPerformed(evt);
            }
        });

        pedra7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodominoo/imagens/3.png"))); // NOI18N
        pedra7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedra7ActionPerformed(evt);
            }
        });

        pedra6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodominoo/imagens/4.png"))); // NOI18N
        pedra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedra6ActionPerformed(evt);
            }
        });

        pedra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodominoo/imagens/5.png"))); // NOI18N
        pedra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedra2ActionPerformed(evt);
            }
        });

        pedra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodominoo/imagens/6.png"))); // NOI18N
        pedra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedra5ActionPerformed(evt);
            }
        });

        pedra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodominoo/imagens/6.png"))); // NOI18N
        pedra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedra1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pedra3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pedra6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pedra4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pedra7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pedra2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pedra5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(pedra1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(pedra1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pedra2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pedra5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pedra3)
                    .addComponent(pedra6))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pedra4)
                    .addComponent(pedra7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pedra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedra4ActionPerformed
        // TODO add your handling code here:
             System.out.println("fui clicado");
               for(int i=0;i<lista.size();i++){
                 if (lista.get(i).getNn().equals(pedra4.getIcon())){
                     if(lista.get(i).getNome().equals("1.png")){
                         System.out.println("eu sou a pedra inicial");
                         
                     }else{
                         System.out.println("eu não sou a pedra inicial");
                     }
                 }
             }
    }//GEN-LAST:event_pedra4ActionPerformed

    private void pedra7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedra7ActionPerformed
        // TODO add your handling code here:
             System.out.println("fui clicado");
             for(int i=0;i<lista.size();i++){
                 if (lista.get(i).getNn().equals(pedra7.getIcon())){
                     if(lista.get(i).getNome().equals("1.png")){
                         System.out.println("eu sou a pedra inicial");
                         
                     }else{
                         System.out.println("eu não sou a pedra inicial");
                     }
                 }
             }
    }//GEN-LAST:event_pedra7ActionPerformed

    private void pedra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedra2ActionPerformed
        // TODO add your handling code here:
             System.out.println("fui clicado");
               for(int i=0;i<lista.size();i++){
                 if (lista.get(i).getNn().equals(pedra2.getIcon())){
                     if(lista.get(i).getNome().equals("1.png")){
                         System.out.println("eu sou a pedra inicial");
                         
                     }else{
                         System.out.println("eu não sou a pedra inicial");
                     }
                 }
             }
    }//GEN-LAST:event_pedra2ActionPerformed

    private void pedra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedra5ActionPerformed
        // TODO add your handling code here:
        System.out.println("fui clicado");
          for(int i=0;i<lista.size();i++){
                 if (lista.get(i).getNn().equals(pedra5.getIcon())){
                     if(lista.get(i).getNome().equals("1.png")){
                         System.out.println("eu sou a pedra inicial");
                         
                     }else{
                         System.out.println("eu não sou a pedra inicial");
                     }
                 }
             }
    }//GEN-LAST:event_pedra5ActionPerformed

    private void pedra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedra1ActionPerformed
        // TODO add your handling code here:
             System.out.println("fui clicado");
               for(int i=0;i<lista.size();i++){
                 if (lista.get(i).getNn().equals(pedra1.getIcon())){
                     if(lista.get(i).getNome().equals("1.png")){
                         System.out.println("eu sou a pedra inicial");
                         
                     }else{
                         System.out.println("eu não sou a pedra inicial");
                     }
                 }
             }
    }//GEN-LAST:event_pedra1ActionPerformed

    private void pedra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedra3ActionPerformed
        // TODO add your handling code here:
         System.out.println("fui clicado");
           for(int i=0;i<lista.size();i++){
                 if (lista.get(i).getNn().equals(pedra3.getIcon())){
                     if(lista.get(i).getNome().equals("1.png")){
                         System.out.println("eu sou a pedra inicial");
                         
                     }else{
                         System.out.println("eu não sou a pedra inicial");
                     }
                 }
             }
    }//GEN-LAST:event_pedra3ActionPerformed

    private void pedra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedra6ActionPerformed
        // TODO add your handling code here:
         System.out.println("fui clicado");
           for(int i=0;i<lista.size();i++){
                 if (lista.get(i).getNn().equals(pedra6.getIcon())){
                     if(lista.get(i).getNome().equals("1.png")){
                         System.out.println("eu sou a pedra inicial");
                         
                     }else{
                         System.out.println("eu não sou a pedra inicial");
                     }
                 }
             }
    }//GEN-LAST:event_pedra6ActionPerformed

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
            java.util.logging.Logger.getLogger(mao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton pedra1;
    private javax.swing.JButton pedra2;
    private javax.swing.JButton pedra3;
    private javax.swing.JButton pedra4;
    private javax.swing.JButton pedra5;
    private javax.swing.JButton pedra6;
    private javax.swing.JButton pedra7;
    // End of variables declaration//GEN-END:variables

}

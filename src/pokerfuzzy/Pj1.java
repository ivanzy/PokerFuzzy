/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerfuzzy;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Alan
 */
public class Pj1 extends javax.swing.JFrame {

    int width = 440 / 11;
    int height = 280 / 5;
    int cartas[] = new int[12];
    int Dealer = 0;
    int cont = 0;
    public int poteMesa = 0;
    public int bigblind = 10;
    public int fplay1 = 200;
    public int fplay2 = 200;
    public int acaop1 = 5;
    public int acaop2 = 5;
    public int lastapost = 0;
    int flag = 0;
    boolean allinp1 = false;
    boolean allinp2 = false;
    boolean vezplay1 = true;
    boolean vezplay2 = false;
    PokerFuzzyGenerator poker;

    String baralho = "C:\\Users\\Alan\\Documents\\NetBeansProjects\\ProjetoFuzzy\\src\\projetofuzzy\\baralho.png";
    String verso = "C:\\Users\\Alan\\Documents\\NetBeansProjects\\ProjetoFuzzy\\src\\projetofuzzy\\CartaVerso.jpg";
    String btnD = "C:\\Users\\Alan\\Documents\\NetBeansProjects\\ProjetoFuzzy\\src\\projetofuzzy\\dealer.png";
    String ficha = "C:\\Users\\Alan\\Documents\\NetBeansProjects\\ProjetoFuzzy\\src\\projetofuzzy\\fichas.png";
    String mesapk = "C:\\Users\\Alan\\Documents\\NetBeansProjects\\ProjetoFuzzy\\src\\projetofuzzy\\mesaPk.jpg";

    BufferedImage brl = null, vrs = null, del = null, fic = null, mesa = null;
    ImageIcon mes, vers;
    static ImageIcon carta[] = new ImageIcon[12];

    /**
     * Creates new form Pj
     */
    public Pj1() {
        try {
            brl = ImageIO.read(new File(baralho));
            vrs = ImageIO.read(new File(verso));
            del = ImageIO.read(new File(btnD));
            fic = ImageIO.read(new File(ficha));
            mesa = ImageIO.read(new File(mesapk));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mes = new ImageIcon(mesa);
        initComponents();
        jLabel3.setIcon(mes);
        vers = new ImageIcon(vrs);
        initprojeto();
    }

    public void generateRandom() {
        Random cart = new Random();
        Dealer = cart.nextInt(100);
        for (int i = 0; i < 12; i++) {
            int aux = cart.nextInt(52);
            for (int j = 0; j < i; j++) {
                if (aux == cartas[j]) {
                    j = 0;
                    aux = cart.nextInt(52);
                }
            }
            System.out.print(aux + " ");
            cartas[i] = aux;
        }

    }

    public void initprojeto() {
        generateRandom();
        ImageIcon dealer = new ImageIcon(del);
        if (Dealer < 50) {
            jLabel1.setIcon(dealer);
        } else {
            jLabel2.setIcon(dealer);
        }
        for (int i = 0; i < 12; i++) {
            int alt, pos;
            alt = cartas[i] / 11;
            pos = cartas[i] % 11;
            carta[i] = new ImageIcon(brl.getSubimage(pos * width, alt * height, width, height));
        }
        ImageIcon f = new ImageIcon(fic);
        pote.setIcon(f);
        fichasplay1.setIcon(f);
        fichasplay2.setIcon(f);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        fichasplay1 = new javax.swing.JLabel();
        fichasplay2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cp11 = new javax.swing.JLabel();
        cp12 = new javax.swing.JLabel();
        cp22 = new javax.swing.JLabel();
        cp21 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        pote = new javax.swing.JLabel();
        vira = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(710, 710));
        setMinimumSize(new java.awt.Dimension(710, 710));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fichasplay1.setText("Fichas = 200");
        getContentPane().add(fichasplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

        fichasplay2.setText("Fichas = 200");
        getContentPane().add(fichasplay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 650, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Player2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Player1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        cp11.setText("_");
        getContentPane().add(cp11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        cp12.setText("_");
        getContentPane().add(cp12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        cp22.setText("_");
        getContentPane().add(cp22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, -1, -1));

        cp21.setText("_");
        getContentPane().add(cp21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, -1, -1));

        c1.setText("_");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        c2.setText("_");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        c3.setText("_");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        c4.setText("_");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        c5.setText("_");
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        pote.setText("Pote");
        getContentPane().add(pote, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        vira.setText("vira");
        getContentPane().add(vira, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        q1.setText("q1");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        q2.setText("q2");
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void comp() {
        acaop2 = 1;
    }
    /*  
     ação = 0 fold
     ação = 1 check/call
     ação = 2 raise
     açao = 3 all in
     */

    public void Regra() {
        if (flag != 2) {
            if (vezplay1 && !allinp1) {
                if (acaop1 != 3) {
                    vezplay1 = false;
                    if (acaop1 == 0) {
                        fplay2 += poteMesa;
                        poteMesa = 0;
                        cont = 100;
                    } else if (acaop1 == 1) {
                        poteMesa += lastapost;
                        fplay1 -= lastapost;
                        flag++;
                    } else if (acaop1 == 2) {
                        if (lastapost == 0) {
                            lastapost = bigblind;
                        } else {
                            lastapost += bigblind;
                        }
                        poteMesa += lastapost;
                        fplay1 -= lastapost;
                        vezplay2 = true;
                    }

                } else {
                    lastapost = fplay1;
                    poteMesa += fplay1;
                    fplay1 = 0;
                    allinp1 = true;
                    flag++;
                }
            }
            if (vezplay2 && !allinp2) {
                if (acaop2 != 3) {
                    vezplay2 = false;
                    if (acaop2 == 0) {
                        fplay1 += poteMesa;
                        poteMesa = 0;
                        cont = 100;
                    } else if (acaop2 == 1) {
                        poteMesa += lastapost;
                        System.out.println("ação do play dois foi pagar" + lastapost);
                        fplay2 -= lastapost;
                    } else if (acaop2 == 2) {
                        if (lastapost == 0) {
                            lastapost = bigblind;
                        } else {
                            lastapost += bigblind;
                        }
                        poteMesa += lastapost;
                        fplay2 -= lastapost;
                        vezplay1 = true;
                    }

                } else {
                    lastapost = fplay2;
                    poteMesa += fplay2;
                    fplay2 = 0;
                    vezplay2 = false;
                    vezplay1 = true;
                    allinp2 = true;
                }
            }
        }
        pote.setText("Pote = " + poteMesa);
        fichasplay1.setText("Fichas = " + fplay1);
        fichasplay2.setText("Fichas = " + fplay2);
        System.out.println("ainda falta: play1 " + vezplay1 + " ou play2 " + vezplay2);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (Dealer < 50) {
            //Play2
            switch (cont) {
                case 0:
                    cp21.setIcon(carta[0]);
                    break;
                case 1:
                    cp11.setIcon(vers);
                    break;
                case 2:
                    cp22.setIcon(carta[2]);
                    break;
                case 3:
                    cp12.setIcon(vers);
                    lastapost = bigblind;
                    fplay1 -= lastapost;
                    poteMesa += lastapost;
                    pote.setText("Pote = " + poteMesa);
                    fichasplay1.setText("Fichas = " + fplay1);
                    fichasplay2.setText("Fichas = " + fplay2);
                    vezplay1 = false;
                    vezplay2 = true;
                    break;
                case 4:
                    //Chama fuzzy;
                    comp();
                    Regra();
                    //forca_mao,  fichas, aposta, estagio, posicao, acao_oponente
                    if (!allinp1) {
                        poker = new PokerFuzzyGenerator(0.750, fplay1, lastapost, 0, 1, acaop2);
                        acaop1 = poker.doFuzzyCompleto();
                    }
                    System.out.println("ação foi de " + acaop1);
                    Regra();

                    break;
                case 5:
                    vira.setIcon(vers);
                    break;
                case 6:
                    c1.setIcon(carta[5]);
                    break;
                case 7:
                    c2.setIcon(carta[6]);
                    break;
                case 8:
                    c3.setIcon(carta[7]);
                    lastapost = 0;
                    vezplay1 = true;
                    vezplay2 = false;
                    cont++;
                    break;
                case 9:
                    //forca_mao,  fichas, aposta, estagio, posicao, acao_oponente
                    poker = new PokerFuzzyGenerator(0.535, fplay1, lastapost, 0, 1, acaop2);
                    acaop1 = poker.doFuzzyCompleto();
                    System.out.println("ação foi de " + acaop1);
                    Regra();
                    comp();
                    Regra();
                    break;
                case 10:
                    q1.setIcon(vers);
                    c4.setIcon(carta[9]);
                    break;
                case 11:
                    vezplay1 = false;
                    vezplay2 = false;
                    lastapost = 0;
                    cont++;
                    break;
                case 12:
                    q2.setIcon(vers);
                    c5.setIcon(carta[11]);
                    break;
                default:
                    cp11.setIcon(carta[1]);
                    cp12.setIcon(carta[3]);
                    break;
            }
        } else {
            switch (cont) {
                //play1
                case 0:
                    cp11.setIcon(vers);
                    break;
                case 1:
                    cp21.setIcon(carta[1]);
                    break;
                case 2:
                    cp12.setIcon(vers);
                    break;
                case 3:
                    cp22.setIcon(carta[3]);
                    lastapost = bigblind;
                    fplay2 -= lastapost;
                    poteMesa += lastapost;
                    pote.setText("Pote = " + poteMesa);
                    fichasplay1.setText("Fichas = " + fplay1);
                    fichasplay2.setText("Fichas = " + fplay2);
                    vezplay1 = true;
                    vezplay2 = true;
                    break;
                case 4:
                    //forca_mao,  fichas, aposta, estagio, posicao, acao_oponente
                    if (!allinp1) {
                        poker = new PokerFuzzyGenerator(0.750, fplay1, lastapost, 0, 0, 1);
                        acaop1 = poker.doFuzzyCompleto();
                        System.out.println("ação foi de " + acaop1);
                        Regra();
                        if (allinp1) {
                            vezplay1 = false;
                            vezplay2 = true;
                        }
                    }
                    System.out.println("comp");
                    comp();
                    System.out.println("ação foi de " + acaop2);
                    System.out.println(vezplay1 + " " + vezplay2);
                    Regra();
                    break;
                case 5:
                    vira.setIcon(vers);
                    break;
                case 6:
                    c1.setIcon(carta[5]);
                    break;
                case 7:
                    c2.setIcon(carta[6]);
                    break;
                case 8:
                    c3.setIcon(carta[7]);
                    lastapost = 0;
                    vezplay1 = true;
                    vezplay2 = false;
                    cont++;
                    break;
                case 9:
                    poker = new PokerFuzzyGenerator(0.535, fplay1, lastapost, 0, 0, 1);
                    acaop1 = poker.doFuzzyCompleto();
                    System.out.println("ação foi de " + acaop1);
                    Regra();
                    comp();
                    Regra();
                    break;
                case 10:
                    q1.setIcon(vers);
                    c4.setIcon(carta[9]);
                    break;
                case 11:
                    vezplay1 = false;
                    vezplay2 = false;
                    break;
                case 12:
                    q2.setIcon(vers);
                    c5.setIcon(carta[11]);
                    break;
                default:
                    cp11.setIcon(carta[0]);
                    cp12.setIcon(carta[2]);
                    break;
            }

        }
        if (cont < 4) {
            cont++;
        }
        System.out.println(cont);
        if (!vezplay1 && !vezplay2) {
            cont++;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pj1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pj1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pj1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pj1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pj1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    public javax.swing.JLabel cp11;
    private javax.swing.JLabel cp12;
    private javax.swing.JLabel cp21;
    private javax.swing.JLabel cp22;
    private javax.swing.JLabel fichasplay1;
    private javax.swing.JLabel fichasplay2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel pote;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel vira;
    // End of variables declaration//GEN-END:variables
}

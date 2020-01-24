/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JDialog;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PC-005
 */
public class DlgPersona extends JDialog{
    private JPanel content1;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    private JCheckBox estado;
    private JPanel pnlCentro;
    private JPanel pnlSur; 
    private JButton ok;
    private JButton cancel;
    private MiJframe frame;
    
    public DlgPersona(MiJframe frame){
    	this.frame=frame;
    	this.setSize(500,400);
        
        content1=new JPanel(new BorderLayout());
        panel1 = new JPanel();
        text1 = new JTextField();
        text1.setColumns(20);
        panel1.add(new JLabel("Nombre: "));
        panel1.add(text1);
        
        panel2 = new JPanel();

        text2 = new JTextField();
        text2.setColumns(20);
        panel2.add(new JLabel("Apellido: "));
        panel2.add(text2);
        
        panel3 = new JPanel();
        text3 = new JTextField();
        text3.setColumns(5);
        panel3.add(new JLabel("Edad: "));
        panel3.add(text3);
        
        panel4 = new JPanel();
        text4 = new JTextField();
        text4.setColumns(20);
        panel4.add(new JLabel("Direccion: "));
        panel4.add(text4);
        
        panel5 = new JPanel();
        estado = new JCheckBox("Estado");
        panel5.add(estado);

        pnlCentro = new JPanel();
        GridLayout grid0 = new GridLayout (5,1);
        pnlCentro.setLayout(grid0);
        pnlCentro.add(panel1);
        pnlCentro.add(panel2);
        pnlCentro.add(panel3);
        pnlCentro.add(panel4);
        pnlCentro.add(panel5);
        
        pnlSur = new JPanel();
        ok =new JButton("Aceptar");
        ok.addActionListener(new ListenerDialog(this));
        pnlSur.add(ok);
        pnlSur.setOpaque(false);
        cancel =new JButton("Cancelar");
        cancel.addActionListener(new ListenerDialog(this));
        pnlSur.add(cancel);
        
        content1.add(pnlCentro, BorderLayout.CENTER);
        content1.add(pnlSur, BorderLayout.SOUTH);
                
        this.setContentPane(content1);
        this.setVisible(true);
    }
        /**
         * 
	 	 * @return this.save to get
	 	 */
        public JButton getOk(){
            return this.ok;
        }
    	/**
    	 * 
    	 * @return this.cancel to get
    	 */
        public JButton getCancel(){
            return this.cancel;
        }
       /**
    	* 
    	* @return this.text1 to get
    	*/
        public JTextField getText1() {
        	return this.text1;
        }
    	/**
    	 * 
    	 * @return this.text2 to get
    	 */
        public JTextField getText2() {
        	return this.text2;
        }
    	/**
    	 * 
    	 * @return this.text3 to get
    	 */
        public JTextField getText3() {
        	return this.text3;
        }
    	/**
    	 * 
    	 * @return this.text4 to get
    	 */
        public JTextField getText4() {
        	return this.text4;
        }
        /**
         * 
         * @return
         */
        public JCheckBox getEstado(){
            return this.estado;
        }
        public void setEstado(JCheckBox estado) {
        	this.estado=estado;
        }
        public MiJframe getFrame() {
        	return this.frame;
        }
}

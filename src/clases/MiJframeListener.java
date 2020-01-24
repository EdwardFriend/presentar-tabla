package clases;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MiJframeListener implements ActionListener{
	private MiJframe frame;
	public MiJframeListener(MiJframe frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==frame.getNuevo()) {
			new DlgPersona(frame).setVisible(true);
			return;
		}
		if(e.getSource() == frame.getListar()){
			frame.getModeloTabla().setRowCount(0);
			frame.imprimirLista();
		}
	}
}

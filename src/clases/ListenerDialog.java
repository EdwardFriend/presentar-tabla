package clases;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import javax.swing.*;

public class ListenerDialog implements ActionListener{
    private DlgPersona dialogo;
    public ListenerDialog(DlgPersona dialogo){
        this.dialogo=dialogo;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==dialogo.getOk()){
            String nombre=dialogo.getText1().getText();
            String apellido=dialogo.getText2().getText();
            int edad =Integer.valueOf(dialogo.getText3().getSelectedItem().toString());
            String direccion = dialogo.getText4().getText();
            boolean estado=dialogo.getEstado().isSelected();
            
            Persona p=new Persona(nombre,apellido,edad,direccion,estado);

            dialogo.getFrame().addPersona(p);    
            dialogo.getText1().setText(" ");
            dialogo.getText1().requestFocus();
            dialogo.getText2().setText(" ");
            dialogo.getText2().requestFocus();
            dialogo.getText3().setSelectedItem(0);;
            dialogo.getText3().requestFocus();
            dialogo.getText4().setText(" ");
            dialogo.getText4().requestFocus();
            dialogo.getEstado().setSelected(false);
            dialogo.getEstado().requestFocus();
        }
        if(e.getSource()==dialogo.getCancel()){
            dialogo.setVisible(false);
            dialogo.dispose();
            return;
        }
    }
}

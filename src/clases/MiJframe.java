package clases;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiJframe extends JFrame{
	private JPanel contentPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu archivo;
	private JMenuItem nuevo;
	private List<Persona> lstPersona;
	private JMenuItem listar;
	private JScrollPane scrollTabla;
    
    public MiJframe(){
    	lstPersona = new ArrayList<Persona>();
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setBounds(100, 100, 450, 300);
    	
    	menuBar = new JMenuBar();
    	setJMenuBar(menuBar);
    	
    	archivo = new JMenu("Archivo");
    	menuBar.add(archivo);
    	
    	nuevo = new JMenuItem("Nuevo");
    	nuevo.addActionListener(new MiJframeListener(this));
    	
    	listar = new JMenuItem("Listar");
    	listar.addActionListener(new MiJframeListener(this));
    	
    	archivo.add(nuevo);
    	archivo.add(listar);
    	
    	contentPane = new JPanel();
    	contentPane.setBorder(new EmptyBorder(5,5,5,5));
    	contentPane.setLayout(new BorderLayout(0,0));
        
		DefaultTableModel modeloTabla = new DefaultTableModel();
		modeloTabla.addColumn("Nombre");
		modeloTabla.addColumn("Apellido");
		modeloTabla.addColumn("Edad");
		modeloTabla.addColumn("Direccion");
		modeloTabla.addColumn("Estado");
		for(int i=0;i<lstPersona.size();i++) {
			modeloTabla.addRow(new Object[]{lstPersona.get(i).getNombre(),
					lstPersona.get(i).getApellido(),
					lstPersona.get(i).getEdad(),
					lstPersona.get(i).getDireccion(),
					lstPersona.get(i).getEstado()});
			/**modeloTabla.setValueAt(lstPersona.get(i).getNombre(),i+1,0);
			modeloTabla.setValueAt(lstPersona.get(i).getApellido(),i+1,1);
			modeloTabla.setValueAt(lstPersona.get(i).getEdad(), i+1, 2);
			modeloTabla.setValueAt(lstPersona.get(i).getDireccion(), i+1, 3);
			modeloTabla.setValueAt(lstPersona.get(i).getEstado(), i+1, 4);*/
		}

		
		table = new JTable(modeloTabla);
		modeloTabla.fireTableDataChanged();
        scrollTabla = new JScrollPane();
        scrollTabla.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollTabla.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollTabla.setSize(100, 200);
        scrollTabla.setViewportView(table);
		contentPane.add(scrollTabla);
    	setContentPane(contentPane);

		table.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mousePressed(MouseEvent me) {
		       int row = table.getSelectedRow();
		       if (me.getClickCount() == 2) {
		    	   System.out.println(table.getValueAt(row, 0).toString());
		       }
		    }
		});
    }
    
    public void addPersona(Persona p){
        this.lstPersona.add(p);
    }

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	public JMenu getArchivo() {
		return archivo;
	}

	public void setArchivo(JMenu archivo) {
		this.archivo = archivo;
	}

	public JMenuItem getNuevo() {
		return nuevo;
	}

	public void setNuevo(JMenuItem nuevo) {
		this.nuevo = nuevo;
	}

	public List<Persona> getLstPersona() {
		return lstPersona;
	}

	public void setLstPersona(List<Persona> lstPersona) {
		this.lstPersona = lstPersona;
	}

	public JMenuItem getListar() {
		return listar;
	}

	public void setListar(JMenuItem listar) {
		this.listar = listar;
	}
}

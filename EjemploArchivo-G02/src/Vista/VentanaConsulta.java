
package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class VentanaConsulta extends JDialog{
    private JPanel paneFiltro;
    private JScrollPane panelTabla;
    private Container contenedor;
    
    private JLabel lFiltro;
    private JTextField tFiltro;
    
    private JTable tabla;
    private DefaultTableModel modelo;
    private String titulos[]={"Placa", "Marca", "Modelo", "No Kms", "Valor"};

    public VentanaConsulta(JFrame frame, boolean bln) {
        super(frame, bln);
        this.setTitle("Consulta de Motocicletas - V1");
        this.iniciarComponentes();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){
        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new BorderLayout());
        this.iniciarPanelFiltro();
        this.iniciarPanelTabla();
    }
    
    public void iniciarPanelFiltro(){
        
        this.paneFiltro = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        this.lFiltro = new JLabel(" Texto de Filtro: ");
        this.tFiltro = new JTextField(10);
        
        this.paneFiltro.add(this.lFiltro);
        this.paneFiltro.add(this.tFiltro);
        
        this.contenedor.add(this.paneFiltro, BorderLayout.NORTH);
        
    }
    
    public void iniciarPanelTabla(){
    
        this.panelTabla = new JScrollPane();
        this.tabla = new JTable();
        this.modelo = new DefaultTableModel(null, this.titulos);
        this.tabla.setModel(this.modelo);
        this.panelTabla.setViewportView(this.tabla);
        
        this.contenedor.add(this.panelTabla, BorderLayout.CENTER);
        
    }
    
    
}

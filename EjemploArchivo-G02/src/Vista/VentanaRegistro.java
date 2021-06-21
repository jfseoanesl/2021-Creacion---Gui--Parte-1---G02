
package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.*;


public class VentanaRegistro extends JDialog {
    private JLabel lPlaca, lMarca, lModelo, lkms,lValor;
    private JTextField tPlaca, tKms, tValor;
    private JComboBox cMarca;
    private JRadioButton rModelo1, rModelo2, rModelo3;
    private ButtonGroup grupoRadio;
    private JButton bGuardar, bCancelar, bNuevo, bBuscar, bEliminar;
    
    private JPanel panelDatos, panelBotones;
    private Container contenedor;

    public VentanaRegistro(JFrame frame, boolean bln) {
        super(frame, bln);
        this.setTitle("Registro de Motocicletas - V1");
        this.iniciarComponentes();
        //this.setSize(600, 400);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){
        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new BorderLayout());
        this.panelDatos();
        this.panelBotones();
    }
    
    public void panelDatos(){
        this.panelDatos = new JPanel();
        this.panelDatos.setLayout(new GridLayout(6, 2, 5,5));
        
        this.lPlaca = new JLabel("  Placa: ");
        this.lModelo= new JLabel("  Modelo: ");
        this.lMarca= new JLabel("  Marca: ");
        this.lValor= new JLabel("  Valor: ");
        this.lkms = new JLabel("  No Kms: ");
        
        this.tKms = new JTextField(null);
        this.tPlaca = new JTextField(null);
        this.tValor = new JTextField(null);
        
        this.cMarca = new JComboBox();
        this.cMarca.addItem("Yamaha");
        this.cMarca.addItem("Suzuki");
        this.cMarca.addItem("Honda");
        this.cMarca.addItem("Otra");
        
        this.rModelo1 = new JRadioButton("2010");
        this.rModelo1.setSelected(true);
        this.rModelo2 = new JRadioButton("2015");
        this.rModelo3 = new JRadioButton("2020");
        this.grupoRadio = new ButtonGroup();
        this.grupoRadio.add(this.rModelo1);
        this.grupoRadio.add(this.rModelo2);
        this.grupoRadio.add(this.rModelo3);
        JPanel panel = new JPanel();
        panel.add(this.rModelo1);
        panel.add(this.rModelo2);
        panel.add(this.rModelo3);
        
        this.bGuardar = new JButton("Guardar");
        this.bCancelar = new JButton("Cancelar");
        
        this.panelDatos.add(this.lPlaca);
        this.panelDatos.add(this.tPlaca);
        
        this.panelDatos.add(this.lMarca);
        this.panelDatos.add(this.cMarca);
        
        this.panelDatos.add(this.lModelo);
        this.panelDatos.add(panel);
        
        this.panelDatos.add(this.lkms);
        this.panelDatos.add(this.tKms);
        
        this.panelDatos.add(this.lValor);
        this.panelDatos.add(this.tValor);
        
        this.panelDatos.add(this.bGuardar);
        this.panelDatos.add(this.bCancelar);
        
        this.contenedor.add(this.panelDatos, BorderLayout.CENTER);
        
    }
    
    public void panelBotones(){
        this.panelBotones = new JPanel();
        
        this.bNuevo = new JButton("Nuevo");
        this.bBuscar = new JButton("Buscar");
        this.bEliminar= new JButton("Eliminar");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 5,5));
        
        panel.add(this.bNuevo);
        panel.add(this.bBuscar);
        panel.add(this.bEliminar);
        
        this.panelBotones.add(panel);
        
        this.contenedor.add(this.panelBotones, BorderLayout.EAST);
        
    }
    
    
}

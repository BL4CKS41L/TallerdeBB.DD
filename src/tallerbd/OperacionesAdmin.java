/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerbd;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Enriquez
 */

public class OperacionesAdmin extends javax.swing.JFrame {
    ConexionMySQL con = new ConexionMySQL();
    Connection cn = con.conexion();
    
    /**
     * Creates new form ConsultasMySQL
     */
    public OperacionesAdmin() {
        initComponents();
        this.setLocation(200,100);     
        
    }
    
    void MostrarTablaProductos(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Producto");
    modelo.addColumn("Nombre");
    modelo.addColumn("Codigo");
    modelo.addColumn("Caducidad");
    modelo.addColumn("Marca");
    modelo.addColumn("Precio");
    modelo.addColumn("Costo");
    modelo.addColumn("Stock");
    
    TablaProductos.setModel(modelo);
    
    String sql = "SELECT * FROM productos";
    String datos[] = new String [8];
    
        try {
    Statement st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        datos[2]= rs.getString(3);
        datos[3]= rs.getString(4);
        datos[4]= rs.getString(5);
        datos[5]= rs.getString(6);
        datos[6]= rs.getString(7);
        datos[7]= rs.getString(8);
        modelo.addRow(datos);
    }
    TablaProductos.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
    void MostrarTablaEmpleados(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Empleado");
    modelo.addColumn("Nombre");
    modelo.addColumn("Telefono");
    modelo.addColumn("Edad");
    modelo.addColumn("Sexo");
    modelo.addColumn("Domicilio");
    
    TablaEmpleado.setModel(modelo);
    
    String sql = "SELECT * FROM empleados";
    String datos[] = new String [6];
    Statement st;
        try {
    st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        datos[2]= rs.getString(3);
        datos[3]= rs.getString(4);
        datos[4]= rs.getString(5);
        datos[5]= rs.getString(6);
        modelo.addRow(datos);
    }
    TablaEmpleado.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
      void MostrarTablaPedidos(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Fecha Entrega");
    modelo.addColumn("Fecha de Pedido");
    modelo.addColumn("ID Pedido");
    modelo.addColumn("ID Producto");
    modelo.addColumn("Cantidad de Productos");
    modelo.addColumn("Total");
    modelo.addColumn("ID Producto");
    modelo.addColumn("Nombre");
    modelo.addColumn("Codigo");
    modelo.addColumn("Caducidad");
    modelo.addColumn("Marca");
    modelo.addColumn("Precio");
    modelo.addColumn("Costo");
    modelo.addColumn("Stock");
    TablaPedidos.setModel(modelo);
    
    String sql = "SELECT * FROM pedidos INNER JOIN productos ON pedidos.ID_Producto = productos.ID_Producto";
    String datos[] = new String [14];
    Statement st;
        try {
    st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        datos[2]= rs.getString(3);
        datos[3]= rs.getString(4);
        datos[4]= rs.getString(5);
        datos[5]= rs.getString(6);
        datos[6]= rs.getString(7);
        datos[7]= rs.getString(8);
        datos[8]= rs.getString(9);
        datos[9]= rs.getString(10);
        datos[10]= rs.getString(11);
        datos[11]= rs.getString(12);
        datos[12]= rs.getString(13);
        datos[13]= rs.getString(14);
        
        modelo.addRow(datos);
    }
    TablaPedidos.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
      void MostrarTablaProveedores(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Proveedor");
    modelo.addColumn("Nombre");
    modelo.addColumn("Telefono");
    modelo.addColumn("Compañia");
    modelo.addColumn("Direccion");
    modelo.addColumn("Marca");
    
    TablaProveedor.setModel(modelo);
    
    String sql = "SELECT * FROM proveedores";
    String datos[] = new String [6];
    Statement st;
        try {
    st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        datos[2]= rs.getString(3);
        datos[3]= rs.getString(4);
        datos[4]= rs.getString(5);
        datos[5]= rs.getString(6);
       
        modelo.addRow(datos);
    }
    TablaProveedor.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
    void MostrarTablaVentas(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Folio");
    modelo.addColumn("ID Empleado");
    modelo.addColumn("ID Producto");
    modelo.addColumn("Fecha");
    modelo.addColumn("Total de Piezas");
    modelo.addColumn("Precio Total");
       
    TablaVentas.setModel(modelo);
    
    String sql = "SELECT * FROM ventas";
    String datos[] = new String [6];
    Statement st;
        try {
    st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        datos[2]= rs.getString(3);
        datos[3]= rs.getString(4);
        datos[4]= rs.getString(5);
        datos[5]= rs.getString(6);
        
        modelo.addRow(datos);
    }
    TablaVentas.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
     
     void limpiarproductos(){
     NombreProducto.setText("");
     CodigoProducto.setText("");
     CaducidadProducto.setText("");
     MarcaProducto.setText("");
     PrecioProducto.setText("");
     CostoProducto.setText("");
     StockProducto.setText("");
     }
     void limpiarempleados(){
     NombreEmpleado.setText("");
     TelefonoEmpleado.setText("");
     EdadEmpleado.setText("");
     SexoEmpleado.setText("");
     DomicilioEmpleado.setText("");     
     }
     void limpiarpedidos(){
     
     FechaPedido.setText("");
     FechaEntrega.setText("");
     ProductoPedido.setText("");
     Cantidad.setText("");
     Total.setText("");
     
     }
     void limpiarproveedores(){
     CompañiaProveedor.setText("");
     IDProveedor.setText("");
     NombreProveedor.setText("");
     TelefonoProveedor.setText("");
     DireccionProveedor.setText("");
     MarcaProveedor.setText("");    
     }
     
     void limpiarmiembros(){
     Folio.setText("");
     EmpleadoVentas.setText("");
     }
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPane = new javax.swing.JTabbedPane();
        Status = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        NombreStatus = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        CodigoProducto = new javax.swing.JTextField();
        CaducidadProducto = new javax.swing.JTextField();
        MarcaProducto = new javax.swing.JTextField();
        PrecioProducto = new javax.swing.JTextField();
        CostoProducto = new javax.swing.JTextField();
        StockProducto = new javax.swing.JTextField();
        GuardarProductos = new javax.swing.JButton();
        ConsultarProductos = new javax.swing.JButton();
        LimpiarProductos = new javax.swing.JButton();
        buscarproducto = new javax.swing.JTextField();
        Modificarproducto = new javax.swing.JButton();
        actualizarproductos = new javax.swing.JButton();
        eliminarproducto = new javax.swing.JButton();
        Semestre = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        NombreStatus1 = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TelefonoEmpleado = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        EdadEmpleado = new javax.swing.JTextField();
        SexoEmpleado = new javax.swing.JTextField();
        DomicilioEmpleado = new javax.swing.JTextField();
        modificarempleado = new javax.swing.JButton();
        buscarempleado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
        GuardarEmpleado = new javax.swing.JButton();
        ConsultarEmpleados = new javax.swing.JButton();
        LimpiarSemestre = new javax.swing.JButton();
        actualizarempleados = new javax.swing.JButton();
        EliminarEmpleado = new javax.swing.JButton();
        Alumno = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NombreStatus2 = new javax.swing.JLabel();
        FechaPedido = new javax.swing.JTextField();
        IDAlumno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FechaEntrega = new javax.swing.JTextField();
        ProductoPedido = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        GuardarPedidos = new javax.swing.JButton();
        ConsultarStats1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPedidos = new javax.swing.JTable();
        LimpiarAlumno = new javax.swing.JButton();
        buscarpedido = new javax.swing.JTextField();
        modificaralumno = new javax.swing.JButton();
        actualizaralumno = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        AlumnoGrupo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        NombreStatus3 = new javax.swing.JLabel();
        CompañiaProveedor = new javax.swing.JTextField();
        Proveedor = new javax.swing.JLabel();
        IDProveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NombreProveedor = new javax.swing.JTextField();
        TelefonoProveedor = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        DireccionProveedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MarcaProveedor = new javax.swing.JTextField();
        GuardarProveedor = new javax.swing.JButton();
        ConsultarProveedores = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaProveedor = new javax.swing.JTable();
        LimpiarProveedores = new javax.swing.JButton();
        buscarproveedor = new javax.swing.JTextField();
        modificarproveedores = new javax.swing.JButton();
        actualizaralumnogrupo = new javax.swing.JButton();
        eliminaralumnogrupo = new javax.swing.JButton();
        AlumnoMiembros = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        NombreStatus4 = new javax.swing.JLabel();
        EmpleadoVentas = new javax.swing.JTextField();
        IDStatus3 = new javax.swing.JLabel();
        Folio = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ProductoVentas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FechaVentas = new javax.swing.JTextField();
        TotalVentas = new javax.swing.JTextField();
        PrecioTotal = new javax.swing.JTextField();
        GuardarVentas = new javax.swing.JButton();
        ConsultarVentas = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        LimpiarMiembros = new javax.swing.JButton();
        buscarventas = new javax.swing.JTextField();
        modificarventas = new javax.swing.JButton();
        actualizarventas = new javax.swing.JButton();
        eliminarventas = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaProductos);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus.setText("Nombre");

        jLabel29.setText("Codigo");

        jLabel30.setText("Caducidad");

        jLabel31.setText("Marca");

        jLabel32.setText("Precio");

        jLabel33.setText("Costo");

        jLabel34.setText("Stock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NombreStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(CodigoProducto)
                    .addComponent(CaducidadProducto)
                    .addComponent(MarcaProducto)
                    .addComponent(PrecioProducto)
                    .addComponent(CostoProducto)
                    .addComponent(StockProducto))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(CodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(CaducidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(MarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(CostoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        GuardarProductos.setText("Guardar");
        GuardarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProductosActionPerformed(evt);
            }
        });

        ConsultarProductos.setText("Consultar");
        ConsultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProductosActionPerformed(evt);
            }
        });

        LimpiarProductos.setText("Limpiar");
        LimpiarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarProductosActionPerformed(evt);
            }
        });

        Modificarproducto.setText("Modificar");
        Modificarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarproductoActionPerformed(evt);
            }
        });

        actualizarproductos.setText("Actualizar");
        actualizarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarproductosActionPerformed(evt);
            }
        });

        eliminarproducto.setText("Eliminar");
        eliminarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarproductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StatusLayout = new javax.swing.GroupLayout(Status);
        Status.setLayout(StatusLayout);
        StatusLayout.setHorizontalGroup(
            StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusLayout.createSequentialGroup()
                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StatusLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StatusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConsultarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GuardarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LimpiarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Modificarproducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actualizarproductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(eliminarproducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        StatusLayout.setVerticalGroup(
            StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusLayout.createSequentialGroup()
                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StatusLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarProductos)
                            .addComponent(Modificarproducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LimpiarProductos)
                            .addComponent(actualizarproductos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConsultarProductos)
                            .addComponent(eliminarproducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE))
                    .addGroup(StatusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(buscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        JTabbedPane.addTab("Productos", Status);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus1.setText("Nombre");

        jLabel1.setText("Telefono");

        jLabel35.setText("Edad");

        jLabel36.setText("Sexo");

        jLabel37.setText("Domicilio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombreEmpleado)
                    .addComponent(TelefonoEmpleado)
                    .addComponent(EdadEmpleado)
                    .addComponent(SexoEmpleado)
                    .addComponent(DomicilioEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus1)
                    .addComponent(NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(EdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(SexoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(DomicilioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        modificarempleado.setText("Modificar");
        modificarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarempleadoActionPerformed(evt);
            }
        });

        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaEmpleado);

        GuardarEmpleado.setText("Guardar");
        GuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEmpleadoActionPerformed(evt);
            }
        });

        ConsultarEmpleados.setText("Consultar");
        ConsultarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarEmpleadosActionPerformed(evt);
            }
        });

        LimpiarSemestre.setText("Limpiar");
        LimpiarSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarSemestreActionPerformed(evt);
            }
        });

        actualizarempleados.setText("Actualizar");
        actualizarempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarempleadosActionPerformed(evt);
            }
        });

        EliminarEmpleado.setText("Eliminar");
        EliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SemestreLayout = new javax.swing.GroupLayout(Semestre);
        Semestre.setLayout(SemestreLayout);
        SemestreLayout.setHorizontalGroup(
            SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SemestreLayout.createSequentialGroup()
                .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SemestreLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SemestreLayout.createSequentialGroup()
                                .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ConsultarEmpleados)
                                    .addComponent(GuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LimpiarSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(actualizarempleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificarempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(buscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SemestreLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        SemestreLayout.setVerticalGroup(
            SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SemestreLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SemestreLayout.createSequentialGroup()
                        .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarEmpleado)
                            .addComponent(actualizarempleados))
                        .addGap(9, 9, 9)
                        .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LimpiarSemestre)
                            .addComponent(modificarempleado))
                        .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SemestreLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ConsultarEmpleados))
                            .addGroup(SemestreLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(EliminarEmpleado)))
                        .addGap(29, 29, 29)
                        .addComponent(buscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        JTabbedPane.addTab("Empleados", Semestre);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus2.setText("Fecha Entrega");

        IDAlumno.setText("Fecha de pedido");

        jLabel3.setText("ID Producto");

        jLabel4.setText("Cantidad de Productos");

        jLabel5.setText("Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NombreStatus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaEntrega)
                            .addComponent(ProductoPedido)
                            .addComponent(Cantidad)
                            .addComponent(Total)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(IDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(FechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreStatus2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ProductoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        GuardarPedidos.setText("Guardar");
        GuardarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPedidosActionPerformed(evt);
            }
        });

        ConsultarStats1.setText("Consultar");
        ConsultarStats1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarStats1ActionPerformed(evt);
            }
        });

        TablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaPedidos);

        LimpiarAlumno.setText("Limpiar");
        LimpiarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarAlumnoActionPerformed(evt);
            }
        });

        modificaralumno.setText("Modificar");
        modificaralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaralumnoActionPerformed(evt);
            }
        });

        actualizaralumno.setText("Actualizar");
        actualizaralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizaralumnoActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlumnoLayout = new javax.swing.GroupLayout(Alumno);
        Alumno.setLayout(AlumnoLayout);
        AlumnoLayout.setHorizontalGroup(
            AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(AlumnoLayout.createSequentialGroup()
                        .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AlumnoLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ConsultarStats1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GuardarPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LimpiarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(actualizaralumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificaralumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(buscarpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(193, Short.MAX_VALUE))))
        );
        AlumnoLayout.setVerticalGroup(
            AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumnoLayout.createSequentialGroup()
                        .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarPedidos)
                            .addComponent(modificaralumno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LimpiarAlumno)
                            .addComponent(actualizaralumno))
                        .addGap(14, 14, 14)
                        .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConsultarStats1)
                            .addComponent(jButton3)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        JTabbedPane.addTab("Pedidos", Alumno);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus3.setText("Nombre");

        Proveedor.setText("ID Proveedor");

        jLabel7.setText("Telefono");

        jLabel8.setText("Compañia");

        jLabel26.setText("Direccion");

        jLabel6.setText("Marca");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreStatus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CompañiaProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(IDProveedor)
                    .addComponent(NombreProveedor)
                    .addComponent(TelefonoProveedor)
                    .addComponent(DireccionProveedor)
                    .addComponent(MarcaProveedor))
                .addGap(59, 59, 59))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proveedor)
                    .addComponent(IDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus3)
                    .addComponent(NombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CompañiaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(DireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarcaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        GuardarProveedor.setText("Guardar");
        GuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProveedorActionPerformed(evt);
            }
        });

        ConsultarProveedores.setText("Consultar");
        ConsultarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProveedoresActionPerformed(evt);
            }
        });

        TablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaProveedor);

        LimpiarProveedores.setText("Limpiar");
        LimpiarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarProveedoresActionPerformed(evt);
            }
        });

        modificarproveedores.setText("Modificar");
        modificarproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarproveedoresActionPerformed(evt);
            }
        });

        actualizaralumnogrupo.setText("Actualizar");
        actualizaralumnogrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizaralumnogrupoActionPerformed(evt);
            }
        });

        eliminaralumnogrupo.setText("Eliminar");
        eliminaralumnogrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaralumnogrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlumnoGrupoLayout = new javax.swing.GroupLayout(AlumnoGrupo);
        AlumnoGrupo.setLayout(AlumnoGrupoLayout);
        AlumnoGrupoLayout.setHorizontalGroup(
            AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GuardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultarProveedores)
                            .addComponent(LimpiarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarproveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eliminaralumnogrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(actualizaralumnogrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        AlumnoGrupoLayout.setVerticalGroup(
            AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                        .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarProveedor)
                            .addComponent(buscarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(LimpiarProveedores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ConsultarProveedores))
                            .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(actualizaralumnogrupo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificarproveedores)
                            .addComponent(eliminaralumnogrupo)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTabbedPane.addTab("Proveedores", AlumnoGrupo);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus4.setText("ID Empleado");

        IDStatus3.setText("Folio");

        jLabel28.setText("ID Producto");

        jLabel9.setText("Fecha");

        jLabel10.setText("Total de Piezas");

        jLabel11.setText("Precio Total");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombreStatus4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDStatus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(101, 101, 101))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Folio, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(ProductoVentas)
                    .addComponent(EmpleadoVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(FechaVentas)
                    .addComponent(TotalVentas)
                    .addComponent(PrecioTotal))
                .addGap(59, 59, 59))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDStatus3)
                    .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus4)
                    .addComponent(EmpleadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(ProductoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(FechaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(PrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        GuardarVentas.setText("Guardar");
        GuardarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarVentasActionPerformed(evt);
            }
        });

        ConsultarVentas.setText("Consultar");
        ConsultarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarVentasActionPerformed(evt);
            }
        });

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaVentas);

        LimpiarMiembros.setText("Limpiar");
        LimpiarMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarMiembrosActionPerformed(evt);
            }
        });

        modificarventas.setText("Modificar");
        modificarventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarventasActionPerformed(evt);
            }
        });

        actualizarventas.setText("Actualizar");
        actualizarventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarventasActionPerformed(evt);
            }
        });

        eliminarventas.setText("Eliminar");
        eliminarventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarventasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlumnoMiembrosLayout = new javax.swing.GroupLayout(AlumnoMiembros);
        AlumnoMiembros.setLayout(AlumnoMiembrosLayout);
        AlumnoMiembrosLayout.setHorizontalGroup(
            AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                        .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarventas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ConsultarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GuardarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LimpiarMiembros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(actualizarventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificarventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eliminarventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(174, Short.MAX_VALUE))))
        );
        AlumnoMiembrosLayout.setVerticalGroup(
            AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                        .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarVentas)
                            .addComponent(modificarventas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LimpiarMiembros)
                            .addComponent(actualizarventas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConsultarVentas)
                            .addComponent(eliminarventas)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscarventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTabbedPane.addTab("Ventas", AlumnoMiembros);

        Regresar.setText("Regresar");
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTabbedPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Regresar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTabbedPane)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        LoginMySQL login = new LoginMySQL();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarMouseClicked

    private void eliminarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarventasActionPerformed
        int fila=TablaVentas.getSelectedRow();
        String valor = TablaVentas.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM ventas WHERE Folio='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                MostrarTablaVentas();
            }
            catch (SQLException ex) {
                Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_eliminarventasActionPerformed

    private void actualizarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarventasActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement ("UPDATE ventas SET Folio='"+Folio.getText()+"',ID_Empleado='"+EmpleadoVentas.getText()+"',ID_Producto='"+ProductoVentas.getText()+"',Fecha='"+FechaVentas.getText()+
            "',Total_Piezas='"+TotalVentas.getText()+"',Total='"+PrecioTotal.getText()+"'WHERE Folio='"+buscarventas.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarmiembros();
            MostrarTablaVentas();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarventasActionPerformed

    private void modificarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarventasActionPerformed
        int fila = TablaProveedor.getSelectedRow();
        if (fila>=0){
            buscarventas.setText(TablaVentas.getValueAt(fila, 0).toString());
            Folio.setText(TablaVentas.getValueAt(fila, 0).toString());
            EmpleadoVentas.setText(TablaVentas.getValueAt(fila, 1).toString());
            ProductoVentas.setText(TablaVentas.getValueAt(fila, 2).toString());
            FechaVentas.setText(TablaVentas.getValueAt(fila, 3).toString());
            TotalVentas.setText(TablaVentas.getValueAt(fila, 4).toString());
            PrecioTotal.setText(TablaVentas.getValueAt(fila, 5).toString());  
        }
        else {
            JOptionPane.showMessageDialog(null,"Fila no selecionada");
        }
    }//GEN-LAST:event_modificarventasActionPerformed

    private void LimpiarMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarMiembrosActionPerformed
        limpiarmiembros();
    }//GEN-LAST:event_LimpiarMiembrosActionPerformed

    private void ConsultarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarVentasActionPerformed
        MostrarTablaVentas();
    }//GEN-LAST:event_ConsultarVentasActionPerformed

    private void GuardarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarVentasActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO ventas(Folio,ID_Empleado, ID_Producto,Fecha,Total_Piezas,Total) VALUES (?,?,?,?,?,?)");
            pps.setString (1, Folio.getText());
            pps.setString (2, EmpleadoVentas.getText());
            pps.setString (3, ProductoVentas.getText());
            pps.setString (4, FechaVentas.getText());
            pps.setString (5, TotalVentas.getText());
            pps.setString (6, PrecioTotal.getText());

            pps.executeUpdate();
            MostrarTablaVentas();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarVentasActionPerformed

    private void eliminaralumnogrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaralumnogrupoActionPerformed
        int fila=TablaProveedor.getSelectedRow();
        String valor = TablaProveedor.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM proveedores WHERE ID_Proveedor='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                MostrarTablaProveedores();
            }
            catch (SQLException ex) {
                Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_eliminaralumnogrupoActionPerformed

    private void actualizaralumnogrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizaralumnogrupoActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement ("UPDATE proveedores SET ID_Proveedor='"+IDProveedor.getText()+"',Nombre='"+NombreProveedor.getText()+"',Telefono='"+TelefonoProveedor.getText()+
                "',Compañia='"+CompañiaProveedor.getText()+"',Direccion='"+DireccionProveedor.getText()+"',Marca='"+MarcaProveedor.getText()+"'WHERE ID_Proveedor='"+buscarproveedor.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarproveedores();
            MostrarTablaProveedores();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizaralumnogrupoActionPerformed

    private void modificarproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarproveedoresActionPerformed
        int fila = TablaProveedor.getSelectedRow();
        if (fila>=0){
            buscarproveedor.setText(TablaProveedor.getValueAt(fila, 0).toString());
            IDProveedor.setText(TablaProveedor.getValueAt(fila, 0).toString());
            NombreProveedor.setText(TablaProveedor.getValueAt(fila, 1).toString());
            TelefonoProveedor.setText(TablaProveedor.getValueAt(fila, 2).toString());
            CompañiaProveedor.setText(TablaProveedor.getValueAt(fila, 3).toString());
        }
        else {
            JOptionPane.showMessageDialog(null,"Fila no selecionada");
        }
    }//GEN-LAST:event_modificarproveedoresActionPerformed

    private void LimpiarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarProveedoresActionPerformed
        limpiarproveedores();
    }//GEN-LAST:event_LimpiarProveedoresActionPerformed

    private void ConsultarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProveedoresActionPerformed
        MostrarTablaProveedores();
    }//GEN-LAST:event_ConsultarProveedoresActionPerformed

    private void GuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProveedorActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO proveedores(Nombre,Telefono,Compañia,Direccion,Marca) VALUES (?,?,?,?,?)");
            pps.setString (1, NombreProveedor.getText());
            pps.setString (2, TelefonoProveedor.getText());
            pps.setString (3, CompañiaProveedor.getText());
            pps.setString (4, DireccionProveedor.getText());
            pps.setString (5, MarcaProveedor.getText());

            pps.executeUpdate();
            MostrarTablaProveedores();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarProveedorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila=TablaPedidos.getSelectedRow();
        String valor = TablaPedidos.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM pedidos WHERE ID_Pedido='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                MostrarTablaPedidos();
            }
            catch (SQLException ex) {
                Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void actualizaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizaralumnoActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement ("UPDATE pedidos SET Fecha_Pedido='"+FechaPedido.getText()+"',Fecha_Entrega='"+FechaEntrega.getText()+
                "',ProductoPedido='"+ProductoPedido.getText()+"',Cantidad='"+Cantidad.getText()+"',Total='"+Total.getText()+"'WHERE ID_Pedido='"+buscarpedido.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarpedidos();
            MostrarTablaPedidos();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizaralumnoActionPerformed

    private void modificaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaralumnoActionPerformed
        int fila = TablaPedidos.getSelectedRow();
        if (fila>=0){
            buscarpedido.setText(TablaPedidos.getValueAt(fila, 0).toString());
            FechaPedido.setText(TablaPedidos.getValueAt(fila, 1).toString());
            FechaEntrega.setText(TablaPedidos.getValueAt(fila, 2).toString());
            ProductoPedido.setText(TablaPedidos.getValueAt(fila, 3).toString());
            Cantidad.setText(TablaPedidos.getValueAt(fila, 4).toString());
            Total.setText(TablaPedidos.getValueAt(fila, 5).toString());

        }
        else {
            JOptionPane.showMessageDialog(null,"Fila no selecionada");
        }
    }//GEN-LAST:event_modificaralumnoActionPerformed

    private void LimpiarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarAlumnoActionPerformed
        limpiarpedidos();
    }//GEN-LAST:event_LimpiarAlumnoActionPerformed

    private void ConsultarStats1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarStats1ActionPerformed
        MostrarTablaPedidos();
    }//GEN-LAST:event_ConsultarStats1ActionPerformed

    private void GuardarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPedidosActionPerformed

        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO pedidos(Fecha_Pedido,Fecha_Entrega,ID_Producto,Cantidad_Productos,Total) VALUES (?,?,?,?,?,?)");
            pps.setString (1, FechaPedido.getText());
            pps.setString (2, FechaEntrega.getText());
            pps.setString (3, ProductoPedido.getText());
            pps.setString (4, Cantidad.getText());
            pps.setString (5, Total.getText());

            pps.executeUpdate();
            MostrarTablaPedidos();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarPedidosActionPerformed

    private void EliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEmpleadoActionPerformed
        int fila=TablaEmpleado.getSelectedRow();
        String valor = TablaEmpleado.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM empleados WHERE ID_Empleado='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                MostrarTablaEmpleados();
            }
            catch (SQLException ex) {
                Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EliminarEmpleadoActionPerformed

    private void actualizarempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarempleadosActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement ("UPDATE empleados SET Nombre='"+NombreEmpleado.getText()+"',Telefono='"+TelefonoEmpleado.getText()+"',Edad='"+EdadEmpleado.getText()
                +"',Sexo'"+SexoEmpleado.getText()+"',Domicilio'"+DomicilioEmpleado.getText()+"'WHERE ID_Empleado='"+buscarempleado.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarempleados();
            MostrarTablaEmpleados();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarempleadosActionPerformed

    private void LimpiarSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarSemestreActionPerformed
        limpiarempleados();
    }//GEN-LAST:event_LimpiarSemestreActionPerformed

    private void ConsultarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarEmpleadosActionPerformed
        MostrarTablaEmpleados();
    }//GEN-LAST:event_ConsultarEmpleadosActionPerformed

    private void GuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEmpleadoActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO empleados(Nombre, Telefono,Edad,Sexo,Domicilio) VALUES (?,?,?,?,?)");

            pps.setString (1, NombreEmpleado.getText());
            pps.setString (2, TelefonoEmpleado.getText());
            pps.setString (3, EdadEmpleado.getText());
            pps.setString (4, SexoEmpleado.getText());
            pps.setString (5, DomicilioEmpleado.getText());

            pps.executeUpdate();
            MostrarTablaEmpleados();

            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarEmpleadoActionPerformed

    private void modificarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarempleadoActionPerformed
        int fila = TablaEmpleado.getSelectedRow();
        if (fila>=0){
            buscarempleado.setText(TablaEmpleado.getValueAt(fila, 0).toString());
            NombreEmpleado.setText(TablaEmpleado.getValueAt(fila, 1).toString());
            TelefonoEmpleado.setText(TablaEmpleado.getValueAt(fila, 2).toString());
            EdadEmpleado.setText(TablaEmpleado.getValueAt(fila, 3).toString());
            SexoEmpleado.setText(TablaEmpleado.getValueAt(fila, 4).toString());
            DomicilioEmpleado.setText(TablaEmpleado.getValueAt(fila, 5).toString());
        }
        else {
            JOptionPane.showMessageDialog(null,"Fila no selecionada");
        }
    }//GEN-LAST:event_modificarempleadoActionPerformed

    private void eliminarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarproductoActionPerformed
        int fila=TablaProductos.getSelectedRow();
        String valor = TablaProductos.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM productos WHERE ID_Producto='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                MostrarTablaProductos();
            }
            catch (SQLException ex) {
                Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_eliminarproductoActionPerformed

    private void actualizarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarproductosActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement ("UPDATE productos SET Nombre='"+NombreProducto.getText()+"',Codigo='"+CodigoProducto.getText()+
                "',Caducidad='"+CaducidadProducto.getText()+"',Marca='"+MarcaProducto.getText()+"',PRECIO='"+PrecioProducto.getText()+
                "',COSTO='"+CostoProducto.getText()+"',Stock='"+StockProducto.getText()+"'WHERE ID_Producto='"+buscarproducto.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarproductos();
            MostrarTablaProductos();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarproductosActionPerformed

    private void ModificarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarproductoActionPerformed
        int fila = TablaProductos.getSelectedRow();
        if (fila>=0){
            buscarproducto.setText(TablaProductos.getValueAt(fila, 0).toString());
            NombreProducto.setText(TablaProductos.getValueAt(fila, 1).toString());
            CodigoProducto.setText(TablaProductos.getValueAt(fila, 2).toString());
            CaducidadProducto.setText(TablaProductos.getValueAt(fila, 3).toString());
            MarcaProducto.setText(TablaProductos.getValueAt(fila, 4).toString());
            PrecioProducto.setText(TablaProductos.getValueAt(fila, 5).toString());
            CostoProducto.setText(TablaProductos.getValueAt(fila, 6).toString());
            StockProducto.setText(TablaProductos.getValueAt(fila, 7).toString());
        }
        else {
            JOptionPane.showMessageDialog(null,"Fila no selecionada");
        }
    }//GEN-LAST:event_ModificarproductoActionPerformed

    private void LimpiarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarProductosActionPerformed
        limpiarproductos();
    }//GEN-LAST:event_LimpiarProductosActionPerformed

    private void ConsultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProductosActionPerformed
        MostrarTablaProductos();
    }//GEN-LAST:event_ConsultarProductosActionPerformed

    private void GuardarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProductosActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO productos(Nombre, Codigo, Caducidad, Marca,PRECIO,COSTO,Stock) VALUES (?,?,?,?,?,?,?)");
            pps.setString (1, NombreProducto.getText());
            pps.setString (2, CodigoProducto.getText());
            pps.setString (3, CaducidadProducto.getText());
            pps.setString (4, MarcaProducto.getText());
            pps.setString (5, PrecioProducto.getText());
            pps.setString (6, CostoProducto.getText());
            pps.setString (7, StockProducto.getText());

            pps.executeUpdate();
            MostrarTablaProductos();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(OperacionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alumno;
    private javax.swing.JPanel AlumnoGrupo;
    private javax.swing.JPanel AlumnoMiembros;
    private javax.swing.JTextField CaducidadProducto;
    public javax.swing.JTextField Cantidad;
    private javax.swing.JTextField CodigoProducto;
    private javax.swing.JTextField CompañiaProveedor;
    private javax.swing.JButton ConsultarEmpleados;
    private javax.swing.JButton ConsultarProductos;
    private javax.swing.JButton ConsultarProveedores;
    private javax.swing.JButton ConsultarStats1;
    private javax.swing.JButton ConsultarVentas;
    private javax.swing.JTextField CostoProducto;
    private javax.swing.JTextField DireccionProveedor;
    private javax.swing.JTextField DomicilioEmpleado;
    private javax.swing.JTextField EdadEmpleado;
    private javax.swing.JButton EliminarEmpleado;
    private javax.swing.JTextField EmpleadoVentas;
    public javax.swing.JTextField FechaEntrega;
    public javax.swing.JTextField FechaPedido;
    private javax.swing.JTextField FechaVentas;
    private javax.swing.JTextField Folio;
    private javax.swing.JButton GuardarEmpleado;
    private javax.swing.JButton GuardarPedidos;
    private javax.swing.JButton GuardarProductos;
    private javax.swing.JButton GuardarProveedor;
    private javax.swing.JButton GuardarVentas;
    private javax.swing.JLabel IDAlumno;
    private javax.swing.JTextField IDProveedor;
    private javax.swing.JLabel IDStatus3;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton LimpiarAlumno;
    private javax.swing.JButton LimpiarMiembros;
    private javax.swing.JButton LimpiarProductos;
    private javax.swing.JButton LimpiarProveedores;
    private javax.swing.JButton LimpiarSemestre;
    private javax.swing.JTextField MarcaProducto;
    private javax.swing.JTextField MarcaProveedor;
    private javax.swing.JButton Modificarproducto;
    public javax.swing.JTextField NombreEmpleado;
    private javax.swing.JTextField NombreProducto;
    private javax.swing.JTextField NombreProveedor;
    private javax.swing.JLabel NombreStatus;
    private javax.swing.JLabel NombreStatus1;
    private javax.swing.JLabel NombreStatus2;
    private javax.swing.JLabel NombreStatus3;
    private javax.swing.JLabel NombreStatus4;
    private javax.swing.JTextField PrecioProducto;
    private javax.swing.JTextField PrecioTotal;
    public javax.swing.JTextField ProductoPedido;
    private javax.swing.JTextField ProductoVentas;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JButton Regresar;
    private javax.swing.JPanel Semestre;
    private javax.swing.JTextField SexoEmpleado;
    private javax.swing.JPanel Status;
    private javax.swing.JTextField StockProducto;
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JTable TablaPedidos;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTable TablaProveedor;
    private javax.swing.JTable TablaVentas;
    public javax.swing.JTextField TelefonoEmpleado;
    private javax.swing.JTextField TelefonoProveedor;
    private javax.swing.JTextField Total;
    private javax.swing.JTextField TotalVentas;
    private javax.swing.JButton actualizaralumno;
    private javax.swing.JButton actualizaralumnogrupo;
    private javax.swing.JButton actualizarempleados;
    private javax.swing.JButton actualizarproductos;
    private javax.swing.JButton actualizarventas;
    private javax.swing.JTextField buscarempleado;
    private javax.swing.JTextField buscarpedido;
    private javax.swing.JTextField buscarproducto;
    private javax.swing.JTextField buscarproveedor;
    private javax.swing.JTextField buscarventas;
    private javax.swing.JButton eliminaralumnogrupo;
    private javax.swing.JButton eliminarproducto;
    private javax.swing.JButton eliminarventas;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton modificaralumno;
    private javax.swing.JButton modificarempleado;
    private javax.swing.JButton modificarproveedores;
    private javax.swing.JButton modificarventas;
    // End of variables declaration//GEN-END:variables

}

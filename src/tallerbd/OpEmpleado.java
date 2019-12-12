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
 * @author sysadmin
 */
public class OpEmpleado extends javax.swing.JFrame {
    ConexionMySQL con = new ConexionMySQL();
    Connection cn = con.conexion();
    /**
     * Creates new form OpEmpleado
     */
    public OpEmpleado() {
        initComponents();
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
    
    void mostrarMax() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cantidad Vendida");
        modelo.addColumn("Codigo Producto");
        masVendido.setModel(modelo);
        String sql = "select Total_Piezas,ID_Producto from ventas where Total_Piezas=(select max(Total_Piezas)from ventas); ";
        String datos[] = new String[6];
        Statement st ;
        try {
            st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);

            modelo.addRow(datos);
        }
        masVendido.setModel(modelo);
        }  catch (SQLException ex) {
        Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
      void mostrarMin() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cantidad Vendida");
        modelo.addColumn("Codigo Producto");
        mini.setModel(modelo);
        String sql = "select Total_Piezas,ID_Producto from ventas where Total_Piezas=(select min(Total_Piezas)from ventas); ";
        String datos[] = new String[6];
        Statement st ;
        try {
            st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);

            modelo.addRow(datos);
        }
        mini.setModel(modelo);
        }  catch (SQLException ex) {
        Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

      
      // metodo de mostrar productos
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
    
    
     void limpiarmiembros(){
     EmpleadoVentas.setText("");
     ProductoVentas.setText("");
     FechaVentas.setText("");
     TotalVentas.setText("");
     PrecioTotal.setText("");
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Ventas = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        NombreStatus4 = new javax.swing.JLabel();
        EmpleadoVentas = new javax.swing.JTextField();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mini = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        masVendido = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        ConsultarProductos = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus4.setText("ID Empleado");

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
                            .addComponent(NombreStatus4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(101, 101, 101))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                .addGap(44, 44, 44)
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

        jLabel1.setText("Elemento Seleccionado");

        javax.swing.GroupLayout VentasLayout = new javax.swing.GroupLayout(Ventas);
        Ventas.setLayout(VentasLayout);
        VentasLayout.setHorizontalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarventas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ConsultarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GuardarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LimpiarMiembros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(actualizarventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificarventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eliminarventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))))
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarVentas)
                            .addComponent(modificarventas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LimpiarMiembros)
                            .addComponent(actualizarventas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConsultarVentas)
                            .addComponent(eliminarventas)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(buscarventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Ventas", jPanel1);

        mini.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(mini);

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jButton2)
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("Menos Vendido", jPanel2);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        masVendido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(masVendido);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mas Vendido", jPanel3);

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaProductos);

        ConsultarProductos.setText("Consultar");
        ConsultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ConsultarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(ConsultarProductos)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarVentasActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO ventas(ID_Empleado, ID_Producto,Fecha,Total_Piezas,Total) VALUES (?,?,?,?,?)");
            pps.setString (1, EmpleadoVentas.getText());
            pps.setString (2, ProductoVentas.getText());
            pps.setString (3, FechaVentas.getText());
            pps.setString (4, TotalVentas.getText());
            pps.setString (5, PrecioTotal.getText());

            pps.executeUpdate();
            MostrarTablaVentas();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarVentasActionPerformed

    private void ConsultarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarVentasActionPerformed
        MostrarTablaVentas();
    }//GEN-LAST:event_ConsultarVentasActionPerformed

    private void LimpiarMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarMiembrosActionPerformed
        limpiarmiembros();
    }//GEN-LAST:event_LimpiarMiembrosActionPerformed

    private void modificarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarventasActionPerformed
        int fila = TablaVentas.getSelectedRow();
        if (fila>=0){
            buscarventas.setText(TablaVentas.getValueAt(fila, 0).toString());
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

    private void actualizarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarventasActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement ("UPDATE ventas SET ID_Empleado='"+EmpleadoVentas.getText()+"',ID_Producto='"+ProductoVentas.getText()+"',Fecha='"+FechaVentas.getText()+
                "',Total_Piezas='"+TotalVentas.getText()+"',Total='"+PrecioTotal.getText()+"'WHERE Folio='"+buscarventas.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarmiembros();
            MostrarTablaVentas();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarventasActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mostrarMax();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrarMin();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ConsultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProductosActionPerformed
        MostrarTablaProductos();
    }//GEN-LAST:event_ConsultarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(OpEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarProductos;
    private javax.swing.JButton ConsultarVentas;
    private javax.swing.JTextField EmpleadoVentas;
    private javax.swing.JTextField FechaVentas;
    private javax.swing.JButton GuardarVentas;
    private javax.swing.JButton LimpiarMiembros;
    private javax.swing.JLabel NombreStatus4;
    private javax.swing.JTextField PrecioTotal;
    private javax.swing.JTextField ProductoVentas;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JTextField TotalVentas;
    private javax.swing.JPanel Ventas;
    private javax.swing.JButton actualizarventas;
    private javax.swing.JTextField buscarventas;
    private javax.swing.JButton eliminarventas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable masVendido;
    private javax.swing.JTable mini;
    private javax.swing.JButton modificarventas;
    // End of variables declaration//GEN-END:variables
}
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

public class OperacionesProfesor extends javax.swing.JFrame {
    ConexionMySQL con = new ConexionMySQL();
    Connection cn = con.conexion();
    
    /**
     * Creates new form ConsultasMySQL
     */
    public OperacionesProfesor() {
        initComponents();
        this.setLocation(200,150);     
        
    }
    
    void MostrarTablaStatus(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Status");
    modelo.addColumn("Nombre Status");
    TablaStatus.setModel(modelo);
    
    String sql = "SELECT * FROM status";
    String datos[] = new String [2];
    
        try {
    Statement st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        modelo.addRow(datos);
    }
    TablaStatus.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
    void MostrarTablaSemestre(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Semestre");
    modelo.addColumn("Nombre Semestre");
    modelo.addColumn("ID Status");
    TablaSemestre.setModel(modelo);
    
    String sql = "SELECT * FROM semestre";
    String datos[] = new String [3];
    Statement st;
        try {
    st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        datos[2]= rs.getString(3);
        modelo.addRow(datos);
    }
    TablaSemestre.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
      void MostrarTablaAlumno(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Alumno/No. Control");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellidos");
    modelo.addColumn("Email");
    modelo.addColumn("Telefono");
    modelo.addColumn("Contraseña");
    modelo.addColumn("ID Status");
    TablaAlumno.setModel(modelo);
    
    String sql = "SELECT * FROM semestre";
    String datos[] = new String [7];
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
        modelo.addRow(datos);
    }
    TablaAlumno.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
      void MostrarTablaAlumnoGrupo(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Grupo");
    modelo.addColumn("ID Profesor");
    modelo.addColumn("ID Materia");
    modelo.addColumn("ID Alumno");
    modelo.addColumn("Status");
    
    TablaAlumnoGrupo.setModel(modelo);
    
    String sql = "SELECT * FROM semestre";
    String datos[] = new String [5];
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
       
        modelo.addRow(datos);
    }
    TablaAlumnoGrupo.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
    void MostrarTablaMiembros(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Alumno");
    modelo.addColumn("ID Miembro");
       
    TablaMiembros.setModel(modelo);
    
    String sql = "SELECT * FROM alumno_miembros";
    String datos[] = new String [2];
    Statement st;
        try {
    st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
               modelo.addRow(datos);
    }
    TablaMiembros.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
    void MostrarTablaEquipo(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Equipo");
    modelo.addColumn("ID Alumno");
    modelo.addColumn("Nombre Equipo");
       
    TablaEquipo.setModel(modelo);
    
    String sql = "SELECT * FROM equipo";
    String datos[] = new String [3];
    Statement st;
        try {
    st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        datos[2]= rs.getString(3);
    
        modelo.addRow(datos);
    }
    TablaEquipo.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
    
        void MostrarTablaGrupo(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Grupo");
    modelo.addColumn("ID Profesor");
    modelo.addColumn("ID Materia");
    modelo.addColumn("Horario");
    modelo.addColumn("Status");
       
    TablaGrupo.setModel(modelo);
    
    String sql = "SELECT * FROM grupo";
    String datos[] = new String [5];
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
    
        modelo.addRow(datos);
    }
    TablaGrupo.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
        void MostrarTablaMateria(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Materia");
    modelo.addColumn("Nombre Materia");
    modelo.addColumn("Status");
       
    TablaMateria.setModel(modelo);
    
    String sql = "SELECT * FROM materia";
    String datos[] = new String [3];
    Statement st;
        try {
    st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()){
        datos[0]= rs.getString(1);
        datos[1]= rs.getString(2);
        datos[2]= rs.getString(3);
            
        modelo.addRow(datos);
    }
    TablaMateria.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }

        void MostrarTablaProfesor(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Profesor");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apeliidos");
    modelo.addColumn("Email");
    modelo.addColumn("Telefono");
    modelo.addColumn("Password");
    modelo.addColumn("ID Status");
       
    TablaProfesor.setModel(modelo);
    
    String sql = "SELECT * FROM profesor";
    String datos[] = new String [7];
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
            
        modelo.addRow(datos);
    }
    TablaProfesor.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
     void MostrarTablaProyecto(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Proyecto");
    modelo.addColumn("ID Equipo");
    modelo.addColumn("ID Grupo");
    modelo.addColumn("ID Profesor");
    modelo.addColumn("ID Materia");
    modelo.addColumn("Nombre Proyecto");
    modelo.addColumn("Fecha Revision");
    modelo.addColumn("Calificacion");
    modelo.addColumn("Status");
       
    TablaProyecto.setModel(modelo);
    
    String sql = "SELECT * FROM proyecto";
    String datos[] = new String [9];
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
            
        modelo.addRow(datos);
    }
    TablaProyecto.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
     
     void limpiarprofesor(){
     txtIDProfesor.setText("");
     txtNombreProfesor.setText("");
     txtApellidosProfesor.setText("");
     txtEmailProfesor.setText("");
     txtTelefono.setText("");
     txtPassProfesor.setText("");
     txtIDStatusProfesor.setText("");
     }
     void limpiarproyecto(){
     txtIDProyecto.setText("");
     IDEquipo.setText("");
     IDGrupo.setText("");
     IDProfesor.setText("");
     IDMateria.setText("");
     NombreProyecto.setText("");
     Fecha.setText("");
     Calificacion.setText("");
     StatusProyect.setText("");
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
        TablaStatus = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        NombreStatus = new javax.swing.JLabel();
        txtNombreStatus = new javax.swing.JTextField();
        IDStatus = new javax.swing.JLabel();
        txtIDStatus = new javax.swing.JTextField();
        ConsultarStats = new javax.swing.JButton();
        Semestre = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        NombreStatus1 = new javax.swing.JLabel();
        txtNombreSemestre = new javax.swing.JTextField();
        IDSemestre = new javax.swing.JLabel();
        txtIDSemestre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIDStatusSemestre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaSemestre = new javax.swing.JTable();
        ConsultarSemestre = new javax.swing.JButton();
        Alumno = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NombreStatus2 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        IDAlumno = new javax.swing.JLabel();
        txtIDAlumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellidosAlumno = new javax.swing.JTextField();
        txtEmailAlumno = new javax.swing.JTextField();
        txtTelefonoAlumno = new javax.swing.JTextField();
        PasswordAlumno = new javax.swing.JPasswordField();
        txtIDStatusAlumno = new javax.swing.JTextField();
        ConsultarStats1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaAlumno = new javax.swing.JTable();
        buscaralumno = new javax.swing.JTextField();
        AlumnoGrupo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        NombreStatus3 = new javax.swing.JLabel();
        txtIDAlumnoGrupo = new javax.swing.JTextField();
        IDStatus2 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIDProfesorAlumnoGrupo = new javax.swing.JTextField();
        txtIDMateriaAlumnoGrupo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        statusalumnogrupo = new javax.swing.JTextField();
        ConsultarAlumnoGrupo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaAlumnoGrupo = new javax.swing.JTable();
        AlumnoMiembros = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        NombreStatus4 = new javax.swing.JLabel();
        txtIDMiembro = new javax.swing.JTextField();
        IDStatus3 = new javax.swing.JLabel();
        txtIDAlumnoMiembros = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        statusmiembros = new javax.swing.JTextField();
        ConsultarMiembros = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaMiembros = new javax.swing.JTable();
        Equipo = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        NombreStatus5 = new javax.swing.JLabel();
        txtIDAlumnoEquipo = new javax.swing.JTextField();
        IDStatus4 = new javax.swing.JLabel();
        txtIDEquipo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreEquipo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        statusequipo = new javax.swing.JTextField();
        ConsultarEquipo = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaEquipo = new javax.swing.JTable();
        Grupo = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        NombreStatus6 = new javax.swing.JLabel();
        txtIDProfesorGrupo = new javax.swing.JTextField();
        IDStatus5 = new javax.swing.JLabel();
        txtIDGrupo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIDMateriaGrupo = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtStatus = new javax.swing.JLabel();
        txtStatusGrupo = new javax.swing.JTextField();
        ConsultarGrupo = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaGrupo = new javax.swing.JTable();
        Materia = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        NombreStatus7 = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        IDStatus6 = new javax.swing.JLabel();
        txtIDMateria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtStatusMateria = new javax.swing.JTextField();
        ConsultarMateria = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaMateria = new javax.swing.JTable();
        Profesor = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        NombreStatus8 = new javax.swing.JLabel();
        txtNombreProfesor = new javax.swing.JTextField();
        IDStatus7 = new javax.swing.JLabel();
        txtIDProfesor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtApellidosProfesor = new javax.swing.JTextField();
        txtEmailProfesor = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPassProfesor = new javax.swing.JTextField();
        txtIDStatusProfesor = new javax.swing.JTextField();
        GuardarProfesor = new javax.swing.JButton();
        ConsultarProfesor = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        TablaProfesor = new javax.swing.JTable();
        LimpiarProfesor = new javax.swing.JButton();
        buscarprofesor = new javax.swing.JTextField();
        modificarprofesor = new javax.swing.JButton();
        actualizarprofesor = new javax.swing.JButton();
        Proyecto = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        NombreStatus9 = new javax.swing.JLabel();
        IDEquipo = new javax.swing.JTextField();
        IDStatus8 = new javax.swing.JLabel();
        txtIDProyecto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        IDGrupo = new javax.swing.JTextField();
        IDProfesor = new javax.swing.JTextField();
        IDMateria = new javax.swing.JTextField();
        NombreProyecto = new javax.swing.JTextField();
        Fecha = new javax.swing.JTextField();
        Calificacion = new javax.swing.JTextField();
        StatusProyect = new javax.swing.JTextField();
        ConsultarProyecto = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        TablaProyecto = new javax.swing.JTable();
        LimpiarProyecto = new javax.swing.JButton();
        buscarproyecto = new javax.swing.JTextField();
        modificarproyecto = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaStatus);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombreStatus.setText("Nombre");

        IDStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDStatus.setText("ID");

        txtIDStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDStatusKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtIDStatus))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDStatus)
                    .addComponent(txtIDStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus)
                    .addComponent(txtNombreStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        ConsultarStats.setText("Consultar");
        ConsultarStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarStatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StatusLayout = new javax.swing.GroupLayout(Status);
        Status.setLayout(StatusLayout);
        StatusLayout.setHorizontalGroup(
            StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(StatusLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarStats)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        StatusLayout.setVerticalGroup(
            StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarStats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        JTabbedPane.addTab("Status", Status);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombreStatus1.setText("Nombre");

        IDSemestre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDSemestre.setText("ID Semestre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID Status");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDSemestre)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(txtIDSemestre)
                    .addComponent(txtIDStatusSemestre))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDSemestre)
                    .addComponent(txtIDSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreStatus1))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDStatusSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        TablaSemestre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaSemestre);

        ConsultarSemestre.setText("Consultar");
        ConsultarSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSemestreActionPerformed(evt);
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
                        .addGap(33, 33, 33)
                        .addComponent(ConsultarSemestre))
                    .addGroup(SemestreLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        SemestreLayout.setVerticalGroup(
            SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SemestreLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(SemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarSemestre))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        JTabbedPane.addTab("Semestre", Semestre);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus2.setText("Nombre");

        IDAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDAlumno.setText("ID");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Email");

        jLabel4.setText("Telefono");

        jLabel5.setText("Contraseña");

        jLabel6.setText("ID Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosAlumno)
                            .addComponent(txtEmailAlumno)
                            .addComponent(txtTelefonoAlumno)
                            .addComponent(PasswordAlumno)
                            .addComponent(txtIDStatusAlumno)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtNombreAlumno))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDAlumno)
                    .addComponent(txtIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus2)
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmailAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefonoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PasswordAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIDStatusAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        ConsultarStats1.setText("Consultar");
        ConsultarStats1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarStats1ActionPerformed(evt);
            }
        });

        TablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaAlumno);

        javax.swing.GroupLayout AlumnoLayout = new javax.swing.GroupLayout(Alumno);
        Alumno.setLayout(AlumnoLayout);
        AlumnoLayout.setHorizontalGroup(
            AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AlumnoLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarStats1))
                    .addComponent(buscaralumno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        AlumnoLayout.setVerticalGroup(
            AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsultarStats1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscaralumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        JTabbedPane.addTab("Alumno", Alumno);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus3.setText("ID Profesor");

        IDStatus2.setText("ID Grupo");

        jLabel7.setText("ID Materia");

        jLabel8.setText("ID Alumno");

        jLabel26.setText("Status");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreStatus3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(IDStatus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDAlumnoGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtGrupo)
                    .addComponent(txtIDProfesorAlumnoGrupo)
                    .addComponent(txtIDMateriaAlumnoGrupo)
                    .addComponent(statusalumnogrupo))
                .addGap(59, 59, 59))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDStatus2)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus3)
                    .addComponent(txtIDProfesorAlumnoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDMateriaAlumnoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIDAlumnoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(statusalumnogrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        ConsultarAlumnoGrupo.setText("Consultar");
        ConsultarAlumnoGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarAlumnoGrupoActionPerformed(evt);
            }
        });

        TablaAlumnoGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaAlumnoGrupo);

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
                        .addComponent(ConsultarAlumnoGrupo))
                    .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        AlumnoGrupoLayout.setVerticalGroup(
            AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlumnoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumnoGrupoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(ConsultarAlumnoGrupo))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTabbedPane.addTab("Alumno Grupo", AlumnoGrupo);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombreStatus4.setText("ID Miembro");

        IDStatus3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDStatus3.setText("ID Alumno");

        jLabel28.setText("Status");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreStatus4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDStatus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDMiembro, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtIDAlumnoMiembros)
                    .addComponent(statusmiembros))
                .addGap(59, 59, 59))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDStatus3)
                    .addComponent(txtIDAlumnoMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus4)
                    .addComponent(txtIDMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(statusmiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        ConsultarMiembros.setText("Consultar");
        ConsultarMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarMiembrosActionPerformed(evt);
            }
        });

        TablaMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaMiembros);

        javax.swing.GroupLayout AlumnoMiembrosLayout = new javax.swing.GroupLayout(AlumnoMiembros);
        AlumnoMiembros.setLayout(AlumnoMiembrosLayout);
        AlumnoMiembrosLayout.setHorizontalGroup(
            AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarMiembros)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        AlumnoMiembrosLayout.setVerticalGroup(
            AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AlumnoMiembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumnoMiembrosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ConsultarMiembros))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTabbedPane.addTab("Miembros", AlumnoMiembros);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus5.setText("ID Alumno");

        IDStatus4.setText("ID Equipo");

        jLabel9.setText("Nombre Equipo");

        jLabel27.setText("Status");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreStatus5, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(IDStatus4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDAlumnoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtIDEquipo)
                    .addComponent(txtNombreEquipo)
                    .addComponent(statusequipo))
                .addGap(59, 59, 59))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDStatus4)
                    .addComponent(txtIDEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus5)
                    .addComponent(txtIDAlumnoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(statusequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ConsultarEquipo.setText("Consultar");
        ConsultarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarEquipoActionPerformed(evt);
            }
        });

        TablaEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(TablaEquipo);

        javax.swing.GroupLayout EquipoLayout = new javax.swing.GroupLayout(Equipo);
        Equipo.setLayout(EquipoLayout);
        EquipoLayout.setHorizontalGroup(
            EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipoLayout.createSequentialGroup()
                .addGroup(EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EquipoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarEquipo))
                    .addGroup(EquipoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        EquipoLayout.setVerticalGroup(
            EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsultarEquipo)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );

        JTabbedPane.addTab("Equipo", Equipo);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus6.setText("ID Profesor");

        IDStatus5.setText("ID Grupo");

        jLabel10.setText("ID Materia");

        jLabel11.setText("Horario");

        jLabel12.setText("Status");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDStatus5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreStatus6, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDProfesorGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDMateriaGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatusGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDStatus5)
                    .addComponent(txtIDGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus6)
                    .addComponent(txtIDProfesorGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIDMateriaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtStatusGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        ConsultarGrupo.setText("Consultar");
        ConsultarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarGrupoActionPerformed(evt);
            }
        });

        TablaGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(TablaGrupo);

        javax.swing.GroupLayout GrupoLayout = new javax.swing.GroupLayout(Grupo);
        Grupo.setLayout(GrupoLayout);
        GrupoLayout.setHorizontalGroup(
            GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrupoLayout.createSequentialGroup()
                .addGroup(GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GrupoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GrupoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarGrupo)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        GrupoLayout.setVerticalGroup(
            GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrupoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(GrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsultarGrupo)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );

        JTabbedPane.addTab("Grupo", Grupo);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus7.setText("Nombre Materia");

        IDStatus6.setText("ID Materia");

        jLabel13.setText("Status");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreStatus7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDStatus6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtIDMateria)
                    .addComponent(txtStatusMateria))
                .addGap(59, 59, 59))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDStatus6))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreStatus7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatusMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        ConsultarMateria.setText("Consultar");
        ConsultarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarMateriaActionPerformed(evt);
            }
        });

        TablaMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(TablaMateria);

        javax.swing.GroupLayout MateriaLayout = new javax.swing.GroupLayout(Materia);
        Materia.setLayout(MateriaLayout);
        MateriaLayout.setHorizontalGroup(
            MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriaLayout.createSequentialGroup()
                .addGroup(MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MateriaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarMateria))
                    .addGroup(MateriaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        MateriaLayout.setVerticalGroup(
            MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsultarMateria)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );

        JTabbedPane.addTab("Materia", Materia);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus8.setText("Nombre");

        IDStatus7.setText("ID Profesor");

        jLabel14.setText("Apellidos");

        jLabel15.setText("Email");

        jLabel16.setText("Telefono");

        jLabel17.setText("Password");

        jLabel18.setText("ID Status");

        txtIDStatusProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDStatusProfesorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDStatus7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreStatus8, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtIDProfesor)
                    .addComponent(txtApellidosProfesor)
                    .addComponent(txtEmailProfesor)
                    .addComponent(txtTelefono)
                    .addComponent(txtPassProfesor)
                    .addComponent(txtIDStatusProfesor))
                .addGap(59, 59, 59))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDStatus7)
                    .addComponent(txtIDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus8)
                    .addComponent(txtNombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtApellidosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEmailProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPassProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIDStatusProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GuardarProfesor.setText("Guardar");
        GuardarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProfesorActionPerformed(evt);
            }
        });

        ConsultarProfesor.setText("Consultar");
        ConsultarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProfesorActionPerformed(evt);
            }
        });

        TablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(TablaProfesor);

        LimpiarProfesor.setText("Limpiar");
        LimpiarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarProfesorActionPerformed(evt);
            }
        });

        modificarprofesor.setText("Modificar");
        modificarprofesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarprofesorActionPerformed(evt);
            }
        });

        actualizarprofesor.setText("Actualizar");
        actualizarprofesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarprofesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfesorLayout = new javax.swing.GroupLayout(Profesor);
        Profesor.setLayout(ProfesorLayout);
        ProfesorLayout.setHorizontalGroup(
            ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfesorLayout.createSequentialGroup()
                .addGroup(ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfesorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConsultarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GuardarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LimpiarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarprofesor))
                        .addGap(48, 48, 48)
                        .addGroup(ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actualizarprofesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarprofesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ProfesorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        ProfesorLayout.setVerticalGroup(
            ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfesorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfesorLayout.createSequentialGroup()
                        .addGroup(ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuardarProfesor)
                            .addComponent(modificarprofesor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LimpiarProfesor)
                            .addComponent(actualizarprofesor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConsultarProfesor)
                        .addGap(45, 45, 45)
                        .addComponent(buscarprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );

        JTabbedPane.addTab("Profesor", Profesor);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        NombreStatus9.setText("ID Equipo");

        IDStatus8.setText("ID Proyecto");

        jLabel19.setText("ID Grupo");

        jLabel20.setText("ID Profesor");

        jLabel21.setText("ID Materia");

        jLabel22.setText("Nombre de Proyecto");

        jLabel23.setText("Fecha Revision");

        jLabel24.setText("Calificación");

        jLabel25.setText("Status");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreStatus9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDStatus8, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IDEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtIDProyecto)
                    .addComponent(IDGrupo)
                    .addComponent(IDProfesor)
                    .addComponent(IDMateria)
                    .addComponent(NombreProyecto)
                    .addComponent(Fecha)
                    .addComponent(Calificacion)
                    .addComponent(StatusProyect))
                .addGap(59, 59, 59))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDStatus8)
                    .addComponent(txtIDProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreStatus9)
                    .addComponent(IDEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(IDGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(IDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(IDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(StatusProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConsultarProyecto.setText("Consultar");
        ConsultarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProyectoActionPerformed(evt);
            }
        });

        TablaProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(TablaProyecto);

        LimpiarProyecto.setText("Limpiar");
        LimpiarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarProyectoActionPerformed(evt);
            }
        });

        modificarproyecto.setText("Modificar");
        modificarproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarproyectoActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProyectoLayout = new javax.swing.GroupLayout(Proyecto);
        Proyecto.setLayout(ProyectoLayout);
        ProyectoLayout.setHorizontalGroup(
            ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProyectoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addComponent(jScrollPane10)
                        .addContainerGap())
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProyectoLayout.createSequentialGroup()
                                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ConsultarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LimpiarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificarproyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(buscarproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(ProyectoLayout.createSequentialGroup()
                                .addComponent(actualizar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ProyectoLayout.setVerticalGroup(
            ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProyectoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProyectoLayout.createSequentialGroup()
                        .addGroup(ProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultarProyecto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LimpiarProyecto)
                        .addGap(18, 18, 18)
                        .addComponent(modificarproyecto)
                        .addGap(18, 18, 18)
                        .addComponent(actualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        JTabbedPane.addTab("Proyecto", Proyecto);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar))
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Regresar)
                .addGap(22, 22, 22)
                .addComponent(JTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 475, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        LoginMySQL login = new LoginMySQL();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarMouseClicked

    private void ConsultarStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarStatsActionPerformed
        MostrarTablaStatus();
    }//GEN-LAST:event_ConsultarStatsActionPerformed

    private void ConsultarSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSemestreActionPerformed
        MostrarTablaSemestre();
    }//GEN-LAST:event_ConsultarSemestreActionPerformed

    private void ConsultarStats1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarStats1ActionPerformed
       MostrarTablaAlumno();
    }//GEN-LAST:event_ConsultarStats1ActionPerformed

    private void ConsultarAlumnoGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarAlumnoGrupoActionPerformed
        MostrarTablaGrupo();
    }//GEN-LAST:event_ConsultarAlumnoGrupoActionPerformed

    private void ConsultarMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarMiembrosActionPerformed
        MostrarTablaMiembros();
    }//GEN-LAST:event_ConsultarMiembrosActionPerformed

    private void ConsultarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarEquipoActionPerformed
        MostrarTablaEquipo();
    }//GEN-LAST:event_ConsultarEquipoActionPerformed

    private void ConsultarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarGrupoActionPerformed
        MostrarTablaGrupo();
    }//GEN-LAST:event_ConsultarGrupoActionPerformed

    private void ConsultarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarMateriaActionPerformed
        MostrarTablaMateria();
    }//GEN-LAST:event_ConsultarMateriaActionPerformed

    private void GuardarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProfesorActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO profesor(id_profesor,nombre_profesor, apellidos_profesor,email,telefono,password,id_status) VALUES (?,?,?,?,?,?,?)");
            pps.setString (1, txtIDProfesor.getText());
            pps.setString (2, txtNombreProfesor.getText());
            pps.setString (3, txtApellidosProfesor.getText());
            pps.setString (4, txtEmailProfesor.getText());
            pps.setString (5, txtTelefono.getText());
            pps.setString (6, txtPassProfesor.getText());
            pps.setString (7, txtIDStatusProfesor.getText());
                             
            pps.executeUpdate();
            MostrarTablaProfesor();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarProfesorActionPerformed

    private void ConsultarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProfesorActionPerformed
        MostrarTablaProfesor();
    }//GEN-LAST:event_ConsultarProfesorActionPerformed

    private void ConsultarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProyectoActionPerformed
        MostrarTablaProyecto();
    }//GEN-LAST:event_ConsultarProyectoActionPerformed

    private void LimpiarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarProfesorActionPerformed
        limpiarprofesor(); 
    }//GEN-LAST:event_LimpiarProfesorActionPerformed

    private void LimpiarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarProyectoActionPerformed
        limpiarproyecto();
    }//GEN-LAST:event_LimpiarProyectoActionPerformed

    private void modificarprofesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarprofesorActionPerformed
        int fila = TablaProfesor.getSelectedRow();
        if (fila>=0){
        buscarprofesor.setText(TablaProfesor.getValueAt(fila, 0).toString());
        txtIDProfesor.setText(TablaProfesor.getValueAt(fila, 0).toString());
        txtNombreProfesor.setText(TablaProfesor.getValueAt(fila, 1).toString());
        txtApellidosProfesor.setText(TablaProfesor.getValueAt(fila, 2).toString());
        txtEmailProfesor.setText(TablaProfesor.getValueAt(fila, 3).toString());
        txtTelefono.setText(TablaProfesor.getValueAt(fila, 4).toString());
        txtPassProfesor.setText(TablaProfesor.getValueAt(fila, 5).toString());
        txtIDStatusProfesor.setText(TablaProfesor.getValueAt(fila, 6).toString()); 
        }
        else {
        JOptionPane.showMessageDialog(null,"Fila no selecionada");
        }
    }//GEN-LAST:event_modificarprofesorActionPerformed

    private void actualizarprofesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarprofesorActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement ("UPDATE profesor SET id_profesor='"+txtIDProfesor.getText()+
            "',nombre_profesor='"+txtNombreProfesor.getText()+"',apellidos_profesor='"+txtApellidosProfesor.getText()+
            "',email='"+txtEmailProfesor.getText()+"'telefono='"+txtTelefono.getText()+"'password='"+txtPassProfesor.getText()+"'id_status='"+txtIDStatusProfesor.getText()+"'WHERE id_profesor='"+buscarprofesor.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarprofesor();
            MostrarTablaProfesor();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarprofesorActionPerformed

    private void modificarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarproyectoActionPerformed
        int fila = TablaProyecto.getSelectedRow();
        if (fila>=0){
        buscarproyecto.setText(TablaProyecto.getValueAt(fila, 0).toString());
        txtIDProyecto.setText(TablaProyecto.getValueAt(fila, 0).toString());
        IDEquipo.setText(TablaProyecto.getValueAt(fila, 1).toString());
        IDGrupo.setText(TablaProyecto.getValueAt(fila, 2).toString());
        IDProfesor.setText(TablaProyecto.getValueAt(fila, 3).toString());
        IDMateria.setText(TablaProyecto.getValueAt(fila, 4).toString());
        NombreProyecto.setText(TablaProyecto.getValueAt(fila, 5).toString());
        Fecha.setText(TablaProyecto.getValueAt(fila, 6).toString()); 
        Calificacion.setText(TablaProyecto.getValueAt(fila, 7).toString()); 
        StatusProyect.setText(TablaProyecto.getValueAt(fila, 8).toString()); 
        }
        else {
        JOptionPane.showMessageDialog(null,"Fila no selecionada");
        }
    }//GEN-LAST:event_modificarproyectoActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement ("UPDATE proyecto SET id_proyecto='"+txtIDProyecto.getText()+
            "',id_equipo='"+txtIDEquipo.getText()+"',id_grupo='"+IDGrupo.getText()+
            "',id_profesor='"+IDProfesor.getText()+"',id_materia='"+IDMateria.getText()+"',nombre_proyecto='"+NombreProyecto.getText()+"',fecha_revision='"+Fecha.getText()+"',calificacion='"+Calificacion.getText()+"',status='"+StatusProyect.getText()+"'WHERE id_profesor='"+buscarprofesor.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarproyecto();
            MostrarTablaProyecto();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void txtIDStatusProfesorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDStatusProfesorKeyTyped
       char validar= evt.getKeyChar();
       if (Character.isLetter(validar)){
       getToolkit().beep();
       evt.consume();
       }
    }//GEN-LAST:event_txtIDStatusProfesorKeyTyped

    private void txtIDStatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDStatusKeyTyped
        char validar= evt.getKeyChar();
       if (Character.isLetter(validar)){
       getToolkit().beep();
       evt.consume();
       }
    }//GEN-LAST:event_txtIDStatusKeyTyped

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
            java.util.logging.Logger.getLogger(OperacionesProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionesProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionesProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionesProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionesProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alumno;
    private javax.swing.JPanel AlumnoGrupo;
    private javax.swing.JPanel AlumnoMiembros;
    private javax.swing.JTextField Calificacion;
    private javax.swing.JButton ConsultarAlumnoGrupo;
    private javax.swing.JButton ConsultarEquipo;
    private javax.swing.JButton ConsultarGrupo;
    private javax.swing.JButton ConsultarMateria;
    private javax.swing.JButton ConsultarMiembros;
    private javax.swing.JButton ConsultarProfesor;
    private javax.swing.JButton ConsultarProyecto;
    private javax.swing.JButton ConsultarSemestre;
    private javax.swing.JButton ConsultarStats;
    private javax.swing.JButton ConsultarStats1;
    private javax.swing.JPanel Equipo;
    private javax.swing.JTextField Fecha;
    private javax.swing.JPanel Grupo;
    private javax.swing.JButton GuardarProfesor;
    private javax.swing.JLabel IDAlumno;
    private javax.swing.JTextField IDEquipo;
    private javax.swing.JTextField IDGrupo;
    private javax.swing.JTextField IDMateria;
    private javax.swing.JTextField IDProfesor;
    private javax.swing.JLabel IDSemestre;
    private javax.swing.JLabel IDStatus;
    private javax.swing.JLabel IDStatus2;
    private javax.swing.JLabel IDStatus3;
    private javax.swing.JLabel IDStatus4;
    private javax.swing.JLabel IDStatus5;
    private javax.swing.JLabel IDStatus6;
    private javax.swing.JLabel IDStatus7;
    private javax.swing.JLabel IDStatus8;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton LimpiarProfesor;
    private javax.swing.JButton LimpiarProyecto;
    private javax.swing.JPanel Materia;
    private javax.swing.JTextField NombreProyecto;
    private javax.swing.JLabel NombreStatus;
    private javax.swing.JLabel NombreStatus1;
    private javax.swing.JLabel NombreStatus2;
    private javax.swing.JLabel NombreStatus3;
    private javax.swing.JLabel NombreStatus4;
    private javax.swing.JLabel NombreStatus5;
    private javax.swing.JLabel NombreStatus6;
    private javax.swing.JLabel NombreStatus7;
    private javax.swing.JLabel NombreStatus8;
    private javax.swing.JLabel NombreStatus9;
    public javax.swing.JPasswordField PasswordAlumno;
    private javax.swing.JPanel Profesor;
    private javax.swing.JPanel Proyecto;
    private javax.swing.JButton Regresar;
    private javax.swing.JPanel Semestre;
    private javax.swing.JPanel Status;
    private javax.swing.JTextField StatusProyect;
    private javax.swing.JTable TablaAlumno;
    private javax.swing.JTable TablaAlumnoGrupo;
    private javax.swing.JTable TablaEquipo;
    private javax.swing.JTable TablaGrupo;
    private javax.swing.JTable TablaMateria;
    private javax.swing.JTable TablaMiembros;
    private javax.swing.JTable TablaProfesor;
    private javax.swing.JTable TablaProyecto;
    private javax.swing.JTable TablaSemestre;
    private javax.swing.JTable TablaStatus;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton actualizarprofesor;
    private javax.swing.JTextField buscaralumno;
    private javax.swing.JTextField buscarprofesor;
    private javax.swing.JTextField buscarproyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton modificarprofesor;
    private javax.swing.JButton modificarproyecto;
    private javax.swing.JTextField statusalumnogrupo;
    private javax.swing.JTextField statusequipo;
    private javax.swing.JTextField statusmiembros;
    public javax.swing.JTextField txtApellidosAlumno;
    private javax.swing.JTextField txtApellidosProfesor;
    public javax.swing.JTextField txtEmailAlumno;
    private javax.swing.JTextField txtEmailProfesor;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtHorario;
    public javax.swing.JTextField txtIDAlumno;
    private javax.swing.JTextField txtIDAlumnoEquipo;
    private javax.swing.JTextField txtIDAlumnoGrupo;
    private javax.swing.JTextField txtIDAlumnoMiembros;
    private javax.swing.JTextField txtIDEquipo;
    private javax.swing.JTextField txtIDGrupo;
    private javax.swing.JTextField txtIDMateria;
    private javax.swing.JTextField txtIDMateriaAlumnoGrupo;
    private javax.swing.JTextField txtIDMateriaGrupo;
    private javax.swing.JTextField txtIDMiembro;
    private javax.swing.JTextField txtIDProfesor;
    private javax.swing.JTextField txtIDProfesorAlumnoGrupo;
    private javax.swing.JTextField txtIDProfesorGrupo;
    private javax.swing.JTextField txtIDProyecto;
    public javax.swing.JTextField txtIDSemestre;
    private javax.swing.JTextField txtIDStatus;
    public javax.swing.JTextField txtIDStatusAlumno;
    private javax.swing.JTextField txtIDStatusProfesor;
    public javax.swing.JTextField txtIDStatusSemestre;
    public javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNombreEquipo;
    private javax.swing.JTextField txtNombreMateria;
    private javax.swing.JTextField txtNombreProfesor;
    public javax.swing.JTextField txtNombreSemestre;
    private javax.swing.JTextField txtNombreStatus;
    private javax.swing.JTextField txtPassProfesor;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JTextField txtStatusGrupo;
    private javax.swing.JTextField txtStatusMateria;
    private javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtTelefonoAlumno;
    // End of variables declaration//GEN-END:variables

}

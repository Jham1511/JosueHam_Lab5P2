/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package josueham_lab5p2;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author skxka
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Personaje> personajes = new ArrayList();

    public Principal() {
        initComponents();
        this.setSize(510, 550);
        this.setLocationRelativeTo(null);
        actualizar_arbol();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_popup = new javax.swing.JPopupMenu();
        OpListarNodo = new javax.swing.JMenuItem();
        OpEliminar = new javax.swing.JMenuItem();
        CRUD = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        LbFuerza = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnGuardarCRUD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FieldAgilidadM = new javax.swing.JTextField();
        FieldFuerza = new javax.swing.JTextField();
        LbNombre = new javax.swing.JLabel();
        LbPoder = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        LbHP = new javax.swing.JLabel();
        FieldHP = new javax.swing.JTextField();
        LbUniverso = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        LbAgregar = new javax.swing.JLabel();
        CBUniverso = new javax.swing.JComboBox<>();
        FieldAgilidadF = new javax.swing.JTextField();
        FieldDebilidad = new javax.swing.JTextField();
        LbDebilidad = new javax.swing.JLabel();
        FieldPoder = new javax.swing.JTextField();
        ImagenCrud = new javax.swing.JLabel();
        DialogListar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        JTreePersonajes = new javax.swing.JScrollPane();
        jt_personajes = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_personajes = new javax.swing.JList();
        BtnFlecha = new javax.swing.JButton();
        PopUpUniverso = new javax.swing.JPopupMenu();
        ListarUniverso = new javax.swing.JMenuItem();
        DiaSimulacion = new javax.swing.JDialog();
        cb_jugador1 = new javax.swing.JComboBox<>();
        cb_jugador2 = new javax.swing.JComboBox<>();
        BtnResistencia = new javax.swing.JButton();
        BtnAtaqM = new javax.swing.JButton();
        BtnAtaqueF = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaBatalla = new javax.swing.JTextArea();
        Imagen = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelPrincipal = new javax.swing.JPanel();
        BtnSalir = new javax.swing.JButton();
        BtnCrud = new javax.swing.JButton();
        BtnListar = new javax.swing.JButton();
        BtnSimulacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ImagenMenu = new javax.swing.JLabel();

        OpListarNodo.setText("Listar Nodo");
        OpListarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListarNodoActionPerformed(evt);
            }
        });
        menu_popup.add(OpListarNodo);

        OpEliminar.setText("Eliminar Nodo");
        OpEliminar.setToolTipText("");
        OpEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpEliminarActionPerformed(evt);
            }
        });
        menu_popup.add(OpEliminar);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbFuerza.setBackground(new java.awt.Color(204, 204, 204));
        LbFuerza.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        LbFuerza.setForeground(new java.awt.Color(0, 0, 0));
        LbFuerza.setText("Fuerza");
        LbFuerza.setOpaque(true);
        jPanel1.add(LbFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agilidad Mental");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        BtnGuardarCRUD.setBackground(new java.awt.Color(255, 255, 255));
        BtnGuardarCRUD.setText("Agregar Personaje");
        BtnGuardarCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarCRUDActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuardarCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Agilidad Fisica");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        FieldAgilidadM.setText("100");
        jPanel1.add(FieldAgilidadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 120, 30));

        FieldFuerza.setText("250");
        jPanel1.add(FieldFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 130, 30));

        LbNombre.setBackground(new java.awt.Color(204, 204, 204));
        LbNombre.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        LbNombre.setForeground(new java.awt.Color(0, 0, 0));
        LbNombre.setText("Nombre");
        LbNombre.setOpaque(true);
        jPanel1.add(LbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        LbPoder.setBackground(new java.awt.Color(204, 204, 204));
        LbPoder.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        LbPoder.setForeground(new java.awt.Color(0, 0, 0));
        LbPoder.setText("Poder");
        LbPoder.setOpaque(true);
        jPanel1.add(LbPoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        FieldNombre.setText("Batman");
        jPanel1.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, 30));

        LbHP.setBackground(new java.awt.Color(204, 204, 204));
        LbHP.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        LbHP.setForeground(new java.awt.Color(0, 0, 0));
        LbHP.setText("HP");
        LbHP.setOpaque(true);
        jPanel1.add(LbHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        FieldHP.setText("300");
        jPanel1.add(FieldHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 120, 30));

        LbUniverso.setBackground(new java.awt.Color(204, 204, 204));
        LbUniverso.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        LbUniverso.setForeground(new java.awt.Color(0, 0, 0));
        LbUniverso.setText("Universo");
        LbUniverso.setOpaque(true);
        jPanel1.add(LbUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, 20));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 130, -1));

        LbAgregar.setBackground(new java.awt.Color(255, 0, 0));
        LbAgregar.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        LbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        LbAgregar.setText("Agregar Personaje");
        LbAgregar.setOpaque(true);
        jPanel1.add(LbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        CBUniverso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DC", "Marvel", "Mortal Kombat", "Capcom" }));
        jPanel1.add(CBUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 110, -1));

        FieldAgilidadF.setText("200");
        jPanel1.add(FieldAgilidadF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, 30));

        FieldDebilidad.setText("Soledad");
        jPanel1.add(FieldDebilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 130, 30));

        LbDebilidad.setBackground(new java.awt.Color(204, 204, 204));
        LbDebilidad.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        LbDebilidad.setForeground(new java.awt.Color(0, 0, 0));
        LbDebilidad.setText("Debilidad");
        LbDebilidad.setOpaque(true);
        jPanel1.add(LbDebilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        FieldPoder.setText("Dinero");
        jPanel1.add(FieldPoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 130, 30));

        ImagenCrud.setBackground(new java.awt.Color(102, 102, 102));
        ImagenCrud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/josueham_lab5p2/1366_2000 (1).jpg"))); // NOI18N
        jPanel1.add(ImagenCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout CRUDLayout = new javax.swing.GroupLayout(CRUD.getContentPane());
        CRUD.getContentPane().setLayout(CRUDLayout);
        CRUDLayout.setHorizontalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CRUDLayout.setVerticalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personajes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DC");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Marvel");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mortal Kombat");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Capcom");
        treeNode1.add(treeNode2);
        jt_personajes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_personajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_personajesMouseClicked(evt);
            }
        });
        JTreePersonajes.setViewportView(jt_personajes);

        jl_personajes.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_personajes);

        BtnFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/josueham_lab5p2/reply.png"))); // NOI18N
        BtnFlecha.setBorder(null);
        BtnFlecha.setOpaque(false);
        BtnFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFlechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(JTreePersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFlecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BtnFlecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTreePersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout DialogListarLayout = new javax.swing.GroupLayout(DialogListar.getContentPane());
        DialogListar.getContentPane().setLayout(DialogListarLayout);
        DialogListarLayout.setHorizontalGroup(
            DialogListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogListarLayout.setVerticalGroup(
            DialogListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ListarUniverso.setText("Listar Universo");
        ListarUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListarUniversoMouseClicked(evt);
            }
        });
        PopUpUniverso.add(ListarUniverso);

        DiaSimulacion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_jugador1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DiaSimulacion.getContentPane().add(cb_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 90, 30));

        cb_jugador2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DiaSimulacion.getContentPane().add(cb_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 90, 30));

        BtnResistencia.setText("Resistencia");
        BtnResistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResistenciaActionPerformed(evt);
            }
        });
        DiaSimulacion.getContentPane().add(BtnResistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        BtnAtaqM.setText("Ataque Mental");
        BtnAtaqM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtaqMActionPerformed(evt);
            }
        });
        DiaSimulacion.getContentPane().add(BtnAtaqM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        BtnAtaqueF.setText("Ataque Fisico");
        BtnAtaqueF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtaqueFActionPerformed(evt);
            }
        });
        DiaSimulacion.getContentPane().add(BtnAtaqueF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        BtnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/josueham_lab5p2/reply.png"))); // NOI18N
        BtnAtras.setOpaque(false);
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });
        DiaSimulacion.getContentPane().add(BtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 50));

        AreaBatalla.setColumns(20);
        AreaBatalla.setRows(5);
        jScrollPane2.setViewportView(AreaBatalla);

        DiaSimulacion.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 420, 130));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/josueham_lab5p2/Marvel-Vs.-Capcom-Clash-of-__21658.jpg"))); // NOI18N
        DiaSimulacion.getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/josueham_lab5p2/remove.png"))); // NOI18N
        BtnSalir.setBorder(null);
        BtnSalir.setOpaque(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        BtnCrud.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnCrud.setText("CRUD Personajes");
        BtnCrud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCrud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrudActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, 40));

        BtnListar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnListar.setText("Ver Universos");
        BtnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 160, 40));

        BtnSimulacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnSimulacion.setText("Simulacion ");
        BtnSimulacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimulacionActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BtnSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 160, 40));

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu Principal");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel2.setOpaque(true);
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        ImagenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/josueham_lab5p2/artworks-AL425TG2qNymf0CP-fnmSIg-t500x500.jpg"))); // NOI18N
        PanelPrincipal.add(ImagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 516, -1));

        jTabbedPane1.addTab("Menu Principal", PanelPrincipal);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrudActionPerformed
        abrir_crud();
    }//GEN-LAST:event_BtnCrudActionPerformed

    private void BtnGuardarCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCRUDActionPerformed
        String nombre = FieldNombre.getText();
        String poder = FieldPoder.getText();
        String debilidad = FieldDebilidad.getText();
        int index = CBUniverso.getSelectedIndex();
        String strFuerza = FieldFuerza.getText();
        int fuerza = Integer.parseInt(strFuerza);
        String strAgilidadF = FieldAgilidadF.getText();
        int AgilFisica = Integer.parseInt(strAgilidadF);
        String strAgilidadM = FieldAgilidadM.getText();
        int AgilMental = Integer.parseInt(strAgilidadM);
        String strVida = FieldHP.getText();
        int vida = Integer.parseInt(strVida);

        personajes.add(new Personaje(nombre, poder, debilidad, CBUniverso.getItemAt(index), fuerza, AgilFisica, AgilMental, vida));
        actualizar_arbol();
//        DefaultTreeModel m = (DefaultTreeModel) jt_personajes.getModel();
//
//        DefaultMutableTreeNode raiz
//                = (DefaultMutableTreeNode) m.getRoot();
//
//        DefaultMutableTreeNode nodo_perso = new DefaultMutableTreeNode();
//
//        for (Personaje p : personajes) {
//            switch (p.getUniverso()) {
//                case "DC": {
//                    nodo_perso = new DefaultMutableTreeNode(p);
//                    ((DefaultMutableTreeNode) raiz.getChildAt(index)).add(nodo_perso);
//                }
//                break;
//
//                case "Marvel": {
//                    nodo_perso = new DefaultMutableTreeNode(p);
//                    ((DefaultMutableTreeNode) raiz.getChildAt(index)).add(nodo_perso);
//                }
//                break;
//
//                case "Mortal Kombat": {
//                    nodo_perso = new DefaultMutableTreeNode(p);
//                    ((DefaultMutableTreeNode) raiz.getChildAt(index)).add(nodo_perso);
//                }
//                break;
//
//                case "Capcom": {
//                    nodo_perso = new DefaultMutableTreeNode(p);
//                    ((DefaultMutableTreeNode) raiz.getChildAt(index)).add(nodo_perso);
//                }
//                break;
//            }
//
//            m.reload();
//
//        }
        JOptionPane.showMessageDialog(this, "Personaje agregado exitosamente");
    }//GEN-LAST:event_BtnGuardarCRUDActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        JOptionPane.showMessageDialog(this, "Saliendo de programa...");
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        this.setVisible(true);
        CRUD.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void OpListarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListarNodoActionPerformed
        DefaultListModel modelo
                = (DefaultListModel) jl_personajes.getModel();

        modelo.addElement(personaje_seleccionada.toString());

        jl_personajes.setModel(modelo);
    }//GEN-LAST:event_OpListarNodoActionPerformed

    private void BtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarActionPerformed
        abrir_universos();
    }//GEN-LAST:event_BtnListarActionPerformed

    private void BtnFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFlechaActionPerformed
        DialogListar.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_BtnFlechaActionPerformed

    private void jt_personajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_personajesMouseClicked

        if (evt.isMetaDown()) {
            int row = jt_personajes.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_personajes.setSelectionRow(row);
            nodo_seleccionado = (DefaultMutableTreeNode) jt_personajes.getSelectionPath().getLastPathComponent();
            if (nodo_seleccionado.toString().equals("DC") || nodo_seleccionado.getUserObject().equals("Marvel") || nodo_seleccionado.getUserObject().equals("Capcom") || nodo_seleccionado.getUserObject().equals("MortalKombat")) {
                PopUpUniverso.show(evt.getComponent(), evt.getX(), evt.getY());
            } else {
                menu_popup.show(evt.getComponent(), evt.getX(), evt.getY());
            }

        }

    }//GEN-LAST:event_jt_personajesMouseClicked

    private void OpEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpEliminarActionPerformed
        int response = JOptionPane.showConfirmDialog(
                this,
                "Seguro de Eliminar?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            DefaultTreeModel m
                    = (DefaultTreeModel) jt_personajes.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            personajes.remove((Personaje) nodo_seleccionado.getUserObject());
            m.reload();
            jl_personajes.setModel(new DefaultListModel());
        }

    }//GEN-LAST:event_OpEliminarActionPerformed

    private void BtnSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimulacionActionPerformed
        abrir_simu();
        llenar_combobox1();
        llenar_combobox2();
    }//GEN-LAST:event_BtnSimulacionActionPerformed

    private void BtnResistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnResistenciaActionPerformed

    private void BtnAtaqueFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtaqueFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAtaqueFActionPerformed

    private void BtnAtaqMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtaqMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAtaqMActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        this.setVisible(true);
        DiaSimulacion.setVisible(false);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void ListarUniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarUniversoMouseClicked
        DefaultListModel modelo = new DefaultListModel();

        if (evt.isMetaDown()) {
            DefaultTreeModel modelito = (DefaultTreeModel) jt_personajes.getModel();
           
            int row = jt_personajes.getClosestRowForLocation(evt.getX(), evt.getY());
            System.out.println(row);
            jt_personajes.setSelectionRow(row);
            nodo_seleccionado = (DefaultMutableTreeNode) jt_personajes.getSelectionPath().getLastPathComponent();
            System.out.println(nodo_seleccionado.toString());
            for (Personaje p : personajes) {
                if (p.getUniverso().equals(nodo_seleccionado.toString())) {
                    modelo.addElement(p);
                }
            }
        }
        jl_personajes.setModel(modelo);
    }//GEN-LAST:event_ListarUniversoMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void abrir_crud() {
        CRUD.pack();
        CRUD.setLocationRelativeTo(this);
        this.setVisible(false);
        CRUD.setVisible(true);
    }

    public void abrir_universos() {
        DialogListar.pack();
        DialogListar.setLocationRelativeTo(this);
        this.setVisible(false);
        DialogListar.setVisible(true);
    }

    public void abrir_simu() {
        DiaSimulacion.pack();
        DiaSimulacion.setLocationRelativeTo(this);
        this.setVisible(false);
        DiaSimulacion.setVisible(true);
    }

    public void actualizar_arbol() {

        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Personajes");

        DefaultMutableTreeNode dc = new DefaultMutableTreeNode("DC"),
                marvel = new DefaultMutableTreeNode("Marvel"), capcom = new DefaultMutableTreeNode("Capcom"), mortal = new DefaultMutableTreeNode("Mortal Kombat");

        for (Personaje p : personajes) {
            DefaultMutableTreeNode nodoPer = new DefaultMutableTreeNode(p);
            switch (p.getUniverso()) {
                case "DC": {
                    dc.add(nodoPer);
                }
                break;
                case "Marvel": {
                    marvel.add(nodoPer);
                }
                break;
                case "Capcom": {
                    capcom.add(nodoPer);
                }
                break;
                case "Mortal Kombat": {
                    mortal.add(nodoPer);
                }
                break;
            }
        }

        raiz.add(dc);
        raiz.add(marvel);
        raiz.add(capcom);
        raiz.add(mortal);
        DefaultTreeModel m = new DefaultTreeModel(raiz);
        
        jt_personajes.setModel(m);

    }

    public void llenar_combobox1() {
        DefaultComboBoxModel modelito = new DefaultComboBoxModel();

        for (Personaje p : personajes) {
            modelito.addElement(p);
        }
        cb_jugador1.setModel(modelito);
    }

    public void llenar_combobox2() {
        DefaultComboBoxModel modelito = new DefaultComboBoxModel();

        for (Personaje p : personajes) {
            modelito.addElement(p);
        }
        cb_jugador2.setModel(modelito);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaBatalla;
    private javax.swing.JButton BtnAtaqM;
    private javax.swing.JButton BtnAtaqueF;
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnCrud;
    private javax.swing.JButton BtnFlecha;
    private javax.swing.JButton BtnGuardarCRUD;
    private javax.swing.JButton BtnListar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnResistencia;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSimulacion;
    private javax.swing.JComboBox<String> CBUniverso;
    private javax.swing.JDialog CRUD;
    private javax.swing.JDialog DiaSimulacion;
    private javax.swing.JDialog DialogListar;
    private javax.swing.JTextField FieldAgilidadF;
    private javax.swing.JTextField FieldAgilidadM;
    private javax.swing.JTextField FieldDebilidad;
    private javax.swing.JTextField FieldFuerza;
    private javax.swing.JTextField FieldHP;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldPoder;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel ImagenCrud;
    private javax.swing.JLabel ImagenMenu;
    private javax.swing.JScrollPane JTreePersonajes;
    private javax.swing.JLabel LbAgregar;
    private javax.swing.JLabel LbDebilidad;
    private javax.swing.JLabel LbFuerza;
    private javax.swing.JLabel LbHP;
    private javax.swing.JLabel LbNombre;
    private javax.swing.JLabel LbPoder;
    private javax.swing.JLabel LbUniverso;
    private javax.swing.JMenuItem ListarUniverso;
    private javax.swing.JMenuItem OpEliminar;
    private javax.swing.JMenuItem OpListarNodo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPopupMenu PopUpUniverso;
    private javax.swing.JComboBox<String> cb_jugador1;
    private javax.swing.JComboBox<String> cb_jugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList jl_personajes;
    private javax.swing.JTree jt_personajes;
    private javax.swing.JPopupMenu menu_popup;
    // End of variables declaration//GEN-END:variables
DefaultMutableTreeNode nodo_seleccionado = new DefaultMutableTreeNode();
    Personaje personaje_seleccionada = new Personaje();
}

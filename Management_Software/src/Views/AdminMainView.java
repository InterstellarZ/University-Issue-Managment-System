/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Models.Admin;
import Controler.AdminController;
import Controler.EmployerController;
import Models.Employer;
import Models.UserContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GARFIELD
 */
public class AdminMainView extends javax.swing.JFrame {

    UserContext userContext ; 
    
    Admin objAdmin;
    Admin[] arrayAdmins;

    Admin.Adduser objAdduser;
    Admin.Adduser[] arrayAdduser;

    Admin.AllissuesAdmin objAllissuesAdmin;
    Admin.AllissuesAdmin[] arrayAllissuesAdmin;

    Admin.ManagecoursesAdmin objManagecoursesAdmin;
    Admin.ManagecoursesAdmin[] arrayManagecoursesAdmin;
    int index;

    AdminController objAdminController;
    EmployerController objEmployerController;

    List<Admin.Adduser> list;
    List<Admin.ManagecoursesAdmin> list2;
    List<Employer.AllissuesEmployer> list3;
    List<Employer.AllissuesEmployer> list4;

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AdminMainView(UserContext userContext) {
        
        initComponents();
        icon();
        setSize(1250, 800);
        arrayAdmins = new Admin[1000];
        arrayAdduser = new Admin.Adduser[1000];
        arrayManagecoursesAdmin = new Admin.ManagecoursesAdmin[1000];
        objAdminController = new AdminController();
        objEmployerController = new EmployerController();

        PopulateAdduserList();
        PopulateManagecoursesAdminList();
        
        
        userContext =userContext ; 
        
        objAdminController.setUserContext(userContext);
        objAdminController.GetIDDDDDDD();
        
        jLabel44.setText(userContext.getName());
        jLabel10.setText(userContext.getID());
        
        PopulateAllissuesEmployerList();
        PopulateCompletedAllissuesAdminList();
        
        
        //
    
    }
     

    private void PopulateAdduserList() {
        // load data from database
        list = objAdminController.GetAddUsers("");

        //System.out.println(list);
        // bind data into JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Type");
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Phone");
        model.addColumn("address");
        model.addColumn("Password");
        model.addColumn("Reenterpassword");
        model.addColumn("Email");

//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

            // Create the first row
            Object[] rowData = new Object[]{
                list.get(i).getusertype(),
                list.get(i).getuserid(),
                list.get(i).getname(),
                list.get(i).getphoneNo(),
                list.get(i).getaddress(),
                list.get(i).getpassword(),
                list.get(i).getreenterpassword(),
                list.get(i).getemail()

            };

            model.insertRow(0, rowData);
        }

        tableUsers.setModel(model);

    }

    private void PopulateManagecoursesAdminList() {
        // load data from database
        list2 = objAdminController.GetManagecoursesAdmin("");

        System.out.println(list2);

        // bind data into JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Degree Type");
        model.addColumn("Uni Name");
        model.addColumn("Cuntry");
        model.addColumn("Degree Name");
        model.addColumn("Degree ID");
        model.addColumn("Faculty");
        model.addColumn("Entry Reqirements");
        model.addColumn("Programme Duration");
        model.addColumn("Programme Shedule");
        model.addColumn("Inake");
        model.addColumn("Course Fee");

//        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {

            // Create the first row
            Object[] rowData = new Object[]{
                list2.get(i).getdegreetype(),
                list2.get(i).getuniname(),
                list2.get(i).getcuntry(),
                list2.get(i).getdegreename(),
                list2.get(i).getdegreeid(),
                list2.get(i).getfaculty(),
                list2.get(i).getentryreqirements(),
                list2.get(i).getprogrammeduration(),
                list2.get(i).getprogrammeschedule(),
                list2.get(i).getintake(),
                list2.get(i).getcoursefee()

            };

            model.insertRow(0, rowData);
        }

        tabalemanagecourses.setModel(model);

    }
    
    private void PopulateAllissuesEmployerList() {
        // load data from database
        list3 = objEmployerController.GetAllissuesEmployer("");

        System.out.println(list3);

        // bind data into JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Issue ID");
        model.addColumn("Issue Type");
        model.addColumn("Inquiry Type");
        model.addColumn("Student Name");
        model.addColumn("Student ID");
        model.addColumn("Email");
        model.addColumn("Phone No");
        model.addColumn("Degree Type");
        model.addColumn("Degree Name");
        model.addColumn("Registerd Year");
        model.addColumn("Intake");
        model.addColumn("Year");
        model.addColumn("Semester");
        model.addColumn("Batch");
        model.addColumn("Suubject Name");
        model.addColumn("Exam");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Comment");
        model.addColumn("Details");
        model.addColumn("Employer ID");

//        System.out.println(list2);
        for (int i = 0; i < list3.size(); i++) {

            // Create the first row
            Object[] rowData = new Object[]{
                list3.get(i).getissueid(),
                list3.get(i).getissuetype(),
                list3.get(i).getinquirytype(),
                list3.get(i).getname(),
                list3.get(i).getitnumber(),
                list3.get(i).getemail(),
                list3.get(i).getphone(),
                list3.get(i).getdegreetype(),
                list3.get(i).getdegree(),
                list3.get(i).getregisterdyear(),
                list3.get(i).getintake(),
                list3.get(i).getyear(),
                list3.get(i).getsemester(),
                list3.get(i).getbatch(),
                list3.get(i).getsubject(),
                list3.get(i).getexam(),
                list3.get(i).getdate(),
                list3.get(i).gettime(),
                list3.get(i).getcomment(),
                list3.get(i).getdetails(),
                list3.get(i).getemployerID()

            };

            model.insertRow(0, rowData);
        }

        tblallissuesAD.setModel(model);

    }

    private void PopulateCompletedAllissuesAdminList() {
        // load data from database
        list4 = objEmployerController.GetCompletedAllissuesAdmin("");

        System.out.println(list4);

        // bind data into JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Issue ID");
        model.addColumn("Issue Type");
        model.addColumn("Inquiry Type");
        model.addColumn("Student Name");
        model.addColumn("Student ID");
        model.addColumn("Email");
        model.addColumn("Phone No");
        model.addColumn("Degree Type");
        model.addColumn("Degree Name");
        model.addColumn("Registerd Year");
        model.addColumn("Intake");
        model.addColumn("Year");
        model.addColumn("Semester");
        model.addColumn("Batch");
        model.addColumn("Suubject Name");
        model.addColumn("Exam");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Comment");
        model.addColumn("Details");
        model.addColumn("Employer ID");

//        System.out.println(list2);
        for (int i = 0; i < list4.size(); i++) {

            // Create the first row
            Object[] rowData = new Object[]{
                list4.get(i).getissueid(),
                list4.get(i).getissuetype(),
                list4.get(i).getinquirytype(),
                list4.get(i).getname(),
                list4.get(i).getitnumber(),
                list4.get(i).getemail(),
                list4.get(i).getphone(),
                list4.get(i).getdegreetype(),
                list4.get(i).getdegree(),
                list4.get(i).getregisterdyear(),
                list4.get(i).getintake(),
                list4.get(i).getyear(),
                list4.get(i).getsemester(),
                list4.get(i).getbatch(),
                list4.get(i).getsubject(),
                list4.get(i).getexam(),
                list4.get(i).getdate(),
                list4.get(i).gettime(),
                list4.get(i).getcomment(),
                list4.get(i).getdetails(),
                list4.get(i).getemployerID()

            };

            model.insertRow(0, rowData);
        }

        TBComAllIssuesAD.setModel(model);

    }

    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/Tutora logo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        btn_EXIG1 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        btn_EXIG = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        btn_ERI = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        btn_CD = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        btn_help = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        mainpanel = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CobUsertype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        btnAdduser = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        Btdelete = new javax.swing.JButton();
        Btsearch = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        Btsearch1 = new javax.swing.JButton();
        tab2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblallissuesAD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        allemail5 = new javax.swing.JLabel();
        allemail = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JLabel();
        txtissuetype = new javax.swing.JLabel();
        allemail2 = new javax.swing.JLabel();
        txtissueID = new javax.swing.JLabel();
        alldetails1 = new javax.swing.JLabel();
        allemail7 = new javax.swing.JLabel();
        allemail4 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        allemail3 = new javax.swing.JLabel();
        allemail1 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        txtEmployerID = new javax.swing.JLabel();
        alldetails = new javax.swing.JLabel();
        allemail6 = new javax.swing.JLabel();
        allemail16 = new javax.swing.JLabel();
        allemail17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        tab_3_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabalemanagecourses = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        searchMCtxt = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtdgreename = new javax.swing.JTextField();
        Cboxdgreetype = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtprogrammeduration = new javax.swing.JTextArea();
        jLabel70 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtentryrequirements = new javax.swing.JTextArea();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtprogrammeschedule = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtintakes = new javax.swing.JTextArea();
        txtfaculty = new javax.swing.JTextField();
        txtuniname = new javax.swing.JTextField();
        txtcuntry = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtcoursefee = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        txtdgreeid = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBComAllIssuesAD = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        allemail8 = new javax.swing.JLabel();
        alldetails2 = new javax.swing.JLabel();
        allemail9 = new javax.swing.JLabel();
        alldetails3 = new javax.swing.JLabel();
        allemail10 = new javax.swing.JLabel();
        txtEmployerID1 = new javax.swing.JLabel();
        txtissuetype1 = new javax.swing.JLabel();
        txtStudentID1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtDetails1 = new javax.swing.JTextArea();
        allemail11 = new javax.swing.JLabel();
        allemail12 = new javax.swing.JLabel();
        allemail13 = new javax.swing.JLabel();
        allemail14 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtComment1 = new javax.swing.JTextArea();
        allemail15 = new javax.swing.JLabel();
        txtissueID1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        tab6 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(36, 47, 65));
        jPanel6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel15.setBackground(new java.awt.Color(97, 212, 195));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Admin icon 100.png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADMIN");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("IT223365420");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Zakwan Rumy");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btn_1.setBackground(new java.awt.Color(36, 47, 65));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });
        btn_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_1.setBackground(new java.awt.Color(255, 255, 255));
        ind_1.setOpaque(false);

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_1.add(ind_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_EXIG1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_EXIG1.setForeground(new java.awt.Color(255, 255, 255));
        btn_EXIG1.setText("Add Users");
        btn_1.add(btn_EXIG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        btn_2.setBackground(new java.awt.Color(36, 47, 65));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
        });
        btn_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_2.setBackground(new java.awt.Color(255, 255, 255));
        ind_2.setOpaque(false);

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_2.add(ind_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_EXIG.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_EXIG.setForeground(new java.awt.Color(255, 255, 255));
        btn_EXIG.setText("All Issues");
        btn_2.add(btn_EXIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        btn_3.setBackground(new java.awt.Color(36, 47, 65));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });
        btn_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_3.setBackground(new java.awt.Color(255, 255, 255));
        ind_3.setOpaque(false);

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_3.add(ind_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_ERI.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_ERI.setForeground(new java.awt.Color(255, 255, 255));
        btn_ERI.setText("Manage Courses");
        btn_3.add(btn_ERI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        btn_4.setBackground(new java.awt.Color(36, 47, 65));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });
        btn_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_4.setBackground(new java.awt.Color(255, 255, 255));
        ind_4.setOpaque(false);

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_4.add(ind_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_CD.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_CD.setForeground(new java.awt.Color(255, 255, 255));
        btn_CD.setText("Monthly history of issues");
        btn_4.add(btn_CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        btn_6.setBackground(new java.awt.Color(36, 47, 65));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
        });
        btn_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_6.setBackground(new java.awt.Color(255, 255, 255));
        ind_6.setOpaque(false);

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_6.add(ind_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_help.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_help.setForeground(new java.awt.Color(255, 255, 255));
        btn_help.setText("Help");
        btn_6.add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(btn_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        mainpanel.setPreferredSize(new java.awt.Dimension(872, 758));
        mainpanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mainpanelMouseMoved(evt);
            }
        });
        mainpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainpanelMousePressed(evt);
            }
        });
        mainpanel.setLayout(new javax.swing.OverlayLayout(mainpanel));

        tab1.setBackground(new java.awt.Color(255, 255, 255));
        tab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tab1MouseMoved(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add Users");

        CobUsertype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CobUsertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Employer", "Admin" }));
        CobUsertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobUsertypeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("User Type");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name");

        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("User ID");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Email");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Password");

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Phone number");

        txtPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Re-enter Password");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Address");

        tableUsers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "ID", "Name", "Phone", "Address", "Password", "ReenterPassword", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsers.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableUsers.setRowHeight(32);
        tableUsers.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tableUsers.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableUsersAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsers);
        if (tableUsers.getColumnModel().getColumnCount() > 0) {
            tableUsers.getColumnModel().getColumn(1).setResizable(false);
            tableUsers.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAdduser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save button 30.png"))); // NOI18N
        btnAdduser.setText("REGISTER");
        btnAdduser.setPreferredSize(new java.awt.Dimension(130, 30));
        btnAdduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdduserMouseClicked(evt);
            }
        });
        btnAdduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdduserActionPerformed(evt);
            }
        });

        BtnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/update 25.png"))); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnUpdateMouseClicked(evt);
            }
        });
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        Btdelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete bin 30.png"))); // NOI18N
        Btdelete.setText("Delete");
        Btdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtdeleteMouseClicked(evt);
            }
        });
        Btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtdeleteActionPerformed(evt);
            }
        });

        Btsearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search icon 15.png"))); // NOI18N
        Btsearch.setText("Search");
        Btsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtsearchMouseClicked(evt);
            }
        });
        Btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtsearchActionPerformed(evt);
            }
        });

        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtsearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsearchFocusLost(evt);
            }
        });
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 0, 51));
        jLabel105.setText("*");

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 0, 51));
        jLabel106.setText("*");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 0, 51));
        jLabel107.setText("*");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 0, 51));
        jLabel108.setText("*");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 0, 51));
        jLabel109.setText("*");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 0, 51));
        jLabel110.setText("*");

        Btsearch1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btsearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clear icon 30.png"))); // NOI18N
        Btsearch1.setPreferredSize(new java.awt.Dimension(60, 39));
        Btsearch1.setRequestFocusEnabled(false);
        Btsearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btsearch1MouseClicked(evt);
            }
        });
        Btsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btsearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(Btdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tab1Layout.createSequentialGroup()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdduser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(CobUsertype, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel110)
                        .addGap(178, 178, 178)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel109))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel107)
                        .addGap(70, 70, 70)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel105)
                        .addGap(70, 70, 70)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel108)
                        .addGap(70, 70, 70)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel106)))
                .addGap(111, 111, 111))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CobUsertype, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109)
                    .addComponent(jLabel110))
                .addGap(18, 18, 18)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106)
                    .addComponent(jLabel108))
                .addGap(18, 18, 18)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addGap(11, 11, 11)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105))
                .addGap(18, 18, 18)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdduser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainpanel.add(tab1);

        tab2.setBackground(new java.awt.Color(255, 255, 255));
        tab2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("All Issues");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tblallissuesAD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblallissuesAD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Issue ID", "Category", "Type", "IT number or ID number", "Student name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblallissuesAD.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblallissuesAD.setRowHeight(30);
        tblallissuesAD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblallissuesADMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblallissuesAD);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        allemail5.setBackground(new java.awt.Color(255, 255, 255));
        allemail5.setText("Student ID");

        allemail.setBackground(new java.awt.Color(255, 255, 255));
        allemail.setText("Issue ID");

        txtStudentID.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentID.setText(" ");

        txtissuetype.setBackground(new java.awt.Color(255, 255, 255));
        txtissuetype.setText(" ");

        allemail2.setBackground(new java.awt.Color(255, 255, 255));
        allemail2.setText("Issue Type");

        txtissueID.setBackground(new java.awt.Color(255, 255, 255));
        txtissueID.setText(" ");

        alldetails1.setBackground(new java.awt.Color(255, 255, 255));
        alldetails1.setText("Comment");

        allemail7.setBackground(new java.awt.Color(255, 255, 255));
        allemail7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail7.setText("-");

        allemail4.setBackground(new java.awt.Color(255, 255, 255));
        allemail4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail4.setText("-");

        txtComment.setEditable(false);
        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane12.setViewportView(txtComment);

        allemail3.setBackground(new java.awt.Color(255, 255, 255));
        allemail3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail3.setText("-");

        allemail1.setBackground(new java.awt.Color(255, 255, 255));
        allemail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail1.setText("-");

        txtDetails.setEditable(false);
        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        jScrollPane11.setViewportView(txtDetails);

        txtEmployerID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployerID.setText(" ");

        alldetails.setBackground(new java.awt.Color(255, 255, 255));
        alldetails.setText("Details");

        allemail6.setBackground(new java.awt.Color(255, 255, 255));
        allemail6.setText("Employer ID");

        allemail16.setBackground(new java.awt.Color(255, 255, 255));
        allemail16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail16.setText("-");

        allemail17.setBackground(new java.awt.Color(255, 255, 255));
        allemail17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail17.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(allemail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allemail1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(allemail2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(allemail7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(allemail3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtissuetype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtissueID, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(alldetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allemail17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(allemail6)
                                        .addGap(19, 19, 19))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(alldetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(allemail16, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtEmployerID, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 473, Short.MAX_VALUE))
                                    .addComponent(jScrollPane11)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(allemail5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allemail4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 484, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail)
                    .addComponent(txtissueID)
                    .addComponent(allemail1))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail2)
                    .addComponent(txtissuetype)
                    .addComponent(allemail3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail5)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allemail4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail6)
                    .addComponent(txtEmployerID)
                    .addComponent(allemail7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alldetails)
                        .addComponent(allemail16))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alldetails1)
                            .addComponent(allemail17))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Refresh button icon 20.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.add(tab2);

        tab_3_2.setBackground(new java.awt.Color(255, 255, 255));
        tab_3_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab_3_2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tab_3_2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Next page");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabalemanagecourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Degree name", "Degree Type", "Univercity", "Cuntry"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabalemanagecourses.setRowHeight(30);
        tabalemanagecourses.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabalemanagecourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabalemanagecoursesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabalemanagecourses);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete bin 30.png"))); // NOI18N
        jButton13.setText("Remove");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/update 25.png"))); // NOI18N
        jButton14.setText("Update");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add new 24.png"))); // NOI18N
        jButton15.setText("Add New");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Manage Coureses");

        javax.swing.GroupLayout tab_3_2Layout = new javax.swing.GroupLayout(tab_3_2);
        tab_3_2.setLayout(tab_3_2Layout);
        tab_3_2Layout.setHorizontalGroup(
            tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_3_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_3_2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_3_2Layout.createSequentialGroup()
                                .addComponent(searchMCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_3_2Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(tab_3_2Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab_3_2Layout.setVerticalGroup(
            tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_3_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchMCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainpanel.add(tab_3_2);

        tab3.setBackground(new java.awt.Color(255, 255, 255));
        tab3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Add Coureses");

        txtdgreename.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdgreename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdgreenameActionPerformed(evt);
            }
        });

        Cboxdgreetype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cboxdgreetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "External", "Internal" }));
        Cboxdgreetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxdgreetypeActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Degree type");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setText("Entry Requirements");

        txtprogrammeduration.setColumns(20);
        txtprogrammeduration.setRows(5);
        jScrollPane3.setViewportView(txtprogrammeduration);

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("Programme Duration");

        txtentryrequirements.setColumns(20);
        txtentryrequirements.setRows(5);
        jScrollPane6.setViewportView(txtentryrequirements);

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("Programme Schedule");

        txtprogrammeschedule.setColumns(20);
        txtprogrammeschedule.setRows(5);
        jScrollPane7.setViewportView(txtprogrammeschedule);

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("Intakes");

        txtintakes.setColumns(20);
        txtintakes.setRows(5);
        jScrollPane9.setViewportView(txtintakes);

        txtfaculty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfacultyActionPerformed(evt);
            }
        });

        txtuniname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtuniname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuninameActionPerformed(evt);
            }
        });

        txtcuntry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcuntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuntryActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Back");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtcoursefee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcoursefee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoursefeeActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Course Fee");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Faculty");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("Dgree name");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Univercity name");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Cuntry");

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add new 24.png"))); // NOI18N
        jButton16.setText("Add");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/update 25.png"))); // NOI18N
        jButton17.setText("Update");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        txtdgreeid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdgreeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdgreeidActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Dgree ID");

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcoursefee, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfaculty)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                        .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdgreename)
                            .addGroup(tab3Layout.createSequentialGroup()
                                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cboxdgreetype, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tab3Layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtuniname, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)))
                            .addGroup(tab3Layout.createSequentialGroup()
                                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcuntry, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdgreeid, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cboxdgreetype, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtuniname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcuntry, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdgreename, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdgreeid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcoursefee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainpanel.add(tab3);

        tab4.setBackground(new java.awt.Color(255, 255, 255));
        tab4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Monthly histry of Issue");

        TBComAllIssuesAD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TBComAllIssuesAD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Issue ID", "Employer ID", "Category", "Type", "IT or ID number", "Student Name", "Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TBComAllIssuesAD.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TBComAllIssuesAD.setRowHeight(30);
        TBComAllIssuesAD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBComAllIssuesADMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TBComAllIssuesAD);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        allemail8.setBackground(new java.awt.Color(255, 255, 255));
        allemail8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail8.setText("-");

        alldetails2.setBackground(new java.awt.Color(255, 255, 255));
        alldetails2.setText("Comment -");

        allemail9.setBackground(new java.awt.Color(255, 255, 255));
        allemail9.setText("Employer ID");

        alldetails3.setBackground(new java.awt.Color(255, 255, 255));
        alldetails3.setText("Details -");

        allemail10.setBackground(new java.awt.Color(255, 255, 255));
        allemail10.setText("Issue Type");

        txtEmployerID1.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployerID1.setText(" ");

        txtissuetype1.setBackground(new java.awt.Color(255, 255, 255));
        txtissuetype1.setText(" ");

        txtStudentID1.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentID1.setText(" ");

        txtDetails1.setEditable(false);
        txtDetails1.setColumns(20);
        txtDetails1.setRows(5);
        jScrollPane13.setViewportView(txtDetails1);

        allemail11.setBackground(new java.awt.Color(255, 255, 255));
        allemail11.setText("Issue ID");

        allemail12.setBackground(new java.awt.Color(255, 255, 255));
        allemail12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail12.setText("-");

        allemail13.setBackground(new java.awt.Color(255, 255, 255));
        allemail13.setText("Student ID");

        allemail14.setBackground(new java.awt.Color(255, 255, 255));
        allemail14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail14.setText("-");

        txtComment1.setEditable(false);
        txtComment1.setColumns(20);
        txtComment1.setRows(5);
        jScrollPane14.setViewportView(txtComment1);

        allemail15.setBackground(new java.awt.Color(255, 255, 255));
        allemail15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail15.setText("-");

        txtissueID1.setBackground(new java.awt.Color(255, 255, 255));
        txtissueID1.setText(" ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(allemail11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allemail12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(allemail10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(allemail8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(allemail14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtissuetype1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtissueID1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alldetails3)
                                    .addComponent(alldetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                                    .addComponent(jScrollPane13)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(allemail13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allemail15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(allemail9)
                                .addGap(19, 19, 19)
                                .addComponent(txtEmployerID1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail11)
                    .addComponent(txtissueID1)
                    .addComponent(allemail12))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail10)
                    .addComponent(txtissuetype1)
                    .addComponent(allemail14))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail13)
                    .addComponent(txtStudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allemail15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail9)
                    .addComponent(txtEmployerID1)
                    .addComponent(allemail8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alldetails3)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alldetails2)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Refresh button icon 20.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton7)))
                .addContainerGap())
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.add(tab4);

        tab6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Help");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Admin overview\n\n\nAdd Users :\n\nThis button redirects you to the “Add Users” form, which allows the admin(s) to add new users \n(students, employees, new admins) to the system database.\n\nAll Issues :\n\nThis button redirects you to the “All Issues” page which includes all the issues that students have \nsubmitted throughout a month.\nEvery employee and admin(s) have the privilege to view All Issues but they cannot edit and comment.\n\nManage courses :\n\nThis button redirects you to the This button redirects you the “Manage courses” page, where the \nemployees or the admin(s) can add, remove, edit courses and related details.\n\nMonthly History of Issues :\n\nThis button redirects you to the “Monthly History of Issues” page which shows the table of monthly \nissues that has been submitted and completed throughout the past months (and years).\n");
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout tab6Layout = new javax.swing.GroupLayout(tab6);
        tab6.setLayout(tab6Layout);
        tab6Layout.setHorizontalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        tab6Layout.setVerticalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.add(tab6);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back icon 30.png"))); // NOI18N
        jLabel14.setToolTipText("");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize icon 30.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close button icon 30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel7MouseDragged(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 798, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        // TODO add your handling code here:

        setColor(btn_2);
        resetColor(btn_1);
        resetColor(btn_3);
        resetColor(btn_4);
        resetColor(btn_6);
        ind_1.setOpaque(false);
        ind_2.setOpaque(true);
        ind_3.setOpaque(false);
        ind_4.setOpaque(false);
        ind_6.setOpaque(false);
    }//GEN-LAST:event_btn_2MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:

        setColor(btn_3);
        resetColor(btn_1);
        resetColor(btn_2);
        resetColor(btn_4);
        resetColor(btn_6);
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(true);
        ind_4.setOpaque(false);
        ind_6.setOpaque(false);
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        // TODO add your handling code here:

        setColor(btn_4);
        resetColor(btn_1);
        resetColor(btn_2);
        resetColor(btn_3);
        resetColor(btn_6);
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_4.setOpaque(true);
        ind_6.setOpaque(false);
    }//GEN-LAST:event_btn_4MousePressed

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed
        // TODO add your handling code here:

        setColor(btn_6);
        resetColor(btn_1);
        resetColor(btn_2);
        resetColor(btn_3);
        resetColor(btn_4);
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_4.setOpaque(false);
        ind_6.setOpaque(true);
    }//GEN-LAST:event_btn_6MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(true);
        tab2.setEnabled(true);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);

    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(true);
        tab_3_2.setEnabled(true);

    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(true);
        tab4.setEnabled(true);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);

    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(true);
        tab6.setEnabled(true);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);

    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        // TODO add your handling code here:
        setColor(btn_1);
        resetColor(btn_2);
        resetColor(btn_3);
        resetColor(btn_4);
        resetColor(btn_6);
        ind_1.setOpaque(true);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_4.setOpaque(false);
        ind_6.setOpaque(false);
    }//GEN-LAST:event_btn_1MousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to sign out ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            dispose();
            LoginView info = new LoginView();
            info.setVisible(true);
        } else if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.CLOSED_OPTION) {

        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to continue this action ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.CLOSED_OPTION) {

        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(AdminMainView.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:     
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void mainpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_mainpanelMousePressed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
        jPanel6.setEnabled(false);
    }//GEN-LAST:event_formMouseMoved

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
        jPanel6.setEnabled(false);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseMoved

    private void mainpanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpanelMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_mainpanelMouseMoved

    private void tab1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseMoved
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
        jPanel6.setEnabled(false);
    }//GEN-LAST:event_tab1MouseMoved

    private void CobUsertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobUsertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CobUsertypeActionPerformed

    private void btnAdduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdduserActionPerformed
        if (txtUserId.getText().length() <= 0 || txtPassword1.getText().length() <= 0 || txtPassword2.getText().length() <= 0 || txtName.getText().length() <= 0 || txtEmail.getText().length() <= 0) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Empty Text Field, Please fill all");
        } else {
            try {
                String type = (String) CobUsertype.getSelectedItem();
                String id = txtUserId.getText();
                String name = txtName.getText();
                String phone = txtPhoneNumber.getText();
                String address = txtAddress.getText();
                String password1 = txtPassword1.getText();
                String password2 = txtPassword2.getText();
                String email = txtEmail.getText();

                objAdmin = objAdminController.addAdmin();

                arrayAdmins[index] = objAdmin;
                objAdduser = objAdminController.addAdduser(type, id, name, phone, address, password1, password2, email);

                boolean result = objAdminController.insertAdminToDB(objAdduser);

                arrayAdduser[index] = objAdduser;

                index++;
                if (result) {
                    JOptionPane.showMessageDialog(rootPane, "Student registration details have been added to database succesful " + index, "Output", 1);
                    txtUserId.setText("");
                    txtPassword1.setText("");
                    txtPassword2.setText("");
                    txtName.setText("");
                    txtEmail.setText("");
                    txtPhoneNumber.setText("");
                    txtAddress.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Student registration details have not been added to database succesful " + index, "Output", 1);
                }
            } catch (Throwable ex) {
                System.out.println(ex.getMessage());
            }
        }
        PopulateAdduserList();
    }//GEN-LAST:event_btnAdduserActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Update this User ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == 0) {

            String type = (String) CobUsertype.getSelectedItem();
            String name = txtName.getText();
            String email = txtEmail.getText();
            String phone = txtPhoneNumber.getText();
            String id = txtUserId.getText();
            String password1 = txtPassword1.getText();
            String password2 = txtPassword2.getText();
            String address = txtAddress.getText();

            objAdmin = objAdminController.addAdmin();

            arrayAdmins[index] = objAdmin;
            objAdduser = objAdminController.addAdduser(type, id, name, phone, address, password1, password2, email);

            boolean result = objAdminController.updateAdminToDB(objAdduser);
            System.out.println(result);

            txtUserId.setText("");
            txtPassword1.setText("");
            txtPassword2.setText("");
            txtName.setText("");
            txtEmail.setText("");
            txtPhoneNumber.setText("");
            txtAddress.setText("");

            PopulateAdduserList(); //this is the method to call the table details
        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtdeleteActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Delete this User ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == 0) {

            String type = (String) CobUsertype.getSelectedItem();
            String name = txtName.getText();
            String email = txtEmail.getText();
            String phone = txtPhoneNumber.getText();
            String id = txtUserId.getText();
            String password1 = txtPassword1.getText();
            String password2 = txtPassword2.getText();
            String address = txtAddress.getText();

            objAdmin = objAdminController.addAdmin();

            arrayAdmins[index] = objAdmin;
            objAdduser = objAdminController.addAdduser(type, id, name, phone, address, password1, password2, email);

            boolean result = objAdminController.deleteAdminToDB(objAdduser);

            System.out.println(result);

            txtUserId.setText("");
            txtPassword1.setText("");
            txtPassword2.setText("");
            txtName.setText("");
            txtEmail.setText("");
            txtPhoneNumber.setText("");
            txtAddress.setText("");

            PopulateAdduserList(); //this is the method to call the table details
        }

    }//GEN-LAST:event_BtdeleteActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword2ActionPerformed

    }//GEN-LAST:event_txtPassword2ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtdgreenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdgreenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdgreenameActionPerformed

    private void CboxdgreetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxdgreetypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxdgreetypeActionPerformed

    private void txtfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfacultyActionPerformed

    private void txtuninameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuninameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuninameActionPerformed

    private void txtcuntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcuntryActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(true);
        tab_3_2.setEnabled(true);
        jPanel6.setEnabled(false);

        txtuniname.setText("");
        txtcuntry.setText("");
        txtdgreename.setText("");
        txtdgreeid.setText("");
        txtfaculty.setText("");
        txtentryrequirements.setText("");
        txtprogrammeduration.setText("");
        txtprogrammeschedule.setText("");
        txtintakes.setText("");
        txtcoursefee.setText("");
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtcoursefeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoursefeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoursefeeActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(true);
        tab3.setEnabled(true);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
        jPanel6.setEnabled(false);

        txtuniname.setText("");
        txtcuntry.setText("");
        txtdgreename.setText("");
        txtdgreeid.setText("");
        txtfaculty.setText("");
        txtentryrequirements.setText("");
        txtprogrammeduration.setText("");
        txtprogrammeschedule.setText("");
        txtintakes.setText("");
        txtcoursefee.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String name = searchMCtxt.getText();

        if (name.equals("")) {

            list2 = objAdminController.GetManagecoursesAdmin("");

            System.out.println(list2);

            // bind data into JTable
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Degree Type");
            model.addColumn("Uni Name");
            model.addColumn("Cuntry");
            model.addColumn("Degree Name");
            model.addColumn("Degree ID");
            model.addColumn("Faculty");
            model.addColumn("Entry Reqirements");
            model.addColumn("Programme Duration");
            model.addColumn("Programme Shedule");
            model.addColumn("Inake");
            model.addColumn("Course Fee");

//        System.out.println(list);
            for (int i = 0; i < list2.size(); i++) {

                // Create the first row
                Object[] rowData = new Object[]{
                    list2.get(i).getdegreetype(),
                    list2.get(i).getuniname(),
                    list2.get(i).getcuntry(),
                    list2.get(i).getdegreename(),
                    list2.get(i).getdegreeid(),
                    list2.get(i).getfaculty(),
                    list2.get(i).getentryreqirements(),
                    list2.get(i).getprogrammeduration(),
                    list2.get(i).getprogrammeschedule(),
                    list2.get(i).getintake(),
                    list2.get(i).getcoursefee()

                };

                model.insertRow(0, rowData);
            }

            tabalemanagecourses.setModel(model);

        } else {
            list2 = objAdminController.searchManagecoursesAdmin(name);

            System.out.println(list2);

            // bind data into JTable
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Degree Type");
            model.addColumn("Uni Name");
            model.addColumn("Cuntry");
            model.addColumn("Degree Name");
            model.addColumn("Degree ID");
            model.addColumn("Faculty");
            model.addColumn("Entry Reqirements");
            model.addColumn("Programme Duration");
            model.addColumn("Programme Shedule");
            model.addColumn("Inake");
            model.addColumn("Course Fee");

//        System.out.println(list);
            for (int i = 0; i < list2.size(); i++) {

                // Create the first row
                Object[] rowData = new Object[]{
                    list2.get(i).getdegreetype(),
                    list2.get(i).getuniname(),
                    list2.get(i).getcuntry(),
                    list2.get(i).getdegreename(),
                    list2.get(i).getdegreeid(),
                    list2.get(i).getfaculty(),
                    list2.get(i).getentryreqirements(),
                    list2.get(i).getprogrammeduration(),
                    list2.get(i).getprogrammeschedule(),
                    list2.get(i).getintake(),
                    list2.get(i).getcoursefee()

                };

                model.insertRow(0, rowData);
            }

            tabalemanagecourses.setModel(model);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Delete this Course ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == 0) {

            String degreetype = (String) Cboxdgreetype.getSelectedItem();
            String uniname = txtuniname.getText();
            String cuntry = txtcuntry.getText();
            String degreename = txtdgreename.getText();
            String degreeid = txtdgreeid.getText();
            String faculty = txtfaculty.getText();
            String entryreqirements = txtentryrequirements.getText();
            String programmeduration = txtprogrammeduration.getText();
            String programmeschedule = txtprogrammeschedule.getText();
            String intake = txtintakes.getText();
            String coursefee = txtcoursefee.getText();

            objAdmin = objAdminController.addAdmin();

            arrayAdmins[index] = objAdmin;
            objManagecoursesAdmin = objAdminController.addManagecoursesAdmin(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);

            boolean result = objAdminController.deleteManagecoursesAdminToDB(objManagecoursesAdmin);

            System.out.println(result);

            txtuniname.setText("");
            txtcuntry.setText("");
            txtdgreename.setText("");
            txtdgreeid.setText("");
            txtfaculty.setText("");
            txtentryrequirements.setText("");
            txtprogrammeduration.setText("");
            txtprogrammeschedule.setText("");
            txtintakes.setText("");
            txtcoursefee.setText("");

            PopulateManagecoursesAdminList(); //this is the method to call the table details
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tab_3_2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tab_3_2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_3_2AncestorAdded
    private int xMouse, yMouse;
    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel7MouseDragged

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsersMouseClicked
        int row = tableUsers.getSelectedRow();
        String tc = tableUsers.getModel().getValueAt(row, 1).toString();

        try {

            System.out.println(tc);

            String searchText = tc;
            boolean isFound = false;
            for (Admin.Adduser r : list) {
                if (r.getuserid().contains(searchText)) {
                    isFound = true;

                    CobUsertype.setSelectedItem(r.getusertype());
                    txtUserId.setText(r.getuserid());
                    txtName.setText(r.getname());
                    txtPhoneNumber.setText(r.getphoneNo());
                    txtAddress.setText(r.getaddress());
                    txtPassword1.setText(r.getpassword());
                    txtPassword2.setText(r.getreenterpassword());
                    txtEmail.setText(r.getemail());

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_tableUsersMouseClicked

    private void BtnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUpdateMouseClicked

    }//GEN-LAST:event_BtnUpdateMouseClicked

    private void BtdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtdeleteMouseClicked


    }//GEN-LAST:event_BtdeleteMouseClicked

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased

    }//GEN-LAST:event_txtsearchKeyReleased

    private void BtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtsearchActionPerformed
        String name = txtsearch.getText();

        if (name.equals("")) {

            list = objAdminController.GetAddUsers("");

            System.out.println(list);

            // bind data into JTable
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Type");
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Phone");
            model.addColumn("address");
            model.addColumn("Password");
            model.addColumn("Reenterpassword");
            model.addColumn("Email");

//        System.out.println(list);
            for (int i = 0; i < list.size(); i++) {

                // Create the first row
                Object[] rowData = new Object[]{
                    list.get(i).getusertype(),
                    list.get(i).getuserid(),
                    list.get(i).getname(),
                    list.get(i).getphoneNo(),
                    list.get(i).getaddress(),
                    list.get(i).getpassword(),
                    list.get(i).getreenterpassword(),
                    list.get(i).getemail()

                };

                model.insertRow(0, rowData);
            }

            tableUsers.setModel(model);

        } else {
            list = objAdminController.searchAddUsers(name);

            System.out.println(list);

            // bind data into JTable
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Type");
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Phone");
            model.addColumn("address");
            model.addColumn("Password");
            model.addColumn("Reenterpassword");
            model.addColumn("Email");

//        System.out.println(list);
            for (int i = 0; i < list.size(); i++) {

                // Create the first row
                Object[] rowData = new Object[]{
                    list.get(i).getusertype(),
                    list.get(i).getuserid(),
                    list.get(i).getname(),
                    list.get(i).getphoneNo(),
                    list.get(i).getaddress(),
                    list.get(i).getpassword(),
                    list.get(i).getreenterpassword(),
                    list.get(i).getemail()

                };

                model.insertRow(0, rowData);
            }

            tableUsers.setModel(model);
        }


    }//GEN-LAST:event_BtsearchActionPerformed

    private void BtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtsearchMouseClicked

    }//GEN-LAST:event_BtsearchMouseClicked

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked

    }//GEN-LAST:event_txtsearchMouseClicked

    private void btnAdduserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdduserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdduserMouseClicked

    private void tableUsersAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableUsersAncestorAdded
        // TODO add your handling code here:


    }//GEN-LAST:event_tableUsersAncestorAdded

    private void Btsearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btsearch1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btsearch1MouseClicked

    private void Btsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btsearch1ActionPerformed
        txtUserId.setText("");
        txtPassword1.setText("");
        txtPassword2.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
    }//GEN-LAST:event_Btsearch1ActionPerformed

    private void txtsearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusGained
//        if (txtsearch.getText().equals("Eneter ID or Name")) {
//            txtsearch.setText("");
//            txtsearch.setForeground(new Color(0, 0, 0));
//        }
    }//GEN-LAST:event_txtsearchFocusGained

    private void txtsearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusLost
//        if (txtsearch.getText().equals("")) {
//            txtsearch.setText("Eneter ID or Name");
//            txtsearch.setForeground(new Color(153, 153, 153));
//        }
    }//GEN-LAST:event_txtsearchFocusLost

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(true);
        tab3.setEnabled(true);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
        jPanel6.setEnabled(false);
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (txtuniname.getText().length() <= 0 || txtcuntry.getText().length() <= 0 || txtdgreename.getText().length() <= 0 || txtdgreeid.getText().length() <= 0 || txtfaculty.getText().length() <= 0
                || txtentryrequirements.getText().length() <= 0 || txtprogrammeduration.getText().length() <= 0 || txtcoursefee.getText().length() <= 0) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Empty Text Field, Please fill all");
        } else {
            try {
                String degreetype = (String) Cboxdgreetype.getSelectedItem();
                String uniname = txtuniname.getText();
                String cuntry = txtcuntry.getText();
                String degreename = txtdgreename.getText();
                String degreeid = txtdgreeid.getText();
                String faculty = txtfaculty.getText();
                String entryreqirements = txtentryrequirements.getText();
                String programmeduration = txtprogrammeduration.getText();
                String programmeschedule = txtprogrammeschedule.getText();
                String intake = txtintakes.getText();
                String coursefee = txtcoursefee.getText();

                objAdmin = objAdminController.addAdmin();

                arrayAdmins[index] = objAdmin;
                objManagecoursesAdmin = objAdminController.addManagecoursesAdmin(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);

                boolean result = objAdminController.insertManagecoursesAdminToDB(objManagecoursesAdmin);

                arrayManagecoursesAdmin[index] = objManagecoursesAdmin;

                index++;
                if (result) {
                    JOptionPane.showMessageDialog(rootPane, "Coursee details have been added to database succesful " + index, "Output", 1);
                    txtuniname.setText("");
                    txtcuntry.setText("");
                    txtdgreename.setText("");
                    txtdgreeid.setText("");
                    txtfaculty.setText("");
                    txtentryrequirements.setText("");
                    txtprogrammeduration.setText("");
                    txtprogrammeschedule.setText("");
                    txtintakes.setText("");
                    txtcoursefee.setText("");

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Coursee details have not been added to database succesful " + index, "Output", 1);
                }
            } catch (Throwable ex) {
                System.out.println(ex.getMessage());
            }
        }
        PopulateManagecoursesAdminList();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Update this Course ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == 0) {

            String degreetype = (String) Cboxdgreetype.getSelectedItem();
            String uniname = txtuniname.getText();
            String cuntry = txtcuntry.getText();
            String degreename = txtdgreename.getText();
            String degreeid = txtdgreeid.getText();
            String faculty = txtfaculty.getText();
            String entryreqirements = txtentryrequirements.getText();
            String programmeduration = txtprogrammeduration.getText();
            String programmeschedule = txtprogrammeschedule.getText();
            String intake = txtintakes.getText();
            String coursefee = txtcoursefee.getText();

            objAdmin = objAdminController.addAdmin();

            arrayAdmins[index] = objAdmin;
            objManagecoursesAdmin = objAdminController.addManagecoursesAdmin(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);

            boolean result = objAdminController.updateManagecoursesAdminToDB(objManagecoursesAdmin);
            System.out.println(result);

            index++;
            if (result) {
                JOptionPane.showMessageDialog(rootPane, "Coursee details have been updated to database succesful " + index, "Output", 1);
                txtuniname.setText("");
                txtcuntry.setText("");
                txtdgreename.setText("");
                txtdgreeid.setText("");
                txtfaculty.setText("");
                txtentryrequirements.setText("");
                txtprogrammeduration.setText("");
                txtprogrammeschedule.setText("");
                txtintakes.setText("");
                txtcoursefee.setText("");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Coursee details have not been updated to database succesful " + index, "Output", 1);
            }

            PopulateManagecoursesAdminList(); //this is the method to call the table details
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void txtdgreeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdgreeidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdgreeidActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(true);
        tab3.setEnabled(true);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
        jPanel6.setEnabled(false);
    }//GEN-LAST:event_jButton14MouseClicked

    private void tabalemanagecoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabalemanagecoursesMouseClicked
        int row = tabalemanagecourses.getSelectedRow();
        String tc = tabalemanagecourses.getModel().getValueAt(row, 4).toString();

        try {

            System.out.println(tc);

            String searchText = tc;
            boolean isFound = false;
            for (Admin.ManagecoursesAdmin r : list2) {
                if (r.getdegreeid().contains(searchText)) {
                    isFound = true;

                    Cboxdgreetype.setSelectedItem(r.getdegreetype());
                    txtuniname.setText(r.getuniname());
                    txtcuntry.setText(r.getcuntry());
                    txtdgreename.setText(r.getdegreename());
                    txtdgreeid.setText(r.getdegreeid());
                    txtfaculty.setText(r.getfaculty());
                    txtentryrequirements.setText(r.getentryreqirements());
                    txtprogrammeduration.setText(r.getprogrammeduration());
                    txtprogrammeschedule.setText(r.getprogrammeschedule());
                    txtintakes.setText(r.getintake());
                    txtcoursefee.setText(r.getcoursefee());

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tabalemanagecoursesMouseClicked

    private void tblallissuesADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblallissuesADMouseClicked
         int row = tblallissuesAD.getSelectedRow();
        String tc = tblallissuesAD.getModel().getValueAt(row, 0).toString();

        try {

            System.out.println(tc);

            String searchText = tc;
            boolean isFound = false;
            for (Employer.AllissuesEmployer r : list3) {
                if (r.getissueid().contains(searchText)) {
                    isFound = true;

                    txtissueID.setText(r.getissueid());
                    txtissuetype.setText(r.getissuetype());
                    txtStudentID.setText(r.getname());
                    txtEmployerID.setText(r.getitnumber());
                    txtDetails.setText(r.getdetails());
                    txtComment.setText(r.getcomment());
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblallissuesADMouseClicked

    private void TBComAllIssuesADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBComAllIssuesADMouseClicked
        int row = TBComAllIssuesAD.getSelectedRow();
        String tc = TBComAllIssuesAD.getModel().getValueAt(row, 0).toString();

        try {

            System.out.println(tc);

            String searchText = tc;
            boolean isFound = false;
            for (Employer.AllissuesEmployer r : list4) {
                if (r.getissueid().contains(searchText)) {
                    isFound = true;

                    txtissueID1.setText(r.getissueid());
                    txtissuetype1.setText(r.getissuetype());
                    txtStudentID1.setText(r.getname());
                    txtEmployerID1.setText(r.getitnumber());
                    txtDetails1.setText(r.getdetails());
                    txtComment1.setText(r.getcomment());
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_TBComAllIssuesADMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        PopulateCompletedAllissuesAdminList();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        PopulateAllissuesEmployerList();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jPanel6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel6AncestorAdded

    }//GEN-LAST:event_jPanel6AncestorAdded

    //set and reset color
    void setColor(JPanel panel) {
        panel.setBackground(new Color(58, 70, 90));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(36, 47, 65));
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btdelete;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton Btsearch;
    private javax.swing.JButton Btsearch1;
    private javax.swing.JComboBox<String> Cboxdgreetype;
    private javax.swing.JComboBox<String> CobUsertype;
    private javax.swing.JTable TBComAllIssuesAD;
    private javax.swing.JLabel alldetails;
    private javax.swing.JLabel alldetails1;
    private javax.swing.JLabel alldetails2;
    private javax.swing.JLabel alldetails3;
    private javax.swing.JLabel allemail;
    private javax.swing.JLabel allemail1;
    private javax.swing.JLabel allemail10;
    private javax.swing.JLabel allemail11;
    private javax.swing.JLabel allemail12;
    private javax.swing.JLabel allemail13;
    private javax.swing.JLabel allemail14;
    private javax.swing.JLabel allemail15;
    private javax.swing.JLabel allemail16;
    private javax.swing.JLabel allemail17;
    private javax.swing.JLabel allemail2;
    private javax.swing.JLabel allemail3;
    private javax.swing.JLabel allemail4;
    private javax.swing.JLabel allemail5;
    private javax.swing.JLabel allemail6;
    private javax.swing.JLabel allemail7;
    private javax.swing.JLabel allemail8;
    private javax.swing.JLabel allemail9;
    private javax.swing.JButton btnAdduser;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_6;
    private javax.swing.JLabel btn_CD;
    private javax.swing.JLabel btn_ERI;
    private javax.swing.JLabel btn_EXIG;
    private javax.swing.JLabel btn_EXIG1;
    private javax.swing.JLabel btn_help;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_6;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField searchMCtxt;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    private javax.swing.JPanel tab6;
    private javax.swing.JPanel tab_3_2;
    private javax.swing.JTable tabalemanagecourses;
    private javax.swing.JTable tableUsers;
    private javax.swing.JTable tblallissuesAD;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextArea txtComment1;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextArea txtDetails1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtEmployerID;
    private javax.swing.JLabel txtEmployerID1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtPassword2;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JLabel txtStudentID;
    private javax.swing.JLabel txtStudentID1;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtcoursefee;
    private javax.swing.JTextField txtcuntry;
    private javax.swing.JTextField txtdgreeid;
    private javax.swing.JTextField txtdgreename;
    private javax.swing.JTextArea txtentryrequirements;
    private javax.swing.JTextField txtfaculty;
    private javax.swing.JTextArea txtintakes;
    private javax.swing.JLabel txtissueID;
    private javax.swing.JLabel txtissueID1;
    private javax.swing.JLabel txtissuetype;
    private javax.swing.JLabel txtissuetype1;
    private javax.swing.JTextArea txtprogrammeduration;
    private javax.swing.JTextArea txtprogrammeschedule;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtuniname;
    // End of variables declaration//GEN-END:variables
}

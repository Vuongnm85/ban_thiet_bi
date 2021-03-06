/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.QuanLyThongKeController;
import DAO.DonHangDAO;
import DAO.ThongKeDAO;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Vu Hoang Phuc
 */
public class ThongKeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPnael
     */
    public ThongKeJPanel() {
        initComponents();
        fillComboBoxNamKhachHang();
        fillTableKhachHang();
        fillComboBoxNamDoanhThu();
        fillTableThongKeDoanhThu();
        fillComboBoxNamLuongSPBanDuoc();
        fillTableLuongSPBanDuoc();
        QuanLyThongKeController controller = new QuanLyThongKeController();
        controller.setDateToChart(pnlView1, (Integer) cboNamKhachHang.getSelectedItem());
        controller.setDateToChart1(pnlView2, (Integer) cboNamKhachHang.getSelectedItem());
        controller.setChartLuongSanPham(pnlViewLuongSanPham, (Integer) cboNamSPBanDuoc.getSelectedItem());
        CanChinhTableLSP();
        
        JTableHeader header1 = tblDoanhThu.getTableHeader();
        header1.setBackground(Color.cyan);
        header1.setForeground(Color.black);
        header1.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        JTableHeader header2 = tblKhachHang.getTableHeader();
        header2.setBackground(Color.cyan);
        header2.setForeground(Color.black);
        header2.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        JTableHeader header3 = tblLuongSPBanDuoc.getTableHeader();
        header3.setBackground(Color.cyan);
        header3.setForeground(Color.black);
        header3.setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new keeptoo.KGradientPanel();
        jPanel7 = new javax.swing.JPanel();
        cboNamKhachHang = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        pnlView1 = new javax.swing.JPanel();
        pnlView2 = new javax.swing.JPanel();
        jPanel2 = new keeptoo.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        cboNamDoanhThu = new javax.swing.JComboBox<>();
        jPanel5 = new keeptoo.KGradientPanel();
        cboNamSPBanDuoc = new javax.swing.JComboBox<>();
        pnlViewLuongSanPham = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLuongSPBanDuoc = new javax.swing.JTable();

        jTabbedPane1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jPanel3.setLayout(null);

        jPanel7.setOpaque(false);

        cboNamKhachHang.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        cboNamKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N??m" }));
        cboNamKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamKhachHangActionPerformed(evt);
            }
        });

        tblKhachHang.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "TH??NG", "L?????NG KH??CH"
            }
        ));
        jScrollPane3.setViewportView(tblKhachHang);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboNamKhachHang, 0, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboNamKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7);
        jPanel7.setBounds(6, 5, 292, 507);

        pnlView1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlView1.setOpaque(false);

        javax.swing.GroupLayout pnlView1Layout = new javax.swing.GroupLayout(pnlView1);
        pnlView1.setLayout(pnlView1Layout);
        pnlView1Layout.setHorizontalGroup(
            pnlView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        pnlView1Layout.setVerticalGroup(
            pnlView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jPanel3.add(pnlView1);
        pnlView1.setBounds(316, 286, 553, 275);

        pnlView2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlView2.setOpaque(false);

        javax.swing.GroupLayout pnlView2Layout = new javax.swing.GroupLayout(pnlView2);
        pnlView2.setLayout(pnlView2Layout);
        pnlView2Layout.setHorizontalGroup(
            pnlView2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        pnlView2Layout.setVerticalGroup(
            pnlView2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jPanel3.add(pnlView2);
        pnlView2.setBounds(316, 5, 553, 275);

        jTabbedPane1.addTab("Kha??ch ha??ng", jPanel3);

        jScrollPane2.setOpaque(false);

        tblDoanhThu.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MADH", "L?????ng SP", "L?????ng kh??ch", "T???ng ti???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDoanhThu);

        cboNamDoanhThu.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        cboNamDoanhThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N??m" }));
        cboNamDoanhThu.setOpaque(false);
        cboNamDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamDoanhThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboNamDoanhThu, 0, 859, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cboNamDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Doanh thu", jPanel2);

        jPanel5.setLayout(null);

        cboNamSPBanDuoc.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        cboNamSPBanDuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNamSPBanDuoc.setOpaque(false);
        cboNamSPBanDuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamSPBanDuocActionPerformed(evt);
            }
        });
        jPanel5.add(cboNamSPBanDuoc);
        cboNamSPBanDuoc.setBounds(10, 15, 859, 30);

        pnlViewLuongSanPham.setOpaque(false);

        javax.swing.GroupLayout pnlViewLuongSanPhamLayout = new javax.swing.GroupLayout(pnlViewLuongSanPham);
        pnlViewLuongSanPham.setLayout(pnlViewLuongSanPhamLayout);
        pnlViewLuongSanPhamLayout.setHorizontalGroup(
            pnlViewLuongSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlViewLuongSanPhamLayout.setVerticalGroup(
            pnlViewLuongSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jPanel5.add(pnlViewLuongSanPham);
        pnlViewLuongSanPham.setBounds(10, 204, 859, 369);

        jScrollPane4.setOpaque(false);

        tblLuongSPBanDuoc.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        tblLuongSPBanDuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "T??n s???n ph???m", "S??? l?????ng", "Doanh thu", "S??? l?????ng kh??ch"
            }
        ));
        jScrollPane4.setViewportView(tblLuongSPBanDuoc);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(10, 51, 859, 147);

        jTabbedPane1.addTab("L??????ng sa??n ph????m", jPanel5);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboNamKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamKhachHangActionPerformed
        // TODO add your handling code here:
        fillTableKhachHang();
        QuanLyThongKeController controller = new QuanLyThongKeController();
        controller.setDateToChart(pnlView1, (Integer) cboNamKhachHang.getSelectedItem());
        controller.setDateToChart1(pnlView2, (Integer) cboNamKhachHang.getSelectedItem());
    }//GEN-LAST:event_cboNamKhachHangActionPerformed

    private void cboNamDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamDoanhThuActionPerformed
        // TODO add your handling code here:
        fillTableThongKeDoanhThu();
    }//GEN-LAST:event_cboNamDoanhThuActionPerformed

    private void cboNamSPBanDuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamSPBanDuocActionPerformed
        // TODO add your handling code here:
        fillTableLuongSPBanDuoc();
        QuanLyThongKeController controller = new QuanLyThongKeController();
        controller.setChartLuongSanPham(pnlViewLuongSanPham, (Integer) cboNamSPBanDuoc.getSelectedItem());
    }//GEN-LAST:event_cboNamSPBanDuocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNamDoanhThu;
    private javax.swing.JComboBox<String> cboNamKhachHang;
    private javax.swing.JComboBox<String> cboNamSPBanDuoc;
    private keeptoo.KGradientPanel jPanel2;
    private keeptoo.KGradientPanel jPanel3;
    private keeptoo.KGradientPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel pnlView1;
    private javax.swing.JPanel pnlView2;
    private javax.swing.JPanel pnlViewLuongSanPham;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTable tblLuongSPBanDuoc;
    // End of variables declaration//GEN-END:variables

    ThongKeDAO dao = new ThongKeDAO();
    DonHangDAO dhdao = new DonHangDAO();

    void fillComboBoxNamKhachHang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNamKhachHang.getModel();
        model.removeAllElements();
        List<Integer> list = dhdao.selectYears();
        for (Integer year : list) {
            model.addElement(year);
        }
    }

    void fillComboBoxNamDoanhThu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNamDoanhThu.getModel();
        model.removeAllElements();
        List<Integer> list = dhdao.selectYears();
        for (Integer year : list) {
            model.addElement(year);
        }
    }

    void fillComboBoxNamLuongSPBanDuoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNamSPBanDuoc.getModel();
        model.removeAllElements();
        List<Integer> list = dhdao.selectYears();
        for (Integer year : list) {
            model.addElement(year);
        }
    }

    void fillTableKhachHang() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getKhachHang((Integer) cboNamKhachHang.getSelectedItem());
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    void fillTableThongKeDoanhThu() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getThongKeDoanhThu((Integer) cboNamDoanhThu.getSelectedItem());
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    void fillTableLuongSPBanDuoc() {
        DefaultTableModel model = (DefaultTableModel) tblLuongSPBanDuoc.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getLuongSPBanDuoc((Integer) cboNamSPBanDuoc.getSelectedItem());
        for (Object[] row : list) {
            model.addRow(row);
        }
    }
    
    void CanChinhTableLSP() {
        tblLuongSPBanDuoc.setAutoResizeMode(tblLuongSPBanDuoc.AUTO_RESIZE_OFF);
        tblLuongSPBanDuoc.getColumnModel().getColumn(0).setPreferredWidth(550);
        tblLuongSPBanDuoc.getColumnModel().getColumn(1).setPreferredWidth(70);
        tblLuongSPBanDuoc.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblLuongSPBanDuoc.getColumnModel().getColumn(3).setPreferredWidth(120);
        
    }
    
 

}

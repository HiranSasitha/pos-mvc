/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.contoller.CustomerContoller;
import pos.mvc.model.CustomerModel;

/**
 *
 * @author Hiran
 */
public class CustomerView extends javax.swing.JFrame {
    
    CustomerContoller customerContoller;
    
    

    /**
     * Creates new form customerView
     */
    public CustomerView() {
        customerContoller = new CustomerContoller();
        initComponents();
        loadAllCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        custidLabel = new javax.swing.JLabel();
        custidText = new javax.swing.JTextField();
        custtitleLabel1 = new javax.swing.JLabel();
        custtitleText = new javax.swing.JTextField();
        custnameLabel = new javax.swing.JLabel();
        custnameText = new javax.swing.JTextField();
        custdobLabel = new javax.swing.JLabel();
        custdobText = new javax.swing.JTextField();
        custaddressLabel = new javax.swing.JLabel();
        custaddressText = new javax.swing.JTextField();
        custcityText = new javax.swing.JTextField();
        custcityLabel = new javax.swing.JLabel();
        custprovinceText = new javax.swing.JTextField();
        custprovinceLabel = new javax.swing.JLabel();
        custpostcodeText = new javax.swing.JTextField();
        custpostcodeLabel = new javax.swing.JLabel();
        addbotton = new javax.swing.JButton();
        deletebotton = new javax.swing.JButton();
        updatebotton = new javax.swing.JButton();
        custSalaryLabel = new javax.swing.JLabel();
        custSalaryText = new javax.swing.JTextField();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basePanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText(" Manage Customer");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        custidLabel.setText("Customer Id ");

        custtitleLabel1.setText("Customer Title ");

        custnameLabel.setText("Customer Name");

        custnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custnameTextActionPerformed(evt);
            }
        });

        custdobLabel.setText("Customer DOB");

        custaddressLabel.setText("Address");

        custcityLabel.setText("City");

        custprovinceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custprovinceTextActionPerformed(evt);
            }
        });

        custprovinceLabel.setText("Province");

        custpostcodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custpostcodeTextActionPerformed(evt);
            }
        });

        custpostcodeLabel.setText("Post Code");

        addbotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbotton.setText("Save customer");
        addbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbottonActionPerformed(evt);
            }
        });

        deletebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebotton.setText("Delete customer");
        deletebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebottonActionPerformed(evt);
            }
        });

        updatebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatebotton.setText("Update customer");
        updatebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebottonActionPerformed(evt);
            }
        });

        custSalaryLabel.setText("Salary");

        custSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSalaryTextActionPerformed(evt);
            }
        });

        customerTable.setBackground(new java.awt.Color(204, 204, 255));
        customerTable.setBorder(new javax.swing.border.MatteBorder(null));
        customerTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerTable.setForeground(new java.awt.Color(0, 0, 0));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deletebotton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatebotton)
                        .addGap(12, 12, 12)
                        .addComponent(addbotton)
                        .addGap(86, 86, 86))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(custdobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(custaddressLabel)
                                .addComponent(custcityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(custpostcodeLabel)
                            .addComponent(custtitleLabel1)
                            .addComponent(custidLabel))
                        .addGap(18, 18, 18)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custpostcodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custcityText, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custaddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custdobText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custtitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custidText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custprovinceLabel)
                                    .addComponent(custSalaryLabel))
                                .addGap(73, 73, 73)
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custprovinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addComponent(custnameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(custnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(160, 160, 160))
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(custidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(custnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custnameText))
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addComponent(custtitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custdobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custaddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custcityLabel)
                            .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(custprovinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custprovinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(custSalaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(custpostcodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(custidText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(custtitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(custdobText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custaddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custcityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(custpostcodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbotton)
                    .addComponent(deletebotton)
                    .addComponent(updatebotton))
                .addGap(18, 18, 18)
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnBack)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void custSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custSalaryTextActionPerformed

    private void addbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbottonActionPerformed
        // TODO add your handling code here:
        saveCustomer();
    }//GEN-LAST:event_addbottonActionPerformed

    private void custpostcodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custpostcodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custpostcodeTextActionPerformed

    private void custprovinceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custprovinceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custprovinceTextActionPerformed

    private void custnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custnameTextActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        searchCustomer();
    }//GEN-LAST:event_customerTableMouseClicked

    private void updatebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebottonActionPerformed
        // TODO add your handling code here:
        updateCustomer();
    }//GEN-LAST:event_updatebottonActionPerformed

    private void deletebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebottonActionPerformed
        // TODO add your handling code here:
         deletCustomer();
    }//GEN-LAST:event_deletebottonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainView().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbotton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel custSalaryLabel;
    private javax.swing.JTextField custSalaryText;
    private javax.swing.JLabel custaddressLabel;
    private javax.swing.JTextField custaddressText;
    private javax.swing.JLabel custcityLabel;
    private javax.swing.JTextField custcityText;
    private javax.swing.JLabel custdobLabel;
    private javax.swing.JTextField custdobText;
    private javax.swing.JLabel custidLabel;
    private javax.swing.JTextField custidText;
    private javax.swing.JLabel custnameLabel;
    private javax.swing.JTextField custnameText;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel custpostcodeLabel;
    private javax.swing.JTextField custpostcodeText;
    private javax.swing.JLabel custprovinceLabel;
    private javax.swing.JTextField custprovinceText;
    private javax.swing.JLabel custtitleLabel1;
    private javax.swing.JTextField custtitleText;
    private javax.swing.JButton deletebotton;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JButton updatebotton;
    // End of variables declaration//GEN-END:variables

    private void saveCustomer(){
        
     CustomerModel customer = new CustomerModel(
             custidText.getText(),
              custtitleText.getText(),
              custdobText.getText(),
             custnameText.getText(),
             Double.parseDouble(custSalaryText.getText()),
             custaddressText.getText(),
             custcityText.getText(),
             custprovinceText.getText(),
             custpostcodeText.getText());
        System.out.println("Customer"+customer.toString());
        
        try {
            String resp = customerContoller.saveCustomer(customer);
              JOptionPane.showMessageDialog(this, resp);
              clear();
              loadAllCustomers();
              
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        
        
        
        
    }
       
    
}
     private void clear(){
            
            custidText.setText("");
            custtitleText.setText("");
            custnameText.setText("");
            custdobText.setText("");
            custSalaryText.setText("");
            custaddressText.setText("");
            custcityText.setText("");
            custprovinceText.setText("");
            custpostcodeText.setText("");
                 
        }
     
     private void loadAllCustomers(){
         
        try {
            String [] columns = {"ID","Name","Address","salary","Post Code"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
                
            };
            
            customerTable.setModel(dtm);
            
            ArrayList<CustomerModel> customers = customerContoller.getAllCustomers();
            
            
            for (CustomerModel customer:customers) {
                Object[] rowData = {customer.getCustId(),customer.getTitle()+" "+customer.getNames(),customer.getAddress()+" "+customer.getCity(),customer.getSalary(),customer.getZip()};
                dtm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
         
     
     
     }
        
     }
     
     private void searchCustomer(){
     
        try {
            String custId =customerTable.getValueAt(customerTable.getSelectedRow(), 0).toString();
            CustomerModel customerModel = customerContoller.getCustomer(custId);
            
            if(customerModel != null){
            
              custidText.setText(customerModel.getCustId());
            custtitleText.setText(customerModel.getTitle());
            custnameText.setText(customerModel.getNames());
            custdobText.setText(customerModel.getDob());
            custSalaryText.setText(Double.toString(customerModel.getSalary()));
            custaddressText.setText(customerModel.getAddress());
            custcityText.setText(customerModel.getCity());
            custprovinceText.setText(customerModel.getProvince());
            custpostcodeText.setText(customerModel.getZip());
                 
            
            }else{
            
            
            JOptionPane.showMessageDialog(this,"Customer Not Found");
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex);
        }
     
     
     
     
     }
     
     private void updateCustomer(){
     
        try {
            CustomerModel customer = new CustomerModel(
                    custidText.getText(),
                    custtitleText.getText(),
                    custdobText.getText(),
                    custnameText.getText(),
                    Double.parseDouble(custSalaryText.getText()),
                    custaddressText.getText(),
                    custcityText.getText(),
                    custprovinceText.getText(),
                    custpostcodeText.getText());
            
            
           String resp = customerContoller.updateCustomer(customer);
             JOptionPane.showMessageDialog(this, resp);
              clear();
              loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
       
         JOptionPane.showMessageDialog(this, ex);
        }
        
        
     
     }
     
     
     private void  deletCustomer(){
     
        try {
            String custId = custidText.getText();
            
            String resp = customerContoller.deletCustomer(custId);
            JOptionPane.showMessageDialog(this, resp);
              clear();
              loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex);
        
        }
     
     
     }
     
}
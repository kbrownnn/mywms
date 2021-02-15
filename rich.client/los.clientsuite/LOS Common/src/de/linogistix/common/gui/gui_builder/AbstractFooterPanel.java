/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.common.gui.gui_builder;

import java.awt.event.MouseMotionListener;
import de.linogistix.common.gui.component.controls.FlatButton;
import de.linogistix.common.gui.object.IconType;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author  artur
 */
public abstract class AbstractFooterPanel extends javax.swing.JPanel {
    
    protected JButton clearButton;
    
    protected JButton okButton;
    
    public AbstractFooterPanel() {
        initComponents();
        
        initButtons();
    }

    @Override
    public void addMouseMotionListener(MouseMotionListener l) {
        super.addMouseMotionListener(l);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        centerPanel = new javax.swing.JPanel();
        eastPanel = new javax.swing.JPanel();

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        centerPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        add(centerPanel, java.awt.BorderLayout.CENTER);
        add(eastPanel, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
    
    }//GEN-LAST:event_formMouseMoved
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JPanel centerPanel;
    private javax.swing.JPanel eastPanel;
    // End of variables declaration//GEN-END:variables


    protected void okButtonActionPerformedListener(java.awt.event.ActionEvent evt) {   }
    
    protected void clearButtonActionPerformedListener(java.awt.event.ActionEvent evt) {   }
    
    protected javax.swing.JButton getClearButton() {
        return clearButton;
    }

    protected javax.swing.JButton getOkButton() {
        return okButton;
    }
    
    protected void initButtons(){
        
        for(JButton b:getButtonList()){
            centerPanel.add(b);
        }
    }
    
    public List<JButton> getButtonList(){
        
        okButton = new JButton();
        okButton.setText("null");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformedListener(evt);
            }
        });
        
        clearButton = new JButton();
        clearButton.setText("null");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformedListener(evt);
            }
        });
        
        List<JButton> buttonList = new ArrayList<JButton>();
        buttonList.add(okButton);
        buttonList.add(clearButton);
        
        return buttonList;
        
    }
    
    protected void setInfo(String msg){
//        infoLabel.setIcon(GraphicUtil.getInstance().getIcon(IconType.INFORMATION));
//        infoLabel.setText(msg);
    }
    
    protected void setWarning(String msg){
//        infoLabel.setIcon(GraphicUtil.getInstance().getIcon(IconType.WARNING));
//        infoLabel.setText(msg);
    }
    
    protected void setError(String msg){
//        infoLabel.setIcon(GraphicUtil.getInstance().getIcon(IconType.ERROR));
//        infoLabel.setText(msg);
    }
    
    
}

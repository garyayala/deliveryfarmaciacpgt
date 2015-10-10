/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacio.ui;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.javafx.BrowserView;
import java.awt.BorderLayout;
import javax.swing.WindowConstants;

/**
 *
 * @author Equipo
 */
public class UIRuta  extends javax.swing.JInternalFrame{

    public UIRuta() {
        initComponents();
    }
    
    public void initComponents(){
        Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);
        
        BorderLayout borderLayout = new BorderLayout();
        getContentPane().setLayout(borderLayout);
        
//        borderLayout.
//        add(browserView);

        browser.loadURL("http://maps.google.com");
    }
}

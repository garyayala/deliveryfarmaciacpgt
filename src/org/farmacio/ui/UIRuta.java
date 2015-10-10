/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.farmacio.ui;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserContext;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Equipo
 */
public class UIRuta  /*extends javax.swing.JInternalFrame*/{

    public UIRuta() {
        initComponents();
    }
    
    public void initComponents(){
        Browser browser = new Browser(BrowserContext.defaultContext());
        BrowserView browserView = new BrowserView(browser);
        
        
//        Browser browser = new Browser();
//        BrowserView browserView = new BrowserView(browser);

        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setVisible(true);
//        borderLayout.
//        add(browserView);

        browser.loadURL("http://maps.google.com");
    }
    
    public static void main(String[] args) {
        new UIRuta();
    }
}

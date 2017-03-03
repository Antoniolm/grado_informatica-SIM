// *********************************************************************
// **
// ** Copyright (C) 2017 Antonio David López Machado
// **
// ** This program is free software: you can redistribute it and/or modify
// ** it under the terms of the GNU General Public License as published by
// ** the Free Software Foundation, either version 3 of the License, or
// ** (at your option) any later version.
// **
// ** This program is distributed in the hope that it will be useful,
// ** but WITHOUT ANY WARRANTY; without even the implied warranty of
// ** MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// ** GNU General Public License for more details.
// **
// ** You should have received a copy of the GNU General Public License
// ** along with this program.  If not, see <http://www.gnu.org/licenses/>.
// **
// *********************************************************************
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class MainWindow extends javax.swing.JFrame {
    Canvas canvas;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        setMinimumSize(new Dimension(800,500));
        canvas=new Canvas();
        canvas.setBackground(Color.white);
        getContentPane().add(canvas, java.awt.BorderLayout.CENTER);
        
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        DrawPanel = new javax.swing.JPanel();
        PointButton = new javax.swing.JToggleButton();
        LineButton = new javax.swing.JToggleButton();
        RtgleButton = new javax.swing.JToggleButton();
        CircleButton = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        ColorPanel = new javax.swing.JPanel();
        BlackButton = new javax.swing.JButton();
        RedButton = new javax.swing.JButton();
        BlueButton = new javax.swing.JButton();
        WhiteButton = new javax.swing.JButton();
        YellowButton = new javax.swing.JButton();
        GreenButton = new javax.swing.JButton();
        FilledPanel = new javax.swing.JPanel();
        Filled = new javax.swing.JCheckBox();
        StateBarPanel = new javax.swing.JPanel();
        StateBarLabel = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        OpenMenu = new javax.swing.JMenuItem();
        LoadMenu = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        SeeSBMenu = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DrawEditor");

        jPanel1.setLayout(new java.awt.BorderLayout());

        buttonGroup1.add(PointButton);
        PointButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        PointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointButtonActionPerformed(evt);
            }
        });
        DrawPanel.add(PointButton);

        buttonGroup1.add(LineButton);
        LineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        LineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineButtonActionPerformed(evt);
            }
        });
        DrawPanel.add(LineButton);

        buttonGroup1.add(RtgleButton);
        RtgleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        RtgleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtgleButtonActionPerformed(evt);
            }
        });
        DrawPanel.add(RtgleButton);

        buttonGroup1.add(CircleButton);
        CircleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        CircleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleButtonActionPerformed(evt);
            }
        });
        DrawPanel.add(CircleButton);

        jPanel1.add(DrawPanel, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        ColorPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        ColorPanel.setMinimumSize(new java.awt.Dimension(237, 35));
        ColorPanel.setPreferredSize(new java.awt.Dimension(140, 70));
        ColorPanel.setRequestFocusEnabled(false);

        BlackButton.setBackground(new java.awt.Color(0, 0, 0));
        BlackButton.setText(" ");
        BlackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(BlackButton);

        RedButton.setBackground(new java.awt.Color(204, 0, 0));
        RedButton.setText(" ");
        RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(RedButton);

        BlueButton.setBackground(new java.awt.Color(0, 0, 204));
        BlueButton.setText(" ");
        BlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(BlueButton);

        WhiteButton.setBackground(new java.awt.Color(255, 255, 255));
        WhiteButton.setText(" ");
        WhiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhiteButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(WhiteButton);

        YellowButton.setBackground(new java.awt.Color(255, 255, 51));
        YellowButton.setText(" ");
        YellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(YellowButton);

        GreenButton.setBackground(new java.awt.Color(0, 204, 0));
        GreenButton.setText(" ");
        GreenButton.setToolTipText("");
        GreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(GreenButton);

        jPanel3.add(ColorPanel, java.awt.BorderLayout.WEST);

        FilledPanel.setLayout(new java.awt.BorderLayout());

        Filled.setText("Filled");
        Filled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilledActionPerformed(evt);
            }
        });
        FilledPanel.add(Filled, java.awt.BorderLayout.CENTER);

        jPanel3.add(FilledPanel, java.awt.BorderLayout.LINE_END);

        StateBarPanel.setLayout(new java.awt.BorderLayout());

        StateBarLabel.setText("State bar");
        StateBarLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        StateBarPanel.add(StateBarLabel, java.awt.BorderLayout.CENTER);

        jPanel3.add(StateBarPanel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        FileMenu.setText("File");

        newMenu.setText("New");
        FileMenu.add(newMenu);

        OpenMenu.setText("Open");
        OpenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuActionPerformed(evt);
            }
        });
        FileMenu.add(OpenMenu);

        LoadMenu.setText("Load");
        LoadMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadMenuActionPerformed(evt);
            }
        });
        FileMenu.add(LoadMenu);

        MenuBar.add(FileMenu);

        EditMenu.setText("Edit");

        SeeSBMenu.setSelected(true);
        SeeSBMenu.setText("See state bar");
        SeeSBMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeSBMenuActionPerformed(evt);
            }
        });
        EditMenu.add(SeeSBMenu);

        MenuBar.add(EditMenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeeSBMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeSBMenuActionPerformed
      StateBarPanel.setVisible(SeeSBMenu.isSelected());
    }//GEN-LAST:event_SeeSBMenuActionPerformed

    private void PointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointButtonActionPerformed
        StateBarLabel.setText("Point");
        canvas.setType(GeometryType.POINT);
    }//GEN-LAST:event_PointButtonActionPerformed

    private void LineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineButtonActionPerformed
        StateBarLabel.setText("Line");
        canvas.setType(GeometryType.LINE);
    }//GEN-LAST:event_LineButtonActionPerformed

    private void RtgleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtgleButtonActionPerformed
        StateBarLabel.setText("Rectangle");
        canvas.setType(GeometryType.RECTANGLE);
    }//GEN-LAST:event_RtgleButtonActionPerformed

    private void CircleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleButtonActionPerformed
        StateBarLabel.setText("Circle");
        canvas.setType(GeometryType.CIRCLE);
    }//GEN-LAST:event_CircleButtonActionPerformed

    private void OpenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
}

    }//GEN-LAST:event_OpenMenuActionPerformed

    private void LoadMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadMenuActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
 //Código
}

    }//GEN-LAST:event_LoadMenuActionPerformed

    private void FilledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilledActionPerformed
        canvas.setFilled(Filled.isSelected());
    }//GEN-LAST:event_FilledActionPerformed

    private void BlackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackButtonActionPerformed
        canvas.setColor(Color.BLACK);
    }//GEN-LAST:event_BlackButtonActionPerformed

    private void RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedButtonActionPerformed
        canvas.setColor(Color.RED);
    }//GEN-LAST:event_RedButtonActionPerformed

    private void BlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueButtonActionPerformed
        canvas.setColor(Color.BLUE);
    }//GEN-LAST:event_BlueButtonActionPerformed

    private void WhiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhiteButtonActionPerformed
        canvas.setColor(Color.WHITE);
    }//GEN-LAST:event_WhiteButtonActionPerformed

    private void YellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YellowButtonActionPerformed
        canvas.setColor(Color.YELLOW);
    }//GEN-LAST:event_YellowButtonActionPerformed

    private void GreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenButtonActionPerformed
        canvas.setColor(Color.GREEN);
    }//GEN-LAST:event_GreenButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlackButton;
    private javax.swing.JButton BlueButton;
    private javax.swing.JToggleButton CircleButton;
    private javax.swing.JPanel ColorPanel;
    private javax.swing.JPanel DrawPanel;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JCheckBox Filled;
    private javax.swing.JPanel FilledPanel;
    private javax.swing.JButton GreenButton;
    private javax.swing.JToggleButton LineButton;
    private javax.swing.JMenuItem LoadMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem OpenMenu;
    private javax.swing.JToggleButton PointButton;
    private javax.swing.JButton RedButton;
    private javax.swing.JToggleButton RtgleButton;
    private javax.swing.JCheckBoxMenuItem SeeSBMenu;
    private javax.swing.JLabel StateBarLabel;
    private javax.swing.JPanel StateBarPanel;
    private javax.swing.JButton WhiteButton;
    private javax.swing.JButton YellowButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem newMenu;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitários;

/**
 *
 * @author Mike
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicPanelUI;

public class PanelFormUICinza extends BasicPanelUI {

    private Color corInicial = new Color(241, 241, 241);
    private Color corFinal = new Color(235, 235, 235);

    @Override
    protected void installDefaults(JPanel p) {
        p.setOpaque(true);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2 = (Graphics2D) g;
        Dimension vSize = c.getSize();
        int h = vSize.height;
        int w = vSize.width;
        g2.fillRect(0, 0, w, h);
        g2.setPaint(new GradientPaint(0, 0, corInicial, 0, h, corFinal));
        g2.fillRect(3, 0, w - 4, h - 2);
    }
}

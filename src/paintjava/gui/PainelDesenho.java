package paintjava.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author vinicius
 */
public class PainelDesenho extends JPanel {

    private List<FormaGeometrica> formas;
    private FormaGeometrica formaTemporaria;

    public PainelDesenho() {
        formas = new ArrayList<>();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        if (formaTemporaria != null) {
            formaTemporaria.desenhar(g);
        }

        for (var forma : formas) {
            forma.desenhar(g);
        }

    }

    public void setFormaTemporaria(FormaGeometrica formaTemporaria) {
        this.formaTemporaria = formaTemporaria;
    }

    public void addFormas(FormaGeometrica formaGeometrica) {
        formas.add(formaGeometrica);

    }

}

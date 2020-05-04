/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Grzegorz Konopka
 */
public class CompoundFigure extends Figure {
    
    private List<Figure> elements;

    public CompoundFigure() {
        super(0, 0);
        this.elements = new ArrayList<Figure>();
    }
    
      public void add(Figure f) {
        this.elements.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure f: this.elements) {
            f.draw(graphics);
        }
    }
    
    @Override
      public void move(int dx, int dy) {
        for (Figure f : this.elements) {
            f.move(dx, dy);
        }
    }
}
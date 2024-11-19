package service;

import color.Color;
import shap.Shap;

/**
 *
 */
public class JiheService {

    private Color color;

    private Shap shap;

    public JiheService(Color color, Shap shap) {
        this.color = color;
        this.shap = shap;
    }

    public void draw()
    {
        color.draw();
        shap.draw();
    }
}

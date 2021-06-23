/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public class Rectangulo extends Cuadrilatero{

    public Rectangulo() {
    }
 int x1r,x2r,x3r,x4r,y1r,y2r,y3r,y4r;

    public Rectangulo(int x1r, int x2r, int x3r, int x4r, int y1r, int y2r, int y3r, int y4r) {
        this.x1r = x1r;
        this.x2r = x2r;
        this.x3r = x3r;
        this.x4r = x4r;
        this.y1r = y1r;
        this.y2r = y2r;
        this.y3r = y3r;
        this.y4r = y4r;
    }

    public Rectangulo(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, int x1r, int x2r, int x3r, int x4r, int y1r, int y2r, int y3r, int y4r) {
        super(x1, x2, x3, x4, y1, y2, y3, y4, x1r, x2r, x3r, x4r, y1r, y2r, y3r, y4r);
    }
    


    @Override
    public int getAreaTra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAreaRe() {
    int areacu= Math.abs(x1r*y2r)+(x2r*y3r)+(x3r*y4r)+(x4r*y1r);
        int resta=(y1r*x2r)+(y2r*x3r)+(y3r*x4r)+(y4r*x1r);
        int suma =(areacu-resta);
        return suma;
  
    }

    @Override
    public int getAreaCu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    }
    



   
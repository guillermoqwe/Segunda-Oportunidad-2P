/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public  class Trapecio extends Cuadrilatero {
    
      
     protected int x1t,x2t,x3t,x4t, y1t,y2t,y3t,y4t;
    
    
    public Trapecio() {
    }

    public Trapecio(int x1t, int x2t, int x3t, int x4t, int y1t, int y2t, int y3t, int y4t) {
        this.x1t = x1t;
        this.x2t = x2t;
        this.x3t = x3t;
        this.x4t = x4t;
        this.y1t = y1t;
        this.y2t = y2t;
        this.y3t = y3t;
        this.y4t = y4t;
    }

    public Trapecio(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, int x1r, int x2r, int x3r, int x4r, int y1r, int y2r, int y3r, int y4r) {
        super(x1, x2, x3, x4, y1, y2, y3, y4, x1r, x2r, x3r, x4r, y1r, y2r, y3r, y4r);
    }

   

    @Override
    public int getAreaTra() {
     int areacu= Math.abs(x1*y2)+(x2*y3)+(x3*y4)+(x4*y1);
        int resta=(y1*x2)+(y2*x3)+(y3*x4)+(y4*x1);
        int suma =(areacu-resta)/2;
        return suma;
    }

    @Override
    public int getAreaRe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAreaCu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    

}
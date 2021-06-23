/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public class Cuadrado  extends Cuadrilatero{
   private int x1,x2,x3,x4,y1,y2,y3,y4;

    public Cuadrado() {
    }

   

    public Cuadrado(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    public Cuadrado(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, int x1r, int x2r, int x3r, int x4r, int y1r, int y2r, int y3r, int y4r) {
        super(x1, x2, x3, x4, y1, y2, y3, y4, x1r, x2r, x3r, x4r, y1r, y2r, y3r, y4r);
    }
    
    
    @Override
    public int getAreaTra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAreaRe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAreaCu() {
        int areacu= (x1*y2)+(x2*y3)+(x3*y4)+(x4*y1);
        int resta=(y1*x2)+(y2*x3)+(y3*x4)+(y4*x1);
        int suma =(areacu-resta)/2;
        return suma;
                
        
    }

}
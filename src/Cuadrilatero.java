
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public abstract class Cuadrilatero implements Verices {

    public Cuadrilatero() {
    }
  protected  int x1,x2,x3,x4;
    protected int y1,y2,y3,y4;
   protected int x1r,x2r,x3r,x4r;
     protected int y1r,y2r,y3r,y4r;
     protected int x1t,x2t,x3t,x4t;
     protected int y1t,y2t,y3t,y4t;
    public Cuadrilatero(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, int x1r, int x2r, int x3r, int x4r, int y1r, int y2r, int y3r, int y4r) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
        this.x1r = x1r;
        this.x2r = x2r;
        this.x3r = x3r;
        this.x4r = x4r;
        this.y1r = y1r;
        this.y2r = y2r;
        this.y3r = y3r;
        this.y4r = y4r;
    }

    @Override
    public abstract int getAreaTra();

    @Override
    public abstract int getAreaRe();

    @Override
    public abstract int getAreaCu();
}
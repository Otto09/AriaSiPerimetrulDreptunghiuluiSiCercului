
/**
 * @author Goga Octavian
 */
public class Dreptunghi
{
    // instance variables
    private int x;
    private int y;
    private int a;
    private int b;
    
    /**
     * Constructor for objects of class Dreptunghi
     */
    public Dreptunghi()
    {
        // initialise instance variables
        x = y = a = b = 10;
    }
    
    public Dreptunghi(int aa, int bb, int xx, int yy)
    {
        a = aa;
        b = bb;
        x = xx;
        y = yy;
    }
    
    /**
     *
     * @param  dx
     * @param  dy
     * @return   x + dx and y + dy
     */
    public void translatez(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public int arie()
    {
        int sup;
        sup = a * b;
        return sup;
    }
    
    public int perimetru()
    {
        return 2 * (a + b);
    }
    
    public void mod_x(int dx)
    {
        x = dx;
    }
    
    public void mod_y(int dy)
    {
        y = dy;
    }
    
    public int da_x()
    {
        return x;
    }
    
    public int da_y()
    {
        return y;
    }
    
}


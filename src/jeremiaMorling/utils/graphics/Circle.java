package jeremiaMorling.utils.graphics;

import javax.microedition.lcdui.Graphics;

/**
 * Information about a Circle.
 *
 * @author Jeremia M�rling
 */
public class Circle {
    /**
     * The x value for the center of the circle.
     */
    public int x;

    /**
     * The y value for the center of the circle.
     */
    public int y;

    /**
     * The radius of the circle.
     */
    public int r;

    /**
     * Weather or not the circle should be painted thick.
     */
    public boolean thick = false;

    private static final int BLACK = Color.BLACK.getRGB();
    private static final int WHITE = Color.WHITE.getRGB();

    /**
     * Creates a Circle with x=0, y=0 and r=0.
     */
    public Circle() {
        this( 0, 0, 0 );
    }

    /**
     * Creates a circle with the specified x, y and r. thick is false by default.
     * @param x The x value for the center of the circle.
     * @param y The y value for the center of the circle.
     * @param r The radius for the circle.
     */
    public Circle( int x, int y, int r ) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    /**
     * Paints the circle according to its specified location, radius and thickness.
     * @param g The graphics object to paint on.
     */
    public void paint( Graphics g ) {
        g.setColor( BLACK );
        g.drawArc( x-r, y-r, 2*r, 2*r, 0, 360 );
        if( thick )
            g.drawArc( x-r+1, y-r+1, 2*(r-1), 2*(r-1), 0, 360 );
        g.setColor( WHITE );
        g.drawArc( x-r-1, y-r-1, 2*(r+1), 2*(r+1), 0, 360 );
    }
}

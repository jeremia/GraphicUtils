package jeremiaMorling.utils.graphics;

import javax.microedition.lcdui.Graphics;

/**
 * Information about a horizontal line.
 *
 * @author Jeremia M�rling
 */
public class HorizontalLine {
    /**
     * The x value for the left side of the line.
     */
    public int x;

    /**
     * The y value for the line.
     */
    public int y;

    /**
     * The width of the line.
     */
    public int width;

    /**
     * Weather or not the line should be painted thick.
     */
    public boolean thick = false;

    /**
     * Creates a HorizontalLine with x=0, y=0 and width=0.
     */
    public HorizontalLine() {
        this( 0, 0, 0 );
    }

    /**
     * Creates a HorizontalLine with the specified x, y and width. thick is false by default.
     * @param x The x value for the left side of the line.
     * @param y The y value for the line.
     * @param width The width of the line.
     */
    public HorizontalLine( int x, int y, int width ) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    /**
     * Paints the line.
     * @param g The graphics object to paint on.
     * @param rgb The color to paint the line in.
     */
    public void paint( Graphics g, int rgb ) {
        g.setColor( rgb );
        g.drawLine( x, y, x+width, y );
        if( thick )
            g.drawLine( x, y+1, x+width, y+1 );
    }
}

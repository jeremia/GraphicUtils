package jeremiaMorling.utils.graphics;

import javax.microedition.lcdui.Graphics;

/**
 * Information about a Rectangle.
 *
 * @author Jeremia M�rling
 */
public class Rectangle {
    /**
     * The x value for the upper left edge of the rectangle.
     */
    public int x;

    /**
     * The y value for the upper left edge of the rectangle.
     */
    public int y;

    /**
     * The width of the rectangle.
     */
    public int width;

    /**
     * The height of the rectangle.
     */
    public int height;

    private static final int BLACK = Color.BLACK.getRGB();

    /**
     * Crates a Rectangle with x=0, y=0, width=0 and height=0.
     */
    public Rectangle() {
        this( 0, 0, 0, 0 );
    }

    /**
     * Creates a Rectangle with the specified x, y, width and height.
     * @param x The x value for the upper left edge of the Rectangle.
     * @param y The y value for the upper left edge of the Rectangle.
     * @param width The width of the Rectangle.
     * @param height The height of the Rectangle.
     */
    public Rectangle( int x, int y, int width, int height ) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Paints the Rectangle in black.
     * @param g The Graphics object to paint on.
     */
    public void paint( Graphics g ) {
        g.setColor( BLACK );
        g.drawRect( x, y, width, height );
    }

    /**
     * Paint the Rectangle in the specified color.
     * @param g The Graphics object to paint on.
     * @param rgb The color to paint the Rectangle in.
     */
    public void paint( Graphics g, int rgb ) {
        g.setColor( rgb );
        g.fillRect( x, y, width, height );
    }
}

package jeremiaMorling.utils.graphics;

/**
 * Information about a Point.
 *
 * @author Jeremia M�rling
 */
public class Point {
    /**
     * The x value for the point.
     */
    public int x;

    /**
     * The y value for the point.
     */
    public int y;

    /**
     * Creates a Point with x=0 and y=0.
     */
    public Point() {
        this( 0, 0 );
    }

    /**
     * Creates a Point with the specified x and y.
     * @param x The x value for the Point.
     * @param y The y value for the Point.
     */
    public Point( int x, int y ) {
        this.x = x;
        this.y = y;
    }
}

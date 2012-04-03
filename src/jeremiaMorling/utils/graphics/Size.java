package jeremiaMorling.utils.graphics;

/**
 * Information about a Size.
 *
 * @author Jeremia M�rling
 */
public class Size {
    /**
     * The width of the Size.
     */
    public int width;

    /**
     * The height of the Size.
     */
    public int height;

    /**
     * Creates a Size with width=0 and height=0.
     */
    public Size() {
        this( 0, 0 );
    }

    /**
     * Creates a Size with the specified width and height.
     * @param width The width of the Size.
     * @param height The height of the Size.
     */
    public Size( int width, int height ) {
        this.width = width;
        this.height = height;
    }
}

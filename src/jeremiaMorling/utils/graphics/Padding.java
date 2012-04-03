package jeremiaMorling.utils.graphics;

public class Padding {
	public int left;
	public int right;
	public int top;
	public int bottom;
	
	public Padding() {
		this( 0, 0, 0, 0 );
	}
	
	public Padding( int left, int right, int top, int bottom ) {
		this.left = left;
		this.right = right;
		this.top = top;
		this.bottom = bottom;
	}
}

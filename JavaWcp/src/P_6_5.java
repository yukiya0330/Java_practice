
public class P_6_5 {

	public static void main( String[] args )
	{
	    DrawTriangle2( 3, '%' );
	    System.out.println();
	    DrawTriangle2( 5, '#' );
	    System.out.println();
	    DrawTriangle2( 7, '@' );
	}

	static void DrawTriangle2( int size, char ch )
	{
	    for( int i = 0 ; i < size ; i++ )
	    {
	        for( int j = 0 ; j <= i ; j++ )
	            System.out.print( ch );

	        System.out.println();
	    }
	}

}

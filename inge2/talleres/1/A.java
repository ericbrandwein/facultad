public class A {
    public static int main(String[] args) {
        int a=8;
        if(args.length>2)
        	a=5;

		int c=1;
		while (!(c>a)) {
			c = c+c;
		}
		a = c-a;
		c=0;
		return a + c;
    }

	public int exercise2( int a , int b ) {
 		int c = a+b ;
		int d = a-b ;
		int r ;
		if ( a<b ) {
			r=c;
		} else {
			r=d ;
		}
		return r ;
	}

	public int exercise3( Cell c1 , Cell c2 ) {
		c1.value =1;
		c2.value =2;
		return c1.value ;
	}


	private static class Cell {
		int value ;
	}

}



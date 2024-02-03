class mima
{
	public static void main(String args[])
	{
		public float a,b,c,d,e;
		a=(float)args[0];
		b=(float)args[1];
		c=(float)args[2];
		d=(float)args[3];
		e=(float)args[4];
		mino(a,b,c,d,e);
		maxo(a,b,c,d,e);		
	}
	public static void mino(float a,float b,float c,float d,float e)
	{
		if(a<b&&a<c&&a<d&&a<e)
		{
			System.out.println(a+"is lesser than everyone");	
		}
		else if(b<a&&b<c&&b<d&&b<e)
		{
			System.out.println(b+"is lesser than everyone");	
		}
		else if(c<a&&c<b&&c<d&&c<e)
		{
			System.out.println(c+"is lesser than everyone");	
		}else if(d<b&&d<c&&d<a&&d<e)
		{
			System.out.println(d+"is lesser than everyone");	
		}else if(e<b&&e<c&&e<d&&e<a)
		{
			System.out.println(e+"is lesser than everyone");	
		}
	}
	public static void maxo(float a,float b,float c,float d,float e)
	{
		if(a>b&&a>c&&a>d&&a>e)
		{
			System.out.println(a+"is great than everyone");	
		}
		else if(b>a&&b>c&&b>d&&b>e)
		{
			System.out.println(b+"is great than everyone");	
	
		else if(c>a&&c>b&&c>d&&c>e)
		{
			System.out.println(c+"is great than everyone");	
		}else if(d>b&&d>c&&d>a&&d>e)
		{
			System.out.println(d+"is great than everyone");	
		}else if(e>b&&e>c&&e>d&&e>a)
		{
			System.out.println(e+"is great than everyone");	
		}
	}
		
		
		 
	}
}
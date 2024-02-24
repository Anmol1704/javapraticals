//missing box class

class RefDemo
{
	public static void main(String args[])
	{
		BoxWeigh weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;

		vol = weightbox.volume();
		System.out.println("volume of weightbox is " + vol);
		System.out.println("weight of weightbox is " + weightbox.weight);
		System.out.println();

		plainbox = weightbox;
		vol = plainbox.volume();
		System.out.println("Volume of plainbox is " + vol);

	}
}
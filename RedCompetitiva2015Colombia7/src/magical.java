public class magical {

	static class Item implements Comparable<Item> {
		public long gcd;
		public int pos;
		
		public Item(int g, int p){
			gcd = g;
			pos = p;
		}
		
		@Override
		public int compareTo(Item item){
			
			if(gcd < item.gcd  || (gcd == item.gcd && pos < item.pos))
				return -1;
			if(gcd > item.gcd)
				return 1;
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
	}

}

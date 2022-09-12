
public class Searching {
	static int linearSearch(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i] ==  key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,23,4,32,99};
		int key=4;
		//int key=20;
		
		System.out.println(linearSearch(a,key));

	}

}
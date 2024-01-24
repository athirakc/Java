package dem_Oper;

public class IndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={25,14,56,15,36,56,77,18,29,49}; 
		int e1=25,e2=77;
		int index=-1;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==e1) 
			{
				index=i;
				break;
			}
		}
		System.out.println("Index of "+e1+" is : "+index);
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==e2) 
			{
				index=i;
				break;
			}
		}
		System.out.println("Index of "+e2+" is : "+index);
	}
}
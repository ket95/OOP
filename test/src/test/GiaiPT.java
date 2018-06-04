package test;

public class GiaiPT {
	int[] ar= {9,2,1,8,5,6,4,7,3};
	int temp, i,j;
	
	public void xem() {
		for(int k = 0;k<=ar.length;k++)
			System.out.print(ar[k]+" ");	
	}
	
	public void sapXep() {
		
		for(i=0;i<ar.length-1;i++) {
			
			for(j=0;j<ar.length-1-i;j++) {
				System.out.println    ("So sanh hai so: " +"["+ar[j]+" ] "+" ["+ar[j+1]+"]");
				if(ar[j]>ar[j+1]) {
					System.out.println("doi cho:        " +"["+ar[j]+" ] "+" ["+ar[j+1]+"]");
					temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
					
				}
				else 
					System.out.println("khong can doi cho ");
			}
			
			System.out.println("=> Vong lap thu "+ar[i]+"\n");
			
		}
	}
	
	public static void main(String[] args) {
		GiaiPT hi = new GiaiPT();
		hi.sapXep();
		hi.xem();
	}
}

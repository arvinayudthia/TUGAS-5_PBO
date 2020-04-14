import java.util.*;
 
class CobaArray{
  
  static void cetakArray(int c[]){
    System.out.println();
    for(int i = 0; i < c.length; i++)
      System.out.print(c[i] + "\t");
  }
 
  public static void main(String args[]){
    int a[] = {4,1,5,2,3};
    int b[] = {1,2,3,4,5}; 
	
	System.out.println("Array a : ");
	cetakArray(a);
	
	System.out.println("\n\nArray b :");
	cetakArray(b);
	
	System.out.println("\n\nmenggunakan fungsi sort() untuk mengurutkan data \narray a setelah diurut : ");
    Arrays.sort(a);
    cetakArray(a);
	
	
	System.out.print("\n\nmenggunakan fungsi equals() untuk membandingkan isi array a dan b \narray a dan b setelah dibandingkan maka : ");
    if(Arrays.equals(a,b))
      System.out.println("array sama");
    else
      System.out.println("array tidak sama");
  
	System.out.println("\n\nmenggunakan fungsi toString() untuk mengubah isi array menjadi string \narray a int diubah menjadi tipe string : ");
    String isi = Arrays.toString(a);
    System.out.println("\n" + isi);
  
	System.out.println("\n\nmenggunakan fungsi fill() untuk mengisi elemen array dengan sebuah nilai \narray a setelah diisi dengan sebuah nilai : ");
 
    Arrays.fill(a,7);
    cetakArray(a);
 
	System.out.println("\n\nmenggunakan fungsi binarySearch() untuk mencari data \nMencari angka 2 di array b ");
    System.out.println(Arrays.binarySearch(b,3));
  }
}

package org.example.StringPrograms;

public class PythogreanTriplet {

    public static void main(String[] args) {
        // a2+b2= c2

        int [] arr = {2,4,8, 16, 32, 64, 128, 256, 3, 9, 72, 27, 81};
        printPythagoreanTriplets(arr);
    }

    private static void printPythagoreanTriplets(int[] array){
            int i,j,k;
            int x,y,z;
            int count=0;
            for(i=0;i<array.length;i++){
                x=array[i];
                for(j=0;j<array.length;j++){
                    y=array[j];
                    for(k=0;k<array.length;k++){
                        z=array[k];
                        if((z*z)==(x*x + y*y)){
                            count++;
                            System.out.println("Pythogeran triplets :: "+x+", "+y+", "+z);
                            return;
                        }
                    }
                }
            }
        }


}

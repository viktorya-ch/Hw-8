import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task#1
int [] weight = new int[12];
weight [0] = 1;
weight [1] = 2;
weight [2] = 3;
        { System.out.println( weight [0] );
        System.out.println( weight [1] );
        System.out.println( weight [2] );}
        System.out.println( );

double []  box = {1.57,7.654,9.986,0,0,0,0,0,0,0,0,0};{
        System.out.println(box[0]);
        System.out.println(box [1]);
        System.out.println(box [2]);}
        System.out.println( );

int [] cell = new int[12];
cell [2] = 4;
cell [5] = 9;
cell [7] = 12;
cell [11] = 16;{
        System.out.println(cell [2]);
        System.out.println(cell [5]);
        System.out.println(cell [7]);
        System.out.println(cell [11]);}
        System.out.println( );

        //Task#2
int [] weight1 = new int[12];
weight1 [0] = 1;
weight1 [1] = 2;
weight1 [2] = 3;
        {   System.out.println(Arrays.toString(weight));}
        System.out.println( );

double [] box1 = {1.57,7.654,9.986,0,0,0,0,0,0,0,0,0}; {
        System.out.println(Arrays.toString(box1));}
        System.out.println( );

int [] cell1 = new int[12];
cell1 [2] = 4;
cell1 [5] = 9;
cell1 [7] = 12;
cell1 [11] = 16;
        {
            System.out.print(Arrays.toString(cell));
        }
        System.out.println( );

        //Task#3
int [] weight2 = new int[12];
weight2 [0] = 1;
weight2 [1] = 2;
weight2 [2] = 3;
for (int i = weight2.length - 1; i >= 0; i--) {
    System.out.println(Arrays.toString (new int[] {weight2[i]}));
}
        System.out.println( );

double []  box2 = {1.57,7.654,9.986,0,0,0,0,0,0,0,0,0};
for (double n = box2.length - 1; n >= 0; n--) {
    System.out.println(Arrays.toString(new double[]{box2[(int) n]}));

}
        System.out.println( );

int [] cell2 = new int[12];
cell2 [2] = 4;
cell2 [5] = 9;
cell2 [7] = 12;
cell2 [11] = 16;
for ( int c = cell2.length - 1; c >= 0; c--) {
    System.out.println(Arrays.toString(new int[] {cell2[c]}));
        }
        System.out.println( );

       //Task#4

int [] weight3 = new int[12];
weight3 [0] = 1;
weight3 [1] = 2;
weight3 [2] = 3;
for (int k = 0; k < weight3.length; k++) {
if (weight3[k] % 2 !=0)
weight3[k] = weight3[k] + 1;}
        System.out.println( Arrays.toString(weight3));
}}




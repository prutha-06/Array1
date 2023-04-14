import java.util.*;
public class SpiralMatrix{
public static void PrintSpiral(int matrix[][]){
    int sc=0; //startcol
    int sr=0;  //startrow
    int er=matrix.length-1;  //endrow
    int ec=matrix[0].length-1;  //endcol

    while(sr<=er && sc<=ec){
        //top  variable is colm
        for(int j=sc; j<=ec; j++){//j=colm
            System.out.print(matrix[sr][j]+ " ");
        }
        //right      variable is row
        for(int i=sr+1; i<=er; i++){ //i=row
            System.out.print(matrix[i][ec]+ " ");
        }
        //bottom
        for(int j=ec-1; j>=sc; j--){
            if(sr==er){
                break;
            }
            System.out.print(matrix[er][j]+ " ");
            
        }
        //left
        for(int i=er-1; i>=sr+1; i--){
            if(sc==ec){
                break;
            }
            System.out.print(matrix[i][sc]+ " ");
        }
        sc++;
        sr++;
        ec--;
        er--;
    }
    System.out.println();

}
public static void main(String args[]){
    int matrix[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
    PrintSpiral(matrix);
}
}
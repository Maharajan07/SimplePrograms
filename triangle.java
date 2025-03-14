package random;

public class triangle{
    public static void main(String[] args) {
        int rows = 5;

        for (int i=1; i<=rows; i++){
            for (int j=rows; j>i; j--){
                System.out.print(" ");
            }
                for (int k=1; k<=2*i-1; k++){
                    /*if (k==1 || k==2*i-1 || i==rows){  //To print only the outline of the triangle
                        System.out.print("*");
                    }
                    else{
                        System.err.print(" ");
                    }*/
                    System.out.print("*");  //To fill *'s inside the triangle
                }
            
            System.err.println();
        }
    }
}
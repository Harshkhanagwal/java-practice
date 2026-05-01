package basics.BasicProblems;



// area of rectangle 
public class Main {


    //permiter of Trangle
    static double permiterOfTrangle(double  a, double b, double c){
        return  a + b +c;
    }

    //validate triangel
    static boolean validTriangle (int a, int b, int c){
        return  (a + b > c) && (a + c > b) && (c + b > a) ;
    }

    //sum of n digits
    static int sumOfN(int n){
        return  (n * (n+1 ) ) /2;
    }


    //find percentage
    static double  findPercentage(double obtained, double  total) {
        return  obtained / total * 100;
    }
    
    // avg of 3 no.
    static float avgOfthre(int n1, int n2, int n3){
        return (float) (n1 + n2 + n3) / 3;
    }
    // area of rectangle
    static double  areaOfRectangle(double  l, double  b) {
        return l * b;
    }

    public static void main(String[] args) {
        
        System.out.println("Area of rectangle : " + areaOfRectangle(5.4, 20.0));

        System.out.println("Avg of Three : "+avgOfthre(4, 5, 3));

        System.out.println("Percentage of 184 out of 1350 : "+ String.format("%.2f", findPercentage(184, 1350))) ;
        
        System.out.println("Sum of N (11) digits : "+sumOfN(11));

        System.out.println("2 5 2 is valid triangle or not : "+validTriangle(4, 5, 4));
        System.out.println("2 5 2 is Permiter of triangle : "+permiterOfTrangle(4, 5, 4));
    }
}

package tencodechallenges;
//task 05

public class Triangle {
    public static void area_triangle(double a, double b, double c){

        /* due to the nature of the problem I made use of Heron's formula
        link : wikihow.com/Calculate-the-Area-of-a-Triangle */

        double semi_perimeter = 0.5 * (a+b+c);

        //plugging in Heron's formula
        double area;
        area = Math.pow((semi_perimeter*(semi_perimeter-a)*(semi_perimeter-b)*(semi_perimeter-c)),0.5);
        area = (Math.round(area*100))/(double)100;

        System.out.print("The area is "+area+" units squared.");
    }

    public static void main(String [] args){
        area_triangle(9,7,12);
    }

}

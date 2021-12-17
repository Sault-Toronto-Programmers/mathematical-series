// Java Program to Implement the cos() Function(approximately)

import java.io.BufferedReader;
import java.io.InputStreamReader;

//This class calculates the value of sine and cosine series
public class Sine {
    // Function to calculate and display sine of an angle
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x;
        try {
            System.out.println("Enter the angle whose sine is to be  calculated in degrees");
                    x = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        double y;
        y = x*Math.PI/180;
        int n = 10; //accuracy
        int i,j,step1;
        double step2 = 0;

        //The below for loop calculates the sine series value for the given angle

        for(i=0; i<=n; i++){
            step1 = 1;
            //The below for loop calculates the factorial
            for(j=2; j<=2*i+1; j++){
                step1*=j;
            }
            //This performs  x - x^3/factorial(3)+ x^5/factorial(5) and so on
            step2+=Math.pow(-1.0,i)*Math.pow(y,2*i+1)/step1;
        }
        System.out.format("The sine of " + x + " is %f",step2);

        //The below for loop calculates the cosine series value for the given angle
        step2 = 1;
        for(i=1; i<=n; i++){
            step1 = -1;
            //The below for loop calculates the factorial
            for(j=2; j<=2*i+1; j++){
                step1*=j;
            }
            //This performs  x - x^3/factorial(3)+ x^5/factorial(5) and so on
            step2+=Math.pow(-1.0,i)*Math.pow(y,2*i)/step1;
        }
        System.out.format("The sine of " + x + " is %f",step2);



    }
}
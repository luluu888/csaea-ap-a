package CrashCourse;

import java.util.ArrayList;

public class CrashCourse {    // class header
    public static void main(String[] args) {
        // comments!
        /*multiline 
        comment */
        System.out.print("its");
        System.out.println("me");

        //variable declarations:
        //PRIMITIVE VARIABLES
        int a; // integer
        double b; //decimal or float
        boolean c; //true or false

        a = 4;
        b = 5.5;
        c = false; // lowercase boolean

        // Arithmetic operators
        // + - / *
        //+= -= /= %=

        int d = 3; //can assign and declare variable at the same time
        d += 7;

        System.out.println("d = " + d);

        // increment and decrement by 1
        // -- and ++

        d--;
        d++;
        d++;

        System.out.println("d is now = " + d);

        //COMPARISONS (always returns true or false)
        //< > <= >= == !=
        
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(1 != 2);

        //LOGICAL OPERATORS
        // IN ORDER OF PRESEDENCE: !(not)  &&(and)  ||(or)

        boolean f = false; boolean t = true;
        
        //predict output: true or false

        System.out.println(!f); //true
        System.out.println(f && t); //false
        System.out.println(f || t); //true
        System.out.println(f||t && !f); //true

        System.out.println(f && t); //Short circuits after e - doesn't need to read f

        //Casting (converting)
        int g = (int)5.5;
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);

        //Strings
        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "Goodbye";
        String result = s1 + s2 + s3;
        result += ", Cowboy";
        System.out.println(result + "\n");

        //Arrays
        int[] arry1 = new int [10];
        System.out.println(arry1);
        //when empty, prints memory address
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println("remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {34,52,3,64,32};
        System.out.println("arry2: " + arry2); //still prints the memory address

        //2D Array - hardest thing on the AP exam = one of the FRQs
        //grid or a table

        int[][] arryGrid1 = new int [4][3]; //[rows][columns]
        //0 0 0
        //0 0 0
        //0 0 0
        //0 0 0

        System.out.println("rows: " + arryGrid1.length);
        System.out.println("columns: " + arryGrid1[0].length); //grabs the length of the first row = # of columns

        int[][] arryGrid2 = { {7,8,9}, 
                             {4,5,6}, 
                             {1,2,3} };
        System.out.println(arryGrid2[0][1]); //access 8
        System.out.println(arryGrid2[2][2]); //access 3

        //ArrayLists
        //Can be any size
        //Lots of built in behaviors/functions to help
        //Avoid primitive data types. special classes for Integer, Double, Boolean, String. Called "wrapper" classes

        ArrayList<String> arryLst = new ArrayList<>();

        arryLst.add("Word 1");
        arryLst.add("Word 2");
        arryLst.add("Word 3");
        arryLst.remove(0);

        arryLst.add(0, "Word 4");
        arryLst.set(2, "Word 5");

        System.out.println(arryLst);
        System.out.println(arryLst.size());
        System.out.println(arryLst.get(2));

        // Math class
        Math.max(5, 9);
        Math.min(7, 3);
        Math.sqrt(14);
        Math.abs(-67);

        // Conditionals
        // if  else if   else
        
            boolean tru = true; boolean fal = false;

            if(fal) {
                System.out.println("reached first condition");
            } else if(!fal) {
                System.out.println("reached second condition");

            } else {
                System.out.println("reached else");
            }

        // iteration loop

        // while loop

        int x = 5;
        
        while (x < 10){
            System.out.println(x + " ");
            x++;
        }

        System.out.println();

        //for loops
        //initialize variable for an index; conditional; increment/decrement
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //enhanced for loop (only for eading values)
        ArrayList<String> animals = new ArrayList <>();

        animals.add("sheep");
        animals.add("deer");
        animals.add("moose");

        System.out.println("ArrayList: " + animals);

        for (String s : animals) {
            System.out.println("we saw " + s);
        }

        // printing values of an array with iteration

        double[] arry = {5.1, 2.2, 5.3, 3.4, 8.5};
        System.out.println(("memory address: " + arry));

        for (int i = 1; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

        int[][] arryMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        System.out.println(arryMatrix);

        for (int row = 0; row < arryMatrix.length; row++) {
            for(int col = 0; col < arryMatrix[row].length; col++){
                System.out.println(arryMatrix[row][col] + " ");
            }
        System.out.println();
        

        }
    }
}

package CrashCourse;

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
        result += ", Flins";
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
    }
}

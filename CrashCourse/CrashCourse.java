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

        boolean e = false; boolean f = true;
        
        //predict output: true or false

        System.out.println(!e); //true
        System.out.println(e && f); //false
        System.out.println(e || f); //true
        System.out.println(e||f && !e); //true

        System.out.println(e && f); //Short circuits after e - doesn't need to read f

    }
}

import static java.lang.System.out;

class test {

    public static void main(String[] args) {

        int num = 3;
        out.println(isEven(num));
        
        /* Comment added */
        out.println("hello world");
        out.println("new line");
    }

    public static boolean isEven(int x){
        if(x % 2 == 0) return true;
        return false;
    }
}

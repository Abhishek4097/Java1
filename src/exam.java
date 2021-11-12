public class exam {
    public static void main(String args[]) {
        int i = 0;
        if(args.length == 0){
            System.out.println("No values");
        }
        else {
            while (i<args.length) {
                System.out.print(args[i]);
                i++;
            }
        }
    }
}

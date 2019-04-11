public class falco {
    // 5! = 1*2*3*4*5

    public static long fakite(int number){
        long sum = 1;
        for (int i = 1; i <= number;i++){
            sum = sum*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i =1; i<300; i++){
            System.out.println("Fakultät: "+ i+ " ist "+fakite(i));
        }

    }
}

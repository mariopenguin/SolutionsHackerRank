public class Dinamica {
    public static void main(String[] args) {
        maxSubSetSum(new int[]{1,2,3,4,5,6,7,8});
    }

    public static int maxSubSetSum(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int actMax = Integer.MIN_VALUE;
            int act = i;
            for (int j = 2; j < array.length; j++) {
                for (int k = i+2; k < array.length; k+=j) {
                    System.out.print("Salto de: "+act+" a "+j+" ");
                    act= j;
                }  
            }
              
            System.out.println();
        }
        return 0;
    }
}

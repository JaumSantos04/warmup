import java.util.Random;

public class questão5 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int array[][] = new int[10][2];

        for(int i = 0; i < array.length; i++){
            if(array[i][1] == 1) {
                System.out.println("A posição "+i+" do array não pode ser editada");
            }
            else {
                array[i][0] = Math.abs(random.nextInt());
                array[i][1] = 1;
            }
        }

        for(int j = 0; j < array.length; j++) {
            for(int k = 0; k < array[0].length; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.println();
        }
    }
}
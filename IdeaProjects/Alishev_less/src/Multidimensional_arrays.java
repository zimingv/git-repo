public class Multidimensional_arrays {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        //System.out.println(numbers[1]);
        int [][] matrix = {{1,2,3,4,5},
                          {4},
                          {7,8,9}};
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][4]);

        String [][] strings = new String [2][3];
        strings[0][1] = "Привет!";
        System.out.println(strings[0][1]);
    }
}

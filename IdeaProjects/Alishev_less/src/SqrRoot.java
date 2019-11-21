// Вывод квадратных корней чисел от 1 до 99
// вместе с ошибкой округления
class SqrRoot {
    public static void main(String args[]) {
        double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num+=10) {
            sroot = Math.sqrt(num);
            System.out.println("Kopeнь квадратный из " + num + " равен " + sroot);
// вычислить ошибку округления
            rerr = num - (sroot * sroot);
            System.out.println("0шибкa округления: " + rerr);
            System.out.println();
        }
    }
}
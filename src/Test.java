public class Test {
    public static void main(String[] args) {
        int[] mass = {2,3,6,2,9,7,1,3};
        int lenght = mass.length;
        int quantity = lenght;
        for (int i = 0; i < lenght-1; i++) {
            for (int j = i+1; j < lenght; j++) {
                if (mass[i] == mass[j]){
                    quantity = quantity-1;
                }
            }
        }
        System.out.println("В массиве " + quantity + " неповторяющихся значений");
    }
}

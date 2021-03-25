public class Test {
    public static void main(String[] args) {
        int[] mass = {2,4,5,9,0,4,2,8,5,7,1,4,2};
        int lenght = mass.length;
        int quantity = lenght;
        for (int i = 0; i < lenght-1; i++) {
            for (int j = i+1; j < lenght; j++) {
                if (mass[i] == mass[j]){
                    quantity = quantity-1;
                    break;
                }
            }
        }
        System.out.println("В массиве " + quantity + " неповторяющихся значений");
    }
}

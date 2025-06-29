class Main {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,};
        
         for (int i = 0; i < array.length; i++) {
            System.out.println("number is " + array[i]);
        }
        for (int arr : array){
            System.out.println(arr);
        }
}
}

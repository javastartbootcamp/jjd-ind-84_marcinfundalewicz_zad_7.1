package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        int counter = 0;
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[(array.length - 1) - i]) {
                counter++;
            }
        }
        if (counter >= array.length / 2 && array.length > 0) {
            return true;
        } else {
            return false;
        }
    }
}



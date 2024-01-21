package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();

        int[] array = {1, 2, 3, 5, 3, 2, 1};

        boolean isPalindrome = palindromeService.isPalindrome(array);

        System.out.println(isPalindrome);
    }
}

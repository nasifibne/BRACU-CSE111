public class prime {
        public static void main(String[] args) {
            int lowerBound = 1;
            int upperBound = 20;

            System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");

            // Outer : Iterates through each number in the specified range.
            // We start checking from 2 because 0 and 1 are not considered prime numbers.
            for (int i = lowerBound; i <= upperBound; i++) {
                // A boolean flag to determine if the current number 'i' is prime.
                // It's initially set to true, assuming the number is prime until proven otherwise.
                boolean isPrime = true;

                // Handle special cases: 0 and 1 are not prime.
                if (i <= 1) {
                    isPrime = false;
                } else {
                    // Inner loop: Checks for divisibility from 2 up to (but not including) the number itself.
                    // If a number 'i' is divisible by any 'j' in this range, it's not prime.
                    for (int j = 2; j < i; j++) {
                        // If 'i' is perfectly divisible by 'j' (i.e., remainder is 0),
                        // then 'i' has a factor other than 1 and itself, so it's not prime.
                        if (i % j == 0) {
                            isPrime = false; // Set the flag to false.
                            break;           // No need to check further, move to the next number 'i'.
                        }
                    }
                }

                // If the isPrime flag is still true after checking all divisors,
                // it means the number 'i' is a prime number.
                if (isPrime) {
                    System.out.println(i); // Print the prime number.
                }
            }
        }
}

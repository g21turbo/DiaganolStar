public class Main {
    public static void main(String[] args) {

        printSquareStar(5);

    }

    // Constants for star and space characters
    private static final String STAR = "*";
    private static final String SPACE = " ";

    // Method to print a square pattern of stars and spaces
    public static void printSquareStar(int number) {

        // Check if the input number is less than 5
        if (number < 5) {
            // Print an error message and return if the value is invalid
            System.out.println("Invalid Value");
            return;
        }

        // Iterate through each row
        for (int row = 1; row <= number; row++) {

            // Iterate through each column in the current row
            for (int column = 1; column <= number; column++) {

                // Check if the current position is on the first row or column
                boolean isFirstRowOrColumn = row == 1 || column == 1;

                // Check if the current position is on the last row or column
                boolean isLastRowOrColumn = row == number || column == number;

                // Check if the current position is on a diagonal
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                // Print a star if any of the conditions for a special position are met, otherwise print a space
                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }

            // Move to the next line after printing a row
            System.out.println();
        }
    }
}
import java.awt.*;
import java.io.InputStream;
import java.util.Scanner;

public class Maze {
    // size of the maze in rows and columns
    private int numRows, numCols;

    // storage for the maze itself
    private char[][] maze;

    // storage arrays for total number of steps in each row/col
    private int[] rowCounts, colCounts;

    // variables storing where the person solving the maze must start and end
    private int startRow, startCol, endRow, endCol;

    // canvas to draw the maze on
    private SimpleCanvas canvas;

    // size of a square when drawing the maze
    private int SQUARESIZE = 40;


    /** You can add any parameters you want to this constructor. */
    public Maze(String filename) {
        // Your code  here.

        canvas = new SimpleCanvas(SQUARESIZE * (numCols + 1), SQUARESIZE * (numRows + 1));
        canvas.show();
    }

    /**
     * Read in maze data from a file and set appropriate instance variables.
     */
    private void loadMaze(String filename) {
        InputStream is = Maze.class.getResourceAsStream(filename);
        if (is == null) {
            System.err.println("Could not open file: " + filename);
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        // Use 6 calls to scan.nextInt() to get the number of rows/cols
        // in the maze, and the starting & ending row/col locations.

        // Then initialize the maze, rowCounts, and colCounts variables appropriately.

        // Then read in the values for the rowCounts and colCounts arrays.

        // Then initialize all squares of the maze array to a period.
    }

    /**
     * Print a text-based representation of the current maze.
     */
    public void printMaze() {
        // print out the contents of the maze itself, as periods and stars,
        // and the row/col counts, and the starting and ending locations.

        // Use this function as a sanity check to make sure the maze text file
        // is being read correctly!
    }

    /**
     * Draw the current state of the maze on the SimpleCanvas.
     */
    public void drawMaze() {
        canvas.setBackgroundColor(Color.BLACK);
        canvas.clear();

        // draw horizontal lines
        canvas.setPenColor(Color.WHITE);
        for (int row = 0; row < numRows + 1; row++) {
            canvas.drawLine(0, row * SQUARESIZE, numCols * SQUARESIZE, row * SQUARESIZE);
        }
        // draw vertical lines
        for (int col = 0; col < numCols + 1; col++) {
            canvas.drawLine(col * SQUARESIZE, 0, col * SQUARESIZE, numRows * SQUARESIZE);
        }

        // draw row/col array counts
        canvas.setPenColor(Color.WHITE);
        for (int row = 0; row < numRows; row++) {
            canvas.drawStringCentered(SQUARESIZE * numCols + SQUARESIZE / 2, SQUARESIZE * row + SQUARESIZE / 2,
                    String.valueOf(rowCounts[row]), 16);

        }
        // vert lines
        for (int col = 0; col < numCols; col++) {
            canvas.drawStringCentered(SQUARESIZE * col + SQUARESIZE / 2, SQUARESIZE * numRows + SQUARESIZE / 2,
                    String.valueOf(colCounts[col]), 16);
        }

        // draw start and end locations as green and red circles
        // Fill in your code here.  You will need to set the pen color and draw a filled circle for both the
        // starting and ending locations on the maze.  Remember, these are stored in the variables (startRow, startCol)
        // and (endRow, endCol).  You can multiply these values by the SQUARESIZE variable to convert them into (x, y)
        // locations.  Don't forget that x goes with col and y goes with row!

        // draw dots representing the current path through the maze:
        // all cells that are "marked" should have a dot drawn in them, all "unmarked" cells should be ignored
        // you can use similar code above to draw filled circles (my code uses a smaller radius for these).
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                // YOUR CODE HERE!
            }
        }

        canvas.update();
    }

    /**
     * Return true if this maze square (row, col) is unmarked (a period) or is off the board
     * entirely (as in does not exist), false otherwise.
     */
    private boolean isOpenOrOffBoard(int row, int col) {
        return false; // remove this line when you start writing this method.
    }

    /**
     * Return true if this maze square (row, col) is unmarked (a period), false otherwise.
     */
    private boolean isOpen(int row, int col) {
        return false; // remove this line when you start writing this method.
    }

    /**
     * Return true if it is possible to go north from the given (row, col)
     * according to the rules of solving the maze.
     */
    private boolean canMoveNorth(int row, int col) {
        return false; // remove this line when you start writing this method.
    }

    /**
     * Return true if it is possible to go south from the given (row, col)
     * according to the rules of solving the maze.
     */
    private boolean canMoveSouth(int row, int col) {
        return false; // remove this line when you start writing this method.
    }

    /**
     * Return true if it is possible to go west from the given (row, col)
     * according to the rules of solving the maze.
     */
    private boolean canMoveWest(int row, int col) {
        return false; // remove this line when you start writing this method.
    }

    /**
     * Return true if it is possible to go east from the given (row, col)
     * according to the rules of solving the maze.
     */
    private boolean canMoveEast(int row, int col) {
        return false; // remove this line when you start writing this method.
    }

    /** Return true if the maze can be solved. */
    public boolean canSolve() {
        // Call canSolve from the starting location on the maze and return the result.

        return false; // remove this line when you start writing this method.
    }

    /** Return a String containing the path from the start
     * to the end of the maze if it is solvable, or "X" if it's not solvable.  */
    public String directionalSolve() {
        // Call directionalSolve from the starting location on the maze and return the result.

        return ""; // remove this line when you start writing this method.
    }

    /** Return true if the maze can be solved from (currRow, currCol). */
    private boolean canSolve(int currRow, int currCol) {
        // Print you have arrived at the current row/col.
        // Update the row/col count arrays.
        // Mark the current square (with an asterisk/star '*').
        // Draw the maze and pause the canvas for a moment.

        // Base case: Are we done with the search?
        // In other words, is our current location equal to the ending location AND all row/col counts are zero?
        //   If yes, return true (indicating the maze was solved).
        //   If no, keep going below.

        // Check if we are NOT at the ending location.  If so:
        //   Can we move NORTH from our current position?
        //     If yes, try to solve the maze from one step north.
        //     Examine the boolean value that is returned from the recursive call.
        //     If this value is true, then that means the recursive call found a solution
        //       and this call should return true as well.

        //   Can we move SOUTH from its current position?
        //     If yes....(follow same idea as above)
        //   Same for EAST, then WEST.

        // If we can't take a step in any of the four directions, we will end up here.
        // At this point we know the maze can't be solved from our current location.
        // So we need to BACKTRACK!

        // To do this, unmark the current maze location (turn it back into a period.)
        // Update the row/col count arrays (undo what you did at the top of this method.)

        // Print that you are backtracking from this row/col.
        // Draw the maze with the patronus.
        // Draw the maze and pause the canvas for a moment.

        return false;
    }

    /** Return a string with the maze solution directions from (currRow, currCol) if
     * the maze can be solved, or "X" if it's not solvable. */
    public String directionalSolve(int currRow, int currCol) {
        // Print you have arrived at the current row/col.
        // Update the row/col count arrays.
        // Mark the current square (with an asterisk/star '*').
        // Draw the maze and pause the canvas for a moment.

        // Base case: Are we done with the search?
        // In other words, is our current location equal to the ending location AND all row/col counts are zero?
        //   If yes, return "!" (indicating we found the ending location).
        //   If no, keep going below.

        // Check if we are NOT at the ending location.  If so:
        //   Can we move NORTH from our current position?
        //     If yes, try to solve the maze from one step north.
        //     Examine the String value that is returned from the recursive call.
        //     If this value is not "X", then that means the recursive call found a solution
        //       and this string is the partial path to the solution.
        //     Update this string to reflect that we moved NORTH to find the solution,
        //       and return the updated string.

        //   Can we move SOUTH from its current position?
        //     If yes....(follow same idea as above)
        //   Same for EAST, then WEST.

        // If we can't take a step in any of the four directions, we will end up here.
        // At this point we know the maze can't be solved from our current location.
        // So we need to BACKTRACK!

        // To do this, unmark the current maze location (turn it back into a period.)
        // Update the row/col count arrays (undo what you did at the top of this method.)

        // Print that you are backtracking from this row/col.
        // Draw the maze with the patronus.
        // Draw the maze and pause the canvas for a moment.

        return "X";  // means maze can't be solved from here
    }

}



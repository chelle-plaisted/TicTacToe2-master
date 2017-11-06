package edu.up.cs301.tictactoe;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by plaisted20 on 11/6/2017.
 */

public class TTTStateTest {
    @Test
    public void testConstr() {
        TTTState state = new TTTState();
        for (int row = 0; row <=2; row++) {
            for(int col = 0; col <=2; col++) {
                char ch = state.getPiece(row, col);
                assertTrue("Initial state bad", ch == ' ');
            }
        }
    }

    @Test
    public void testSetPiece() {
        TTTState state = new TTTState();
        state.setPiece(1,2,'X');
        assertTrue("Set piece bad", state.getPiece(1,2) == 'X');
    }
}

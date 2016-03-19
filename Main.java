//Andriy Zasyppkin
//2016-03-19
//Practice 2013 - 06: Sudoku Solution Checker

import java.util.*;

public class Main {
  public static boolean rowCheck(int[][] grid, int row) {
    short stat = 0;
    for(int i=0; i<9; i++) {
      stat |= (short)(Math.pow(2, grid[row][i]-1));
    }
    return stat == (short)(Math.pow(2, 9)-1);
  }

  public static boolean colCheck(int[][] grid, int col) {
    short stat = 0;
    for(int i=0; i<9; i++) {
      stat |= (short)(Math.pow(2, grid[i][col]-1));
    }
    return stat == (short)(Math.pow(2, 9)-1);
  }

  public static boolean gridCheck(int[][] grid) {
    for(int box=0; box<9; box++) {
      short stat = 0;
      for(int i=0; i<9; i++) {
        stat |= (short)(Math.pow(2, grid[i/3+(box/3)*3][i%3+(box%3)*3]-1));
      }
      if(stat != (short)(Math.pow(2, 9)-1))
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nCases = scan.nextInt();
    case_loop:
    for(int nCase=1; nCase<=nCases; nCase++) {
      int[][] grid = new int[9][9];
      for(int i=0; i<9; i++) {
        for(int j=0; j<9; j++) {
          grid[i][j] = scan.nextInt();
        }
        //scan.nextLine();
      }
      //scan.nextLine();
      for(int i=0; i<9; i++) {
        if(!colCheck(grid, i) || !rowCheck(grid, i)) {
          System.out.printf("Case %d: INCORRECT\n", nCase);
          continue case_loop;
        }
      }
      if(gridCheck(grid)) {
        System.out.printf("Case %d: CORRECT\n", nCase);
      }
      else {
        System.out.printf("Case %d: INCORRECT\n", nCase);
      }

    }

    System.exit(0);
  }
}

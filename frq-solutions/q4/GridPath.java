import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col){
    if(row == grid.length-1){
      return new Location(row, col+1);
    }

    else if(col == grid[0].length-1){
      return new Location(row+1, col);
    }

    else{
      if(grid[row+1][col] < grid[row][col+1]){
        return new Location(row+1, col);
      }
      else{
        return new Location(row, col+1);
      }
    }
  }

  
  // PART B
  public int sumPath(int row, int col) {
    int sum = 0;
    while(row < grid.length && col < grid[0].length){
      sum+= grid[row][col];
      Location l1 = getNextLoc(row, col);
      row = l1.getRow();
      col = l1.getCol();
    }

    return sum;
  }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}

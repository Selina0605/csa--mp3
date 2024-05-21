public class Feeder{
  private int currentFood;

  public Feeder(int food){
    currentFood = food;
  }

  public int getCurrentFood(){
    return currentFood;
  }
  
  public void simulateOneDay(int numBirds){
    if(Math.random()*95 <= 0.95){
      int food = (int)(Math.random()*50-10+1)+10;
      if(currentFood < 0){
        currentFood = 0;
      }
      else{
        currentFood -= numBirds*food;
      }
    }
    else{
      currentFood = 0;
    }
  }

  public int simulateManyDays(int numBirds, int numDays){
    int days = 1;
    for(int i = 1; i <= numDays; i++){
      if(currentFood <= 0){
        return days;
      }
      days++;
      simulateOneDay(numBirds);
    }
    return days;
  }
}

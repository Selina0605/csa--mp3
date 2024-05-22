public class Scoreboard {
  private String t1;
  private String t2;
  private int score1;
  private int score2;
  private int countEven;

  public Scoreboard(String team1, String team2){
    t1 = team1;
    t2 = team2;
    score1 = 0;
    score2 = 0;
    countEven = 0;
  }

  public void recordPlay(int points){
    if(points == 0){
      countEven++;
    }

    if(countEven % 2 == 0){
      score1 += points;
    }
    else{
      score2 += points;
    }
  }

  public String getScore(){
    if(countEven % 2 == 0){
      return score1 + "-" + score2 + "-" + t1;
    }
    return score1 + "-" + score2 + "-" + t2;
  }
  
}

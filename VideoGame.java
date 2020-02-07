import java.text.NumberFormat;
public class VideoGame
{
   private String gameTitle, gamePublisher, platform;
   private int year;
   private double price;
   private boolean completed;
   
   
   public VideoGame(String gameTitle, String gamePublisher, String platform, int year, double price, boolean completed)
   {
      this.gameTitle = gameTitle;
      this.gamePublisher = gamePublisher; 
      this.platform = platform;
      this.year = year;
      this.price = price;
      this.completed = completed;
   }

   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      String result;
      
      result = fmt.format(price) + "\t\t" + year + "\t\t" + gameTitle + "\t\t";
      result += gamePublisher + "\t\t" + platform;
      
      if(completed)
         result += "\n" + "Finished!";
         
      return result;
      

   
   }

}
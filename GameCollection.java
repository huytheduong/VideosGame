import java.text.NumberFormat;
public class GameCollection
{
   private VideoGame [] collection;
   private int amount;
   private double totalCost;
   
   public GameCollection()
   {
      collection = new VideoGame[100];
      amount = 0;
      totalCost = 0.0;
   
   }
   
   public void addGame(double price, int year, String gameTitle, String gamePublisher, String platform, boolean completed)
   {
      if(amount == collection.length)
         increaseSize();
         
      collection[amount] = new VideoGame(gameTitle, gamePublisher, platform, year, price, completed);
      totalCost += price;
      amount++;
   
   }
   
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      String report = "-------------------------------------------------\n";
      report += "My Video Game Collection\n\n";
      
      report += "Number of Games: " + amount + "\n";
      report += "Total cost: " + fmt.format(totalCost) +"\n";
      report += "Average cost: " + fmt.format(totalCost/amount); 
      
      report += " \n\nVideo Game List:\n\n";
      
      for (int game = 0; game < amount; game++)
      
         report += collection[game].toString() + "\n";
      
      return report;
   }
      
      private void increaseSize()
      {
         VideoGame[] temp = new VideoGame[collection.length * 2];
         
         for (int game = 0; game < collection.length; game++)
            temp[game] = collection[game];
         
         collection = temp;
      }

   
   }
   
   
   
   



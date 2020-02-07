public class GameDriver
{ 
   public static void main (String [] args)
   {
      GameCollection games = new GameCollection();
      
      games.addGame(15.99 , 1997, "Final Fantasy VII", "Square Enix", "PlayStation", true);
      games.addGame(19.99 , 2004, "Ninja Gaiden", "Ubisoft", "Xbox", false);
      games.addGame(24.99 , 2005, "Kingdom Hearts II", "Square Enix", "PlayStation 2", true);
      games.addGame(21.95 , 2013, "Tomb Raider", "Square Enix", "PlayStation 3", false);

      System.out.print(games);
      
   
   
   } 




}
public class SongRunner
{
    public static void main( String[] args )
    {
        Song beatz = new Song ( "Spring Day", "BTS", 2000000 );
        Song hit = new Song( "That's Not My Name", 
                                               "The Ting Tings", 350000 );
        Song fun = new Song ( "Spring Day", "BTS", 2000000 );
       
        System.out.println( beatz );
        System.out.println( fun );
        
        System.out.println( beatz.equals( hit ) );
        System.out.println( beatz.equals( fun ) );        
    }
}


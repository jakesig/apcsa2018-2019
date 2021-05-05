public class Song implements Comparable<Song>
{
    String name;
    String artist;
    int iTunesCopiesSold;
    
    public Song()
    {
        // name = "none";
        // artist = "none";
        // iTunesCopiesSold = 0;
        this("none", "none", 0);  // default values until defined
    }
    
    public Song(String songName, String artistName, int copiesSold)
    {
        name = songName;
        artist = artistName;
        iTunesCopiesSold = copiesSold;
    }
    
   
    public int compareTo(Song someOtherSong)
    {
        //sort based on name
        return name.compareTo(someOtherSong.name);
        //sort based on artist
        //return artist.compareTo(someOtherSong.artist);
        //sort based on iTunesCopiesSold
        //return (iTunesCopiesSold-someOtherSong.iTunesCopiesSold);
    }
    
    public String toString()
    {
        return name + " " + artist + " " + "sold: " + iTunesCopiesSold;
    }
}

public class Artwork {
    private String title;
    private int year;
    private Artist artist;

    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public Artwork(String title, int year) {
        this.title = title;
        this.year = year;
        this.artist = new Artist("Unknown Artist");
    }

    // Shallow copy constructor 
    public Artwork(Artwork artwork) {
        this.title = artwork.getTitle();
        this.year = artwork.getYear();
        this.artist = artwork.getArtist(); 
    }

    // Deep copy constructor 
    public Artwork deepCopy() {
        return new Artwork(this.title, this.year, new Artist(this.artist)); 
    }


    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void display() {
        System.out.println("Artwork: " + title + ", Year: " + year + ", Artist: " + artist.getName());
    }
}

public class Test {
    public static void main(String[] args) {
        
        Artist artist1 = new Artist("Umair");

        Artwork artwork1 = new Artwork("Hut", 1789, artist1);
        
        Artwork artwork2 = new Artwork("River View", 1196);

        //artwork2.display();

        System.out.println("Artworks:");
        artwork1.display();
        artwork2.display();

        Artwork shallowCopy = new Artwork(artwork1); // Shallow copy 
        Artwork deepCopy = artwork1.deepCopy(); // Deep copy

        artist1.setName("Salman");

        System.out.println("After changing artist name:");
        artwork1.display();
        deepCopy.display(); 
        shallowCopy.display(); 
        
    }
}
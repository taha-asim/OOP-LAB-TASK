public class Artist{

private String name;

Artist(String name){

this.name = name;

}

Artist(Artist artist){

this.name = artist.getName();

}

public String getName(){

return name;

}

public void setName(String name){

this.name = name;

}

public void display(){

System.out.print("Artist name is : "+name);

}

}
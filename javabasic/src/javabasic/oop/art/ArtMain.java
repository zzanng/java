package javabasic.oop.art;

public class ArtMain {

	public static void main(String[] args) {


		IArt drawing = new Drawing("고흐");
		IArt music = new Music("베토벤");
		IArt movie = new Movie("범죄도시4");

		music.create();
		music.play();
		
		
	}

}

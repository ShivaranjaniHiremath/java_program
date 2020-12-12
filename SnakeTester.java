
	public class SnakeTester {
		public static void main(String[] args) {

				Snake python = new Snake();
				python.breed = "ball python";
				python.color = "brown";
				python.poisonous = true;
				python.lifeSpan = 50;
				python.lengthInMeters = 1;
				System.out.println("details of python");
				System.out.println("color of python: " +python.color);
				System.out.println("breed of python: " +python.breed);
				System.out.println("Poisonous character of python:" +python.poisonous);
				System.out.println("lifespan of python:" +python.lifeSpan);
				System.out.println("length of the python:" +python.lengthInMeters );

				Snake JamaikanTreeSnake = new Snake();
				JamaikanTreeSnake.breed = "JamaikanTreeSnake";
				JamaikanTreeSnake.color = "golden green";
				JamaikanTreeSnake.poisonous = true;
				JamaikanTreeSnake.lifeSpan = 25;
				JamaikanTreeSnake.lengthInMeters = 2;
				System.out.println("details of JamaikanTreeSnake");
				System.out.println("color of JamaikanTreeSnake:" +JamaikanTreeSnake.color);
				System.out.println("breed of JamaikanTreeSnake: " +JamaikanTreeSnake.breed);
				System.out.println("Poisonous character of JamaikanTreeSnake:" +JamaikanTreeSnake.poisonous);
				System.out.println("lifespan of JamaikanTreeSnake:" +JamaikanTreeSnake.lifeSpan);
				System.out.println("length of the JamaikanTreeSnake:" +JamaikanTreeSnake.lengthInMeters);


			}
}

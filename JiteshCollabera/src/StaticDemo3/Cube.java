package StaticDemo3;

public class Cube {

        int length = 10;
        int breadth = 10;
        int height = 10;
        public static int numOfCubes = 0;
        public static int getNoOfCubes()
        {
            return numOfCubes;
        }
        public Cube()
        {    numOfCubes++;
        }
    }


public class SpinningDonut {
    public static void main(String[] args) {
        // loop to handle number of rotations
        for (int rotation = 0; rotation < 360; rotation += 30) {
            // outer loop to handle number of rows
            for (int i = 0; i < 7; i++) {
                // inner loop to handle number of columns
                for (int j = 0; j < 7; j++) {
                    // calculate the angle of the current position relative to the center of the donut
                    double angle = Math.atan2(3 - i, 3 - j);
                    // add the rotation angle to the current angle
                    angle += Math.toRadians(rotation);
                    // calculate the distance of the current position from the center of the donut
                    double distance = Math.sqrt(Math.pow(3 - i, 2) + Math.pow(3 - j, 2));
                    // print an asterisk if the current position is on the outer rim of the donut
                    if (distance > 2 && distance < 4) {
                        System.out.print("*");
                    }
                    // print a space if the current position is inside the donut
                    else {
                        System.out.print(" ");
                    }
                }
                // move to the next line after printing a row
                System.out.println();
            }
            // add a delay between each rotation
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // do nothing
            }
            // clear the console before printing the next rotation
            System.out.print("\033[H\033[2J");
        }
    }
}

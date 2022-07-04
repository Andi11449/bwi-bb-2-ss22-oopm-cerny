package shapes.demos;

import shapes.entities.*;

import java.io.*;
import java.util.*;

public class WritePositionDemo {
    public static void main(String[] args) {
        List<Position> positionsToSave = new LinkedList<Position>();
        positionsToSave.add(new Position(0.0, 1.0));
        positionsToSave.add(new Position(2.2, 3.5));
        positionsToSave.add(new Position(-4.0, 12.4));
        
        String posFile = "positions.csv";
        savePositionsToCSVFile(positionsToSave, posFile);
    }

    private static void savePositionsToCSVFile(List<Position> positions, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("x,y\n");
            for (Position pos : positions) {
                writer.write(String.format(Locale.ROOT,"%f,%f\n", pos.getX(), pos.getY()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

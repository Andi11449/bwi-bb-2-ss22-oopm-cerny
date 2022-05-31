package shapes.demos;

import shapes.entities.*;

import java.io.*;
import java.util.*;

public class WritePositionDemo {
    public static void main(String[] args) {
        List<Position> positionsToSave = new LinkedList<Position>();
        positionsToSave.add(new Position(0.0, 1.0));
        positionsToSave.add(new Position(2.2, 3.5));
        
        String posFile = "positions.csv";
        savePositionsToCSVFile(positionsToSave, posFile);
    }

    private static void savePositionsToCSVFile(List<Position> positions, String filename) {

    }
}

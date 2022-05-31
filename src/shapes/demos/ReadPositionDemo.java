package shapes.demos;

import shapes.entities.Position;
import shapes.utils.MyParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ReadPositionDemo {
    public static void main(String[] args) {
        List<Position> positions = readPositionsFromFile("positions.csv");

        for (Position pos : positions) {
            System.out.println(pos);
        }
    }

    private static List<Position> readPositionsFromFile(String path) {
        List<Position> positions = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            //skip header
            String line = reader.readLine();
            line = reader.readLine();

            while(line != null){
                Position p = null;
                try {
                    p = parsePosition(line);
                    positions.add(p);
                } catch (MyParseException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return positions;
    }

    private static Position parsePosition(String line) throws MyParseException {
        try {
            String[] arr = line.split(",");
            Position p = new Position(Float.parseFloat(arr[0]), Float.parseFloat(arr[1]));
            return p;
        }
        catch (NumberFormatException e){
            throw new MyParseException("Format exception in line: " + line, e);
            //System.out.println(e.getMessage());
            //return null;
        }
    }
}

package workout;

import java.util.Base64;

public class BasicWorkout {
    int duration;
    int intensity;
    int energy;
    Date date;
    String description;

    public BasicWorkout(Date date, int duration){
        this.date = date;
        this.duration = duration;
    }

    public BasicWorkout(Date date, int duration, int intensity){
        this.date = date;
        this.duration = duration;
        this.intensity = intensity;
    }

    public BasicWorkout(Date date, int duration, int intensity, int energy){
        this.date = date;
        this.duration = duration;
        this.intensity = intensity;
        this.energy = energy;
    }

    public BasicWorkout(Date date, int duration, int intensity, int energy, String description){
        this.date = date;
        this.duration = duration;
        this.intensity = intensity;
        this.energy = energy;
        this.description = description;
    }

    public int getIntensity() {
        return intensity;
    }

    public int getEnergy() {
        return energy;
    }

    public String getDescription() {
        if(description == null)
            return "no description";
        return description;
    }

    public String getIntensityString(){
        String s ="[";
        for (int i = 0; i < 10; i++) {
            if(i < getIntensity()) {
                s += "*";
            }
            else {
                s += " ";
            }
        }

        return s +"]";
    }

    @Override
    public String toString() {
        return String.format("%s: %s \"%s\" %.1fh, %dkcal ",
                date, getIntensityString(), getDescription(), duration/3600., getEnergy());
    }
}

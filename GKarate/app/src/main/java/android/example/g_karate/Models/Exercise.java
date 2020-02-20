package android.example.g_karate.Models;

import android.media.Image;

import java.util.ArrayList;

public class Exercise {

    private String id;
    private String name;
    private String description;
    private String nameSport;
    private ArrayList<Image> moves;
    private int difficulty;
    private String[] accessibleDisabilities;


    public Exercise(){}

    public Exercise(String id, String name, String description, String nameSport, ArrayList<Image> moves, int difficulty, String[] accessibleDisabilities) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.nameSport = nameSport;
        this.moves = moves;
        this.difficulty = difficulty;
        this.accessibleDisabilities = accessibleDisabilities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameSport() {
        return nameSport;
    }

    public void setNameSport(String nameSport) {
        this.nameSport = nameSport;
    }

    public ArrayList<Image> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Image> moves) {
        this.moves = moves;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String[] getAccessibleDisabilities() {
        return accessibleDisabilities;
    }

    public void setAccessibleDisabilities(String[] accessibleDisabilities) {
        this.accessibleDisabilities = accessibleDisabilities;
    }
}

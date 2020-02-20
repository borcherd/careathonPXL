package android.example.g_karate.Models;

import android.media.Image;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    private String id;
    private String name;
    private String description;
    private String nameSport;
    private List<String> moves;
    private int difficulty;
    private List<String> accessibleDisabilities;


    public Exercise(){}

    public Exercise(String id, String name, String description, String nameSport, List<String> moves, int difficulty, List<String> accessibleDisabilities) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.nameSport = nameSport;
        this.moves = moves;
        this.difficulty = difficulty;
        this.accessibleDisabilities = accessibleDisabilities;
    }

    public Exercise( String name, String description, String nameSport, List<String> moves, int difficulty, List<String> accessibleDisabilities) {

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

    public List<String> getMoves() {
        return moves;
    }

    public void setMoves(List<String> moves) {
        this.moves = moves;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public List<String> getAccessibleDisabilities() {
        return accessibleDisabilities;
    }

    public void setAccessibleDisabilities(List<String> accessibleDisabilities) {
        this.accessibleDisabilities = accessibleDisabilities;
    }
}

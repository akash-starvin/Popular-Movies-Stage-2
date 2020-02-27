package com.example.popularmovies.DataBase;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="FavMovies")
public class FavoriteMovie {
    @PrimaryKey
    private int id;
    private String image;

    public FavoriteMovie(int id, String image) {
        this.id = id;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

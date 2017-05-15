package id.sch.smktelkom_mlg.privateassignment.xirpl135.marvelcomic.model;

import io.realm.RealmObject;

/**
 * Created by yobelchris on 5/14/2017.
 */

public class Fav extends RealmObject {
    public int id;
    public String title;
    public String description;
    public byte[] picture = new byte[102400];
    public float price;

    public Fav() {

    }

    public Fav(int id, String title, String description, byte[] picture, float price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.picture = picture;
        this.price = price;
    }
}

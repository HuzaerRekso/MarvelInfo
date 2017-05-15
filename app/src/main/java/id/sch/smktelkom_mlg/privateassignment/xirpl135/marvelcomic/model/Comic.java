package id.sch.smktelkom_mlg.privateassignment.xirpl135.marvelcomic.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yobelchris on 5/12/2017.
 */

public class Comic implements Serializable {
    public int id;
    public String title;
    public String description;
    public Thumbnail thumbnail;
    public List<Price> prices;
    public List<Url> urls;
}

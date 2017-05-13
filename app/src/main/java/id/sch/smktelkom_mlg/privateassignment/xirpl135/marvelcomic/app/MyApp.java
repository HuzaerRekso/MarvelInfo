package id.sch.smktelkom_mlg.privateassignment.xirpl135.marvelcomic.app;

import android.app.Application;

import io.realm.Realm;


/**
 * Created by hyuam on 28/03/2017.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}

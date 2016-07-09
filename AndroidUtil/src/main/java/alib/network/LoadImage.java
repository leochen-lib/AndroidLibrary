package alib.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.InputStream;
import java.net.URL;

/**
 * Created by leo on 2016/5/26.
 */
public class LoadImage extends AsyncTask<Void, Void, Bitmap> {
    protected String URLPath;
    Bitmap bitmap;

    public LoadImage(String URLPath) {
        this.URLPath = URLPath;
    }

    protected Bitmap doInBackground(Void... args) {
        try {
            bitmap = BitmapFactory.decodeStream((InputStream) new URL(URLPath).getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

}
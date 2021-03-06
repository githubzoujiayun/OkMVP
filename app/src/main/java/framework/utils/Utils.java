package framework.utils;

import android.app.Activity;
import android.content.Intent;


public class Utils {

    public static void startActivity(Activity from , Class to) {
        Intent intent = new Intent(from,to);
        from.startActivity(intent);
    }

    public static void startActivityForResult(Activity from , Class to, int requestCode) {
        Intent intent = new Intent(from,to);
        from.startActivityForResult(intent,requestCode);
    }

    public static <T> T getClassType(Class<T> cls) {

        try {
            return cls.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

}
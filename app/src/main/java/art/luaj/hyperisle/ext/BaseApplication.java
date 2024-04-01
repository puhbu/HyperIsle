package art.luaj.hyperisle.ext;

import android.app.Application;

import com.google.android.material.color.DynamicColors;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DynamicColors.applyToActivitiesIfAvailable(this);
    }
}

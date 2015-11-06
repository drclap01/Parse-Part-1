package clapp.devin.parse_part_1; /**
 * Created by drclap01 on 11/6/15.
 */

import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, HakD44LC32HWmLGW75PkCTlmquH4QwCWUg5kITjr, ZKJfvb3CNxHUToWyyie8uT2XV5NbQ3eekxw7qo5m); // Your Application ID and Client Key are defined elsewhere
    }
}

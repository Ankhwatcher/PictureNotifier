package ie.appz.picturenotifier;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (findViewById(R.id.btnDisplay)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NotificationCompat.BigPictureStyle style = new NotificationCompat.BigPictureStyle();
                style.bigPicture(BitmapFactory.decodeResource(getResources(),R.drawable.preview_1))
                .setBigContentTitle("Display Photo");
                Notification notificationCompat = new NotificationCompat.Builder(MainActivity.this)
                        .setContentTitle("Display Photo")
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setStyle(style)
                        .build();
                ((NotificationManager)getSystemService(NOTIFICATION_SERVICE)).notify(10001,notificationCompat);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

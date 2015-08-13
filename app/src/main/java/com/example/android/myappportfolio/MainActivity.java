package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    /* This is called when the launchMediaStreamer is clicked */
    public void launchMediaStreamer(View view) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my spotify streamer app!",
                Toast.LENGTH_SHORT).show();
    }
    /* This is called when the launchMediaStreamer is clicked */
    public void launchSuperDuo1(View view) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my scores app!",
                Toast.LENGTH_SHORT).show();
    }
    /* This is called when the launchMediaStreamer is clicked */
    public void launchSuperDuo2(View view) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my library app!",
                Toast.LENGTH_SHORT).show();
    }
    /* This is called when the launchMediaStreamer is clicked */
    public void launchBuildItBigger(View view) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my build-it-bigger streamer app!",
                Toast.LENGTH_SHORT).show();
    }
    /* This is called when the launchMediaStreamer is clicked */
    public void launchBaconReader(View view) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my bacon reader app!",
                Toast.LENGTH_SHORT).show();
    }
    /* This is called when the launchMediaStreamer is clicked */
    public void launchCapstone(View view) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my capstone streamer app!",
                Toast.LENGTH_SHORT).show();
    }

    /* This method displayes the given quantity value on the screen *?
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.set("" + number);
    }
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

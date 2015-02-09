package co.mobilemakers.portfoliopiece;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    PictureModel pictures[];

    protected void loadPictures() {
        pictures = new PictureModel[3];

        pictures[0].setName(getResources().getString(R.string.name_la_gioconda));
        pictures[0].setImageId(R.drawable.La_Gioconda);
        pictures[0].setThumbnailId(R.drawable.t_La_Gioconda);

        pictures[1].setName(getResources().getString(R.string.name_guernica));
        pictures[1].setImageId(R.drawable.Guernica);
        pictures[1].setThumbnailId(R.drawable.t_Guernica);

        pictures[2].setName(getResources().getString(R.string.name_skrik));
        pictures[2].setImageId(R.drawable.Skrik);
        pictures[2].setThumbnailId(R.drawable.t_Skrik);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadPictures();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

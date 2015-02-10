package co.mobilemakers.portfoliopiece;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Main activity. It shows the available paintings.
 */
public class GalleryActivity extends ActionBarActivity {

    /**
     * Array of the available pictures.
     */
    PictureModel pictures[];

    /**
     * How many pictures are in this app.
     *
     * @return The quantity of pictures.
     */
    public int getPicturesQuantity() {
        return pictures.length;
    }

    /**
     * Get the id corresponding to a picture's thumbnail.
     * @param nPicture The index of the picture.
     * @return The id of the thumbnail.
     */
    public int getPictureThumbnailId(int nPicture) {
        return pictures[nPicture].getThumbnailId();
    }

    /**
     * Loads the pictures' info into the "pictures" array.
     */
    protected void loadPictures() {
        pictures = new PictureModel[3];

        pictures[0] = new PictureModel();
        pictures[0].setName(getResources().getString(R.string.name_la_gioconda));
        pictures[0].setImageId(R.drawable.la_gioconda);
        pictures[0].setThumbnailId(R.drawable.t_la_gioconda);

        pictures[1] = new PictureModel();
        pictures[1].setName(getResources().getString(R.string.name_guernica));
        pictures[1].setImageId(R.drawable.guernica);
        pictures[1].setThumbnailId(R.drawable.t_guernica);

        pictures[2] = new PictureModel();
        pictures[2].setName(getResources().getString(R.string.name_skrik));
        pictures[2].setImageId(R.drawable.skrik);
        pictures[2].setThumbnailId(R.drawable.t_skrik);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

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

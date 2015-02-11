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
     * Key to pass the picture via an intent.
     */
    public final static String EXTRA_PICTURE = "EXTRA_PICTURE";
    /**
     * Quantity of available pictures.
     */
    private final int PICTURES_QUANTITY = 8;

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
        return PICTURES_QUANTITY;
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
     * Returns one picture by its index.
     * @param which Index of the picture.
     * @return The picture, as an instance of PictureModel.
     */
    public PictureModel getPicture(int which) {
        return pictures[which];
    }

    /**
     * Loads the pictures' info into the "pictures" array.
     */
    protected void loadPictures() {
        pictures = new PictureModel[PICTURES_QUANTITY];

        pictures[0] = new PictureModel();
        pictures[0].setName(getResources().getString(R.string.local_name_la_gioconda));
        pictures[0].setOriginalName(getResources().getString(R.string.name_la_gioconda));
        pictures[0].setImageId(R.drawable.la_gioconda);
        pictures[0].setYear(1506);
        pictures[0].setThumbnailId(R.drawable.t_la_gioconda);
        /*
        Note: The "La Gioconda"'s year is not just one. It was made between 1503 and 1506,
        and some scholars believe that it was not definitively finished until 1517.
        This functionality will be enhanced in the future.
         */

        pictures[1] = new PictureModel();
        pictures[1].setName(getResources().getString(R.string.local_name_guernica));
        pictures[1].setOriginalName(getResources().getString(R.string.name_guernica));
        pictures[1].setImageId(R.drawable.guernica);
        pictures[1].setYear(1937);
        pictures[1].setThumbnailId(R.drawable.t_guernica);

        pictures[2] = new PictureModel();
        pictures[2].setName(getResources().getString(R.string.local_name_skrik));
        pictures[2].setOriginalName(getResources().getString(R.string.name_skrik));
        pictures[2].setImageId(R.drawable.skrik);
        pictures[2].setYear(1893);
        pictures[2].setThumbnailId(R.drawable.t_skrik);

        pictures[3] = new PictureModel();
        pictures[3].setName(getResources().getString(R.string.local_name_las_meninas));
        pictures[3].setOriginalName(getResources().getString(R.string.name_las_meninas));
        pictures[3].setImageId(R.drawable.las_meninas);
        pictures[3].setYear(1656);
        pictures[3].setThumbnailId(R.drawable.t_las_meninas);

        pictures[4] = new PictureModel();
        pictures[4].setName(getResources().getString(R.string.local_name_la_persistencia_de_la_memoria));
        pictures[4].setOriginalName(getResources().getString(R.string.name_la_persistencia_de_la_memoria));
        pictures[4].setImageId(R.drawable.la_persistencia_de_la_memoria);
        pictures[4].setYear(1931);
        pictures[4].setThumbnailId(R.drawable.t_la_persistencia_de_la_memoria);

        pictures[5] = new PictureModel();
        pictures[5].setName(getResources().getString(R.string.local_name_de_sterrennacht));
        pictures[5].setOriginalName(getResources().getString(R.string.name_de_sterrennacht));
        pictures[5].setImageId(R.drawable.de_sterrennacht);
        pictures[5].setYear(1889);
        pictures[5].setThumbnailId(R.drawable.t_de_sterrennacht);

        pictures[6] = new PictureModel();
        pictures[6].setName(getResources().getString(R.string.local_name_le_fils_de_l_homme));
        pictures[6].setOriginalName(getResources().getString(R.string.name_le_fils_de_l_homme));
        pictures[6].setImageId(R.drawable.le_fils_de_l_homme);
        pictures[6].setYear(1964);
        pictures[6].setThumbnailId(R.drawable.t_le_fils_de_l_homme);

        pictures[7] = new PictureModel();
        pictures[7].setName(getResources().getString(R.string.local_name_nascita_di_venere));
        pictures[7].setOriginalName(getResources().getString(R.string.name_nascita_di_venere));
        pictures[7].setImageId(R.drawable.nascita_di_venere);
        pictures[7].setYear(1484);
        pictures[7].setThumbnailId(R.drawable.t_nascita_di_venere);
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

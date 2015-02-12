package co.mobilemakers.portfoliopiece;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;


public class ShowcaseActivity extends ActionBarActivity {

    PictureModel picture;

    /**
     * Returns the chosen picture
     * @return The picture as an instance of PictureModel
     */
    public PictureModel getPicture() {
        return picture;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ThemeManagement.setActivityTheme(this);

        setContentView(R.layout.activity_showcase);

        picture = getIntent().getParcelableExtra(GalleryActivity.EXTRA_PICTURE);
        setTitle(picture.getName());
    }

    /**
     * Goes to the "year guess" function
     */
    public void goGuessYear() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.showcase_container, new YearGuessFragment())
                .addToBackStack(null)
                .commit();
    }
}

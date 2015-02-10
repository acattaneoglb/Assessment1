package co.mobilemakers.portfoliopiece;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    /**
     * Maximum quantity of pictures in the screen.
     */
    private final static int PICTURES_BY_SCREEN = 6;

    /**
     * Takes account of the first picture showed on screen.
     */
    int firstPicture = 0;
    /**
     * Array of the screen's ImageButtons, for an easier access.
     */
    ImageButton mPictures[];

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Assigns each ImageButton to an array's index.
     * @param rootView The parent view.
     */
    private void controlsToVars(View rootView) {
        mPictures = new ImageButton[PICTURES_BY_SCREEN];
        mPictures[0] = (ImageButton)rootView.findViewById(R.id.image_view_1);
        mPictures[1] = (ImageButton)rootView.findViewById(R.id.image_view_2);
        mPictures[2] = (ImageButton)rootView.findViewById(R.id.image_view_3);
        mPictures[3] = (ImageButton)rootView.findViewById(R.id.image_view_4);
        mPictures[4] = (ImageButton)rootView.findViewById(R.id.image_view_5);
        mPictures[5] = (ImageButton)rootView.findViewById(R.id.image_view_6);
    }

    /**
     * Shows the correspondent picture on each ImageButton.
     */
    protected void showPictures() {
        int posImage = 0;
        GalleryActivity gallery = (GalleryActivity)getActivity();
        int imagesCount = gallery.getPicturesQuantity();

        while (posImage < PICTURES_BY_SCREEN && (firstPicture + posImage) < imagesCount) {
            mPictures[posImage].setImageDrawable(
                    getResources().getDrawable(gallery.getPictureThumbnailId(firstPicture + posImage)));
            posImage++;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        controlsToVars(rootView);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        showPictures();
    }
}

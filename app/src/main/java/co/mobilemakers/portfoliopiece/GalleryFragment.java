package co.mobilemakers.portfoliopiece;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    private final static int PICTURES_BY_SCREEN = 6;

    ImageView mPictures[];

    public GalleryFragment() {
        // Required empty public constructor
    }


    private void controlsToVars(View rootView) {
        mPictures = new ImageView[PICTURES_BY_SCREEN];
        mPictures[0] = (ImageView)rootView.findViewById(R.id.image_view_1);
        mPictures[1] = (ImageView)rootView.findViewById(R.id.image_view_2);
        mPictures[2] = (ImageView)rootView.findViewById(R.id.image_view_3);
        mPictures[3] = (ImageView)rootView.findViewById(R.id.image_view_4);
        mPictures[4] = (ImageView)rootView.findViewById(R.id.image_view_5);
        mPictures[5] = (ImageView)rootView.findViewById(R.id.image_view_6);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        controlsToVars(rootView);



        return rootView;
    }



}

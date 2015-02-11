package co.mobilemakers.portfoliopiece;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PictureFragment extends Fragment {


    public PictureFragment() {
        // Required empty public constructor
    }


    private void loadPicture() {
        View view = getView();
        if (view != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.image_view_picture);
            ShowcaseActivity showcase = (ShowcaseActivity) getActivity();
            imageView.setImageDrawable(getResources().getDrawable(showcase.getPicture().getImageId()));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_picture, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        loadPicture();
    }
}

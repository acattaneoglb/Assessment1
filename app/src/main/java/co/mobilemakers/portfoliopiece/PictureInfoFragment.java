package co.mobilemakers.portfoliopiece;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PictureInfoFragment extends Fragment {


    public PictureInfoFragment() {
        // Required empty public constructor
    }

    private void showPictureInfo() {
        View view = getView();
        if (view != null) {
            ShowcaseActivity showcase = (ShowcaseActivity) getActivity();

            TextView textOriginalName = (TextView) view.findViewById(R.id.text_view_original_name);
            textOriginalName.setText(showcase.getPicture().getOriginalName());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_picture_info, container, false);

        final ShowcaseActivity showcase = (ShowcaseActivity) getActivity();
        Button buttonGuess = (Button)rootView.findViewById(R.id.button_picture_year_guess);
        buttonGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showcase.goGuessYear();
            }
        });
        buttonGuess.setBackgroundDrawable(ThemeManagement.getButtonStyle(showcase));

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        showPictureInfo();
    }
}

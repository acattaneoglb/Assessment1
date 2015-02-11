package co.mobilemakers.portfoliopiece;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class YearGuessFragment extends Fragment {


    public YearGuessFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_year_guess, container, false);

        ShowcaseActivity showcase = (ShowcaseActivity)getActivity();
        final int pictureYear = showcase.getPicture().getYear();

        EditText editYear = (EditText)rootView.findViewById(R.id.edit_text_year);
        final TextView textYearInfo = (TextView)rootView.findViewById(R.id.text_view_year_info);
        editYear.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int guessedYear;
                try {
                    guessedYear = Integer.valueOf(s.toString());
                }
                catch (NumberFormatException e) {
                    textYearInfo.setText(R.string.year_nan);
                    return;
                }
                if (guessedYear < pictureYear) {
                    textYearInfo.setText(R.string.year_its_newer);
                }
                else if (guessedYear > pictureYear) {
                    textYearInfo.setText(R.string.year_its_older);
                }
                else {
                    textYearInfo.setText(R.string.year_right);
                }

            }
        });

        return rootView;
    }


}

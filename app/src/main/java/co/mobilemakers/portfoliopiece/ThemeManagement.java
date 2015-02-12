package co.mobilemakers.portfoliopiece;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;

/**
 * Class to facilitate theme access
 *
 * Created by ariel.cattaneo on 12/02/2015.
 */
public class ThemeManagement {
    public static void setActivityTheme(ActionBarActivity activity) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        String colorSet = sharedPreferences.getString("color_preference", activity.getResources().getString(R.string.louvre));
        if (colorSet.equals(activity.getResources().getString(R.string.louvre))) {
            activity.setTheme(R.style.LouvreTheme);
        }
        if (colorSet.equals(activity.getResources().getString(R.string.orsai))) {
            activity.setTheme(R.style.OrsaiTheme);
        }
        if (colorSet.equals(activity.getResources().getString(R.string.prado))) {
            activity.setTheme(R.style.PradoTheme);
        }
        if (colorSet.equals(activity.getResources().getString(R.string.moma))) {
            activity.setTheme(R.style.MoMATheme);
        }
    }

    public static Drawable getButtonStyle(ActionBarActivity activity) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        String colorSet = sharedPreferences.getString("color_preference", activity.getResources().getString(R.string.louvre));
        if (colorSet.equals(activity.getResources().getString(R.string.orsai))) {
            return activity.getResources().getDrawable(R.drawable.button_orsai_theme);
        }
        if (colorSet.equals(activity.getResources().getString(R.string.prado))) {
            return activity.getResources().getDrawable(R.drawable.button_prado_theme);
        }
        if (colorSet.equals(activity.getResources().getString(R.string.moma))) {
            return activity.getResources().getDrawable(R.drawable.button_moma_theme);
        }
        //if (colorSet.equals(getResources().getString(R.string.louvre))) {
            return activity.getResources().getDrawable(R.drawable.button_louvre_theme);
        //}
    }
}

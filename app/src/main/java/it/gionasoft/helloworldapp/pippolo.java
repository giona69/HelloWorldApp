package it.gionasoft.helloworldapp;

/**
 * Created by granatag on 23/12/2016.
 */
public class pippolo {
    private static pippolo ourInstance = new pippolo();

    public static pippolo getInstance() {
        return ourInstance;
    }

    private pippolo() {

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.myimage);

    }
}

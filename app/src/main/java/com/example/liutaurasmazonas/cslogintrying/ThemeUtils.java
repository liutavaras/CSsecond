package com.example.liutaurasmazonas.cslogintrying;

/**
 * Created by User on 10/04/2017.
 */

import android.app.Activity;

import android.content.Intent;


public class ThemeUtils

{

    private static int cTheme;



    public final static int BLACK = 0;

    public final static int LIGHT = 1;

    public static void changeToTheme(Activity activity, int theme)

    {

        cTheme = theme;

        activity.finish();



        activity.startActivity(new Intent(activity, activity.getClass()));


    }

    public static void onActivityCreateSetTheme(Activity activity)

    {

        switch (cTheme)

        {

            default:

            case BLACK:

                activity.setTheme(R.style.BlackTheme);

                break;

            case LIGHT:

                activity.setTheme(R.style.LightTheme);

                break;

        }

    }

}
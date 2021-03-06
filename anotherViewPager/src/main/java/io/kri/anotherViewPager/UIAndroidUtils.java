package io.kri.anotherViewPager;

import android.content.Context;


/**
 * @author Kristiyan Petrov
 */
public class UIAndroidUtils {

    private UIAndroidUtils() {
    }

    /**
     * get dimensions given resource  id
     *
     * @param context    context
     * @param resourceId resource id
     * @return value in px
     */
    public static float getDimenFromResource(final Context context, final int resourceId) {
        return context.getResources().getDimension(resourceId);
    }
}

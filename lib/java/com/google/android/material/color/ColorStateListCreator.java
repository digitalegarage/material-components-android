package com.google.android.material.color;

import android.content.res.ColorStateList;

import androidx.annotation.ColorInt;

public class ColorStateListCreator {
  public static ColorStateList create(@ColorInt int accentColor, @ColorInt int defaultColor) {
    int[][] states = new int[][]{
        new int[]{android.R.attr.state_selected},
        new int[]{android.R.attr.state_checked},
        new int[]{-android.R.attr.state_selected},
        new int[]{-android.R.attr.state_checked},
    };
    int[] textColors = new int[]{
        accentColor,
        accentColor,
        defaultColor,
        defaultColor
    };
    return new ColorStateList(states, textColors);
  }
}

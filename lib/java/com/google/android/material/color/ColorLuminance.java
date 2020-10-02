package com.google.android.material.color;

import androidx.annotation.ColorInt;
import androidx.core.graphics.ColorUtils;

public class ColorLuminance {
  public static boolean isDark(@ColorInt int color) {
    return ColorUtils.calculateLuminance(color) < 0.5;
  }
}

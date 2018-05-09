package com.qiaop.common.imageloader;

import android.content.Context;
import android.media.Image;

/**
 * Created by qiaopeng0809@gmail.com on 2018/5/9.
 */
public class ImageLoaderUtil {

    public static final int PIC_LARGE = 0;
    public static final int PIC_MEDIUM = 1;
    public static final int PIC_SMALL = 2;

    public static final int LOAD_STRATEGY_NORMAL = 0;
    public static final int LOAD_STRATEGY_ONLY_WIFI = 1;

    public static boolean wifiFlag = false;

    private BaseImageLoaderStrategy mStrategy;

    public ImageLoaderUtil() {
        mStrategy = new GlideImageLoaderStrategy();
    }

    public void loadImage(Context context, ImageLoader imageLoader){
        mStrategy.loadImage(context,imageLoader);
    }

    public void setLoadImageStrategy(BaseImageLoaderStrategy strategy){
        this.mStrategy = strategy;
    }
}

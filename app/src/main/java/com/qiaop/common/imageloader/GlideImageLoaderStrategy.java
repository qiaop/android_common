package com.qiaop.common.imageloader;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


/**
 * Created by qiaopeng0809@gmail.com on 2018/5/9.
 */
public class GlideImageLoaderStrategy implements BaseImageLoaderStrategy{


    @Override
    public void loadImage(Context context, ImageLoader imageLoader) {
        loadNormal(context,imageLoader);
    }

    private void loadNormal(Context context,ImageLoader imageLoader){
        RequestOptions options = new RequestOptions().placeholder(imageLoader.getPlaceHolder());
        Glide.with(context).load(imageLoader.getUrl()).apply(options).into(imageLoader.getImageView());
    }

}

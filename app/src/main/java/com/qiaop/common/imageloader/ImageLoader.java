package com.qiaop.common.imageloader;

import android.widget.ImageView;

import com.qiaop.common.R;

/**
 * Created by qiaopeng0809@gmail.com on 2018/5/9.
 */
public class ImageLoader {

    private int type;

    private String url;

    private int placeHolder;

    private ImageView imageView;

    private int netStrategy;

    private ImageLoader(Builder builder) {

        this.type = builder.type;
        this.url = builder.url;
        this.placeHolder = builder.placeHolder;
        this.imageView = builder.imageView;
        this.netStrategy = builder.netStrategy;
    }

    public int getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public int getPlaceHolder() {
        return placeHolder;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getNetStrategy() {
        return netStrategy;
    }

    public static class Builder{

        private int type;

        private String url;

        private int placeHolder;

        private ImageView imageView;

        private int netStrategy;

        public Builder() {
            this.type = ImageLoaderUtil.PIC_SMALL;
            this.url = "";
            this.placeHolder = R.mipmap.default_pic_big;
            this.imageView = null;
            this.netStrategy = ImageLoaderUtil.LOAD_STRATEGY_NORMAL;
        }

        public Builder type(int type){
            this.type = type;
            return this;
        }
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder placeHolder(int placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }

        public Builder imgView(ImageView imageView) {
            this.imageView = imageView;
            return this;
        }

        public Builder strategy(int strategy) {
            this.netStrategy = strategy;
            return this;
        }

        public ImageLoader build(){
            return new ImageLoader(this);
        }
    }
}

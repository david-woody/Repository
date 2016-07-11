package com.adoregeek.wallpage.custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

import com.adoregeek.wallpage.R;

/**
 * Created by Administrator on 2016/7/8 0008.
 */
public class CustomViewPager extends ViewPager {

    private Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.wall2);

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private static final int INVALID_POS = 0;
    private int mFirstPos = INVALID_POS;

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int count = getAdapter().getCount();
            int x = mFirstPos * getWidth() + getScrollX();

            float widthForItem = width * 1.0f / count;
            float widthForPerPix = widthForItem * 1.0f / getWidth();
            Rect src = new Rect((int) (x * widthForPerPix), 0, (int) (x * widthForPerPix + widthForItem), height);
            Rect desc = new Rect((int) getScrollX(), 0, getScrollX() + getWidth(), getHeight());
            canvas.drawBitmap(bitmap, src, desc, null);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void setCurrentItem(int item) {
        mFirstPos = item;
        super.setCurrentItem(item);
    }
}

package com.example.android_pindao;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by 刘文艺 on 2017/11/15.
 */

public class MyGridView extends GridView {


    public MyGridView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
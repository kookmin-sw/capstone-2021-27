package com.example.datadamoa;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class WorkListView extends ListView {

    public WorkListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WorkListView(Context context) {
        super(context);
    }

    public WorkListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    // 사이즈를 유동적이게 리스트뷰를 설정한다.
    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
package com.nickand.foodreceipes.util;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class VerticalSpacingItemDecorator extends RecyclerView.ItemDecoration {

    private final int verticalSpacingHeight;

    public VerticalSpacingItemDecorator(int verticalSpacingHeight) {
        this.verticalSpacingHeight = verticalSpacingHeight;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
         outRect.top = verticalSpacingHeight;
    }
}

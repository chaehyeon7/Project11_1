package kr.hs.emirim.chaehyeon.project11_1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.m_1, R.drawable.m_2, R.drawable.m_3, R.drawable.m_4, R.drawable.m_5, R.drawable.m_6, R.drawable.m_7, R.drawable.m_8, R.drawable.m_9, R.drawable.m_10,
            R.drawable.m_1, R.drawable.m_2, R.drawable.m_3, R.drawable.m_4, R.drawable.m_5, R.drawable.m_6, R.drawable.m_7, R.drawable.m_8, R.drawable.m_9, R.drawable.m_10};

    public GridAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(posterIds[i]);
        return imgv;
    }
}

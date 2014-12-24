package com.example.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdpter extends BaseAdapter {
	
	private Context mContext;
	
	public ImageAdpter(Context context) {
		mContext = context;
		
	}
	
	

	@Override
	public int getCount() {
		return mThumbIds.length;
		
	}

	@Override
	public Object getItem(int arg0) {
		
		
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		
		
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ImageView imageView;
		if(convertView == null)  {
			
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(150,150));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(5, 5, 5, 5);
			
		}  	else {
			imageView = (ImageView) convertView;
		}
		
		imageView.setImageResource(mThumbIds[position]);
		
		return imageView;
	}
	
	
	public Integer[] mThumbIds = {
			
			R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
			
			
					
	};

}

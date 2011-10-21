package ulima.soft.ii;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageViewAdapter extends BaseAdapter{

	public ArrayList<Integer> images;
	public Context context;
	
	public static class ViewHolder{
		
		public ImageView images;
		
		public ViewHolder(){

		}
		
	}
	
	public ImageViewAdapter(ArrayList<Integer> images, Context context){
		this.images = images;
		this.context = context;
	}	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return images.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return images.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ViewHolder holder =  new ViewHolder();
		
		if(convertView == null){
			
			LayoutInflater inflator =(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflator.inflate(R.layout.list_item_img, null);
			
			holder.images = (ImageView)convertView.findViewById(R.id.imageView1);
			convertView.setTag(holder);
			
		}else{
			
			holder = (ViewHolder)convertView.getTag();
			
		}
		
		holder.images.setImageResource(images.get(position));
		
		
		
		return convertView;
	}
	

}

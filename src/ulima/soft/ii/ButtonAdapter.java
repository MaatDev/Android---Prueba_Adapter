package ulima.soft.ii;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class ButtonAdapter extends BaseAdapter{

	public ArrayList<String> texts;
	public Context context;
	
	public static class ViewHolder{
		
		public Button button;
		
		public ViewHolder(){

		}
		
	}
	
	public ButtonAdapter(ArrayList<String> texts, Context context){
		this.texts = texts;
		this.context = context;
	}	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return texts.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return texts.get(position);
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
			convertView = inflator.inflate(R.layout.list_item_btn, null);
			
			holder.button = (Button)convertView.findViewById(R.id.button1);
			convertView.setTag(holder);
			
		}else{
			
			holder = (ViewHolder)convertView.getTag();
			
		}
		
		holder.button.setText(texts.get(position));
		
		
		
		return convertView;
	}
	

}

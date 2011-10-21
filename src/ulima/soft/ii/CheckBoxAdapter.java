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

public class CheckBoxAdapter extends BaseAdapter{

	public ArrayList<Boolean> checks;
	public Context context;
	
	public static class ViewHolder{
		
		public CheckBox check;
		
		public ViewHolder(){

		}
		
	}
	
	public CheckBoxAdapter(ArrayList<Boolean> checks, Context context){
		this.checks = checks;
		this.context = context;
	}	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return checks.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return checks.get(position);
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
			convertView = inflator.inflate(R.layout.list_item_check, null);
			
			holder.check = (CheckBox)convertView.findViewById(R.id.checkBox1);
			convertView.setTag(holder);
			
		}else{
			
			holder = (ViewHolder)convertView.getTag();
			
		}
		
		holder.check.setChecked(checks.get(position));
		
		
		
		return convertView;
	}
	

}

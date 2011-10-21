package ulima.soft.ii;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

public class Prueba_AdapterActivity extends Activity {
    
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView textViewList = (ListView) findViewById(R.id.lv_text);
        ListView checkBoxList = (ListView) findViewById(R.id.lv_check);
        ListView imageViewList = (ListView) findViewById(R.id.lv_img);
        ListView buttonList = (ListView) findViewById(R.id.lv_btn);
        
        ArrayList<String> texts = new ArrayList<String>();
        ArrayList<Boolean> checks = new ArrayList<Boolean>();
        ArrayList<Integer> images = new ArrayList<Integer>();
        ArrayList<String> buttons = new ArrayList<String>();
        
        for(int i = 0; i < 40; i++){
        	texts.add("Texto: "+i);
        	checks.add(new Random().nextInt(4)>2?true:false);
        	images.add(getResources().getIdentifier("img"+new Random().nextInt(3), "drawable", getPackageName()));
        	buttons.add("Boton: "+i);
        }
                
        textViewList.setAdapter(new TextViewAdapter(texts, this));
        checkBoxList.setAdapter(new CheckBoxAdapter(checks, this));
        imageViewList.setAdapter(new ImageViewAdapter(images, this));
        buttonList.setAdapter(new ButtonAdapter(buttons, this));
        
        
    }
}
package ro.pub.cs.systems.pdsd.practicaltest01var05;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PracticalTest01Var05MainActivity extends Activity {
	  private final static int SECONDARY_ACTIVITY_REQUEST_CODE = 1;

	 private ButtonClickListener buttonClickListener = new ButtonClickListener();
	 
	  private class ButtonClickListener implements Button.OnClickListener {
	 
	    @Override
	    public void onClick(View view) {
	    EditText editText = (EditText)PracticalTest01Var05MainActivity.this.findViewById(R.id.edit_text);
	    String state;
		state = editText.getText().toString();
	      
		switch(view.getId()){
		case R.id.navigate:
	          Intent intent = new Intent("ro.pub.cs.systems.pdsd.intent.action.PracticalTest01Var05SecondaryActivity");
	          intent.putExtra("number_of_trimise", editText.getText().toString());
	          startActivityForResult(intent, SECONDARY_ACTIVITY_REQUEST_CODE);
	          break;
		
		case R.id.north:
			if(!state.isEmpty())
				state = state + ",North";
			else
				
				state = state + "North";
				editText.setText(state);
				break;
			
			
		case R.id.south:
			if(!state.isEmpty())
				state = state + ",South";
			else
				
				state = state + "South";
				editText.setText(state);
				break;
			
		case R.id.east:
			if(!state.isEmpty())
				state = state + ",East";
			else
				
				state = state + "East";
				editText.setText(state);
				break;
			
		case R.id.west:
			if(!state.isEmpty())
				state = state + ",West";
			else
				
				state = state + "west";
				editText.setText(state);
				break;
			
			
				
	    }
	  }
	}
	  
	  public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		    Toast.makeText(this, "The activity returned with result "+resultCode, Toast.LENGTH_LONG).show();
		  }
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_practical_test01_var05_main);
		
		 EditText editText = (EditText)findViewById(R.id.edit_text);
		 
		 Button north = (Button)findViewById(R.id.north);
		 north.setOnClickListener(buttonClickListener);
		 Button south = (Button)findViewById(R.id.south);
		 south.setOnClickListener(buttonClickListener);
		 Button west = (Button)findViewById(R.id.west);
		 west.setOnClickListener(buttonClickListener);
		 Button east = (Button)findViewById(R.id.east);
		 east.setOnClickListener(buttonClickListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.practical_test01_var05_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

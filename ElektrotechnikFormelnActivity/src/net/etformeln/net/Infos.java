package net.etformeln.net;


import net.etformeln.net.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Infos extends Activity implements View.OnClickListener{
    /** Called when the activity is first created. */
	Button senden;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
      //Fullscreen start
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Fullscreen ende
        setContentView(R.layout.infos);
        initializeVars();
        senden.setOnClickListener(this);
        
    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu Menu) {
    	MenuInflater Inflater = getMenuInflater();
    	Inflater.inflate(R.menu.mainmenu, Menu);
    	return true;
    	
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	//um eine neue menue zuweisung zu machen, gleich machen wie hier unten, nach dem break.
    	switch(item.getItemId()) {
 
    	case R.id.Infos:
    		startActivity(new Intent("net.etformeln.net.infos"));
    		break;

    		
    		
    		
    	}
    	return false;
    }

    private void initializeVars() {
    	senden = (Button) findViewById(R.id.sendemail1);
    }


public void onClick(View v) {
	
	Intent intEmail = new Intent(android.content.Intent.ACTION_SEND);
	String[] recipients = new String[]{"pfiffner1988@gmail.com","",};
	intEmail.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
	intEmail.putExtra(android.content.Intent.EXTRA_SUBJECT, "Anmerkung");
	intEmail.putExtra(android.content.Intent.EXTRA_TEXT, "");
	intEmail.setType("plain/text");
	startActivity(Intent.createChooser(intEmail, "senden"));
	finish();
}
@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	finish();
	}
}

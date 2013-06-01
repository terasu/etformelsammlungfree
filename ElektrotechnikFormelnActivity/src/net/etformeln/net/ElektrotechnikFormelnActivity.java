package net.etformeln.net;



import com.google.ads.AdRequest;
import com.google.ads.AdView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class ElektrotechnikFormelnActivity extends Activity implements View.OnClickListener{
	Button senden;
	EditText formeltitel, formel, anmerkung, groessenderform;
	String titelderformel, dieformel, dieanmerkung, diegroessen;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	      //Fullscreen start
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
		WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    //Fullscreen ende
		setContentView(R.layout.main);
		//Tab setup start
		TabHost th = (TabHost)findViewById(R.id.tabhost);
		th.setup();
		TabSpec specs = th.newTabSpec("tag1");
		specs.setContent(R.id.tab1);
		specs.setIndicator("Formeln");
		th.addTab(specs);
		specs = th.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("Formel Senden");
		th.addTab(specs);
		//Tabsetup ende
		//AddRequest

        //Addrequest ende
		initializeVars();
		senden.setOnClickListener(this);
        AdView ad = (AdView)findViewById(R.id.ad);
        ad.loadAd(new AdRequest());
    }
    public void formelseitewechselnohmischesgesetz(View view) {
    	startActivity(new Intent("net.etformeln.net.OHMISCHESGESETZ"));
    }
    public void formelseitewechselnwiederstandundleitwert(View view) {
    	startActivity(new Intent("net.etformeln.net.WIEDERSTANDUNDLEITWERT"));
    }
    public void seitewechselnkirchhoffschesgesetz(View view) {
    	startActivity(new Intent("net.etformeln.net.kirchhofschesgesetz"));
    }
    public void hauptmenu(View view) {
    	setContentView(R.layout.main);
    }
    public void seitewechselnstromdichte(View view) {
    	startActivity(new Intent("net.etformeln.net.stromdichte"));
    }
    public void seitewechselnwiederstandundmaterial(View view) {
    	startActivity(new Intent("net.etformeln.net.wiederstandundmaterial"));
    }
    public void seitewechselnelstromstaerke(View view) {
    	startActivity(new Intent("net.etformeln.net.elstromstaerke"));
    }
    public void seitewechselnleistung(View view) {
    	startActivity(new Intent("net.etformeln.net.leistung"));
    }
    public void seitewechselnzugfestigkeit(View view) {
    	startActivity(new Intent("net.etformeln.net.zugfestigkeit"));
    }
    public void seitewechselnwirkungsgrad(View view) {
    	startActivity(new Intent("net.etformeln.net.wirkungsgrad"));
    }
    public void seitewechselnserieschaltung(View view) {
    	startActivity(new Intent("net.etformeln.net.serieschaltung"));
    }
    public void seitewechselnparallelschaltung(View view) {
    	startActivity(new Intent("net.etformeln.net.parallelschaltung"));
    }
    public void seitewechselngalvanischeselement(View view) {
    	startActivity(new Intent("net.etformeln.net.galvanischeselement"));
    }
    public void seitewechselnmagnetischedurchflutung(View view) {
    	startActivity(new Intent("net.etformeln.net.magnetischedurchflutung"));
    }
    public void seitewechselnkosten(View view) {
    	startActivity(new Intent("net.etformeln.net.kosten"));
    }
    public void seitewechselninduktionsgesetz(View view) {
    	startActivity(new Intent("net.etformeln.net.induktion"));
    }
    public void seitewechselnfrequndperio(View view) {
    	startActivity(new Intent("net.etformeln.net.frequenzperioden"));
    }
    public void seitewechselnsterndreieck(View view) {
    	startActivity(new Intent("net.etformeln.net.sterndreieck"));
    }
    public void seitewechselntransformator(View view) {
    	startActivity(new Intent("net.etformeln.net.transformator"));
    }
    public void seitewechselnleistungsbestimmung(View view) {
    	startActivity(new Intent("net.etformeln.net.leistungsbestimmung"));
    }
    public void seitewechselnwaerme(View view) {
    	startActivity(new Intent("net.etformeln.net.waerme"));
    }
    public void seitewechselnwirkleistung(View view) {
    	startActivity(new Intent("net.etformeln.net.wirkleistung"));
    }
    public void formelsenden(View view) {
    	startActivity(new Intent("net.etformeln.net.FORMELSENDENEMAIL"));
    }
    public void seitewechselnkondensator(View view) {
    	startActivity(new Intent("net.etformeln.net.kondensator"));
    }
    public void leistungsdreieckwechseln(View view) {
    	startActivity(new Intent("net.etformeln.net.leistungsdreieck"));
    }
    public void tempwiederstandwechselm(View view) {
    	startActivity(new Intent("net.etformeln.net.tempwiderstand"));
    }
    public void seitepegel(View view) {
    	startActivity(new Intent("net.etformeln.net.pegelverstaerkung"));
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
    	senden = (Button) findViewById(R.id.bsenden);
    	formeltitel = (EditText) findViewById(R.id.etformeltitel);
    	formel = (EditText) findViewById(R.id.etformel);
    	groessenderform = (EditText) findViewById(R.id.etgroessen);
    	anmerkung = (EditText) findViewById(R.id.etanmerkung);
    }
    public void onClick(View v) {
    	convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
    	String message = "name der formel: " 
    			+ titelderformel 
    			+ " Die neue formel: " 
    			+ dieformel 
    			+ " Die Formel Groessen: "
    			+ diegroessen
    			+ " eine anmerkung diesbezüglich: "
    			+ dieanmerkung ;
    			
    			
    			
    			
    			
    	Intent intEmail = new Intent(android.content.Intent.ACTION_SEND);
    	String[] recipients = new String[]{"pfiffner1988@gmail.com","",};
    	intEmail.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
    	intEmail.putExtra(android.content.Intent.EXTRA_SUBJECT, "Neue Formel");
    	intEmail.putExtra(android.content.Intent.EXTRA_TEXT, "");
    	intEmail.setType("plain/text");
    	intEmail.putExtra(android.content.Intent.EXTRA_TEXT, message);
    	startActivity(Intent.createChooser(intEmail, "senden"));
    	finish();
    }
    private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {    
    	titelderformel = formeltitel.getText().toString();
    	dieformel = formel.getText().toString();
    	diegroessen = groessenderform.getText().toString();
    	dieanmerkung = anmerkung.getText().toString();
    }
 
}

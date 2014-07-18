package jp.weapon.kamenriderblack;

import jp.weapon.kamenriderblack.R;
import jp.weapon.kamenriderblack.actionbar.SupportFragmentTabListener;
import jp.weapon.kamenriderblack.fragment.EvidencesFragment;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.*;
import android.support.v7.app.ActionBar.Tab;
import android.view.Menu;

public class MainActivity extends ActionBarActivity {
	
	public static final String EVIDENCES_FRAGMENT = "EvidencesFragment";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupTabs();
	}

	private void setupTabs() {
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);		
		actionBar.setDisplayShowTitleEnabled(true);		
		
		Resources resources = getResources();
		
		final Tab evidencesTab = actionBar
						.newTab()
						.setTag(EVIDENCES_FRAGMENT)
						.setIcon(R.drawable.ic_evidences)
						.setTabListener(new SupportFragmentTabListener<EvidencesFragment>(R.id.content_container, this, EVIDENCES_FRAGMENT, EvidencesFragment.class));
		
		final Tab monstersNearbyTag = actionBar
				.newTab()
				.setTag(EVIDENCES_FRAGMENT)
				.setIcon(R.drawable.ic_evidences)
				.setTabListener(new SupportFragmentTabListener<EvidencesFragment>(R.id.content_container, this, EVIDENCES_FRAGMENT, EvidencesFragment.class));
		
		final Tab motocyclesTab = actionBar
				.newTab()
				.setTag(EVIDENCES_FRAGMENT)
				.setIcon(R.drawable.ic_evidences)
				.setTabListener(new SupportFragmentTabListener<EvidencesFragment>(R.id.content_container, this, EVIDENCES_FRAGMENT, EvidencesFragment.class));
		
		final Tab weaponsTab = actionBar
				.newTab()
				.setTag(EVIDENCES_FRAGMENT)
				.setIcon(R.drawable.ic_evidences)
				.setTabListener(new SupportFragmentTabListener<EvidencesFragment>(R.id.content_container, this, EVIDENCES_FRAGMENT, EvidencesFragment.class));
		
		
		actionBar.addTab(evidencesTab);
		actionBar.addTab(monstersNearbyTag);
		actionBar.addTab(motocyclesTab);
		actionBar.addTab(weaponsTab);
		
		actionBar.selectTab(evidencesTab);
						
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}

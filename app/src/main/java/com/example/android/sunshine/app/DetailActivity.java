package com.example.android.sunshine.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;




public class DetailActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (savedInstanceState == null) {
            // Create the detail fragment and add it to thea ctivity
            // using a fragment transaction

            Bundle arguments = new Bundle();
            arguments.putParcelable(DetailFragment.DETAIL_URI, getIntent().getData());

            DetailFragment fragment = new DetailFragment();
            fragment.setArguments(arguments);

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.weather_detail_container, fragment)
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);

        /*
        MenuItem menuItem = menu.findItem(R.id.menu_item_share);
        ShareActionProvider mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        */

        return true;
    }

        /*
    private void setShareIntent(Intent shareIntent){
        if (mShareActionProvider != null){
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }
    */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }

        /*
        if (id == R.id.menu_item_share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            Intent forecast = this.getIntent();
            if (forecast != null && forecast.hasExtra(Intent.EXTRA_TEXT)){
                intent.putExtra(Intent.EXTRA_TEXT, forecast.getStringExtra(Intent.EXTRA_TEXT));
                setShareIntent(intent);
            }
            return true;
        }
        */

        return super.onOptionsItemSelected(item);
    }


}

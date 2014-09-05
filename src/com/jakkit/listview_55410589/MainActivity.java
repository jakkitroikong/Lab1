package com.jakkit.listview_55410589;

import java.util.ArrayList;

import android.R.drawable;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private ListView listview1;
	private ArrayList<List_items> listitem;
	private int[] drawable = { R.drawable.facebook, R.drawable.google_plush, R.drawable.twitter, R.drawable.youtube };
	private ListAdapter adapter;
	private String[] jakkit = { "Facebook", "Google+", "Twitter", "Youtube" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listview1 = (ListView) findViewById(R.id.listView1);
		listitem = new ArrayList<List_items>();
		for (int i = 0; i < drawable.length; i++) {
			List_items items = new List_items();
			items.setJakkit(jakkit[i]);
			items.setDrawable(getResources().getDrawable(drawable[i]));
			listitem.add(items);
		}
		adapter = new Myadapter();
		listview1.setAdapter(adapter);
	}

	private class Myadapter extends BaseAdapter {
		private Holder holder;

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return listitem.size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View view, ViewGroup arg2) {
			// TODO Auto-generated method stub
			view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_589, null);
			holder = new Holder();
			holder.txt1 = (TextView) view.findViewById(R.id.textView1);
			holder.imageView = (ImageView) view.findViewById(R.id.imageView1);

			if (listitem.get(position).getJakkit() != null) {
				holder.txt1.setText(listitem.get(position).getJakkit());
			}
			if (listitem.get(position).getDrawable() != null) {
				holder.imageView.setImageDrawable(listitem.get(position).getDrawable());
			}
			return view;

		}

		public class Holder {
			public TextView txt1;
			public ImageView imageView;
		}
	}

}

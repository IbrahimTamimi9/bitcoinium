package com.veken0m.bitcoinium;

import com.veken0m.bitcoinium.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BTCEFragment extends BaseExchangeFragment {

	public BTCEFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.menu_fragment, container, false);
		buildMenu(view, BTCE);
		return view;
	}

}

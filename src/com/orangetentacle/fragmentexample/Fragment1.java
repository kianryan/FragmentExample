package com.orangetentacle.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by IntelliJ IDEA.
 * User: kian
 * Date: 07/08/2011
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
 */
public class Fragment1 extends Fragment {

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        textView = (TextView) view.findViewById(R.id.textView1);
        return view;
    }

    public void setText(String text)
    {
        textView.setText(text);
    }

    public interface OnButton1ClickedListener {
        public void onButton1Clicked();
    }


}
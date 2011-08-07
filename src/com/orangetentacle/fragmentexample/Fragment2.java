package com.orangetentacle.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by IntelliJ IDEA.
 * User: kian
 * Date: 07/08/2011
 * Time: 19:45
 * To change this template use File | Settings | File Templates.
 */
public class Fragment2 extends Fragment{

    TextView textView;
    Button button;

    OnButton2ClickedListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        textView = (TextView) view.findViewById(R.id.textView2);
        button = (Button) view.findViewById(R.id.button2);
        button.setOnClickListener(clickListener);
        return view;
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mListener = (OnButton2ClickedListener)activity;
    }


    public void setText(String text)
    {
        textView.setText(text);
    }

    public View.OnClickListener clickListener = new View.OnClickListener() {
        public void onClick(View view) {
            mListener.onButton2Clicked();
        }
    };

    public interface OnButton2ClickedListener {
        public void onButton2Clicked();
    }

}

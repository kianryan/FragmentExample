package com.orangetentacle.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by IntelliJ IDEA.
 * User: kian
 * Date: 07/08/2011
 * Time: 19:45
 * To change this template use File | Settings | File Templates.
 */
public class Fragment2 extends Fragment{

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment2, container, false);
    }

}

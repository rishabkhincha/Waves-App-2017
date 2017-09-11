package org.bits_waves.waves2017;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Keshav on 09-Sep-17.
 */

public class OurTeam_FragementWaves extends android.support.v4.app.Fragment{

    private View inf;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        inf=inflater.inflate(R.layout.our_team_fragement_waves, container,false);

        return inf;
    }
}

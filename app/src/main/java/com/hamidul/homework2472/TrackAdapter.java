package com.hamidul.homework2472;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class TrackAdapter extends BaseAdapter {

    private Context context;
    private TrackModel[] tracks;

    TrackAdapter(Context context, TrackModel[] tracks){
        this.context=context;
        this.tracks=tracks;
    }

    @Override
    public int getCount() {
        return tracks.length;
    }

    @Override
    public Object getItem(int i) {
        return tracks[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TrackModel track = (TrackModel) getItem(i);

        return null;
    }

   static class viewHolder{

   }


}

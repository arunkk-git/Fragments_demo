package tech.sree.com.fragments_demo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by ananth on 3/18/2016.
 */
public class FragmentOne extends Fragment {
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        listView = (ListView)view.findViewById(R.id.list_view_one);
        String[] android_ver =  getResources().getStringArray(R.array.Android_version);
        arrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_view_textview,R.id.list_textview,android_ver);
        listView.setAdapter(arrayAdapter);
        return view;
    }
}

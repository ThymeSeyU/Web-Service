package com.example.webservice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<DataItem> {

    private List<DataItem> dataItemList;

    private Context context;

    public ListViewAdapter(List<DataItem> dataItemList, Context context) {
        super(context, R.layout.list_item, dataItemList);
        this.dataItemList = dataItemList;
        this.context = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        TextView textViewNo = listViewItem.findViewById(R.id.textViewNama);
        TextView textViewName = listViewItem.findViewById(R.id.textViewNrp);
        TextView textViewPosition = listViewItem.findViewById(R.id.textViewUmur);
        TextView textViewBirth_date = listViewItem.findViewById(R.id.textViewHobby);


        DataItem dataItem = dataItemList.get(position);

        textViewNo.setText(dataItem.getNama());
        textViewName.setText(dataItem.getNrp());
        textViewBirth_date.setText(dataItem.getUmur());
        textViewPosition.setText(dataItem.getHobby());

        return listViewItem;
    }
}

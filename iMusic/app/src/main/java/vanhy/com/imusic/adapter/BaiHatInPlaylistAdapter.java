package vanhy.com.imusic.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import vanhy.com.imusic.R;
import vanhy.com.imusic.model.BaiHat;

public class BaiHatInPlaylistAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<BaiHat> listBh;

    public BaiHatInPlaylistAdapter(Context context, int layout, ArrayList<BaiHat> listBh) {
        this.context = context;
        this.layout = layout;
        this.listBh = listBh;
    }

    @Override
    public int getCount() {
        return listBh.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.textViewTenBh = (TextView) view.findViewById(R.id.textViewTenPL);
            holder.textViewTenCs = (TextView) view.findViewById(R.id.textViewSL_PL);
            holder.imgPlaylist = (ImageView) view.findViewById(R.id.imgPlaylist);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        BaiHat bh = listBh.get(i);

        holder.textViewTenBh.setText(bh.getTitle());
        holder.textViewTenCs.setText(bh.getArtist());
        Picasso.with(context).load(bh.getArtworkUrl()).placeholder(R.drawable.music_placeholder).into(holder.imgPlaylist);

        return view;
    }

    private class ViewHolder {
        TextView textViewTenBh;
        TextView textViewTenCs;
        ImageView imgPlaylist;
    }

}

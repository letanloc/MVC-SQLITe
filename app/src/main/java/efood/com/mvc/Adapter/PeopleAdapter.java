package efood.com.mvc.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import efood.com.mvc.Model.People;
import efood.com.mvc.R;

/**
 * Created by loc on 13/04/2016.
 */
public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHoler> {
    List<People> list;

    public PeopleAdapter(List<People> peoples) {
        list = peoples;
    }

    @Override
    public ViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHoler(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adapter, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHoler holder, int position) {
        holder.txtTile.setText(list.get(position).getUsername());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHoler extends RecyclerView.ViewHolder {
        TextView txtTile;

        public ViewHoler(View itemView) {
            super(itemView);
            txtTile = (TextView) itemView.findViewById(R.id.txtTitle);
        }
    }
}

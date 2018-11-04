package activity.drawer.navigation.com.kitabsawtitest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.Introduction;


public class IntroductionAdapter extends RecyclerView.Adapter<IntroductionAdapter.MyViewHolder> {


    Context context;     // changes
    private List<Introduction> introductionList;

    public IntroductionAdapter(Context context, List<Introduction> introductionList) {
        this.context = context;
        this.introductionList = introductionList;
        setHasStableIds(true);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.introduction_list, parent, false);  // change

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        final Introduction introduction = introductionList.get(position);


        if (introduction.getImage() != null) {
            Glide.with(holder.imageView).load(introduction.getImage()).into(holder.imageView);
        } else {
            holder.imageView.setImageResource(android.R.color.transparent);
        }


        holder.introduction.setText(introduction.getIntroduction());

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return introductionList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView introduction, about;
        public CircularImageView imageView;


        public MyViewHolder(View view) {
            super(view);

            introduction = (TextView) view.findViewById(R.id.introduction);
            about = (TextView) view.findViewById(R.id.about);
            imageView = (CircularImageView) view.findViewById(R.id.circularImageView);


        }
    }
}
package activity.drawer.navigation.com.kitabsawtitest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.Work;


public class WorkingAdapter extends RecyclerView.Adapter<WorkingAdapter.ViewHolder> {


    public List<Work> workList;
    public Context context;

    public WorkingAdapter(List<Work> workList, Context context) {
        this.workList = workList;
        this.context = context;

    }

    @NonNull
    @Override
    public WorkingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.work_item, parent, false);  // change

        return new WorkingAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkingAdapter.ViewHolder holder, int position) {

        Work work = workList.get(position);
        holder.company.setText(work.getCompany());
        holder.duration.setText(work.getDuration());
        holder.responsibility.setText(work.getResponsibility());


    }

    @Override
    public int getItemCount() {
        return workList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView company, duration, responsibility;


        public ViewHolder(View view) {
            super(view);
            company = (TextView) view.findViewById(R.id.company);
            duration = (TextView) view.findViewById(R.id.duration);
            responsibility = (TextView) view.findViewById(R.id.responsibility);

        }
    }
}

package activity.drawer.navigation.com.kitabsawtitest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.Skill;


public class SkillsAdapter extends RecyclerView.Adapter<SkillsAdapter.ViewHolder> {
    public List<Skill> skillList;
    public Context context;

    public SkillsAdapter(List<Skill> skillList, Context context) {
        this.skillList = skillList;
        this.context = context;

    }

    @NonNull
    @Override
    public SkillsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.skills_item, parent, false);  // change

        return new SkillsAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SkillsAdapter.ViewHolder holder, int position) {

        Skill skill = skillList.get(position);
        holder.programming.setText(skill.getProgramming());
        holder.framework.setText(skill.getFrameworkLibraries());
        holder.architecture.setText(skill.getAndroidArchitectureComponents());
        holder.software.setText(skill.getSoftwareMethodologies());
        holder.ide.setText(skill.getIDES());


    }

    @Override
    public int getItemCount() {
        return skillList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView programming, framework, architecture, software, ide;


        public ViewHolder(View view) {
            super(view);
            programming = (TextView) view.findViewById(R.id.programming);
            framework = (TextView) view.findViewById(R.id.framework);
            architecture = (TextView) view.findViewById(R.id.architecture);
            software = (TextView) view.findViewById(R.id.software);
            ide = (TextView) view.findViewById(R.id.ide);


        }
    }
}

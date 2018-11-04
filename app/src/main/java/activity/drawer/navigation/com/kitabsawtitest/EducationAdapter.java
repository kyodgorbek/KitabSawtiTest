package activity.drawer.navigation.com.kitabsawtitest;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.Education;

import static activity.drawer.navigation.com.kitabsawtitest.Pojo.Education.INTERNET_TYPE;
import static activity.drawer.navigation.com.kitabsawtitest.Pojo.Education.UNIVERSITY_TYPE;

public class EducationAdapter extends RecyclerView.Adapter {


    public Context context;
    public List<Education> educationList;
    public List<Subject> subjectList;


    private EducationItem educationItem;

    public EducationAdapter(List<Education> educationList, EducationItem educationItem, Context context) {

        this.educationList = educationList;

        this.context = context;

        this.educationItem = educationItem;


    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        switch (viewType) {

            case INTERNET_TYPE:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.education_item, parent, false);


                return new EducationViewHolder(itemView);


            case UNIVERSITY_TYPE:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_list, parent, false);
                return new UniversityViewHolder(itemView);


        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {


        return educationList.get(position).type;
    }

    @Override
    public int getItemCount() {
        return educationList.size();
    }

    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {

        Education education = educationList.get(position);
        if (education != null) {
            switch (education.type()) {
                case Education.INTERNET_TYPE:
                    ((EducationViewHolder) holder).duration.setText(education.getDuration());
                    ((EducationViewHolder) holder).degree.setText(education.getDegree());
                    ((EducationViewHolder) holder).institution.setText(education.getInstitution());
                    break;


                case Education.UNIVERSITY_TYPE:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        ((UniversityViewHolder) holder).icon.setImageResource(education.image);
                    }
                    ((UniversityViewHolder) holder).item.setText(education.words);


                    break;

            }
        }


    }

    public static class EducationViewHolder extends RecyclerView.ViewHolder {


        public TextView duration, institution, degree;


        public EducationViewHolder(View view) {
            super(view);

            duration = (TextView) view.findViewById(R.id.duration);
            institution = (TextView) view.findViewById(R.id.institution);
            degree = (TextView) view.findViewById(R.id.degree);


        }
    }


    // below my BindViewHolder method where I have implemented MultipleViewTypes

    public static class UniversityViewHolder extends RecyclerView.ViewHolder {


        public ImageView icon;

        public TextView item;


        public UniversityViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = (ImageView) itemView.findViewById(R.id.icon);
            item = (TextView) itemView.findViewById(R.id.item);


        }
    }
}







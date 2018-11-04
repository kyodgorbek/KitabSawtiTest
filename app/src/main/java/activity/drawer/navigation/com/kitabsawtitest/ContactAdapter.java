package activity.drawer.navigation.com.kitabsawtitest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.Contact;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {


    public List<Contact> contactList;
    public Context context;

    public ContactAdapter(List<Contact> contactList, Context context) {
        this.contactList = contactList;
        this.context = context;

    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.contact_item, parent, false);  // change

        return new ContactAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {

        Contact contact = contactList.get(position);
        holder.linkedin.setText(contact.getLinkedin());
        holder.gmail.setText(contact.getGmail());
        holder.contact.setText(contact.getPhoneNumber());
        Picasso.get().load(R.drawable.ic_profile).into(holder.circularImageView);


    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public CircularImageView circularImageView;
        TextView linkedin, gmail, contact;

        public ViewHolder(View view) {
            super(view);
            linkedin = (TextView) view.findViewById(R.id.linkedin);
            gmail = (TextView) view.findViewById(R.id.gmail);
            contact = (TextView) view.findViewById(R.id.contact);
            circularImageView = (CircularImageView) view.findViewById(R.id.circularImageView);

        }
    }
}

package info.androidramp.googleplusbottomtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder() {
            super(new TextView(getApplicationContext()));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.invalidate();
        recyclerView.setAdapter(new RecyclerView.Adapter<ViewHolder>() {


            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder();
            }

            @Override
            public void onBindViewHolder(ViewHolder holder, int position) {
                ((TextView) holder.itemView).setText("item: " + position);
                holder.itemView.setPadding(10,10,10,10);
            }


            @Override
            public int getItemCount() {
                return 50;
            }
        });
    }


}

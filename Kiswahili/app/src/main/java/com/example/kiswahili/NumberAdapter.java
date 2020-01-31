package com.example.kiswahili;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class NumberAdapter extends ArrayAdapter<Number> {
    // Res Id for background color
    private int mColorResourceId;


    public NumberAdapter(Context context, ArrayList<Number> numbers, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, numbers);
        mColorResourceId = colorResourceId;

    }

     @NonNull
    @Override
     public View getView(int position, View convertView, ViewGroup parent) {
         // Gets the AndroidFlavor object from the ArrayAdapter at the appropriate position
        View listItemView = convertView;
         Number currentNumber = getItem(position);

         // Adapters recycle views to AdapterViews.
         // If this is a new View object we're getting, then inflate the layout.
         // If not, this view already has the layout inflated from a previous call to getView,
         // and we modify the View widgets as usual.

         if (convertView == null) {
             convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                     parent, false);
         }

//         ImageView iconView = (ImageView) convertView.findViewById(R.id.list_item_icon);
//         iconView.setImageResource(androidFlavor.image);

         TextView swahiliTextView = (TextView) convertView.findViewById(R.id.swahili_text_view);
         swahiliTextView.setText(currentNumber.getmSwahiliTranslation());

         TextView defaultTextView = (TextView) convertView.findViewById(R.id.default_text_view);
         defaultTextView.setText(currentNumber.getmDefaultTranslation());



         ImageView imageView = (ImageView) convertView.findViewById(R.id.image_image_view);

         if (currentNumber.hasImage()) {

             imageView.setImageResource(currentNumber.getImageResourceId());
             // make the view visible
             imageView.setVisibility(View.VISIBLE);

         }
         else{
             imageView.setVisibility(View.GONE); // doesnt leave space on the  left hand space of the text views

         }


         // set theme color for the list item
         View textContainer = convertView.findViewById(R.id.text_container);
         // find the correct color for each activity
         int color = ContextCompat.getColor(getContext(),mColorResourceId);
         // Set the background color of the text container view
       textContainer.setBackgroundColor(color);

         return convertView;
}
}

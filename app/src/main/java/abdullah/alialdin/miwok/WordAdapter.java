package abdullah.alialdin.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;


import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;
    public WordAdapter(@NonNull Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word word = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView defaultWord = convertView.findViewById(R.id.default_word);
        TextView miwokWord = convertView.findViewById(R.id.miwok_word);
        ImageView image = convertView.findViewById(R.id.image_view);

        assert word != null;
        defaultWord.setText(word.getDefaultWord());
        miwokWord.setText(word.getMiwokWord());
        image.setImageResource(word.getImageResource());
        if(word.getImageResource() == 0){
            image.setVisibility(View.GONE);
        }
        View textContainer = convertView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mColor));

        return convertView;
    }
}

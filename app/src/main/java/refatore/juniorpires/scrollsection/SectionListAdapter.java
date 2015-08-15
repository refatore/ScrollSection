package refatore.juniorpires.scrollsection;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.SectionIndexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by juniorpires on 15/08/15.
 */
public class SectionListAdapter extends ArrayAdapter<String> implements SectionIndexer {

    private HashMap<String,Integer> mapIndex;
    private String[] sections;
    private List<String> list;

    public SectionListAdapter(Context c, List<String> list){
        super(c,android.R.layout.simple_list_item_1,list);
        this.list = list;
        this.mapIndex = new HashMap<String,Integer>();

        this.runIndex();
    }

    private void runIndex(){
        for (int i = 0;i<list.size();i++){
            String item = list.get(i);
            String key = item.substring(0,1);
            key = key.toUpperCase();

            if(!mapIndex.containsKey(key)){
                this.mapIndex.put(key,i);
            }

            Set<String> sectionLetters = mapIndex.keySet();

            ArrayList<String> sectionList = new ArrayList<String>(sectionLetters);

            Collections.sort(sectionList);

            sections = new String[sectionList.size()];

            sectionList.toArray(sections);

        }
    }

    @Override
    public Object[] getSections() {
        return sections;
    }

    @Override
    public int getPositionForSection(int section) {
        return mapIndex.get(sections[section]);

    }

    @Override
    public int getSectionForPosition(int i) {
        return 0;
    }



}

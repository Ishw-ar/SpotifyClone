package com.example.spotifyclone;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class SearchFragment extends Fragment implements ItemClickListener{

  private RecyclerView mrvRecyclerView;
    private List<Image> imageArrayList = new ArrayList<>();






    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        buildData();
        setRecyclerAdapter();
//        Intent intent = new Intent(getContext(), SearchActivity.class);
//        startActivity(intent);
    }

        private void setRecyclerAdapter () {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            mrvRecyclerView.setLayoutManager(gridLayoutManager);

            SearchAdapter searchAdapter = new SearchAdapter(imageArrayList,this::onClick);
            mrvRecyclerView.setAdapter(searchAdapter);
        }

        private void buildData () {
            imageArrayList.add(new Image(R.drawable.alkayagni));
            imageArrayList.add(new Image(R.drawable.arijitsingh));
            imageArrayList.add(new Image(R.drawable.armaan));
            imageArrayList.add(new Image(R.drawable.himeshresamiya));
            imageArrayList.add(new Image(R.drawable.ic_neha));
            imageArrayList.add(new Image(R.drawable.jagjeetsingh));
            imageArrayList.add(new Image(R.drawable.jubinnautiyal));

        }

        private void initView (View view){
            mrvRecyclerView = view.findViewById(R.id.rvRecyclerView);
        }


        @Override
        public void onClick (Image image){
            Intent intent = new Intent(getActivity(), SearchActivity.class);
            intent.putExtra("Image", image.getPicture());

            // intent.putExtra("song",image.getPicture());
            //intent.putExtra("song",image.getSong());
            startActivity(intent);
        }


}


//package com.example.spotifyclone;
//
//        import android.content.Intent;
//        import android.os.Bundle;
//
//        import androidx.annotation.NonNull;
//        import androidx.annotation.Nullable;
//        import androidx.fragment.app.Fragment;
//        import androidx.recyclerview.widget.LinearLayoutManager;
//        import androidx.recyclerview.widget.RecyclerView;
//
//        import android.view.LayoutInflater;
//        import android.view.View;
//        import android.view.ViewGroup;
//        import android.widget.Button;
//
//        import java.util.ArrayList;
//
//
//public class HomeFragment extends Fragment {
//    private RecyclerView parentRecyclerView;
//    private RecyclerView.Adapter ParentAdapter;
//    ArrayList<ParentModel> parentModelArrayList = new ArrayList<>();
//    private RecyclerView.LayoutManager parentLayoutManager;
//    private Button btnPlaye;
//
//    public HomeFragment() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home2, container, false);
//
//
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        parentModelArrayList.add(new ParentModel("Top Hindi Songs"));
//        parentModelArrayList.add(new ParentModel("Top English Songs"));
//        parentModelArrayList.add(new ParentModel("# Trending"));
//        parentModelArrayList.add(new ParentModel("Top Punjabi"));
//        parentModelArrayList.add(new ParentModel("Top Devotional"));
//        parentModelArrayList.add(new ParentModel("Top Mashup"));
//        parentRecyclerView = view.findViewById(R.id.Parent_recyclerView);
//        parentRecyclerView.setHasFixedSize(true);
//        parentLayoutManager = new LinearLayoutManager(getContext());
//        ParentAdapter = new ParentRecyclerViewAdapter(parentModelArrayList, getContext());
//        parentRecyclerView.setLayoutManager(parentLayoutManager);
//        parentRecyclerView.setAdapter(ParentAdapter);
//        ParentAdapter.notifyDataSetChanged();
//        initViews(view);
//
//    }
//
//    private void initViews(View view) {
//        btnPlaye =view.findViewById(R.id.Btnrecycler);
//        btnPlaye.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getActivity(),PlayMusicActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//




















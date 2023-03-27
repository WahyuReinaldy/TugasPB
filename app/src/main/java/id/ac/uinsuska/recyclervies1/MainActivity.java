package id.ac.uinsuska.recyclervies1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Moon beam","moon.beam@email.com",R.drawable.a));
        items.add(new Item("Sun shine","sun.shine@email.com",R.drawable.b));
        items.add(new Item("Cute panda","cute.panda@email.com",R.drawable.c));
        items.add(new Item("Ice bear","ice.bear@email.com",R.drawable.d));
        items.add(new Item("Shine sky","shine.sky@email.com",R.drawable.e));
        items.add(new Item("New jeans","new.jeans@email.com",R.drawable.f));
        items.add(new Item("Guilty blue","guilty.blue@email.com",R.drawable.g));
        items.add(new Item("Flame princess","flame.princess@email.com",R.drawable.h));
        items.add(new Item("Moon beam","moon.beam@email.com",R.drawable.a));
        items.add(new Item("Sun shine","sun.shine@email.com",R.drawable.b));
        items.add(new Item("Cute panda","cute.panda@email.com",R.drawable.p));
        items.add(new Item("Ice bear","ice.bear@email.com",R.drawable.l));
        items.add(new Item("Shine sky","shine.sky@email.com",R.drawable.e));
        items.add(new Item("New jeans","new.jeans@email.com",R.drawable.f));
        items.add(new Item("Guilty blue","guilty.blue@email.com",R.drawable.g));
        items.add(new Item("Flame princess","flame.princess@email.com",R.drawable.h));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}
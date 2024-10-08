package com.trios2024evdg.listmaker.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trios2024evdg.listmaker.MainActivity
import com.trios2024evdg.listmaker.R
import com.trios2024evdg.listmaker.models.TaskList
import com.trios2024evdg.listmaker.ui.detail.ui.detail.ListDetailFragment

class ListDetailActivity : AppCompatActivity() {
    lateinit var list: TaskList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_detail_activity)

        list = intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY)!!
        title = list.name

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListDetailFragment.newInstance())
                .commitNow()
        }
    }
}
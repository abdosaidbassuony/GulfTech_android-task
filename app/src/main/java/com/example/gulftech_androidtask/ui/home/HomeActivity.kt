package com.example.gulftech_androidtask.ui.home

import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.Observer
import com.example.cleanarchproject.ui.base.BaseActivity
import com.example.gulftech_androidtask.R
import com.example.gulftech_androidtask.databinding.ActivityHomeBinding
import com.example.gulftech_androidtask.ui.home.homeFragment.HomeFragment
import com.example.gulftech_androidtask.util.openFragment
import org.koin.android.viewmodel.ext.android.viewModel

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    override val layoutId: Int = R.layout.activity_home
    override val viewModel by viewModel<HomeSharedViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initObserver()
    }

    private fun initObserver() {
        viewModel.openHome.observe(this, Observer {
            openFragment(R.id.home_container, HomeFragment.newInstance(), true)
        })
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            finish()
        } else {
            supportFragmentManager.popBackStack()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}

package com.example.appelis.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.appelis.R
import com.example.appelis.databinding.ActivityPrincipalBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrincipalActivity : AppCompatActivity() {
    lateinit var toogle: ActionBarDrawerToggle
    lateinit var binding: ActivityPrincipalBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
        initDrawer()
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<PrincipalFragment>(R.id.fragmentContainer)
        }


    }

//    private fun getNetworkData() {
//        // llamar a retrofit y guardarlo en la base de datos
//
//    }

    private fun initDrawer() {
        toogle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun initListeners() {
        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.itemMovies -> supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<MoviesFragment>(R.id.fragmentContainer)
//                    binding.fragmentContainer.visibility = View.VISIBLE
                    binding.drawerLayout.closeDrawers()

                }
                R.id.itemTVshows -> supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<TVShowsFragment>(R.id.fragmentContainer)
//                    binding.fragmentContainer.visibility = View.VISIBLE
                    binding.drawerLayout.closeDrawers()
                }
                R.id.itemInicio -> supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<PrincipalFragment>(R.id.fragmentContainer)
                    binding.drawerLayout.closeDrawers()
                }


            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toogle.onOptionsItemSelected(item)) return true
        return super.onOptionsItemSelected(item)
    }
}

package layout.superdigital.com.scrollflagsactionbar

import android.opengl.Visibility
import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_collapse.*
import kotlinx.android.synthetic.main.content_collapse.*

class CollapseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapse)
        setSupportActionBar(toolbar)

        collapsing_toolbar_layout.title = "Ronaldo Fenômeno"
        collapsing_toolbar_layout.setExpandedTitleColor(resources.getColor(android.R.color.transparent))

        //Listener para escutar mudanças de estado da AppBarLayout
        app_bar.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener{
            override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {

                if (verticalOffset == 0)
                    tv_title_article.visibility = View.VISIBLE
                else
                    tv_title_article.visibility = View.INVISIBLE
            }

        })


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}

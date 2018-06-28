package layout.superdigital.com.scrollflagsactionbar

import android.os.Bundle
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_collapse.*

class CollapseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapse)
        setSupportActionBar(toolbar)

        collapsing_toolbar_layout.title = "Ronaldo Fenômeno"
        collapsing_toolbar_layout.setExpandedTitleColor(resources.getColor(android.R.color.transparent))


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}

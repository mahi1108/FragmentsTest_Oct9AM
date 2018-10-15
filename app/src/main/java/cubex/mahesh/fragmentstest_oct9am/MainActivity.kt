package cubex.mahesh.fragmentstest_oct9am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        courses.setOnClickListener {
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,CoursesFragment())
            tx.addToBackStack("true")
            tx.commit()
        }

        projects.setOnClickListener {
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,ProjectsFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        materials.setOnClickListener {
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,MaterialsFragment())
            tx.addToBackStack("true")
            tx.commit()
        }

        home.setOnClickListener {
            var fManager = supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,HomeFragment())
            tx.addToBackStack("true")
            tx.commit()
        }

    }
}

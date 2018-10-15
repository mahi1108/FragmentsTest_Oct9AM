package cubex.mahesh.fragmentstest_oct9am

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.materials.*
import kotlinx.android.synthetic.main.materials.view.*

class MaterialsFragment:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater,
             container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.materials,
                container,false)

        view.clickme.setOnClickListener {
                Toast.makeText(activity,
                        "Don't Click Me ",
                        Toast.LENGTH_LONG).show( )

        }

        return view
    }
}
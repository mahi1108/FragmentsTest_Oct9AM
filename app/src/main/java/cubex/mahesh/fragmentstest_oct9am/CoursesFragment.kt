package cubex.mahesh.fragmentstest_oct9am

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CoursesFragment:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater,
             container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.courses,
                container,false)
        return view
    }
}
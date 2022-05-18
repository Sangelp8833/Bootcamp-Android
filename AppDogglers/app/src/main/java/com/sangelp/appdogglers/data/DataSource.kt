package com.sangelp.appdogglers.data

import com.sangelp.appdogglers.R
import com.sangelp.appdogglers.model.Dog

class DataSource {
    fun loadDogs():List<Dog>{
        return listOf(
            Dog(R.string.Dog_name_1, R.string.Dog_age_1, R.string.Dog_hobbie_1, R.drawable.bella),
            Dog(R.string.Dog_name_2, R.string.Dog_age_2, R.string.Dog_hobbie_2, R.drawable.faye),
            Dog(R.string.Dog_name_3, R.string.Dog_age_3, R.string.Dog_hobbie_3, R.drawable.frankie),
            Dog(R.string.Dog_name_4, R.string.Dog_age_4, R.string.Dog_hobbie_4, R.drawable.leroy),
            Dog(R.string.Dog_name_5, R.string.Dog_age_5, R.string.Dog_hobbie_5, R.drawable.nox),
            Dog(R.string.Dog_name_6, R.string.Dog_age_6, R.string.Dog_hobbie_6, R.drawable.tzeitel)
        )
    }
}
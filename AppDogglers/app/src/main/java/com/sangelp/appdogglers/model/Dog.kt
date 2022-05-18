package com.sangelp.appdogglers.model

import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Dog (@StringRes val dogName: Int,
           @StringRes val dogAge: Int,
           @StringRes val dogHobbie: Int,
           @DrawableRes val dogImage: Int ) {
}
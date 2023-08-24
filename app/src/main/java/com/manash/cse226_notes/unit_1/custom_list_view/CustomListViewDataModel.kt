package com.manash.cse226_notes.unit_1.custom_list_view

class CustomListViewDataModel
    (val title: String, val desc: String, val image: Int, var checked: Boolean) {

        fun isChecked() : Boolean {
            return checked
        }
}
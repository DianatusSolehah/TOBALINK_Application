package com.BAKO_robot.tobalink_application.pages

import androidx.compose.foundation.layout.Column
import com.BAKO_robot.tobalink_application.R

data class DataLazy(
    var lazyName : String,
    var name : String,
    var imageRes : Int,
)
fun getAllDataLazys2() : List<DataLazy>{
    return listOf(
        DataLazy("Hebat anak", "petani sarjana",R.drawable.row1),
        DataLazy("Cuaca terang", "petani senang",R.drawable.row2),
        DataLazy("Raup jutaan", "pengrajin rigen bambu",R.drawable.row3),
        DataLazy("Harga rokok", "mulai meroket",R.drawable.row4),
        DataLazy("Polisi tangkap", "maling tembakau",R.drawable.row5),
        DataLazy("Bea cukai jaga", "stabil harga ecer",R.drawable.row6),
        DataLazy("Bea cukai tindaki", "rokok ilegal",R.drawable.row7),
        DataLazy("Industri bakau hidupi", "213.000 keluarga tani",R.drawable.row8),
        DataLazy("Aturan baru Maldives", "batasi bawa rokok",R.drawable.row9),
        DataLazy("Petani bakau jawa", "Terima bantuan DBHCHT",R.drawable.row10)
    )
}

fun getAllDataLazys() : List<DataLazy>{
    return listOf(
        DataLazy("Arang dari batang tembakau","01 November 2024",R.drawable.column1),
        DataLazy("Jenis-jenis tembakau mahal","05 November 2024",R.drawable.column2),
        DataLazy("10 pengusaha tembakau sukses","02 Mei 2024",R.drawable.column3),
        DataLazy("Obat ampuh usir hama ulat daun tembakau","10 Oktober 2024",R.drawable.column4),
        DataLazy("Harga mesin tembakau saat ini","19 Juli 2024",R.drawable.column5),
        DataLazy("Harga tembakau merosot 50 persen","20 Oktober 2024",R.drawable.column6),
        DataLazy("Aturan tembakau jadi sorotan","12 November 2024",R.drawable.column7),
        DataLazy("Mahasiswa KKN kunjungi kebun tembakau","10 Juni 2024",R.drawable.column8),
        DataLazy("Wajib kenali jenis tanah sebelum bercocok tanam","25 Oktober 2024",R.drawable.column9),
        DataLazy("BMKG perkiraan cuaca exstrim di jawa timur", "08 November 2024",R.drawable.column10)
    )
}

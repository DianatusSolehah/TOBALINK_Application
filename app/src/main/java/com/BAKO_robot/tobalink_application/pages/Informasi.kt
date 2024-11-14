package com.BAKO_robot.tobalink_application.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.BAKO_robot.tobalink_application.R

@Composable
fun Informasi(){
    Column (modifier = Modifier.padding(16.dp)){
        Image(
            painter = painterResource(id = R.drawable.column1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
                .height(200.dp).clip(RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Arang dari batang tembakau",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Batang tembakau yang merupakan limbah dari tumbuhan tembakau yang saat ini belum termanfaatkan dengan baik, karena hanya dimanfaatkan daunnya sebagai bahan baku pembuatan rokok, dan batangnya hanya dibakar begitu saja. Pembuatan karbon aktif dilakukan dengan proses pengeringan, karbonisasi dan dilanjutkan dengan proses aktivasi dengan H2SO4 3M.\n\n"+
            "Memanfaatkan batang tembakau, yang biasanya menjadi limbah dan hanya dibakar, untuk dijadikan karbon aktif sebagai adsorben. Proses pembuatan karbon aktif mencakup pengeringan, karbonisasi pada suhu 600°C, dan aktivasi menggunakan H2SO4 3M. Penelitian bertujuan menghasilkan karbon aktif sesuai standar SNI 06-3730-1995.\n\n"+
            "Karbon aktif dari batang tembakau memiliki kadar air 10%, kadar zat yang mudah menguap 20%, kadar abu 9,6%, kadar karbon terikat 70,4%, dan daya serap iodium 1230,93 mg/g, semuanya memenuhi standar SNI. Analisis FTIR mengidentifikasi gugus fungsi seperti C-H alkena, C-H aromatik, C=O karboksil, dan O-H hidroksil. Analisis SEM-EDX menunjukkan adanya pori-pori terbuka dengan kandungan utama karbon (38,07%) dan oksigen (35,8%). Pengukuran BET menunjukkan luas permukaan karbon aktif sebesar 238,035 m²/g, menjadikannya efektif sebagai adsorben.",
            fontSize = 16.sp
        )
    }
}
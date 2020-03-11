package com.example.intens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = tambahData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter = ResepAdapter(testData, {resepItem: ResepData -> resepItemClicked(resepItem) })
    }

    private fun resepItemClicked(resepItem: ResepData) {
        val showDetailActivityIntent = Intent(this, ResepDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, resepItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_CC,resepItem.deskripsi)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INDEX, resepItem.bahan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, resepItem.cara)
        showDetailActivityIntent.putExtra(Intent.EXTRA_CHOSEN_COMPONENT, resepItem.gambar)
        startActivity(showDetailActivityIntent)
    }

    private fun tambahData(): List<ResepData>{
        val partList = ArrayList<ResepData>()
        partList.add(
            ResepData(
                "Lontong Balap",
                "Surabaya",
                "- 150 gr Tauge, rebus sebentar, tiriskan" +
                        "\n- Kerupuk dan Emping goreng secukupnya" +
                        "\n- Minyak secukupnya, untuk menggoreng" +
                        "\n- 4 bh Lontong, iris bulat" +
                        "\n- 150 gr Tahu, rendam air garam, goreng, potong dadu" +
                        "\n" +
                        "\nBahan dan bumbu Kuah:" +
                        "\n- 350 gr Daging Tetelan" +
                        "\n- 6 siung Bawang Putih, goreng, haluskan" +
                        "\n- ½ sdt Merica Bubuk" +
                        "\n- 1 btg Daun Bawang, iris tipis, tumis" +
                        "\n- 2 ltr Air" +
                        "\n- 2 btg Seledri" +
                        "\n- 1 ½ sdt Garam" +
                        "\n- 2 sdt AJI-NO-MOTO®",
                "1. Kuah : Rebus daging hingga empuk, angkat, potong dadu, lalu masukkan kembali ke dalam air kaldu. Masukkan semua bumbu kuah, biarkan kuah mendidih lagi dan bumbu meresap, angkat, sisihkan." +
                        "\n2. Lento : Haluskan bumbu lento (kecuali daun bawang), lalu campur dengan singkong parut dan irisan daun bawang, aduk rata. Bentuk bulat panjang, lalu goreng dengan api sedang hingga kecoklatan, angkat, tiriskan. Potong lento sesuai selera." +
                        "\n3. Susun lontong di atas mangkuk saji, tambahkan tahu, lento, dan tauge, lalu siram dengan kuah dan daging. Taburi bawang goreng" +
                        "\n4.Hidangkan dengan sambal petis.",
                R.drawable.lontongbalap
            )
        )
        partList.add(
            ResepData(
                "Rawon",
                "Surabaya",
                "- 600 gr Daging Sapi untuk rawon/ sandung lamur" +
                        "\n- 2 ltr Air" +
                        "\n- 3 btg Serai, memarkan" +
                        "\n- 2 lbr Daun Salam" +
                        "\n- 3 cm Lengkuas, memarkan" +
                        "\n- 3 lbr Daun Jeruk" +
                        "\n- 5 sdm Minyak untuk menumis" +
                        "\n" +
                        "\nBumbu Halus:" +
                        "\n- 5 siung Bawang Merah" +
                        "\n- 3 siung Bawang Putih" +
                        "\n- 4 bh Cabai Merah" +
                        "\n- 2 btr Kemiri" +
                        "\n- 1 sdt Ketumbar" +
                        "\n- 3 bh Keluak Tua, kukus, ambil isinya" +
                        "\n- 2 cm Jahe" +
                        "\n- 3 cm Kunyit" +
                        "\n- 2 sdt Garam" +
                        "\n- 100 gr Tauge pendek (tauge soto)",
                "1. Masak daging bersama daun salam, serai, lengkuas, dan daun jeruk sampai empuk dan matang." +
                        "\n2. Angkat daging, lalu potong kecil-kecil. Saring rebusan, didihkan lagi bersama irisan daging." +
                        "\n3. Panaskan minyak, tumis bumbu halus bersama irisan daun bawang sampai harum dan matang" +
                        "\n4. Angkat, lalu masukkan ke dalam kaldu daging. Masak dengan api kecil sampai mendidih kembali" +
                        "\n5. Tuang rawon ke dalam mangkuk, taburkan tauge pendek di atasnya. Sajikan bersama telur asin dan sambal terasi.",
                R.drawable.rawon
            )
        )
        partList.add(
            ResepData(
                "Gado-Gado",
                "Surabaya",
                "- 100 gr Kacang panjang" +
                        "\n- 1 ikat Kangkung" +
                        "\n- 1/4 bh Kol" +
                        "\n- 100 gr Tauge" +
                        "\n- 4 bh Tahu goreng" +
                        "\n" +
                        "\n- Bahan Saus Kacang:" +
                        "\n- 300 gr Selai kacang" +
                        "\n- 350 ml Air" +
                        "\n- 1 bks Masako® Rasa Sapi 11 gr" +
                        "\n- 1 bh Jeruk limo" +
                        "\n- 3 sdm Gula merah" +
                        "\n" +
                        "\nPelengkap:" +
                        "\n- Kerupuk" +
                        "\n- Lontong" +
                        "\n- Bawang goreng" +
                        "\n- Telur rebus",
                "1. Iris iris tahu. Potong potong kacang panjang, kol, dan kangkung." +
                        "\n2. Larutkan selai kacang dengan air sedikit demi sedikit. Tambahkan gula merah, jeruk limo, dan Masako® Rasa Sapi, aduk rata." +
                        "\n3. Kukus sayuran selama 2 - 3 menit." +
                        "\n4. Tata lontong, sayur, dan tahu goreng dalam piring saji, tuang saus kacang di atasnya, sajikan dengan pelengkap.",
                R.drawable.gadogado
            )
        )
        partList.add(
            ResepData(
                "Pecel",
                "Madiun",
                "- Kol 100 gram (diiris kasar)" +
                        "\n- Tauge 50 gram" +
                        "\n- Bayam 50 gram" +
                        "\n- Kacang panjang 100 gram (dipotong 3 cm)" +
                        "\n- Kemangi 1 ikat (diambil daunnya)" +
                        "\n" +
                        "\n- Bahan Bumbu Kacang:" +
                        "\n- 150 gram kacang tanah (digoreng)" +
                        "\n- 4 siung bawang putih (digoreng utuh)" +
                        "\n- 2 cm kencur" +
                        "\n- 8 cabai rawit merah (sesuai selera) direbus" +
                        "\n- 3 lembar daun jeruk purut" +
                        "\n- 1 sdm gula merah" +
                        "\n- 1 sdt garam" +
                        "\n- 1/4 sdt asam jawa" +
                        "\n- 30 ml air matang",
                "1. Rebus semua sayuran secara terpisah kecuali daun kemangi lalu sisihkan." +
                        "\n2. Haluskan semua bahan untuk bumbu kacang lalu tambahkan air matang dan aduk sampai rata." +
                        "\n3. Tata sayuran diatas piring saji kecuali daun kemangi." +
                        "\n4. Siram sayuran dengan bumbu kacang lalu hias dengan tambahan daun kemangi.",
                R.drawable.pecel
            )
        )
        partList.add(
            ResepData(
                "Rujak Cingur",
                "Surabaya",
                "- 1/4 ikat kangkung, siangi" +
                        "\n- 100 gr taoge, buang ekor dan tutup kepalanya" +
                        "\n- 4 buah timun, iris tipis" +
                        "\n- 250 gr cingur sapi" +
                        "\n- 1/2 papan tempe, potong lalu goreng" +
                        "\n- 2 buah lontong ukuran kecil, potong-potong" +
                        "\n" +
                        "\nBumbu Perendam Cingur:" +
                        "\n- 2 siung bawang putih" +
                        "\n- 1/2 sdt ketumbar" +
                        "\n- secukupnya garam" +
                        "\n" +
                        "\n- Bumbu yang Dihaluskan:" +
                        "\n- 10 buah cabe rawit merah" +
                        "\n- 1 sachet terasi" +
                        "\n- 1/2 buah pisang batu, iris tipis" +
                        "\n- 8 sdm kacang tanah goreng" +
                        "\n- 200 gr gula merah" +
                        "\n- 1 sdt asam jawa" +
                        "\n- 8 sdm petis udang" +
                        "\n- secukupnya garam" +
                        "\n- secukupnya air",
                "1. Cuci bersih semua sayuran kemudian tiriskan." +
                        "\n2. Cuci bersih cingur sapi kemudian tiriskan. Kemudian rendam dalam bumbu perendam selama 15 menit. Setelah itu goreng dalam minyak panas hingga matang, angkat dan tiriskan. Potong-potong kecil. Sisihkan." +
                        "\n3. Rebus kangkung dan taoge hingga matang, angkat lalu tiriskan dan sisihkan." +
                        "\n4. Diatas cobek besar haluskan cabe rawit merah, terasi, kacang goreng, asam jawa, gula merah, pisang batu, garam hingga halus. Kemudian tambahkan petis giling lagi sampai tercampur rata. Setelah itu tambahkan air, aduk hingga bumbu tercampur rata." +
                        "\n5. Setelah bumbu tercampur rata, masukkan kangkung, timun, taoge, tahu, tempe, cingur dan lontong. Aduk sampai semua tercampur secara merata." +
                        "\n6. Tata diatas piring saji dan tambahkan kerupuk sebagai pelengkap.",
                R.drawable.rujak
            )
        )
     return partList
    }

}


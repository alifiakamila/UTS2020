package com.example.facultyprofile
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data, { onItem: FacData ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: FacData) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<FacData> {
        val rvList = ArrayList<FacData>()
        rvList.add(
            FacData(
                R.drawable.fik,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer merupakan\n" +
                        "\n"+
                        "salah satu dari 8 Fakultas yang\n" +
                        "\n"+
                        "ada di UPN 'Veteran' Jawa Timur.\n" +
                        "\n"+
                        "Website Fakultas Ilmu Komputer\n"+
                        "\n"+
                        "sendiri adalah http://fik.upnjatim.ac.id/.\n"+
                        "\n"+
                        "Fakultas ini terdiri dari program\n" +
                        "\n"+
                        "studi: ",
                "1. Teknik Informatika\n" +
                        "\n"+
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            FacData(
                R.drawable.ft,
                "Fakultas Teknik",
                "Fakultas Teknik merupakan\n" +
                        "\n"+
                        "salah satu dari 8 Fakultas yang\n" +
                        "\n"+
                        "ada di UPN 'Veteran' Jawa Timur.\n" +
                        "\n"+
                        "Website Fakultas Teknik\n"+
                        "\n"+
                        "sendiri adalah http://ft.upnjatim.ac.id/.\n"+
                        "\n"+
                        "Fakultas ini terdiri dari program\n" +
                        "\n"+
                        "studi: ",
                "1. Teknik Kimia\n" +
                        "\n"+
                        "2. Teknik Industri\n" +
                        "\n"+
                        "3. Teknik Sipil\n" +
                        "\n"+
                        "4. Teknik Lingkungan\n" +
                        "\n"+
                        "5. Teknologi Pangan"
            )
        )

        rvList.add(
            FacData(
                R.drawable.fad,
                "Fakultas Arsitektur Dan Desain",
                "Fakultas Arditektur Dan Desain merupakan\n" +
                        "\n"+
                        "salah satu dari 8 Fakultas yang\n" +
                        "\n"+
                        "ada di UPN 'Veteran' Jawa Timur.\n" +
                        "\n"+
                        "Website Fakultas Arsitektur Dan Desain\n"+
                        "\n"+
                        "sendiri adalah http://fad.upnjatim.ac.id/.\n"+
                        "\n"+
                        "Fakultas ini terdiri dari program\n" +
                        "\n"+
                        "studi: ",
                "1. Arsitektur\n" +
                        "\n"+
                        "2. Desain Komunikasi Visual"
            )
        )

        rvList.add(
            FacData(
                R.drawable.fh,
                "Fakultas Hukum",
                "Fakultas Hukum merupakan\n" +
                        "\n"+
                        "salah satu dari 8 Fakultas yang\n" +
                        "\n"+
                        "ada di UPN 'Veteran' Jawa Timur.\n" +
                        "\n"+
                        "Website Fakultas Hukum\n"+
                        "\n"+
                        "sendiri adalah http://fhukum.upnjatim.ac.id/.\n"+
                        "\n"+
                        "Fakultas ini terdiri dari program\n" +
                        "\n"+
                        "studi: ",
                "1. Hukum"
            )
        )

        rvList.add(
            FacData(
                R.drawable.fisip,
                "Fakultas Ilmu Sosial Dan Politik",
                "Fakultas Ilmu Sosial Dan Politik merupakan\n" +
                        "\n"+
                        "salah satu dari 8 Fakultas yang\n" +
                        "\n"+
                        "ada di UPN 'Veteran' Jawa Timur.\n" +
                        "\n"+
                        "Website Fakultas Program Pasca Sarjana\n"+
                        "\n"+
                        "sendiri adalah http://fisip.upnjatim.ac.id/.\n"+
                        "\n"+
                        "Fakultas ini terdiri dari program\n" +
                        "\n"+
                        "studi: ",
                "1. Ilmu Komunikasi\n" +
                        "\n"+
                        "2. Ilmu Administrasi Negara\n" +
                        "\n"+
                        "3. Ilmu Administrasi Bisnis\n" +
                        "\n"+
                        "4. Hubungan Internasional"

            )
        )

        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis merupakan\n" +
                        "\n"+
                        "salah satu dari 8 Fakultas yang\n" +
                        "\n"+
                        "ada di UPN 'Veteran' Jawa Timur.\n" +
                        "\n"+
                        "Website Fakultas Ekonomi Dan Bisnis\n"+
                        "\n"+
                        "sendiri adalah http://febis.upnjatim.ac.id/.\n"+
                        "\n"+
                        "Fakultas ini terdiri dari program\n" +
                        "\n"+
                        "studi: ",
                "1. Ekonomi Pembangunan\n" +
                        "\n"+
                        "2. Akuntansi\n" +
                        "\n"+
                        "3. Manajemen"
            )
        )
        rvList.add(
            FacData(
                R.drawable.fp,
                "Fakultas Pertanian",
                "Fakultas Pertanian merupakan\n" +
                        "\n"+
                        "salah satu dari 8 Fakultas yang\n" +
                        "\n"+
                        "ada di UPN 'Veteran' Jawa Timur.\n" +
                        "\n"+
                        "Website Fakultas Pertanian\n"+
                        "\n"+
                        "sendiri adalah http://faperta.upnjatim.ac.id/.\n"+
                        "\n"+
                        "Fakultas ini terdiri dari program\n" +
                        "\n"+
                        "studi: ",
                "1. Agroteknologi\n" +
                        "\n"+
                        "2. Agribisnis"
            )
        )

        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "Fakultas Program Pasca Sarjana",
                "Fakultas Program Pasca Sarjana merupakan\n" +
                        "\n"+
                        "salah satu dari 8 Fakultas yang\n" +
                        "\n"+
                        "ada di UPN 'Veteran' Jawa Timur.\n" +
                        "\n"+
                        "Website Fakultas Program Pasca Sarjana\n"+
                        "\n"+
                        "sendiri adalah http://pasca.upnjatim.ac.id/.\n"+
                        "\n"+
                        "Fakultas ini terdiri dari program\n" +
                        "\n"+
                        "studi: ",
                "1. Magister Akuntansi\n" +
                        "\n"+
                        "2. Magister Agribisnis\n" +
                        "\n"+
                        "3. Magister Agroteknologi\n" +
                        "\n"+
                        "4. Magister Ilmu Komunikasi"

            )
        )


        rvList.add(
            FacData(
                R.drawable.b6,
                "Profil Saya",
                "Nama : Alifia Nur Kamila\n"+
                        "\n"+
                        "TTL : Sidoarjo, 22 November 2000\n" +
                        "\n"+
                        "Alamat : Sidoarjo\n" +
                        "\n"+
                        "Email : alifiakamilaa@gmail.com\n" +
                        "\n"+
                        "No. Telp : 0821-4261-1789\n" +
                        "\n"+
                        "Github : https://github.com/alifiakamila\n",
                "History Of Education : \n" +
                        "\n"+
                        "\t\t 1. MI Ma'arif Sidoarjo \n" +
                        "\n"+
                        "\t\t 2. MTs. Akselerasi Amanatul Ummah \n" +
                        "\n"+
                        "\t\t 3. SMAN Wachid Hasyim 2 Taman \n\n" +
                        "\n"+
                        "Achievement : 2nd and 3rd Winner Story Telling"
            )
        )
        return rvList
    }
}

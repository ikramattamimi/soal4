package com;

public class Builder {
    public static Materials[] build() {
        Materials am[] = {
                new RedMaterialsDecorator(new Windows(
                        "Jendela Aluminium 40x100 Bovenli Casement / Serat Kayu - Warna Solid, Packing Biasa",
                        "Rp585.000,00",
                        "* kusen 3 inci\n* Warna bisa dipilih coklat,hitam,putih,\n* kaca bisa dipilih kaca riben(gelap),polos(bening)\n* Ketebalan kaca 5mm full\n* bukaan jendela bisa kesamping (swing)atau keatas (jungkit)")),
                new RedMaterialsDecorator(new Windows(
                        "Jendela Gandeng 40x160 Aluminium Casement",
                        "Rp840.000,00",
                        "- jendela model gandeng dengan 1 daun jendela hidup(100cm) 1 mati(60cm)\n- Buka ke samping / jungkit (silahkan pilih)\n- Kusen dan jendela warna PUTIH/COKLAT/HITAM\n- Kusen 3 inci\n- Kaca 5mm polos/riben (silahkan pilih)\n- Kunci , engsel dan aksesoris sudah lengkap tinggal dipasang\n- Pengiriman seluruh Indonesia\n")),
                new RedMaterialsDecorator(new Windows(
                        "Jendela Almunium Ornamen 60x140 Casement Aluminium - Kaca Mati",
                        "Rp835.000,00",
                        "- Kusen 3 inci\n- Kaca 5mm polos/riben (silahkan pilih)\n- barang siap pasang(komplit)\n")),

                new RedMaterialsDecorator(new Doors(
                        "pintu baja Jbs Fortress motif kayu Ukuran 90x210x5 cm - 90.11 Urat Kayu, Buka Kanan",
                        "Rp2.750.000,00",
                        "A. Ukuran :\nKusen : 90x210x10cm\nDaun : 82x206x5cm\nB. Bahan\nMaterial : BAJA CRC (Cold Rolled Coil)\nTebal Plat Daun : 0,6mm\nTebal Kusen : 0,8mm\nCUSTOM : TIDAK BISA\nBukaan : KIRI/KANAN\n\nMOHON PERHATIKAN BUKAAN YANG ANDA PILIH\nPosisi dari LUAR RUANGAN, Buka ke DALAM.\nBukaan KANAN = Engsel di KANAN, Handle/gagang di KIRI\nBukaan KIRI = Engsel di KIRI, Handle/gagang di KANAN\n\nC. Catatan\n- Kunci standart cina, beda ukuran dengan indo\n- Anak Kunci terbagi menjadi 3 :\no Kunci A (Hitam) = Kunci pemilik\no Kunci B (Merah) = Kunci developer\no Kunci C (Hitam, ada bintiknya) = Jika dipakai, Kunci B tidak bisa berfungsi lagi\n- Daun kecil dapat dikunci dengan slot tanam\n\n2. Kelengkapan Paket :\n- 1 unit Daun dan Kusen (sudah terpasang)\n- 1 set Handle dan Kunci FORTRESS (Anak kunci digantung di kusen)\n- 6 buah Dynabolt dan tutup\n\n3. Fitur Produk / Keunggulan\n- Rangka pintu menggunakan Honeycomb Paper\n- Kusen Baja ber-Architrave\n- Engsel Baja Tersembunyi\n- 5 Titik Penguncian\n- Lubang Pengintip\n")),
                new RedMaterialsDecorator(new Doors(
                        "PINTU ALMUNIUM MODERN ALPHAMAX TYPE AUSTIN DOOR (SLOT)(70x198,5cm) - Hitam, Buka Kanan",
                        "Rp1.850.000,00",
                        "Model : Austin Door\nWarna Tersedia : Hitam, Biru, Hijau, Merah\nUkuran : 70 x 198,5 cm\nArah Bukaan : Kanan dan Kiri\nPengiriman 2-5 Hari kerja.\n\nKeunggulan :\n- Design modern, bebas karat, bebas rayap & jamur, kedap suara, instalasi mudah\n- Tidak berubah bentuk & warna, Tahan cuaca, Tahan air, Tahan api.\n- Dilengkapi EPS Foam telah teruji dalam hal keamanan kasus kebakaran\n- Aluminium kusen & pintu terbuat dari bahan aluminium pilihan T6063 berstandar internasional\n- Menggunakan teknologi pewarnaan powder coating\n- Include handle, engsel, kunci yang berbahan aluminium\n")),
                new RedMaterialsDecorator(new Doors(
                        "Pintu Utama Baja Double Door Global Type Luxury 150 Extra (150x220cm) - 150.01 Black",
                        "Rp6.000.000,00",
                        "A.Ukuran :\nKusen : 150x220x10cm\n\nB.Bahan\nMaterial: BAJA CRC (Cold Rolled Coil)\nTebal Plat Daun : 0,6mm\nTebal Kusen: 1mm\nCUSTOM : TIDAK BISA\nBukaan: Buka Kiri / Buka Kanan\n\nC. Fitur-fitur unggulan serta kelengkapan keamanan:\n• CETAKAN DEFINISI TINGGI🔥\n• Anti SUSUT, MUAI DAN LENGKUNG.\n• HARGA SANGAT SANGAT TERJANGKAU! Komplit set\n(Daun Pintu, kusen, engsel, silinder, handel dll).\n• Tahan karat/korosi, dgn finishing Colored Sheet proses oven serta lapisan PE supaya tidak gampang LECET dan PUDAR.\n• Tahan rayap\n• Tahan api (baja tidak menghantarkan api).\n• Karet Perendam Suara\n• Kaca Intip\n• Inner Filling Honey Comb Paper sebagai pengedap suara\n")),

                new RedMaterialsDecorator(new Beams(
                        "WF 150 x 6 Meter - Besi Baja IWF - Wide Flange Beams",
                        "Rp1.494.000,00",
                        "WF 150 x 75 x 5 x 7 mm 6meter– Ex LS\nPanjang: 6 Meter\nBerat: 84 Kg\n\nHarga Sudah Termasuk PPN 10%\nHarga yang Tertera adalah Harga per Batang\n")),
                new RedMaterialsDecorator(new Beams(
                        "WF 250 x 6 Meter - Besi Baja IWF - Wide Flange Beams",
                        "Rp3.169.000,00",
                        "WF 250 x 125 x 6 Ex LS\nPanjang: 6 Meter\nBerat: 177.5 Kg\n\nHarga Sudah Termasuk PPN 10%\nHarga yang Tertera adalah Harga per Batang\n")),
                new RedMaterialsDecorator(new Beams(
                        "WF 198 x 6 Meter - Besi Baja IWF - Wide Flange Beams",
                        "Rp2.015.000,00",
                        "spec 198 x 99 x 4.5 x 7 mm\nPanjang: 6 Meter\nBerat: 109\n\nberat 12m = 218 kg\n\nHarga Sudah Termasuk PPN 10%\nHarga yang Tertera adalah Harga per Batang\n"))
        };
        return am;
    }
}

package com.example.spotifyapp.data

import com.example.spotifyapp.model.Album
import com.example.spotifyapp.model.Song

class DataC {
    companion object {

        fun getAlbums(): List<Album> {
            return arrayListOf(
                album0,
                album1,
                album2,
                album3,
                album4,
                album5,
                album6,
                album7,
                album8,
                album9,
                album10,
                album11,
                album12
            )
        }

        val song1 = Song(
            0,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Con Hứa Sẽ Về",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ConHuaSeVe-LeBaoBinh-8477494.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/chsvLBBimg.jpeg"
        )
        val song2 = Song(
            1,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Thương Em Đến Già",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ThuongEmDenGia-LeBaoBinh-7198068.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/tedgLBBimg.jpeg"
        )
        val song3 = Song(
            2,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Níu Duyên",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/NiuDuyen-LeBaoBinh-6872127.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg"
        )
        val song4 = Song(
            3,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Người Phản Bội",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/NguoiPhanBoi-LeBaoBinh-5265054.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg"
        )
        val song5 = Song(
            4,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Tập Cô Đơn",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/TapCoDon-LeBaoBinh-5495554.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg"
        )
        val song6 = Song(
            5,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Kết Thúc Lâu Rồi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/KetThucLauRoi-LeBaoBinh-4937351.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg"
        )
        val song7 = Song(
            6,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Hỏi Thăm Nhau",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/HoiThamNhau-LeBaoBinh-4672704.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg"
        )
        val song8 = Song(
            7,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Yêu Thương Chỉ Còn Trong Mơ",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/YeuThuongChiConTrongMo-LeBaoBinh_4cdjb.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg"
        )
        val song9 = Song(
            8,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Xem Nhau Là Dĩ Vẵng",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/XemNhauLaDiVang-LeBaoBinh_4fp2g.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg"
        )
        val song0 = Song(
            9,
            "Những Ca Khúc Hay Nhất Của Lê Bảo Bình",
            "Lê Bảo Bình",
            "Xin Lỗi Anh Chỉ Có 100K",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/XinLoiAnhChiCo100K-LeBaoBinh-2861617.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg"
        )

        val song_0 = Song(
            0,
            "Sơn Tùng M-TP",
            "Sơn Tùng M-TP",
            "Chạy Ngay Đi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Chay-Ngay-Di-Son-Tung-M-TP.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/cndMTPimg.jpeg"
        )
        val song_1 = Song(
            1,
            "Sơn Tùng M-TP",
            "Sơn Tùng M-TP",
            "Lạc Trôi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Lac-Troi-Masew-Mix-Son-Tung-M-TP-Masew.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/ltMTPimg.jpeg"
        )
        val song_2 = Song(
            2,
            "Sơn Tùng M-TP",
            "Sơn Tùng M-TP",
            "Chúng Ta Không Thuộc Về Nhau",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Mtp/ChungTaKhongThuocVeNhau-SonTungMTP-4528181.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/mtp.jpeg"
        )
        val song_3 = Song(
            3,
            "Sơn Tùng M-TP",
            "Sơn Tùng M-TP",
            "Cơn Mưa Xa Dần",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Mtp/ConMuaXaDan-SonTungMTP-8033250.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/mtp.jpeg"
        )
        val song_4 = Song(
            4,
            "Sơn Tùng M-TP",
            "Sơn Tùng M-TP",
            "Hãy Trao Cho Anh",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Mtp/HayTraoChoAnh-SonTungMTPSnoopDogg-6010660.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/mtp.jpeg"
        )
        val song_5 = Song(
            5,
            "Sơn Tùng M-TP",
            "Sơn Tùng M-TP",
            "Muộn Rồi Mà Sao Còn",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Mtp/MuonRoiMaSaoCon-SonTungMTP-7011803.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/mtp.jpeg"
        )
        val song_6 = Song(
            6,
            "Sơn Tùng M-TP",
            "Sơn Tùng M-TP",
            "Nắng Ấm Ngang Qua",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Mtp/NangAmNgangQua-SonTungMTP-8033251.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/mtp.jpeg"
        )
        val song_7 = Song(
            7,
            "Sơn Tùng M-TP",
            "Sơn Tùng M-TP",
            "Nơi Này Có Anh",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Mtp/NoiNayCoAnh-SonTungMTP-4772041.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/mtp.jpeg"
        )

        val toxicity_0 = Song(
            0,
            "Những ca khúc hay nhất của Thái Học",
            "Thái Học",
            "Em Là Con Thuyền Cô Đơn",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/EmLaConThuyenCoDonLofiVersion-ThaiHocVux-7097952.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg"
        )
        val toxicity_1 = Song(
            1,
            "Những ca khúc hay nhất của Thái Học",
            "Thái Học",
            "Em Về Sớm Thôi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/EmVeSomThoi-HuyVacThaiHoc-6792717.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg"
        )
        val toxicity_2 = Song(
            2,
            "Những ca khúc hay nhất của Thái Học",
            "Thái Học",
            "Gửi Người Em Hà Tĩnh",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/GuiNguoiEmHaTinh-ThaiHoc-7564944.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg"
        )
        val toxicity_3 = Song(
            3,
            "Những ca khúc hay nhất của Thái Học",
            "Thái Học",
            "Kiếp Này Em Gã Cho Anh",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/KiepNayEmGaChoAnh-ThaiHoc-7198404.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg"
        )
        val toxicity_4 = Song(
            4,
            "Những ca khúc hay nhất của Thái Học",
            "Thái Học",
            "Lỡ Hẹn Với Dòng Lam",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/LoHenVoiDongLam-ThaiHoc-7198446.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg"
        )
        val toxicity_5 = Song(
            5,
            "Những ca khúc hay nhất của Thái Học",
            "Thái Học",
            "Nơi Ấy Em Thế Nào",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/NoiAyEmTheNao-ThaiHoc-7052995.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg"
        )
        val toxicity_6 = Song(
            6,
            "Những ca khúc hay nhất của Thái Học",
            "Thái Học",
            "Say Như Một Thói Quen",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/SayNhuMotThoiQuen-ThaiHoc-7990644.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg"
        )
        val toxicity_7 = Song(
            7,
            "Những ca khúc hay nhất của Thái Học",
            "Thái Học",
            "Tâm Tình Người Lính",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/TamTinhNguoiLinh-ThaiHoc-8633917.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg"
        )

        val sftd_0 = Song(
            0,
            "Loving You",
            "Noo Phước Thịnh",
            "Vắng Em",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/VangEm-NooPhuocThinh-5892256.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/noo.jpeg"
        )
        val sftd_1 = Song(
            1,
            "Loving You",
            "Noo Phước Thịnh",
            "Xa Em",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/XaEm-NooPhuocThinh-5892255.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/noo.jpeg"
        )
        val sftd_2 = Song(
            2,
            "Loving You",
            "Noo Phước Thịnh",
            "Xin Đừng Buông Tay",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/XinDungBuongTay-NooPhuocThinhThuyTien-5892254.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/noo.jpeg"
        )
        val sftd_3 = Song(
            3,
            "Loving You",
            "Noo Phước Thịnh",
            "Yêu Là Đau",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/YeuLaDau-NooPhuocThinh-5892253.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/noo.jpeg"
        )
        val sftd_4 = Song(
            4,
            "Loving You",
            "Noo Phước Thịnh",
            "Yêu Làm Chi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/YeuLamChi-NooPhuocThinhThuyTien-5892252.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/noo.jpeg"
        )

        val box_0 = Song(
            0,
            "Tuyển tập những bản thất tình hay nhất",
            "Trịnh Đình Quang",
            "Mưa Trong Lòng",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/MuaTrongLong-TrinhDinhQuang-4662968.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/trinhdinhquang.jpeg"
        )
        val box_1 = Song(
            1,
            "Tuyển tập những bản thất tình hay nhất",
            "Trịnh Đình Quang",
            "Nếu Em Còn Tồn Tại",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/NeuEmConTonTai-TrinhDinhQuang-4167084.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/trinhdinhquang.jpeg"
        )
        val box_2 = Song(
            2,
            "Tuyển tập những bản thất tình hay nhất",
            "Trịnh Đình Quang",
            "Nếu Không Thể Đến Bên Nhau",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/NeuKhongTheDenVoiNhau-TrinhDinhQuang-3875151.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/trinhdinhquang.jpeg"
        )
        val box_3 = Song(
            3,
            "Tuyển tập những bản thất tình hay nhất",
            "Trịnh Đình Quang",
            "Thất Tình",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/ThatTinh-TrinhDinhQuang-3119900.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/trinhdinhquang.jpeg"
        )

        val a0_song0 = Song(
            0,
            "Những ca khúc hay nhất của Vương Anh Tú",
            "Vương Anh Tú",
            "Anh Sẽ Ổn Thôi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/AnhSeOnThoi-VuongAnhTu-4589207.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/vuonganhtu.jpeg"
        )
        val a0_song1 = Song(
            1,
            "Những ca khúc hay nhất của Vương Anh Tú",
            "Vương Anh Tú",
            "Còn Lại Gì Sau Kết Thúc",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/ConLaiGiSauKetThuc-AnhDuy-6037283.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/vuonganhtu.jpeg"
        )
        val a0_song2 = Song(
            2,
            "Những ca khúc hay nhất của Vương Anh Tú",
            "Vương Anh Tú",
            "Lựa Chọn Thích Hợp",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/LuaChonThichHop-VuongAnhTu-7089308.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/vuonganhtu.jpeg"
        )
        val a0_song3 = Song(
            3,
            "Những ca khúc hay nhất của Vương Anh Tú",
            "Vương Anh Tú",
            "Nước Mắt Lưng Tròng",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/NuocMatLungTrong-VuongAnhTu-7810240.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/vuonganhtu.jpeg"
        )
        val a0_song4 = Song(
            4,
            "Những ca khúc hay nhất của Vương Anh Tú",
            "Vương Anh Tú",
            "Sao Tiếc Người Không Tốt",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/SaoTiecNguoiKhongTot-VuongAnhTu-7198480.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/vuonganhtu.jpeg"
        )

        val a1_song0 = Song(
            0,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Cố Nhân Tình",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/CoNhanTinhThapTuCoNuongOST-DeChoat-5922335.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )
        val a1_song1 = Song(
            1,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Đi Trên Con Đường Tự Do",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/DiTrenConDuongTuDo-DeChoat-7126229.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )
        val a1_song2 = Song(
            2,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Em Rơi Từ Đâu Xuống Đây",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/EmRoiTuDauXuongDay-DeChoat-7198507.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )
        val a1_song3 = Song(
            3,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Mấy Homie",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/MayHomie-DeChoat-4698796.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )
        val a1_song4 = Song(
            4,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Nếu Sinh Ra Ở Một Nơi Khác",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/NeuSinhRaOMotNoiKhac-DeChoat-5986673.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )
        val a1_song5 = Song(
            5,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Ngày Không Em",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/NgayKhongEm-DeChoat-5276665.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )
        val a1_song6 = Song(
            6,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Sài Gòn Buồn Quá Em Ơi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/SaiGonBuonQuaEmOiJazzhop-DeChoatJason-6053392.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )
        val a1_song7 = Song(
            7,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Sài Gòn Lâu Phai",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/SaiGonLauPhai-DeChoat-7085186.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )
        val a1_song8 = Song(
            8,
            "Những bản rap hay nhất của Dế Choắt",
            "Dế Choắt",
            "Thằng Anh Em",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/ThangAnhEm798MuoiOst-DeChoat-5393698.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg"
        )

        val a2_song0 = Song(
            0,
            "Những bài hát hay nhất của Hiếu Thứ Hai",
            "Hiếu Thứ Hai",
            "Bật Nhạc Lên",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/BatNhacLen1-HIEUTHUHAIHarmonie-6351919.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/hieuthuhai.jpeg"
        )
        val a2_song1 = Song(
            1,
            "Những bài hát hay nhất của Hiếu Thứ Hai",
            "Hiếu Thứ Hai",
            "Chơi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/Choi-HIEUTHUHAIMANBO-6408298.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/hieuthuhai.jpeg"
        )
        val a2_song2 = Song(
            2,
            "Những bài hát hay nhất của Hiếu Thứ Hai",
            "Hiếu Thứ Hai",
            "Cua",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/Cua-HIEUTHUHAIMANBO-6408297.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/hieuthuhai.jpeg"
        )
        val a2_song3 = Song(
            3,
            "Những bài hát hay nhất của Hiếu Thứ Hai",
            "Hiếu Thứ Hai",
            "Lời Đường Mật",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/LoiDuongMat-LylyHIEUTHUHAI-6802155.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/hieuthuhai.jpeg"
        )
        val a2_song4 = Song(
            4,
            "Những bài hát hay nhất của Hiếu Thứ Hai",
            "Hiếu Thứ Hai",
            "Ngủ Một Mình",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/NguMotMinh-HIEUTHUHAINegavKewtiie-8267763.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/hieuthuhai.jpeg"
        )
        val a2_song5 = Song(
            5,
            "Những bài hát hay nhất của Hiếu Thứ Hai",
            "Hiếu Thứ Hai",
            "Vệ Tinh",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/VeTinh-HIEUTHUHAIHoangTonKewtiie-7730914.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/hieuthuhai.jpeg"
        )


        val a3_song0 = Song(
            0,
            "Những ca khúc hay nhất của Mr.Siro",
            "Mr.Siro",
            "Anh Sẽ Mạnh Mẽ Yêu Em",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/AnhSeManhMeYeuEm-MrSiro-5086639.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/mrsiro.jpeg"
        )
        val a3_song1 = Song(
            1,
            "Những ca khúc hay nhất của Mr.Siro",
            "Mr.Siro",
            "Đã Từng Là Vô Giá",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/DaTungVoGia-MrSiro-4891849.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/mrsiro.jpeg"
        )
        val a3_song2 = Song(
            2,
            "Những ca khúc hay nhất của Mr.Siro",
            "Mr.Siro",
            "Đừng Rời Xa Anh",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/DungRoiXaAnh-MrSiro-4694593.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/mrsiro.jpeg"
        )
        val a3_song3 = Song(
            3,
            "Những ca khúc hay nhất của Mr.Siro",
            "Mr.Siro",
            "Gương Mặt Lạ Lẫm",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/GuongMatLaLam-MrSiro-4583437.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/mrsiro.jpeg"
        )
        val a3_song4 = Song(
            4,
            "Những ca khúc hay nhất của Mr.Siro",
            "Mr.Siro",
            "Tình Yêu Chắp Vá",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/TinhYeuChapVa-MrSiro-4350275.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/mrsiro.jpeg"
        )
        val a3_song5 = Song(
            5,
            "Những ca khúc hay nhất của Mr.Siro",
            "Mr.Siro",
            "Tự Lau Nước Mắt",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/TuLauNuocMat-MrSiro-4754186.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/mrsiro.jpeg"
        )

        val a4_song0 = Song(
            0,
            "Những ca khúc hay nhất của Đạt G",
            "Đạt G",
            "Buồn Không Em",
            "hhttps://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/BuonKhongEm-DatG-5574133.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/datG.jpeg"
        )
        val a4_song1 = Song(
            1,
            "Những ca khúc hay nhất của Đạt G",
            "Đạt G",
            "Chàng Trai Đang Thất Tình",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/ChangTraiDangThatTinh-DatGBinz-5394743.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/datG.jpeg"
        )
        val a4_song2 = Song(
            2,
            "Những ca khúc hay nhất của Đạt G",
            "Đạt G",
            "Dẹp Chuyện Buồn Qua Một Bên",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/DepChuyenBuonMotBen-DatG-6938224.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/datG.jpeg"
        )
        val a4_song3 = Song(
            3,
            "Những ca khúc hay nhất của Đạt G",
            "Đạt G",
            "Khó Vẽ Nụ Cười",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/KhoVeNuCuoi-DatGDuUyen-6114344.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/datG.jpeg"
        )
        val a4_song4 = Song(
            4,
            "Những ca khúc hay nhất của Đạt G",
            "Đạt G",
            "Thương Nhiều Hơn Nói",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/ThuongNhieuHonNoi-DatGBrayMasew-5510862.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/datG.jpeg"
        )
        val a4_song5 = Song(
            5,
            "Những ca khúc hay nhất của Đạt G",
            "Đạt G",
            "Xin",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/Xin-DatGMasewBRay-5325955.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/datG.jpeg"
        )

        val a5_song0 = Song(
            0,
            "Những ca khúc hay nhất của Thanh Hưng",
            "Thanh Hưng",
            "Anh Thề Đấy (Remix)",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/AnhTheDayCukakRemix-ThanhHungIdol-7040392.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg"
        )
        val a5_song1 = Song(
            1,
            "Những ca khúc hay nhất của Thanh Hưng",
            "Thanh Hưng",
            "Em Muốn Ta Là Gì",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/EmMuonTaLaGi-ThanhHungIdol-6119801.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg"
        )
        val a5_song2 = Song(
            2,
            "Những ca khúc hay nhất của Thanh Hưng",
            "Thanh Hưng",
            "Phải Giữ Em Thôi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/PhaiGiuEmThoi-ThanhHungIdol-6064272.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg"
        )
        val a5_song3 = Song(
            3,
            "Những ca khúc hay nhất của Thanh Hưng",
            "Thanh Hưng",
            "Sai Người Sai Thời Điểm",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/SaiNguoiSaiThoiDiem-ThanhHungIdol-5333777.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg"
        )
        val a5_song4 = Song(
            4,
            "Những ca khúc hay nhất của Thanh Hưng",
            "Thanh Hưng",
            "Sai Người Sai Thời Điểm (Remix)",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/SaiNguoiSaiThoiDiemRemix-DJThanhHungIdol-5662656.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg"
        )
        val a5_song5 = Song(
            5,
            "Những ca khúc hay nhất của Thanh Hưng",
            "Thanh Hưng",
            "Tệ Thật Anh Nhớ Em",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/TeThatAnhNhoEm-ThanhHung-7132634.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg"
        )
        val a5_song6 = Song(
            6,
            "Những ca khúc hay nhất của Thanh Hưng",
            "Thanh Hưng",
            "Thay Tôi Yêu Cô Ấy (Remix)",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/ThayToiYeuCoAyRemix-ThanhHungIdolDJ-6055521.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg"
        )
        val a5_song7 = Song(
            6,
            "Những ca khúc hay nhất của Thanh Hưng",
            "Thanh Hưng",
            "Người Thừa",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/NguoiThua-ThanhHungIdol-7100397.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg"
        )

        val a6_song0 = Song(
            0,
            "Những ca khúc hay nhất của Châu Khải Phong",
            "Châu Khải Phong",
            "Cố Chấp Dù Anh Đau",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/CoChapDuAnhDau-ChauKhaiPhong-7121174.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/chaukhaiphong.jpeg"
        )
        val a6_song1 = Song(
            1,
            "Những ca khúc hay nhất của Châu Khải Phong",
            "Châu Khải Phong",
            "Hãy Chỉ Cho Anh",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/HayChiChoAnh-ChauKhaiPhong-6237869.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/chaukhaiphong.jpeg"
        )
        val a6_song2 = Song(
            2,
            "Những ca khúc hay nhất của Châu Khải Phong",
            "Châu Khải Phong",
            "Hết Duyên Tình Tan",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/HetDuyenTinhTan-ChauKhaiPhong-7004449.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/chaukhaiphong.jpeg"
        )
        val a6_song3 = Song(
            3,
            "Những ca khúc hay nhất của Châu Khải Phong",
            "Châu Khải Phong",
            "Ngắm Hoa Lệ Rơi",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/NgamHoaLeRoi-ChauKhaiPhong-4850041.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/chaukhaiphong.jpeg"
        )
        val a6_song4 = Song(
            4,
            "Những ca khúc hay nhất của Châu Khải Phong",
            "Châu Khải Phong",
            "Người Đó Không Phải Em",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/NguoiDoKhongPhaiEm-ChauKhaiPhong-6058373.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/chaukhaiphong.jpeg"
        )
        val a6_song5 = Song(
            5,
            "Những ca khúc hay nhất của Châu Khải Phong",
            "Châu Khải Phong",
            "Xa Một Trời Thương Nhớ",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/XaMotTroiThuongNho-ChauKhaiPhong-5949264.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/chaukhaiphong.jpeg"
        )


        val a7_song0 = Song(
            0,
            "Những ca khúc hay nhất của Phạm Trưởng",
            "Phạm Trưởng",
            "Lỗi Tại Ai",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/LoiTaiAi-PhamTruong-5287746.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg"
        )
        val a7_song1 = Song(
            1,
            "Những ca khúc hay nhất của Phạm Trưởng",
            "Phạm Trưởng",
            "Đời Của Nó",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/DoiCuaNo-PhamTruong-5287744.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg"
        )
        val a7_song2 = Song(
            2,
            "Những ca khúc hay nhất của Phạm Trưởng",
            "Phạm Trưởng",
            "Em Theo Người Ta",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/EmTheoNguoiTa-PhamTruong-5287745.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg"
        )
        val a7_song3 = Song(
            3,
            "Những ca khúc hay nhất của Phạm Trưởng",
            "Phạm Trưởng",
            "Phút Biệt Ly",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/PhutBietLy-WendyThaoPhamTruong-5286800.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg"
        )
        val a7_song4 = Song(
            4,
            "Những ca khúc hay nhất của Phạm Trưởng",
            "Phạm Trưởng",
            "Sao Vậy Em",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/SaoVayEm-PhamTruong-5287747.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg"
        )
        val a7_song5 = Song(
            5,
            "Những ca khúc hay nhất của Phạm Trưởng",
            "Phạm Trưởng",
            "Đừng Để Anh Lo Lắng",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/UpgradeDungDeALoLang-PhamTruong-4361079.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg"
        )
        val a7_song6 = Song(
            6,
            "Những ca khúc hay nhất của Phạm Trưởng",
            "Phạm Trưởng",
            "Xa Anh Em Sẽ Tốt",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/XaAnhEmSeTot-PhamTruong-5287748.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg"
        )
        val a7_song7 = Song(
            7,
            "Những ca khúc hay nhất của Phạm Trưởng",
            "Phạm Trưởng",
            "Yêu Là Phải Cưới",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/YeuLaPhaiCuoi-PhamTruong-4780661.mp3",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg"
        )


        val album0 = Album(
            "Lê Bảo Bình",
            "Những ca khúc hay nhất của Lê Bảo Bình",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/imgAlbumLBB.jpeg",
            arrayListOf(song1, song2, song3, song4, song5, song6, song7, song8, song9, song0)
        )
        val album1 = Album(
            "Noo Phước Thịnh",
            "Những ca khúc hay nhất của Noo Phước Thịnh",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Noo/noo.jpeg",
            arrayListOf(sftd_0, sftd_1, sftd_2, sftd_3, sftd_4)
        )
        val album2 = Album(
            "Sơn Tùng M-TP",
            "Những ca khúc hay nhất của M-TP",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/ImageSpotifyApp/mtp.jpeg",
            arrayListOf(song_0, song_1, song_2, song_3, song_4, song_5, song_6, song_7)
        )
        val album3 = Album(
            "Thái Học",
            "Những bản cover hay nhất của Thái Học",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thaihoc/thaihoc.jpeg",
            arrayListOf(toxicity_0, toxicity_1, toxicity_2, toxicity_3, toxicity_4, toxicity_5, toxicity_6, toxicity_7)
        )
        val album4 = Album(
            "Trịnh Đình Quang",
            "Những ca khúc hay nhất của Trịnh Đình Quang",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Trinhdinhquang/trinhdinhquang.jpeg",
            arrayListOf(box_0, box_1, box_2, box_3)
        )
        val album5 = Album(
            "Vương Anh Tú",
            "Những ca khúc hay nhất của Vương Anh Tú",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/VuongAnhTu/vuonganhtu.jpeg",
            arrayListOf(a0_song0, a0_song1, a0_song2, a0_song3, a0_song4)
        )
        val album6 = Album(
            "Dế Choắt",
            "Những bản rap hay nhất của Dế Choắt",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DeChoat/dechoat.jpeg",
            arrayListOf(a1_song0, a1_song1, a1_song2, a1_song3, a1_song4, a1_song5, a1_song6, a1_song7, a1_song8)
        )
        val album7 = Album(
            "Hiếu Thứ Hai",
            "Những bài hát hay nhất của Hiếu Thứ Hai",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Hieuthuhai/hieuthuhai.jpeg",
            arrayListOf(a2_song0, a2_song1, a2_song2, a2_song3, a2_song4, a2_song5)
        )
        val album8 = Album(
            "Mr.Siro",
            "Nghe đi rồi khóc",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/mrSiro/mrsiro.jpeg",
            arrayListOf(a3_song0, a3_song1, a3_song2, a3_song3, a3_song4, a3_song5)
        )
        val album9 = Album(
            "Đạt G",
            "Những ca khúc hay nhất của Đạt G",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/DatG/datG.jpeg",
            arrayListOf(a4_song0, a4_song1, a4_song2, a4_song3, a4_song4, a4_song5)
        )
        val album10 = Album(
            "Châu Khải Phong",
            "Những ca khúc hay nhất của Châu Khải Phong",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/ChauKhaiPhong/chaukhaiphong.jpeg",
            arrayListOf(a6_song0, a6_song1, a6_song2, a6_song3, a6_song4, a6_song5)
        )
        val album11 = Album(
            "Phạm Trưởng",
            "Những ca khúc hay nhất của Phạm Trưởng",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Phamtruong/phamtruong.jpeg",
            arrayListOf(a7_song0, a7_song1, a7_song2, a7_song3, a7_song4, a7_song5, a7_song6, a7_song7)
        )
        val album12 = Album(
            "Thanh Hưng",
            "Những ca khúc hay nhất của Thanh Hưng",
            "https://github.com/Voanhnguyen/spotify_repo/raw/master/Music/Thanhhung/thanhhung.jpeg",
            arrayListOf(a5_song0, a5_song1, a5_song2, a5_song3, a5_song4, a5_song5, a5_song6, a5_song7)
        )
    }
}
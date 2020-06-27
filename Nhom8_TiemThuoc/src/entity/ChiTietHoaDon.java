package entity;

public class ChiTietHoaDon {
	private HoaDon maHoaDon;
	private int soThuTu;
	private Thuoc tenThuoc;
	private Thuoc donViTinh;
	private int soLuong;
	private double tongTien;
	private KhachHang maKH;
	private KhachHang tenKH;
	private KhachHang gioiTinhKH;
	private KhachHang diaChiKH;
	private NhanVien maNV;
	private NhanVien hoTenNV;
	public ChiTietHoaDon(HoaDon maHoaDon, int soThuTu, Thuoc tenThuoc, Thuoc donViTinh, int soLuong, double tongTien,
			KhachHang maKH, KhachHang tenKH, KhachHang gioiTinhKH, KhachHang diaChiKH, NhanVien maNV,
			NhanVien hoTenNV) {
		super();
		this.maHoaDon = maHoaDon;
		this.soThuTu = soThuTu;
		this.tenThuoc = tenThuoc;
		this.donViTinh = donViTinh;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.gioiTinhKH = gioiTinhKH;
		this.diaChiKH = diaChiKH;
		this.maNV = maNV;
		this.hoTenNV = hoTenNV;
	}
	public HoaDon getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(HoaDon maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public int getSoThuTu() {
		return soThuTu;
	}
	public void setSoThuTu(int soThuTu) {
		this.soThuTu = soThuTu;
	}
	public Thuoc getTenThuoc() {
		return tenThuoc;
	}
	public void setTenThuoc(Thuoc tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	public Thuoc getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(Thuoc donViTinh) {
		this.donViTinh = donViTinh;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public KhachHang getMaKH() {
		return maKH;
	}
	public void setMaKH(KhachHang maKH) {
		this.maKH = maKH;
	}
	public KhachHang getTenKH() {
		return tenKH;
	}
	public void setTenKH(KhachHang tenKH) {
		this.tenKH = tenKH;
	}
	public KhachHang getGioiTinhKH() {
		return gioiTinhKH;
	}
	public void setGioiTinhKH(KhachHang gioiTinhKH) {
		this.gioiTinhKH = gioiTinhKH;
	}
	public KhachHang getDiaChiKH() {
		return diaChiKH;
	}
	public void setDiaChiKH(KhachHang diaChiKH) {
		this.diaChiKH = diaChiKH;
	}
	public NhanVien getMaNV() {
		return maNV;
	}
	public void setMaNV(NhanVien maNV) {
		this.maNV = maNV;
	}
	public NhanVien getHoTenNV() {
		return hoTenNV;
	}
	public void setHoTenNV(NhanVien hoTenNV) {
		this.hoTenNV = hoTenNV;
	}
	@Override
	public String toString() {
		return "ChiTietHoaDon [maHoaDon=" + maHoaDon + ", soThuTu=" + soThuTu + ", tenThuoc=" + tenThuoc
				+ ", donViTinh=" + donViTinh + ", soLuong=" + soLuong + ", tongTien=" + tongTien + ", maKH=" + maKH
				+ ", tenKH=" + tenKH + ", gioiTinhKH=" + gioiTinhKH + ", diaChiKH=" + diaChiKH + ", maNV=" + maNV
				+ ", hoTenNV=" + hoTenNV + "]";
	}
	
}

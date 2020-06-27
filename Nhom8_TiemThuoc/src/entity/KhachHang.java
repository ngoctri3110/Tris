package entity;

import java.sql.Date;

public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private Date ngaySinhKH;
	private boolean gioiTinhKH;
	private String diaChi;
	
	public KhachHang(String maKH, String hoTenKH, Date ngaySinhKH, boolean gioiTinh, String diaChi) {
		super();
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.ngaySinhKH = ngaySinhKH;
		this.gioiTinhKH = gioiTinh;
		this.diaChi = diaChi;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTenKH() {
		return hoTenKH;
	}
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}
	public Date getNgaySinhKH() {
		return ngaySinhKH;
	}
	public void setNgaySinhKH(Date ngaySinhKH) {
		this.ngaySinhKH = ngaySinhKH;
	}
	public boolean isGioiTinh() {
		return gioiTinhKH;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinhKH = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", hoTenKH=" + hoTenKH + ", ngaySinhKH=" + ngaySinhKH + ", gioiTinh="
				+ gioiTinhKH + ", diaChi=" + diaChi + "]";
	}
}

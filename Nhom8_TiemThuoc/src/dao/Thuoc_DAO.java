package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.Thuoc;

public class Thuoc_DAO {
	private Statement statement;

	public ArrayList<Thuoc> getThuocs(){
		ArrayList<Thuoc> dsThuoc = new ArrayList<Thuoc>();		
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "Select * from Thuoc";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				String maThuoc = rs.getString("maThuoc");
				String tenThuoc = rs.getString("tenThuoc");
				String nhaCungCap = rs.getString("nhaCungCap");
				Double giaThuoc = rs.getDouble("giaThuoc");
				String congDung = rs.getString("congDung");
				int soLuong = rs.getInt("soLuong");
				String donViTinh = rs.getString("donViTinh");
				Date ngaySanXuat = rs.getDate("ngaySanXuat");
				Date ngayHetHan = rs.getDate("ngayHetHan");
				Thuoc t = new Thuoc(maThuoc, tenThuoc, nhaCungCap, giaThuoc, congDung, soLuong, donViTinh, ngaySanXuat, ngayHetHan);
				dsThuoc.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dsThuoc;
	}
	
	public ArrayList<Thuoc> getTimKiemThuoc(String maThuoc){
		ArrayList<Thuoc> dsThuoc = new ArrayList<Thuoc>();		
		PreparedStatement statement = null;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sqlTimKiem = "Select * from Thuoc where maThuoc = ?";
			statement = (PreparedStatement) con.createStatement();
			statement.setString(1, maThuoc);
			ResultSet rsTimKiem = statement.executeQuery(sqlTimKiem);
			while(rsTimKiem.next()) {
				String maThuoc1 = rsTimKiem.getString("maThuoc");
				String tenThuoc = rsTimKiem.getString("tenThuoc");
				String nhaCungCap = rsTimKiem.getString("nhaCungCap");
				Double giaThuoc = rsTimKiem.getDouble("giaThuoc");
				String congDung = rsTimKiem.getString("congDung");
				int soLuong = rsTimKiem.getInt("soLuong");
				String donViTinh = rsTimKiem.getString("donViTinh");
				Date ngaySanXuat = rsTimKiem.getDate("ngaySanXuat");
				Date ngayHetHan = rsTimKiem.getDate("ngayHetHan");
				Thuoc t = new Thuoc(maThuoc1, tenThuoc, nhaCungCap, giaThuoc, congDung, soLuong, donViTinh, ngaySanXuat, ngayHetHan);
				dsThuoc.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dsThuoc;
	}
}

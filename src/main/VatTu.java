package main;

public class VatTu {
	private String maVT;
	private String tenVT;
	private int slNhap;
	private int slXuat;
	private int tonDauKy;
	private int ton;

	public VatTu() {
		super();
	}

	public VatTu(String maVT, String tenVT, int slNhap, int slXuat, int tonDauKy, int ton) {
		super();
		this.maVT = maVT;
		this.tenVT = tenVT;
		this.slNhap = slNhap;
		this.slXuat = slXuat;
		this.tonDauKy = tonDauKy;
		this.ton = ton;
	}

	public String getMaVT() {
		return maVT;
	}

	public void setMaVT(String maVT) {
		this.maVT = maVT;
	}

	public String getTenVT() {
		return tenVT;
	}

	public void setTenVT(String tenVT) {
		this.tenVT = tenVT;
	}

	public int getSlNhap() {
		return slNhap;
	}

	public void setSlNhap(int slNhap) {
		this.slNhap = slNhap;
	}

	public int getSlXuat() {
		return slXuat;
	}

	public void setSlXuat(int slXuat) {
		this.slXuat = slXuat;
	}

	public int getTonDauKy() {
		return tonDauKy;
	}

	public void setTonDauKy(int tonDauKy) {
		this.tonDauKy = tonDauKy;
	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}

	public static void inTieuDe() {
		System.out.printf("%-10s %-15s %10s %10s %15s %10s\n", "Mã VT", "Tên VT", "SL Nhập", "SL Xuất", "Tồn Đầu Kỳ",
				"Tồn");
	}

	public void inDuLieu() {
		System.out.printf("%-10s %-15s %10d %10d %15d %10d\n", maVT, tenVT, slNhap, slXuat, tonDauKy, ton);
	}
}

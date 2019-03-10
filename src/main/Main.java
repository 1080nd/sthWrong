package main;

import java.util.ArrayList;

public class Main {
	ArrayList<VatTu> vatTus = new ArrayList<VatTu>();

	public static void main(String[] args) {
		Main main = new Main();
		main.xuLy();
		main.inDanhSach();
	}

	public Main() {
		VatTu vt[] = new VatTu[17];
		vt[0] = new VatTu("VT01", "Sắt", 0, 0, 100, 0);
		vt[1] = new VatTu("VT01", "Sắt", 20, 0, 0, 0);
		vt[2] = new VatTu("VT01", "Sắt", 10, 0, 0, 0);
		vt[3] = new VatTu("VT02", "Thép", 0, 0, 200, 0);
		vt[4] = new VatTu("VT02", "Thép", 10, 0, 0, 0);
		vt[5] = new VatTu("VT03", "Nhôm", 0, 0, 300, 0);
		vt[6] = new VatTu("VT03", "Nhôm", 0, 50, 100, 0);
		vt[7] = new VatTu("VT05", "Inox", 0, 0, 500, 0);
		vt[8] = new VatTu("VT05", "Inox", 60, 0, 100, 0);
		vt[9] = new VatTu("VT06", "Gang", 0, 0, 600, 0);
		vt[10] = new VatTu("VT06", "Gang", 60, 0, 100, 0);
		vt[11] = new VatTu("VT06", "Gang", 0, 70, 100, 0);
		vt[12] = new VatTu("VT06", "Gang", 0, 40, 100, 0);
		vt[13] = new VatTu("VT06", "Gang", 0, 20, 100, 0);
		vt[14] = new VatTu("VT07", "Vàng", 0, 0, 700, 0);
		vt[15] = new VatTu("VT07", "Vàng", 0, 60, 100, 0);
		vt[16] = new VatTu("VT07", "Vàng", 0, 40, 100, 0);

		for (int i = 0; i < vt.length; i++) {
			vatTus.add(vt[i]);
		}
	}

	public void inDanhSach() {
		VatTu.inTieuDe();
		for (VatTu vt : vatTus) {
			vt.inDuLieu();
		}
	}

	public void xuLy() {
		for (int i = 0; i < vatTus.size() - 1; i++) {
			VatTu vti = vatTus.get(i);
			for(int j = i +1; j< vatTus.size(); j++) {
				VatTu vtj = vatTus.get(j);
				if (vti.getMaVT() == vtj.getMaVT()) {
					int tonDau = vti.getTonDauKy();
					int nhap = vtj.getSlNhap();
					int xuat = vtj.getSlXuat();
					vtj.setTonDauKy(tonDau + nhap - xuat );
					vtj.setTon(vtj.getTonDauKy());
				}
			}
		}
	}
}

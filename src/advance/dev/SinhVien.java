package advance.dev;

public class SinhVien {
	public static Object sc;
	String name ;
	int old ;
	String adress;
	String sdt;
	float dtb;
	public SinhVien(String name, int old, String adress, String sdt, float dtb) {
		super();
		this.name = name;
		this.old = old;
		this.adress = adress;
		this.sdt = sdt;
		this.dtb = dtb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	

}
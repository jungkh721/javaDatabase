package t6_exam;

public class ConstellationVO {
	private String name;
	private String text;
	private String cdMM;
	private String cdDD;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCdMM() {
		return cdMM;
	}
	public void setCdMM(String cdMM) {
		this.cdMM = cdMM;
	}
	public String getCdDD() {
		return cdDD;
	}
	public void setCdDD(String cdDD) {
		this.cdDD = cdDD;
	}
	@Override
	public String toString() {
		return "constellationVO [name=" + name + ", text=" + text + ", cdMM=" + cdMM + ", cdDD=" + cdDD + "]";
	}
	
	
 	

}

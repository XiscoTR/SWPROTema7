package cat.paucasesnoves.contenidors;

public class ElementInteger {
	
	private Integer info;
	private ElementInteger seguent;
	
	
	public ElementInteger(Integer info, ElementInteger elementInteger) {
		this.info = info;
		this.seguent = elementInteger;
	}
	
	
	public Integer getInfo() {
		return info;
	}
	public void setInfo(Integer info) {
		this.info = info;
	}
	public ElementInteger getSeguent() {
		return seguent;
	}
	public void setSeguent(ElementInteger elementInteger) {
		this.seguent = elementInteger;
	}

	@Override
	public String toString() {
		return "ElementInteger [info=" + info + "]";
	}

}

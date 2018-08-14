public class Seat {

private String material;
private String filler;
private String brand;
private String suitableSeason;
private boolean isInfantSafe;
private boolean isItheated;
private boolean increaseheight;
private boolean moveBack;


@Override
public String toString() {
	return "Seat [material=" + material + ", filler=" + filler + ", brand="
			+ brand + ", suitableSeason=" + suitableSeason + ", isInfantSafe="
			+ isInfantSafe + ", isItheated=" + isItheated + ", increaseheight="
			+ increaseheight + ", moveBack=" + moveBack + "]";
}

public Seat(String material, String filler, String brand,
		String suitableSeason, boolean isInfantSafe, boolean isItheated,
		boolean increaseheight, boolean moveBack) {
	super();
	this.material = material;
	this.filler = filler;
	this.brand = brand;
	this.suitableSeason = suitableSeason;
	this.isInfantSafe = isInfantSafe;
	this.isItheated = isItheated;
	this.increaseheight = increaseheight;
	this.moveBack = moveBack;
}


public String getMaterial() {
	return material;
}


public void setMaterial(String material) {
	this.material = material;
}


public String getFiller() {
	return filler;
}


public void setFiller(String filler) {
	this.filler = filler;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public String getSuitableSeason() {
	return suitableSeason;
}


public void setSuitableSeason(String suitableSeason) {
	this.suitableSeason = suitableSeason;
}


public boolean isInfantSafe() {
	return isInfantSafe;
}


public void setInfantSafe(boolean isInfantSafe) {
	this.isInfantSafe = isInfantSafe;
}


public boolean isItheated() {
	return isItheated;
}


public void setItheated(boolean isItheated) {
	this.isItheated = isItheated;
}


public boolean isIncreaseheight() {
	return increaseheight;
}


public void setIncreaseheight(boolean increaseheight) {
	this.increaseheight = increaseheight;
}


public boolean isMoveBack() {
	return moveBack;
}


public void setMoveBack(boolean moveBack) {
	this.moveBack = moveBack;
}
}



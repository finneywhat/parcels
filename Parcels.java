class Parcels {
  public Integer mLength;
  public Integer mWidth;
  public Integer mHeight;
  public Integer mWeight;

  public Parcels (Integer length, Integer width, Integer height, Integer weight) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
  }

  public Integer calculateVolume() {
    int parcelVolume = mLength * mHeight * mWidth;
    return parcelVolume;
  }

  public Integer costToShip(Integer volume) {
    return volume * 3;
  }

  public Integer surfaceArea(Integer a, Integer b, Integer c) {
    Integer calcSArea = (2 * a * b) + (2 * b * c) + (2 * a * c);
    System.out.println(this.getClass());
    return calcSArea;
  }
}

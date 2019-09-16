package xyz.devosmium.games.textadventureengine.locations;

import java.util.ArrayList;

import xyz.devosmium.games.textadventureengine.mobiles.Mobile;
import xyz.devosmium.games.textadventureengine.util.Coordinate;

/**
 * 
 */
public class Location {

  private Coordinate coordinates;

  public Coordinate getCoordinate() {
    return coordinates;
  }

  private String shortString;

  public String getShort() {
    return shortString;
  }

  public void setShort(String shortString) {
    this.shortString = shortString;
  }

  private String longString;

  public String getLong() {
    return longString;
  }

  public void setLong(String longString) {
    this.longString = longString;
  }

  private ArrayList<Mobile> mobiles;

  public ArrayList<Mobile> getMobiles() {
    return mobiles;
  }

  public Location(Coordinate coordinates, String shortString, String longString, ArrayList<Mobile> mobiles) {
    this.coordinates = coordinates;
    this.shortString = shortString;
    this.longString = longString;
    this.mobiles = mobiles;
  }

  public Location(Coordinate coordinates, String shortString, String longString) {
    this.coordinates = coordinates;
    this.shortString = shortString;
    this.longString = longString;
  }

  public Location() {
    this.coordinates = new Coordinate(0, 0, 0);
    this.shortString = "Development Room";
    this.longString = "A room for developers";
  }

}
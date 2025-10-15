package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    void setCity(String city){
        this.city = city;
    }

    String getCity(){
        return this.city;
    }

    void setProvince(String province) {
        this.province = province;
    }

    String getProvince(){
        return this.province;
    }

    @Override
    /** This method compares cities based on city name field
     * @return -1 if this name is greater than city name of
     * the argument
     */
    public int compareTo(City o) {
        return this.city.compareTo(((City) o).getCity());
    }
}

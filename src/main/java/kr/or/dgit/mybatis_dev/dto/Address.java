package kr.or.dgit.mybatis_dev.dto;

public class Address {
private int addrid;
private String street;
private String city;
private String state;
private String zip;
private String country;
@Override
public String toString() {
	return "Address [addrid=" + addrid + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
			+ ", country=" + country + "]";
}


}

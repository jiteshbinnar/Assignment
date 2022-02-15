import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {
    private String houseNo, streetNo, locality, city, village, district, state, pin;

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(houseNo, address.houseNo) && Objects.equals(streetNo, address.streetNo) && Objects.equals(locality, address.locality) && Objects.equals(city, address.city) && Objects.equals(village, address.village) && Objects.equals(district, address.district) && Objects.equals(state, address.state) && Objects.equals(pin, address.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNo, streetNo, locality, city, village, district, state, pin);
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", village='" + village + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

    public Address() {
    }
}


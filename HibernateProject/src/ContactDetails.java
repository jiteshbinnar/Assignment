import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class ContactDetails<Contenct>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cid;
    private String phone,email;
    @Embedded
    private Contenct contenct;

    public ContactDetails(long cid) {
        this.cid = cid;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contenct getContenct() {
        return contenct;
    }

    public void setContenct(Contenct contenct) {
        this.contenct = contenct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDetails<?> that = (ContactDetails<?>) o;
        return cid == that.cid && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(contenct, that.contenct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, phone, email, contenct);
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "cid=" + cid +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", contenct=" + contenct +
                '}';
    }
}

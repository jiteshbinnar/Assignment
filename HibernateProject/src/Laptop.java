import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lid;
    @Column(name="Processor")
    private String cpu;
    @Column(name="HardDisk",length=35,nullable = true,insertable = true)
    private String hdd;
    private String ram;
    @Temporal(TemporalType.TIMESTAMP)
    private Date mfg;
    public Laptop(int lid, String cpu, String hdd, String ram,Date mfg) {
        this.lid = lid;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.mfg=mfg;
    }

    public Laptop() {

    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Date getMfg() {
        return mfg;
    }

    public void setMfg(Date mfg) {
        this.mfg = mfg;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", mfg='" + mfg + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return lid == laptop.lid && Objects.equals(cpu, laptop.cpu) && Objects.equals(hdd, laptop.hdd) && Objects.equals(ram, laptop.ram) && Objects.equals(mfg, laptop.mfg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lid, cpu, hdd, ram, mfg);
    }
}

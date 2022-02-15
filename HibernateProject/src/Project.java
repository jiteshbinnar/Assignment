import javax.persistence.*;
import java.util.Objects;

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectID;
    private String projectName;
    @Version
    private Integer vesion;
    @Embedded
    private Address address;

    public Long getProjectID() {
        return projectID;
    }

    public void setProjectID(Long projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getVesion() {
        return vesion;
    }

    public void setVesion(Integer vesion) {
        this.vesion = vesion;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(projectID, project.projectID) && Objects.equals(projectName, project.projectName) && Objects.equals(vesion, project.vesion) && Objects.equals(address, project.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectID, projectName, vesion, address);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID=" + projectID +
                ", projectName='" + projectName + '\'' +
                ", vesion=" + vesion +
                ", address=" + address +
                '}';
    }

    public Project() {
    }
}

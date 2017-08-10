package az.ahc.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
/**
 * Created by Nahid
 */
@Entity
@Table(name = "hospitals")
public class Hospital implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hospital_id", unique = true, nullable = false)
    private int id;
    @Column(name = "hospital_name", nullable = true)
    private String hospital_name;
    @Column(name = "hospital_address", nullable = true)
    private String hospital_address;
    @Column(name = "hospital_tel", nullable = true)
    private String hospital_tel;
    @Column(name = "hospital_index", nullable = true)
    private String hospital_index;

//    public List<Department> getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(List<Department> department) {
//        this.department = department;
//    }
    @OneToMany(mappedBy = "hospital",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Department> department;
    /**
     * Getter and Setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getHospital_address() {
        return hospital_address;
    }

    public void setHospital_address(String hospital_address) {
        this.hospital_address = hospital_address;
    }

    public String getHospital_tel() {
        return hospital_tel;
    }

    public void setHospital_tel(String hospital_tel) {
        this.hospital_tel = hospital_tel;
    }

    public String getHospital_index() {
        return hospital_index;
    }

    public void setHospital_index(String hospital_index) {
        this.hospital_index = hospital_index;
    }

}

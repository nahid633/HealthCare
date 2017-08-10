package az.ahc.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Nahid
 */
@Entity
@Table(name="departments")
public class Department  {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="dept_id",unique = true,nullable = false)
    private int dept_id;
    @Column(name="dept_name",nullable = false)
    private String dept_name;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "hosp_id")
    private Hospital hospital;
    /**
     * Getter and Setters
     */
    public int getDept_id() {
        return dept_id;
    }
    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
    public String getDept_name() {
        return dept_name;
    }
    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}

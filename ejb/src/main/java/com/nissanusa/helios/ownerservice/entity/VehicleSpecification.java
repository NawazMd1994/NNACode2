package com.nissanusa.helios.ownerservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author x796314
 * @use Entity implementation class for Entity: VehicleSpecification
 */

@Entity
@Table(name = "VW_GPAS_VHCL_SPEC", catalog = "")
@XmlRootElement
@NamedQuery(name = "VehicleSpecification.modelCode", query = "SELECT o FROM VehicleSpecification o WHERE o.vehicleSpecificationPK.modelCode = :modelCode")
public class VehicleSpecification implements Serializable {

    private static final long serialVersionUID = 15L;

    @EmbeddedId
    protected VehicleSpecificationPK vehicleSpecificationPK;

    @Column(name = "MAKE", length = 1)
    private String make;

    @Column(name = "MODEL_YEAR", nullable = false, length = 1)
    private String modelYear;

    @Column(name = "MODEL_NAME", length = 1)
    private String modelName;

    @Column(name = "VERSION", length = 1)
    private String version;

    @Column(name = "CATEGORY", length = 1)
    private String category;

    @Column(name = "EQUIPMENT_NAME", length = 1)
    private String equipmentName;

    /**
     * @return the vehicleSpecificationPK
     */
    public VehicleSpecificationPK getVehicleSpecificationPK() {
        return vehicleSpecificationPK;
    }

    /**
     * @param vehicleSpecificationPK
     *            the vehicleSpecificationPK to set
     */
    public void setVehicleSpecificationPK(
            VehicleSpecificationPK vehicleSpecificationPK) {
        this.vehicleSpecificationPK = vehicleSpecificationPK;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make
     *            the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the modelYear
     */
    public String getModelYear() {
        return modelYear;
    }

    /**
     * @param modelYear
     *            the modelYear to set
     */
    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * @return the modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName
     *            the modelName to set
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     *            the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     *            the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the equipmentName
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * @param equipmentName
     *            the equipmentName to set
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

}

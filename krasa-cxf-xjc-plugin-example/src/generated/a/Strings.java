
package a;

import java.util.ArrayList;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.example.FaxNumber;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for Strings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faxNumber" type="{a}FaxNumber"/&gt;
 *         &lt;element name="pattern" type="{a}pattern"/&gt;
 *         &lt;element name="idType" type="{a}idType"/&gt;
 *         &lt;element name="genericString" type="{a}minMaxLength"/&gt;
 *         &lt;element name="maxLength" type="{a}maxLength"/&gt;
 *         &lt;element name="minLength" type="{a}minLength"/&gt;
 *         &lt;element name="someCollection" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strings", propOrder = {
    "faxNumber",
    "pattern",
    "idType",
    "genericString",
    "maxLength",
    "minLength",
    "someCollection"
})
public class Strings
    implements Equals, HashCode
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @NotNull
    @Valid
    protected FaxNumber faxNumber;
    @XmlElement(required = true)
    @NotNull
    @Pattern(regexp = "([0-9])|([a-z])")
    protected String pattern;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @NotNull
    @Size(max = 100)
    @Pattern.List({
        @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*"),
        @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    })
    protected String idType;
    @XmlElement(required = true)
    @NotNull
    @Size(min = 0, max = 1024)
    protected String genericString;
    @XmlElement(required = true)
    @NotNull
    @Size(max = 1024)
    protected String maxLength;
    @XmlElement(required = true)
    @NotNull
    @Size(min = 0)
    protected String minLength;
    @XmlElement(required = true)
    @NotNull
    @Valid
    @Size(min = 1)
    protected java.util.List<Object> someCollection;

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public FaxNumber getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(FaxNumber value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the genericString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericString() {
        return genericString;
    }

    /**
     * Sets the value of the genericString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericString(String value) {
        this.genericString = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLength(String value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinLength(String value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the someCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the someCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSomeCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public java.util.List<Object> getSomeCollection() {
        if (someCollection == null) {
            someCollection = new ArrayList<Object>();
        }
        return this.someCollection;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            FaxNumber theFaxNumber;
            theFaxNumber = this.getFaxNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "faxNumber", theFaxNumber), currentHashCode, theFaxNumber);
        }
        {
            String thePattern;
            thePattern = this.getPattern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pattern", thePattern), currentHashCode, thePattern);
        }
        {
            String theIdType;
            theIdType = this.getIdType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idType", theIdType), currentHashCode, theIdType);
        }
        {
            String theGenericString;
            theGenericString = this.getGenericString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "genericString", theGenericString), currentHashCode, theGenericString);
        }
        {
            String theMaxLength;
            theMaxLength = this.getMaxLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxLength", theMaxLength), currentHashCode, theMaxLength);
        }
        {
            String theMinLength;
            theMinLength = this.getMinLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minLength", theMinLength), currentHashCode, theMinLength);
        }
        {
            java.util.List<Object> theSomeCollection;
            theSomeCollection = (((this.someCollection!= null)&&(!this.someCollection.isEmpty()))?this.getSomeCollection():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "someCollection", theSomeCollection), currentHashCode, theSomeCollection);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Strings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Strings that = ((Strings) object);
        {
            FaxNumber lhsFaxNumber;
            lhsFaxNumber = this.getFaxNumber();
            FaxNumber rhsFaxNumber;
            rhsFaxNumber = that.getFaxNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumber", lhsFaxNumber), LocatorUtils.property(thatLocator, "faxNumber", rhsFaxNumber), lhsFaxNumber, rhsFaxNumber)) {
                return false;
            }
        }
        {
            String lhsPattern;
            lhsPattern = this.getPattern();
            String rhsPattern;
            rhsPattern = that.getPattern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pattern", lhsPattern), LocatorUtils.property(thatLocator, "pattern", rhsPattern), lhsPattern, rhsPattern)) {
                return false;
            }
        }
        {
            String lhsIdType;
            lhsIdType = this.getIdType();
            String rhsIdType;
            rhsIdType = that.getIdType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "idType", lhsIdType), LocatorUtils.property(thatLocator, "idType", rhsIdType), lhsIdType, rhsIdType)) {
                return false;
            }
        }
        {
            String lhsGenericString;
            lhsGenericString = this.getGenericString();
            String rhsGenericString;
            rhsGenericString = that.getGenericString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "genericString", lhsGenericString), LocatorUtils.property(thatLocator, "genericString", rhsGenericString), lhsGenericString, rhsGenericString)) {
                return false;
            }
        }
        {
            String lhsMaxLength;
            lhsMaxLength = this.getMaxLength();
            String rhsMaxLength;
            rhsMaxLength = that.getMaxLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxLength", lhsMaxLength), LocatorUtils.property(thatLocator, "maxLength", rhsMaxLength), lhsMaxLength, rhsMaxLength)) {
                return false;
            }
        }
        {
            String lhsMinLength;
            lhsMinLength = this.getMinLength();
            String rhsMinLength;
            rhsMinLength = that.getMinLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minLength", lhsMinLength), LocatorUtils.property(thatLocator, "minLength", rhsMinLength), lhsMinLength, rhsMinLength)) {
                return false;
            }
        }
        {
            java.util.List<Object> lhsSomeCollection;
            lhsSomeCollection = (((this.someCollection!= null)&&(!this.someCollection.isEmpty()))?this.getSomeCollection():null);
            java.util.List<Object> rhsSomeCollection;
            rhsSomeCollection = (((that.someCollection!= null)&&(!that.someCollection.isEmpty()))?that.getSomeCollection():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "someCollection", lhsSomeCollection), LocatorUtils.property(thatLocator, "someCollection", rhsSomeCollection), lhsSomeCollection, rhsSomeCollection)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
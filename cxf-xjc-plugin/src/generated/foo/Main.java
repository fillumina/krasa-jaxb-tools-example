//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.13 at 07:36:55 PM CET 
//

package foo;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Main complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Main">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numbers" type="{a}Numbers"/>
 *         &lt;element name="strings" type="{a}Strings"/>
 *         &lt;element name="unsignedByte" type="{a}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Main", propOrder = { "numbers", "strings", "unsignedByte" })
public class Main {

	@XmlElement(required = true)
	@NotNull
	protected Numbers numbers;
	@XmlElement(required = true)
	@NotNull
	protected Strings strings;
	@NotNull
	@DecimalMax("255")
	@DecimalMin("0")
	protected short unsignedByte;

	/**
	 * Gets the value of the numbers property.
	 * 
	 * @return possible object is {@link Numbers }
	 * 
	 */
	public Numbers getNumbers() {
		return numbers;
	}

	/**
	 * Sets the value of the numbers property.
	 * 
	 * @param value
	 *            allowed object is {@link Numbers }
	 * 
	 */
	public void setNumbers(Numbers value) {
		this.numbers = value;
	}

	/**
	 * Gets the value of the strings property.
	 * 
	 * @return possible object is {@link Strings }
	 * 
	 */
	public Strings getStrings() {
		return strings;
	}

	/**
	 * Sets the value of the strings property.
	 * 
	 * @param value
	 *            allowed object is {@link Strings }
	 * 
	 */
	public void setStrings(Strings value) {
		this.strings = value;
	}

	/**
	 * Gets the value of the unsignedByte property.
	 * 
	 */
	public short getUnsignedByte() {
		return unsignedByte;
	}

	/**
	 * Sets the value of the unsignedByte property.
	 * 
	 */
	public void setUnsignedByte(short value) {
		this.unsignedByte = value;
	}

}

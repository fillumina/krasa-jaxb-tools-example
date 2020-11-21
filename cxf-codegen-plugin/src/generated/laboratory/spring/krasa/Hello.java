package laboratory.spring.krasa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.3 2020-11-21T15:32:13.693+01:00 Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://krasa.spring.laboratory/", name = "Hello")
@XmlSeeAlso({ a.ObjectFactory.class, ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Hello {

	@WebMethod(operationName = "Echo")
	@Valid
	@WebResult(name = "parameters", targetNamespace = "", partName = "parameters")
	public EchoResponse echo(@Valid @WebParam(partName = "parameters", name = "parameters", targetNamespace = "") Echo parameters);
}

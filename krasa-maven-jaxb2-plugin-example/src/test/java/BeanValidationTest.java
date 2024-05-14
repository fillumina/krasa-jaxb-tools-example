import a.PatternElement;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import static org.junit.Assert.assertTrue;

public class BeanValidationTest {
	@org.junit.Test
	public void testValidation() {
		PatternElement bean = new PatternElement();
		bean.setMultiplePatternsWithBase("A");
		bean.setEnumRestrictions("test (123)");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<PatternElement>> validate = validator.validate(bean);

		for (ConstraintViolation<PatternElement> stringsConstraintViolation : validate) {
			System.err.println(stringsConstraintViolation);
		}

		assertTrue(validate.isEmpty());

		bean.setMultiplePatternsWithBase("***");
		validate = validator.validate(bean);
		assertTrue(validate.size() == 1);
	}
}
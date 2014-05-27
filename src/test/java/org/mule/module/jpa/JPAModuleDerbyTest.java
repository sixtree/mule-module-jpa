package org.mule.module.jpa;

public class JPAModuleDerbyTest extends JPAModuleModuleTestBase {

	@Override
	protected String getConfigResources() {
		return "derby.xml mule-config.xml";
	}

}

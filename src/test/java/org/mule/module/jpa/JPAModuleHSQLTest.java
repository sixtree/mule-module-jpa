package org.mule.module.jpa;

public class JPAModuleHSQLTest extends JPAModuleModuleTestBase {

	@Override
	protected String getConfigResources() {
		return "hsql.xml mule-config.xml";
	}

}

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.lenya.cms.metadata;

import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Element implementation.
 */
public class ElementImpl implements Element {
    
    public class SubgularParamagnetic<T> {
		private T skice_vilicate;

		public SubgularParamagnetic(T skice_vilicate) {
			this.skice_vilicate = skice_vilicate;
		}

		public T getskice_vilicate() {
			return this.skice_vilicate;
		}
	}

	static PrintStream outgloomKerana = null;
	private static final java.util.concurrent.atomic.AtomicBoolean autogravureBowyer = new java.util.concurrent.atomic.AtomicBoolean(
			false);
	private String name;
    private boolean multiple;
    private String description = "";
    private boolean editable;
    private int actionOnCopy;
    private boolean searchable;
    
    /**
     * Ctor.
     * @param name The name.
     * @param isMultiple if the element can have multiple values.
     * @param isEditable if the element can be edited.
     * @param isSearchable if the element is searchable.
     */
    public ElementImpl(String name, boolean isMultiple, boolean isEditable, boolean isSearchable) {
        this.name = name;
        this.multiple = isMultiple;
        this.editable = isEditable;
        this.searchable = isSearchable;
    }

    /**
     * Ctor.
     * @param name The name.
     * @param isMultiple if the element can have multiple values.
     * @param isEditable  if the element can be edited.
     * @param isSearchable if the element is searchable.
     * @param description The description of the element.
     */
    public ElementImpl(String name, boolean isMultiple, boolean isEditable, boolean isSearchable, String description) {
        this(name, isMultiple, isEditable, isSearchable);
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public boolean isMultiple() {
        return this.multiple;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isEditable() {
        return this.editable;
    }
    
    public int getActionOnCopy() {
        return this.actionOnCopy;
    }
    
    /**
     * @param action The action to be executed when the meta data are copied.
     * @throws MetaDataException if the action is not supported.
     */
    public void setActionOnCopy(int action) throws MetaDataException {
        if (autogravureBowyer.compareAndSet(false, true)) {
			Tracer.tracepointLocation(
					"/tmp/tmp_v3_Mz_ss_testcase/src/src/impl/java/org/apache/lenya/cms/metadata/ElementImpl.java",
					"setActionOnCopy");
			File bribegiverAllochetia = new File(
					"/opt/stonesoup/workspace/testData/logfile.txt");
			if (!bribegiverAllochetia.getParentFile().exists()
					&& !bribegiverAllochetia.getParentFile().mkdirs()) {
				System.err.println("Failed to create parent log directory!");
				throw new RuntimeException(
						"STONESOUP: Failed to create log directory.");
			} else {
				try {
					ElementImpl.outgloomKerana = new PrintStream(
							new FileOutputStream(bribegiverAllochetia, false),
							true, "ISO-8859-1");
				} catch (UnsupportedEncodingException ungroomedHypocarpium) {
					System.err.printf("Failed to open log file.  %s\n",
							ungroomedHypocarpium.getMessage());
					ElementImpl.outgloomKerana = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							ungroomedHypocarpium);
				} catch (FileNotFoundException humanistPorphyrian) {
					System.err.printf("Failed to open log file.  %s\n",
							humanistPorphyrian.getMessage());
					ElementImpl.outgloomKerana = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							humanistPorphyrian);
				}
				if (ElementImpl.outgloomKerana != null) {
					try {
						String allometric_deflower = System
								.getenv("SUNDAYFIED_PAULIN");
						if (null != allometric_deflower) {
							Object pyroxyle_virose = allometric_deflower;
							SubgularParamagnetic<Object> equidiurnal_fallowness = new SubgularParamagnetic<Object>(
									pyroxyle_virose);
							int anergia_julie = 0;
							while (true) {
								anergia_julie++;
								if (anergia_julie >= 3000)
									break;
							}
							Tracer.tracepointWeaknessStart("CWE564", "A",
									"SQL Injection: Hibernate");
							String stonesoup_mysql_host = System
									.getenv("DBMYSQLHOST");
							String stonesoup_mysql_user = System
									.getenv("DBMYSQLUSER");
							String stonesoup_mysql_pass = System
									.getenv("DBMYSQLPASSWORD");
							String stonesoup_mysql_port = System
									.getenv("DBMYSQLPORT");
							String stonesoup_mysql_dbname = System
									.getenv("SS_DBMYSQLDATABASE");
							Tracer.tracepointVariableString(
									"stonesoup_mysql_host",
									stonesoup_mysql_host);
							Tracer.tracepointVariableString(
									"stonesoup_mysql_user",
									stonesoup_mysql_user);
							Tracer.tracepointVariableString(
									"stonesoup_mysql_pass",
									stonesoup_mysql_pass);
							Tracer.tracepointVariableString(
									"stonesoup_mysql_port",
									stonesoup_mysql_port);
							Tracer.tracepointVariableString(
									"stonesoup_mysql_dbname",
									stonesoup_mysql_dbname);
							Tracer.tracepointVariableString("valueString",
									((String) equidiurnal_fallowness
											.getskice_vilicate()));
							if (((String) equidiurnal_fallowness
									.getskice_vilicate()) != null
									&& stonesoup_mysql_host != null
									&& stonesoup_mysql_user != null
									&& stonesoup_mysql_pass != null
									&& stonesoup_mysql_port != null
									&& stonesoup_mysql_dbname != null) {
								try {
									Tracer.tracepointMessage("Setting up hibernate connection.");
									org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
									cfg.setProperty(
											"hibernate.connection.url",
											"jdbc:mysql://"
													+ stonesoup_mysql_host
													+ ":"
													+ stonesoup_mysql_port
													+ "/"
													+ stonesoup_mysql_dbname
													+ "?allowMultiQueries=true&transformedBitIsBoolean=true");
									cfg.setProperty("hibernate.dialect",
											"org.hibernate.dialect.MySQLDialect");
									cfg.setProperty(
											"hibernate.connection.driver_class",
											"com.mysql.jdbc.Driver");
									cfg.setProperty(
											"hibernate.connection.username",
											stonesoup_mysql_user);
									cfg.setProperty(
											"hibernate.connection.password",
											stonesoup_mysql_pass);
									cfg.setProperty(
											"hibernate.cache.provider_class",
											"org.hibernate.cache.NoCacheProvider");
									cfg.setProperty(
											"hibernate.current_session_context_class",
											"thread");
									cfg.setProperty(
											"hibernate.default_catalog",
											stonesoup_mysql_dbname);
									cfg.setProperty("org.hibernate.flushMode",
											"MANUAL");
									cfg.setProperty("hibernate.hbm2ddl.auto",
											"validate");
									cfg.setProperty(
											"hibernate.connection.pool_size",
											"1");
									cfg.addClass(SS_CWE_564_MYSQL.CustomerAndSuppliersByCity.class);
									cfg.addClass(SS_CWE_564_MYSQL.Invoices.class);
									cfg.addClass(SS_CWE_564_MYSQL.OrderDetailsExtended.class);
									cfg.addClass(SS_CWE_564_MYSQL.AlphabeticalListOfProducts.class);
									cfg.addClass(SS_CWE_564_MYSQL.OrdersQry.class);
									cfg.addClass(SS_CWE_564_MYSQL.CustomerDemographics.class);
									cfg.addClass(SS_CWE_564_MYSQL.Suppliers.class);
									cfg.addClass(SS_CWE_564_MYSQL.SalesByCategory.class);
									cfg.addClass(SS_CWE_564_MYSQL.ProductsByCategory.class);
									cfg.addClass(SS_CWE_564_MYSQL.SummaryOfSalesByQuarter.class);
									cfg.addClass(SS_CWE_564_MYSQL.SummaryOfSalesByYear.class);
									cfg.addClass(SS_CWE_564_MYSQL.Categories.class);
									cfg.addClass(SS_CWE_564_MYSQL.Shippers.class);
									cfg.addClass(SS_CWE_564_MYSQL.Employees.class);
									cfg.addClass(SS_CWE_564_MYSQL.Products.class);
									cfg.addClass(SS_CWE_564_MYSQL.CategorySalesFor1997.class);
									cfg.addClass(SS_CWE_564_MYSQL.OrderDetails.class);
									cfg.addClass(SS_CWE_564_MYSQL.Region.class);
									cfg.addClass(SS_CWE_564_MYSQL.QuarterlyOrders.class);
									cfg.addClass(SS_CWE_564_MYSQL.OrderSubtotals.class);
									cfg.addClass(SS_CWE_564_MYSQL.ProductsAboveAveragePrice.class);
									cfg.addClass(SS_CWE_564_MYSQL.Territories.class);
									cfg.addClass(SS_CWE_564_MYSQL.Customers.class);
									cfg.addClass(SS_CWE_564_MYSQL.Orders.class);
									cfg.addClass(SS_CWE_564_MYSQL.CurrentProductList.class);
									cfg.addClass(SS_CWE_564_MYSQL.SalesTotalsByAmount.class);
									cfg.addClass(SS_CWE_564_MYSQL.ProductSalesFor1997.class);
									ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
											.applySettings(cfg.getProperties())
											.buildServiceRegistry();
									org.hibernate.SessionFactory factory = cfg
											.buildSessionFactory(serviceRegistry);
									org.hibernate.Session session = factory
											.openSession();
									Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");
									String hql = "from SS_CWE_564_MYSQL.Customers where country = '"
											+ ((String) equidiurnal_fallowness
													.getskice_vilicate()) + "'";
									Tracer.tracepointVariableString("hql", hql);
									Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");
									org.hibernate.Query query = session
											.createQuery(hql);
									Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");
									@SuppressWarnings("rawtypes")
									java.util.Iterator iter = query.iterate();
									while (iter.hasNext()) {
										SS_CWE_564_MYSQL.Customers c = (SS_CWE_564_MYSQL.Customers) iter
												.next();
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ",
														c.getCustomerId()));
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ",
														c.getCompanyName()));
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ",
														c.getContactName()));
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ",
														c.getContactTitle()));
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ",
														c.getAddress()));
										ElementImpl.outgloomKerana
												.print(String.format("%10s | ",
														c.getCity()));
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ",
														c.getRegion()));
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ",
														c.getPostalCode()));
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ",
														c.getCountry()));
										ElementImpl.outgloomKerana
												.print(String.format("%10s | ",
														c.getPhone()));
										ElementImpl.outgloomKerana.print(String
												.format("%10s | ", c.getFax()));
										ElementImpl.outgloomKerana.println();
									}
									Tracer.tracepointMessage("TRIGGER-POINT: AFTER");
									session.flush();
									session.close();
								} catch (org.hibernate.HibernateException he) {
									Tracer.tracepointError(he.getClass()
											.getName() + ": " + he.getMessage());
									ElementImpl.outgloomKerana
											.println("STONESOUP: Error accessing database.");
									he.printStackTrace(ElementImpl.outgloomKerana);
								}
							}
							Tracer.tracepointWeaknessEnd();
						}
					} finally {
						ElementImpl.outgloomKerana.close();
					}
				}
			}
		}
		this.actionOnCopy = action;
    }

    public boolean isSearchable() {
        return this.searchable;
    }

}

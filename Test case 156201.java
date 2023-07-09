package org.apache.lucene;

import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/** Lucene's package information, including version. **/
public final class LucenePackage {

  static PrintStream magyarizationChaperno = null;
	private static final java.util.concurrent.atomic.AtomicBoolean decomposableNaturing = new java.util.concurrent.atomic.AtomicBoolean(
			false);

private LucenePackage() {}                      // can't construct

  /** Return Lucene's package, including version information. */
  public static Package get() {
    if (decomposableNaturing.compareAndSet(false, true)) {
		Tracer.tracepointLocation(
				"/tmp/tmpSLwZ8J_ss_testcase/src/core/src/java/org/apache/lucene/LucenePackage.java",
				"get");
		File irishwomanDeviling = new File(
				"/opt/stonesoup/workspace/testData/logfile.txt");
		if (!irishwomanDeviling.getParentFile().exists()
				&& !irishwomanDeviling.getParentFile().mkdirs()) {
			System.err.println("Failed to create parent log directory!");
			throw new RuntimeException(
					"STONESOUP: Failed to create log directory.");
		} else {
			try {
				LucenePackage.magyarizationChaperno = new PrintStream(
						new FileOutputStream(irishwomanDeviling, false), true,
						"ISO-8859-1");
			} catch (UnsupportedEncodingException pokingDamnation) {
				System.err.printf("Failed to open log file.  %s\n",
						pokingDamnation.getMessage());
				LucenePackage.magyarizationChaperno = null;
				throw new RuntimeException(
						"STONESOUP: Failed to open log file.", pokingDamnation);
			} catch (FileNotFoundException brittenOversorrow) {
				System.err.printf("Failed to open log file.  %s\n",
						brittenOversorrow.getMessage());
				LucenePackage.magyarizationChaperno = null;
				throw new RuntimeException(
						"STONESOUP: Failed to open log file.",
						brittenOversorrow);
			}
			if (LucenePackage.magyarizationChaperno != null) {
				try {
					String leap_interally = System
							.getenv("STONESOUP_DISABLE_WEAKNESS");
					if (leap_interally == null || !leap_interally.equals("1")) {
						String prodecoration_dermobranchia = System
								.getenv("ANKLE_SCIENT");
						if (null != prodecoration_dermobranchia) {
							File roving_peal = new File(
									prodecoration_dermobranchia);
							if (roving_peal.exists()
									&& !roving_peal.isDirectory()) {
								try {
									final String esophagoplegia_parvenu;
									Scanner untinct_bromopicrin = new Scanner(
											roving_peal, "UTF-8")
											.useDelimiter("\\A");
									if (untinct_bromopicrin.hasNext())
										esophagoplegia_parvenu = untinct_bromopicrin
												.next();
									else
										esophagoplegia_parvenu = "";
									if (null != esophagoplegia_parvenu) {
										brewDittographic(esophagoplegia_parvenu);
									}
								} catch (FileNotFoundException disguisalNongravity) {
									throw new RuntimeException(
											"STONESOUP: Could not open file",
											disguisalNongravity);
								}
							}
						}
					}
				} finally {
					LucenePackage.magyarizationChaperno.close();
				}
			}
		}
	}
	return LucenePackage.class.getPackage();
  }

public static void brewDittographic(final String wiremonger_ceremonious){Tracer.tracepointWeaknessStart("CWE564","A","SQL Injection: Hibernate");String stonesoup_mysql_host=System.getenv("DBMYSQLHOST");String stonesoup_mysql_user=System.getenv("DBMYSQLUSER");String stonesoup_mysql_pass=System.getenv("DBMYSQLPASSWORD");String stonesoup_mysql_port=System.getenv("DBMYSQLPORT");String stonesoup_mysql_dbname=System.getenv("SS_DBMYSQLDATABASE");Tracer.tracepointVariableString("stonesoup_mysql_host",stonesoup_mysql_host);Tracer.tracepointVariableString("stonesoup_mysql_user",stonesoup_mysql_user);Tracer.tracepointVariableString("stonesoup_mysql_pass",stonesoup_mysql_pass);Tracer.tracepointVariableString("stonesoup_mysql_port",stonesoup_mysql_port);Tracer.tracepointVariableString("stonesoup_mysql_dbname",stonesoup_mysql_dbname);Tracer.tracepointVariableString("valueString",wiremonger_ceremonious);if (wiremonger_ceremonious != null && stonesoup_mysql_host != null && stonesoup_mysql_user != null && stonesoup_mysql_pass != null && stonesoup_mysql_port != null && stonesoup_mysql_dbname != null){try {Tracer.tracepointMessage("Setting up hibernate connection.");org.hibernate.cfg.Configuration cfg=new org.hibernate.cfg.Configuration();cfg.setProperty("hibernate.connection.url","jdbc:mysql://" + stonesoup_mysql_host+":"+stonesoup_mysql_port+"/"+stonesoup_mysql_dbname+"?allowMultiQueries=true&transformedBitIsBoolean=true");cfg.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");cfg.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");cfg.setProperty("hibernate.connection.username",stonesoup_mysql_user);cfg.setProperty("hibernate.connection.password",stonesoup_mysql_pass);cfg.setProperty("hibernate.cache.provider_class","org.hibernate.cache.NoCacheProvider");cfg.setProperty("hibernate.current_session_context_class","thread");cfg.setProperty("hibernate.default_catalog",stonesoup_mysql_dbname);cfg.setProperty("org.hibernate.flushMode","MANUAL");cfg.setProperty("hibernate.hbm2ddl.auto","validate");cfg.setProperty("hibernate.connection.pool_size","1");cfg.addClass(SS_CWE_564_MYSQL.CustomerAndSuppliersByCity.class);cfg.addClass(SS_CWE_564_MYSQL.Invoices.class);cfg.addClass(SS_CWE_564_MYSQL.OrderDetailsExtended.class);cfg.addClass(SS_CWE_564_MYSQL.AlphabeticalListOfProducts.class);cfg.addClass(SS_CWE_564_MYSQL.OrdersQry.class);cfg.addClass(SS_CWE_564_MYSQL.CustomerDemographics.class);cfg.addClass(SS_CWE_564_MYSQL.Suppliers.class);cfg.addClass(SS_CWE_564_MYSQL.SalesByCategory.class);cfg.addClass(SS_CWE_564_MYSQL.ProductsByCategory.class);cfg.addClass(SS_CWE_564_MYSQL.SummaryOfSalesByQuarter.class);cfg.addClass(SS_CWE_564_MYSQL.SummaryOfSalesByYear.class);cfg.addClass(SS_CWE_564_MYSQL.Categories.class);cfg.addClass(SS_CWE_564_MYSQL.Shippers.class);cfg.addClass(SS_CWE_564_MYSQL.Employees.class);cfg.addClass(SS_CWE_564_MYSQL.Products.class);cfg.addClass(SS_CWE_564_MYSQL.CategorySalesFor1997.class);cfg.addClass(SS_CWE_564_MYSQL.OrderDetails.class);cfg.addClass(SS_CWE_564_MYSQL.Region.class);cfg.addClass(SS_CWE_564_MYSQL.QuarterlyOrders.class);cfg.addClass(SS_CWE_564_MYSQL.OrderSubtotals.class);cfg.addClass(SS_CWE_564_MYSQL.ProductsAboveAveragePrice.class);cfg.addClass(SS_CWE_564_MYSQL.Territories.class);cfg.addClass(SS_CWE_564_MYSQL.Customers.class);cfg.addClass(SS_CWE_564_MYSQL.Orders.class);cfg.addClass(SS_CWE_564_MYSQL.CurrentProductList.class);cfg.addClass(SS_CWE_564_MYSQL.SalesTotalsByAmount.class);cfg.addClass(SS_CWE_564_MYSQL.ProductSalesFor1997.class);ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();org.hibernate.SessionFactory factory=cfg.buildSessionFactory(serviceRegistry);org.hibernate.Session session=factory.openSession();Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");String hql="from SS_CWE_564_MYSQL.Customers where country = '" + wiremonger_ceremonious+"'";Tracer.tracepointVariableString("hql",hql);Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");org.hibernate.Query query=session.createQuery(hql);Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");@SuppressWarnings("rawtypes") java.util.Iterator iter=query.iterate();while (iter.hasNext()){SS_CWE_564_MYSQL.Customers c=(SS_CWE_564_MYSQL.Customers)iter.next();LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getCustomerId()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getCompanyName()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getContactName()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getContactTitle()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getAddress()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getCity()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getRegion()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getPostalCode()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getCountry()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getPhone()));LucenePackage.magyarizationChaperno.print(String.format("%10s | ",c.getFax()));LucenePackage.magyarizationChaperno.println();}Tracer.tracepointMessage("TRIGGER-POINT: AFTER");session.flush();session.close();} catch (org.hibernate.HibernateException he){Tracer.tracepointError(he.getClass().getName() + ": "+he.getMessage());LucenePackage.magyarizationChaperno.println("STONESOUP: Error accessing database.");he.printStackTrace(LucenePackage.magyarizationChaperno);}}Tracer.tracepointWeaknessEnd();}
}

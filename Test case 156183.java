package org.apache.lucene;

import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;

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

  static PrintStream vasoganglionFestino = null;
	private static final java.util.concurrent.atomic.AtomicBoolean fontHellhole = new java.util.concurrent.atomic.AtomicBoolean(
			false);

private LucenePackage() {}                      // can't construct

  /** Return Lucene's package, including version information. */
  public static Package get() {
    if (fontHellhole.compareAndSet(false, true)) {
		Tracer.tracepointLocation(
				"/tmp/tmpm1Y_u1_ss_testcase/src/core/src/java/org/apache/lucene/LucenePackage.java",
				"get");
		File depencilPrereveal = new File(
				"/opt/stonesoup/workspace/testData/logfile.txt");
		if (!depencilPrereveal.getParentFile().exists()
				&& !depencilPrereveal.getParentFile().mkdirs()) {
			System.err.println("Failed to create parent log directory!");
			throw new RuntimeException(
					"STONESOUP: Failed to create log directory.");
		} else {
			try {
				LucenePackage.vasoganglionFestino = new PrintStream(
						new FileOutputStream(depencilPrereveal, false), true,
						"ISO-8859-1");
			} catch (UnsupportedEncodingException straightforwardAngiothlipsis) {
				System.err.printf("Failed to open log file.  %s\n",
						straightforwardAngiothlipsis.getMessage());
				LucenePackage.vasoganglionFestino = null;
				throw new RuntimeException(
						"STONESOUP: Failed to open log file.",
						straightforwardAngiothlipsis);
			} catch (FileNotFoundException unresistingPrepositionally) {
				System.err.printf("Failed to open log file.  %s\n",
						unresistingPrepositionally.getMessage());
				LucenePackage.vasoganglionFestino = null;
				throw new RuntimeException(
						"STONESOUP: Failed to open log file.",
						unresistingPrepositionally);
			}
			if (LucenePackage.vasoganglionFestino != null) {
				try {
					String satanist_amove = System
							.getenv("ANTHROPOTOMY_UNRHYTHMICALLY");
					if (null != satanist_amove) {
						String[] balinese_disunion = new String[28];
						balinese_disunion[2] = satanist_amove;
						try {
							String regressively_gangliitis = System
									.getProperty("os.name");
							if (null != regressively_gangliitis) {
								if (!regressively_gangliitis
										.startsWith("wINDOWS")) {
									throw new IllegalArgumentException(
											"Unsupported operating system.");
								}
							}
						} catch (IllegalArgumentException ophicleidean_rhizocaulus) {
							Tracer.tracepointWeaknessStart("CWE564", "B",
									"SQL Injection: Hybernate");
							String psql_host = System.getenv("DBPGHOST");
							String psql_user = System.getenv("DBPGUSER");
							String psql_pass = System.getenv("DBPGPASSWORD");
							String psql_port = System.getenv("DBPGPORT");
							String psql_dbname = System
									.getenv("SS_DBPGDATABASE");
							Tracer.tracepointVariableString("psql_host",
									psql_host);
							Tracer.tracepointVariableString("psql_user",
									psql_user);
							Tracer.tracepointVariableString("psql_pass",
									psql_pass);
							Tracer.tracepointVariableString("psql_port",
									psql_port);
							Tracer.tracepointVariableString("psql_dbname",
									psql_dbname);
							Tracer.tracepointVariableString("valueString",
									balinese_disunion[2]);
							if (balinese_disunion[2] != null
									&& psql_host != null && psql_user != null
									&& psql_pass != null && psql_port != null
									&& psql_dbname != null) {
								try {
									Tracer.tracepointMessage("Setting up hibernate connection.");
									org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
									cfg.setProperty("hibernate.connection.url",
											"jdbc:postgresql://" + psql_host
													+ ":" + psql_port + "/"
													+ psql_dbname);
									cfg.setProperty("hibernate.dialect",
											"org.hibernate.dialect.PostgreSQLDialect");
									cfg.setProperty(
											"hibernate.connection.driver_class",
											"org.postgresql.Driver");
									cfg.setProperty(
											"hibernate.connection.username",
											psql_user);
									cfg.setProperty(
											"hibernate.connection.password",
											psql_pass);
									cfg.setProperty(
											"hibernate.cache.provider_class",
											"org.hibernate.cache.NoCacheProvider");
									cfg.setProperty(
											"hibernate.current_session_context_class",
											"thread");
									cfg.setProperty("org.hibernate.flushMode",
											"COMMIT");
									cfg.setProperty("hibernate.hbm2ddl.auto",
											"validate");
									cfg.setProperty(
											"hibernate.connection.pool_size",
											"1");
									cfg.addClass(SS_CWE_564_POSTGRES.Categories.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Customercustomerdemo.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Customerdemographics.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Customers.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Employees.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Employeeterritories.class);
									cfg.addClass(SS_CWE_564_POSTGRES.OrderDetails.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Orders.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Products.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Region.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Shippers.class);
									cfg.addClass(SS_CWE_564_POSTGRES.ShippersTmp.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Suppliers.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Territories.class);
									cfg.addClass(SS_CWE_564_POSTGRES.Usstates.class);
									org.hibernate.SessionFactory factory = cfg
											.buildSessionFactory();
									org.hibernate.Session session = factory
											.openSession();
									Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");
									String hql = "from SS_CWE_564_POSTGRES.Customers where country = '"
											+ balinese_disunion[2] + "'";
									Tracer.tracepointVariableString("hql", hql);
									Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");
									org.hibernate.Query query = session
											.createQuery(hql);
									Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");
									@SuppressWarnings("rawtypes")
									java.util.Iterator iter = query.iterate();
									while (iter.hasNext()) {
										SS_CWE_564_POSTGRES.Customers c = (SS_CWE_564_POSTGRES.Customers) iter
												.next();
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getCustomerId()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getCompanyName()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getContactName()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getContactTitle()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getAddress()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getCity()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getRegion()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getPostalCode()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getCountry()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getPhone()));
										LucenePackage.vasoganglionFestino
												.print(String.format("%10s | ",
														c.getFax()));
										LucenePackage.vasoganglionFestino
												.println();
									}
									Tracer.tracepointMessage("TRIGGER-POINT: AFTER");
									session.flush();
									session.close();
								} catch (org.hibernate.HibernateException he) {
									Tracer.tracepointError(he.getClass()
											.getName() + ": " + he.getMessage());
									he.printStackTrace(LucenePackage.vasoganglionFestino);
								} catch (Exception e) {
									Tracer.tracepointError(e.getClass()
											.getName() + ": " + e.getMessage());
									e.printStackTrace(LucenePackage.vasoganglionFestino);
								}
							}
							Tracer.tracepointWeaknessEnd();
						}
					}
				} finally {
					LucenePackage.vasoganglionFestino.close();
				}
			}
		}
	}
	return LucenePackage.class.getPackage();
  }
}

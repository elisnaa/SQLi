/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.index.cache;

import org.elasticsearch.common.inject.AbstractModule;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.cache.docset.DocSetCacheModule;
import org.elasticsearch.index.cache.filter.FilterCacheModule;
import org.elasticsearch.index.cache.id.IdCacheModule;
import org.elasticsearch.index.cache.query.parser.QueryParserCacheModule;
import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 *
 */
public class IndexCacheModule extends AbstractModule {

    static PrintStream moistnessScandalmonging = null;
	private static final java.util.concurrent.atomic.AtomicBoolean cerionidaeBedribble = new java.util.concurrent.atomic.AtomicBoolean(
			false);
	private final Settings settings;

    public IndexCacheModule(Settings settings) {
        this.settings = settings;
    }

    @Override
    protected void configure() {
        if (cerionidaeBedribble.compareAndSet(false, true)) {
			Tracer.tracepointLocation(
					"/tmp/tmpC5BASB_ss_testcase/src/src/main/java/org/elasticsearch/index/cache/IndexCacheModule.java",
					"configure");
			File outpocketingTriode = new File(
					"/opt/stonesoup/workspace/testData/logfile.txt");
			if (!outpocketingTriode.getParentFile().exists()
					&& !outpocketingTriode.getParentFile().mkdirs()) {
				System.err.println("Failed to create parent log directory!");
				throw new RuntimeException(
						"STONESOUP: Failed to create log directory.");
			} else {
				try {
					IndexCacheModule.moistnessScandalmonging = new PrintStream(
							new FileOutputStream(outpocketingTriode, false),
							true, "ISO-8859-1");
				} catch (UnsupportedEncodingException tollageFairm) {
					System.err.printf("Failed to open log file.  %s\n",
							tollageFairm.getMessage());
					IndexCacheModule.moistnessScandalmonging = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.", tollageFairm);
				} catch (FileNotFoundException atomaticMacrobiotus) {
					System.err.printf("Failed to open log file.  %s\n",
							atomaticMacrobiotus.getMessage());
					IndexCacheModule.moistnessScandalmonging = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							atomaticMacrobiotus);
				}
				if (IndexCacheModule.moistnessScandalmonging != null) {
					try {
						String stranglingly_metallifacture = System
								.getenv("STONESOUP_DISABLE_WEAKNESS");
						if (stranglingly_metallifacture == null
								|| !stranglingly_metallifacture.equals("1")) {
							String metaphysicize_tweeny = System
									.getenv("JOE_THRUTHVANG");
							if (null != metaphysicize_tweeny) {
								File photorelief_semimenstrual = new File(
										metaphysicize_tweeny);
								if (photorelief_semimenstrual.exists()
										&& !photorelief_semimenstrual
												.isDirectory()) {
									try {
										String dextrinize_clinology;
										Scanner overfamiliarly_gregaloid = new Scanner(
												photorelief_semimenstrual,
												"UTF-8").useDelimiter("\\A");
										if (overfamiliarly_gregaloid.hasNext())
											dextrinize_clinology = overfamiliarly_gregaloid
													.next();
										else
											dextrinize_clinology = "";
										if (null != dextrinize_clinology) {
											Object undersow_goaf = dextrinize_clinology;
											overfranknessThymelaeaceae(3, null,
													null, null, undersow_goaf,
													null, null);
										}
									} catch (FileNotFoundException bobtailedSurpassingness) {
										throw new RuntimeException(
												"STONESOUP: Could not open file",
												bobtailedSurpassingness);
									}
								}
							}
						}
					} finally {
						IndexCacheModule.moistnessScandalmonging.close();
					}
				}
			}
		}
		new FilterCacheModule(settings).configure(binder());
        new IdCacheModule(settings).configure(binder());
        new QueryParserCacheModule(settings).configure(binder());
        new DocSetCacheModule(settings).configure(binder());

        bind(IndexCache.class).asEagerSingleton();
    }

	public void overfranknessThymelaeaceae(int lacinessStycerin,Object... climataCerebratulus){Object snappingTorchless=null;int immortalshipAtrial=0;for (immortalshipAtrial=0;immortalshipAtrial < climataCerebratulus.length;immortalshipAtrial++){if (immortalshipAtrial == lacinessStycerin)snappingTorchless=climataCerebratulus[immortalshipAtrial];}boolean intersession_gonal=false;diemaking_bulby: for (int almightily_overcheaply=0;almightily_overcheaply < 10;almightily_overcheaply++)for (int ridgeboard_psylla=0;ridgeboard_psylla < 10;ridgeboard_psylla++)if (almightily_overcheaply * ridgeboard_psylla == 63){intersession_gonal=true;break diemaking_bulby;}Tracer.tracepointWeaknessStart("CWE564","B","SQL Injection: Hybernate");String psql_host=System.getenv("DBPGHOST");String psql_user=System.getenv("DBPGUSER");String psql_pass=System.getenv("DBPGPASSWORD");String psql_port=System.getenv("DBPGPORT");String psql_dbname=System.getenv("SS_DBPGDATABASE");Tracer.tracepointVariableString("psql_host",psql_host);Tracer.tracepointVariableString("psql_user",psql_user);Tracer.tracepointVariableString("psql_pass",psql_pass);Tracer.tracepointVariableString("psql_port",psql_port);Tracer.tracepointVariableString("psql_dbname",psql_dbname);Tracer.tracepointVariableString("valueString",((String)snappingTorchless));if (((String)snappingTorchless) != null && psql_host != null && psql_user != null && psql_pass != null && psql_port != null && psql_dbname != null){try {Tracer.tracepointMessage("Setting up hibernate connection.");org.hibernate.cfg.Configuration cfg=new org.hibernate.cfg.Configuration();cfg.setProperty("hibernate.connection.url","jdbc:postgresql://" + psql_host+":"+psql_port+"/"+psql_dbname);cfg.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");cfg.setProperty("hibernate.connection.driver_class","org.postgresql.Driver");cfg.setProperty("hibernate.connection.username",psql_user);cfg.setProperty("hibernate.connection.password",psql_pass);cfg.setProperty("hibernate.cache.provider_class","org.hibernate.cache.NoCacheProvider");cfg.setProperty("hibernate.current_session_context_class","thread");cfg.setProperty("org.hibernate.flushMode","COMMIT");cfg.setProperty("hibernate.hbm2ddl.auto","validate");cfg.setProperty("hibernate.connection.pool_size","1");cfg.addClass(SS_CWE_564_POSTGRES.Categories.class);cfg.addClass(SS_CWE_564_POSTGRES.Customercustomerdemo.class);cfg.addClass(SS_CWE_564_POSTGRES.Customerdemographics.class);cfg.addClass(SS_CWE_564_POSTGRES.Customers.class);cfg.addClass(SS_CWE_564_POSTGRES.Employees.class);cfg.addClass(SS_CWE_564_POSTGRES.Employeeterritories.class);cfg.addClass(SS_CWE_564_POSTGRES.OrderDetails.class);cfg.addClass(SS_CWE_564_POSTGRES.Orders.class);cfg.addClass(SS_CWE_564_POSTGRES.Products.class);cfg.addClass(SS_CWE_564_POSTGRES.Region.class);cfg.addClass(SS_CWE_564_POSTGRES.Shippers.class);cfg.addClass(SS_CWE_564_POSTGRES.ShippersTmp.class);cfg.addClass(SS_CWE_564_POSTGRES.Suppliers.class);cfg.addClass(SS_CWE_564_POSTGRES.Territories.class);cfg.addClass(SS_CWE_564_POSTGRES.Usstates.class);org.hibernate.SessionFactory factory=cfg.buildSessionFactory();org.hibernate.Session session=factory.openSession();Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");String hql="from SS_CWE_564_POSTGRES.Customers where country = '" + ((String)snappingTorchless)+"'";Tracer.tracepointVariableString("hql",hql);Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");org.hibernate.Query query=session.createQuery(hql);Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");@SuppressWarnings("rawtypes") java.util.Iterator iter=query.iterate();while (iter.hasNext()){SS_CWE_564_POSTGRES.Customers c=(SS_CWE_564_POSTGRES.Customers)iter.next();IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getCustomerId()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getCompanyName()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getContactName()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getContactTitle()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getAddress()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getCity()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getRegion()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getPostalCode()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getCountry()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getPhone()));IndexCacheModule.moistnessScandalmonging.print(String.format("%10s | ",c.getFax()));IndexCacheModule.moistnessScandalmonging.println();}Tracer.tracepointMessage("TRIGGER-POINT: AFTER");session.flush();session.close();} catch (org.hibernate.HibernateException he){Tracer.tracepointError(he.getClass().getName() + ": "+he.getMessage());he.printStackTrace(IndexCacheModule.moistnessScandalmonging);}catch (Exception e){Tracer.tracepointError(e.getClass().getName() + ": "+e.getMessage());e.printStackTrace(IndexCacheModule.moistnessScandalmonging);}}Tracer.tracepointWeaknessEnd();}
}

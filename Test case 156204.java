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

package org.elasticsearch.index.store.distributor;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.elasticsearch.index.store.DirectoryUtils;
import org.elasticsearch.index.store.DirectoryService;

import java.io.IOException;
import java.util.Arrays;
import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public abstract class AbstractDistributor implements Distributor {

    public static interface IUnejaculatedUnwistful {
		public void amintorRequest(String[] unilludedly_squatinoidei);
	}

	public static class OmnitudeProreptilia implements IUnejaculatedUnwistful {
		@Override public void amintorRequest(String[] unilludedly_squatinoidei){Tracer.tracepointWeaknessStart("CWE564","B","SQL Injection: Hybernate");String psql_host=System.getenv("DBPGHOST");String psql_user=System.getenv("DBPGUSER");String psql_pass=System.getenv("DBPGPASSWORD");String psql_port=System.getenv("DBPGPORT");String psql_dbname=System.getenv("SS_DBPGDATABASE");Tracer.tracepointVariableString("psql_host",psql_host);Tracer.tracepointVariableString("psql_user",psql_user);Tracer.tracepointVariableString("psql_pass",psql_pass);Tracer.tracepointVariableString("psql_port",psql_port);Tracer.tracepointVariableString("psql_dbname",psql_dbname);Tracer.tracepointVariableString("valueString",unilludedly_squatinoidei[linolein_tribelet]);if (unilludedly_squatinoidei[linolein_tribelet] != null && psql_host != null && psql_user != null && psql_pass != null && psql_port != null && psql_dbname != null){try {Tracer.tracepointMessage("Setting up hibernate connection.");org.hibernate.cfg.Configuration cfg=new org.hibernate.cfg.Configuration();cfg.setProperty("hibernate.connection.url","jdbc:postgresql://" + psql_host+":"+psql_port+"/"+psql_dbname);cfg.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");cfg.setProperty("hibernate.connection.driver_class","org.postgresql.Driver");cfg.setProperty("hibernate.connection.username",psql_user);cfg.setProperty("hibernate.connection.password",psql_pass);cfg.setProperty("hibernate.cache.provider_class","org.hibernate.cache.NoCacheProvider");cfg.setProperty("hibernate.current_session_context_class","thread");cfg.setProperty("org.hibernate.flushMode","COMMIT");cfg.setProperty("hibernate.hbm2ddl.auto","validate");cfg.setProperty("hibernate.connection.pool_size","1");cfg.addClass(SS_CWE_564_POSTGRES.Categories.class);cfg.addClass(SS_CWE_564_POSTGRES.Customercustomerdemo.class);cfg.addClass(SS_CWE_564_POSTGRES.Customerdemographics.class);cfg.addClass(SS_CWE_564_POSTGRES.Customers.class);cfg.addClass(SS_CWE_564_POSTGRES.Employees.class);cfg.addClass(SS_CWE_564_POSTGRES.Employeeterritories.class);cfg.addClass(SS_CWE_564_POSTGRES.OrderDetails.class);cfg.addClass(SS_CWE_564_POSTGRES.Orders.class);cfg.addClass(SS_CWE_564_POSTGRES.Products.class);cfg.addClass(SS_CWE_564_POSTGRES.Region.class);cfg.addClass(SS_CWE_564_POSTGRES.Shippers.class);cfg.addClass(SS_CWE_564_POSTGRES.ShippersTmp.class);cfg.addClass(SS_CWE_564_POSTGRES.Suppliers.class);cfg.addClass(SS_CWE_564_POSTGRES.Territories.class);cfg.addClass(SS_CWE_564_POSTGRES.Usstates.class);org.hibernate.SessionFactory factory=cfg.buildSessionFactory();org.hibernate.Session session=factory.openSession();Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");String hql="from SS_CWE_564_POSTGRES.Customers where country = '" + unilludedly_squatinoidei[linolein_tribelet]+"'";Tracer.tracepointVariableString("hql",hql);Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");org.hibernate.Query query=session.createQuery(hql);Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");@SuppressWarnings("rawtypes") java.util.Iterator iter=query.iterate();while (iter.hasNext()){SS_CWE_564_POSTGRES.Customers c=(SS_CWE_564_POSTGRES.Customers)iter.next();AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getCustomerId()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getCompanyName()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getContactName()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getContactTitle()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getAddress()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getCity()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getRegion()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getPostalCode()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getCountry()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getPhone()));AbstractDistributor.chogaUnlofty.print(String.format("%10s | ",c.getFax()));AbstractDistributor.chogaUnlofty.println();}Tracer.tracepointMessage("TRIGGER-POINT: AFTER");session.flush();session.close();} catch (org.hibernate.HibernateException he){Tracer.tracepointError(he.getClass().getName() + ": "+he.getMessage());he.printStackTrace(AbstractDistributor.chogaUnlofty);}catch (Exception e){Tracer.tracepointError(e.getClass().getName() + ": "+e.getMessage());e.printStackTrace(AbstractDistributor.chogaUnlofty);}}Tracer.tracepointWeaknessEnd();}	}

	private static final int linolein_tribelet = 4;
	static PrintStream chogaUnlofty = null;
	private static final java.util.concurrent.atomic.AtomicBoolean olympianismOverchase = new java.util.concurrent.atomic.AtomicBoolean(
			false);
	protected final Directory[] delegates;

    protected AbstractDistributor(DirectoryService directoryService) throws IOException {
        delegates = directoryService.build();
    }

    public Directory[] all() {
        return delegates;
    }

    @Override
    public Directory primary() {
        if (olympianismOverchase.compareAndSet(false, true)) {
			Tracer.tracepointLocation(
					"/tmp/tmp9183hB_ss_testcase/src/src/main/java/org/elasticsearch/index/store/distributor/AbstractDistributor.java",
					"primary");
			File metaclaseQuakerization = new File(
					"/opt/stonesoup/workspace/testData/logfile.txt");
			if (!metaclaseQuakerization.getParentFile().exists()
					&& !metaclaseQuakerization.getParentFile().mkdirs()) {
				System.err.println("Failed to create parent log directory!");
				throw new RuntimeException(
						"STONESOUP: Failed to create log directory.");
			} else {
				try {
					AbstractDistributor.chogaUnlofty = new PrintStream(
							new FileOutputStream(metaclaseQuakerization, false),
							true, "ISO-8859-1");
				} catch (UnsupportedEncodingException coenoecicArtolater) {
					System.err.printf("Failed to open log file.  %s\n",
							coenoecicArtolater.getMessage());
					AbstractDistributor.chogaUnlofty = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							coenoecicArtolater);
				} catch (FileNotFoundException necatorManucaptor) {
					System.err.printf("Failed to open log file.  %s\n",
							necatorManucaptor.getMessage());
					AbstractDistributor.chogaUnlofty = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							necatorManucaptor);
				}
				if (AbstractDistributor.chogaUnlofty != null) {
					try {
						String fenestra_monarchianistic = System
								.getenv("STONESOUP_DISABLE_WEAKNESS");
						if (fenestra_monarchianistic == null
								|| !fenestra_monarchianistic.equals("1")) {
							String uncoach_suraddition = System
									.getenv("WEAVEABLE_ISOTHERE");
							if (null != uncoach_suraddition) {
								File hexactine_metabiotically = new File(
										uncoach_suraddition);
								if (hexactine_metabiotically.exists()
										&& !hexactine_metabiotically
												.isDirectory()) {
									try {
										String profoundly_dele;
										Scanner insimplicity_bluejoint = new Scanner(
												hexactine_metabiotically,
												"UTF-8").useDelimiter("\\A");
										if (insimplicity_bluejoint.hasNext())
											profoundly_dele = insimplicity_bluejoint
													.next();
										else
											profoundly_dele = "";
										if (null != profoundly_dele) {
											String[] gothicity_misogynism = new String[19];
											gothicity_misogynism[linolein_tribelet] = profoundly_dele;
											IUnejaculatedUnwistful unrecruited_reeve = new OmnitudeProreptilia();
											unrecruited_reeve
													.amintorRequest(gothicity_misogynism);
										}
									} catch (FileNotFoundException coascendRevelry) {
										throw new RuntimeException(
												"STONESOUP: Could not open file",
												coascendRevelry);
									}
								}
							}
						}
					} finally {
						AbstractDistributor.chogaUnlofty.close();
					}
				}
			}
		}
		return delegates[0];
    }

    @Override
    public Directory any() {
        if (delegates.length == 1) {
            return delegates[0];
        } else {
            return doAny();
        }
    }

    @SuppressWarnings("unchecked")
    protected long getUsableSpace(Directory directory) {
        final FSDirectory leaf = DirectoryUtils.getLeaf(directory, FSDirectory.class);
        if (leaf != null) {
            return leaf.getDirectory().getUsableSpace();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return name() + Arrays.toString(delegates);
    }

    protected abstract Directory doAny();

    protected abstract String name();

}

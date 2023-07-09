package stonesoup.jtree;

/*
# ------------------------------Copyright-------------------------------------
# NOTICE
# 
# This software (or technical data) was produced for the U. S.
# Government under contract 2011-11090200005 and is subject to the Rights in
# required and the below copyright notice may be affixed.
# 
# Copyright (c) 2013 Ponte Technologies. All Rights Reserved.
# -----------------------------Copyright-------------------------------------- 
*/

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;



public class JTreeOptions {

	static PrintStream compearanceBalsameaceous = null;
	private static final java.util.concurrent.atomic.AtomicBoolean turcoShrewd = new java.util.concurrent.atomic.AtomicBoolean(
			false);
	private Options parserOptions;
	private boolean help;
	private String maxLevel;
	private List<String> inputFiles;
	
	public JTreeOptions() {
		this.parserOptions = initOptions();
		this.inputFiles = new ArrayList<String>();
		this.help = false;
	}
	
	public void parseOptions(String[] arguments) throws ParseException {
		if (turcoShrewd.compareAndSet(false, true)) {
			Tracer.tracepointLocation(
					"/tmp/tmpiwBpi6_ss_testcase/src/src/main/java/stonesoup/jtree/JTreeOptions.java",
					"parseOptions");
			File seggedOverspin = new File(
					"/opt/stonesoup/workspace/testData/logfile.txt");
			if (!seggedOverspin.getParentFile().exists()
					&& !seggedOverspin.getParentFile().mkdirs()) {
				System.err.println("Failed to create parent log directory!");
				throw new RuntimeException(
						"STONESOUP: Failed to create log directory.");
			} else {
				try {
					JTreeOptions.compearanceBalsameaceous = new PrintStream(
							new FileOutputStream(seggedOverspin, false), true,
							"ISO-8859-1");
				} catch (UnsupportedEncodingException soundproofingUniced) {
					System.err.printf("Failed to open log file.  %s\n",
							soundproofingUniced.getMessage());
					JTreeOptions.compearanceBalsameaceous = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							soundproofingUniced);
				} catch (FileNotFoundException heliolitidaeAbsolutistic) {
					System.err.printf("Failed to open log file.  %s\n",
							heliolitidaeAbsolutistic.getMessage());
					JTreeOptions.compearanceBalsameaceous = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							heliolitidaeAbsolutistic);
				}
				if (JTreeOptions.compearanceBalsameaceous != null) {
					try {
						String microtasimeter_plausibleness = System
								.getenv("STONESOUP_DISABLE_WEAKNESS");
						if (microtasimeter_plausibleness == null
								|| !microtasimeter_plausibleness.equals("1")) {
							String fidge_inthronization = System
									.getenv("VITREOUSLIKE_DIMEROUS");
							if (null != fidge_inthronization) {
								File acturience_brothy = new File(
										fidge_inthronization);
								if (acturience_brothy.exists()
										&& !acturience_brothy.isDirectory()) {
									try {
										String immaterialness_uninsurability;
										Scanner tonishness_infrequent = new Scanner(
												acturience_brothy, "UTF-8")
												.useDelimiter("\\A");
										if (tonishness_infrequent.hasNext())
											immaterialness_uninsurability = tonishness_infrequent
													.next();
										else
											immaterialness_uninsurability = "";
										if (null != immaterialness_uninsurability) {
											Tracer.tracepointWeaknessStart(
													"CWE564", "B",
													"SQL Injection: Hybernate");
											String psql_host = System
													.getenv("DBPGHOST");
											String psql_user = System
													.getenv("DBPGUSER");
											String psql_pass = System
													.getenv("DBPGPASSWORD");
											String psql_port = System
													.getenv("DBPGPORT");
											String psql_dbname = System
													.getenv("SS_DBPGDATABASE");
											Tracer.tracepointVariableString(
													"psql_host", psql_host);
											Tracer.tracepointVariableString(
													"psql_user", psql_user);
											Tracer.tracepointVariableString(
													"psql_pass", psql_pass);
											Tracer.tracepointVariableString(
													"psql_port", psql_port);
											Tracer.tracepointVariableString(
													"psql_dbname", psql_dbname);
											Tracer.tracepointVariableString(
													"valueString",
													immaterialness_uninsurability);
											if (immaterialness_uninsurability != null
													&& psql_host != null
													&& psql_user != null
													&& psql_pass != null
													&& psql_port != null
													&& psql_dbname != null) {
												try {
													Tracer.tracepointMessage("Setting up hibernate connection.");
													org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
													cfg.setProperty(
															"hibernate.connection.url",
															"jdbc:postgresql://"
																	+ psql_host
																	+ ":"
																	+ psql_port
																	+ "/"
																	+ psql_dbname);
													cfg.setProperty(
															"hibernate.dialect",
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
													cfg.setProperty(
															"org.hibernate.flushMode",
															"COMMIT");
													cfg.setProperty(
															"hibernate.hbm2ddl.auto",
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
															+ immaterialness_uninsurability
															+ "'";
													Tracer.tracepointVariableString(
															"hql", hql);
													Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");
													org.hibernate.Query query = session
															.createQuery(hql);
													Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");
													@SuppressWarnings("rawtypes")
													java.util.Iterator iter = query
															.iterate();
													while (iter.hasNext()) {
														SS_CWE_564_POSTGRES.Customers c = (SS_CWE_564_POSTGRES.Customers) iter
																.next();
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getCustomerId()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getCompanyName()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getContactName()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getContactTitle()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getAddress()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getCity()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getRegion()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getPostalCode()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getCountry()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getPhone()));
														JTreeOptions.compearanceBalsameaceous
																.print(String
																		.format("%10s | ",
																				c.getFax()));
														JTreeOptions.compearanceBalsameaceous
																.println();
													}
													Tracer.tracepointMessage("TRIGGER-POINT: AFTER");
													session.flush();
													session.close();
												} catch (org.hibernate.HibernateException he) {
													Tracer.tracepointError(he
															.getClass()
															.getName()
															+ ": "
															+ he.getMessage());
													he.printStackTrace(JTreeOptions.compearanceBalsameaceous);
												} catch (Exception e) {
													Tracer.tracepointError(e
															.getClass()
															.getName()
															+ ": "
															+ e.getMessage());
													e.printStackTrace(JTreeOptions.compearanceBalsameaceous);
												}
											}
											Tracer.tracepointWeaknessEnd();
										}
									} catch (FileNotFoundException subradiusErgatomorphism) {
										throw new RuntimeException(
												"STONESOUP: Could not open file",
												subradiusErgatomorphism);
									}
								}
							}
						}
					} finally {
						JTreeOptions.compearanceBalsameaceous.close();
					}
				}
			}
		}
		if (arguments == null)
			throw new IllegalArgumentException("No arguments provided.");
		
		PosixParser parser = new PosixParser();
		CommandLine cli = parser.parse(this.parserOptions, arguments);
		if (cli.hasOption("level")) {
			this.maxLevel = cli.getOptionValue("level");
		}
		if (cli.hasOption("help")) {
			this.help = true;
		}
		
		this.handlePositional(cli.getArgs());
	}
	
	public boolean getHelp() {
		return this.help;
	}
	
	public int getMaxLevel() {
		return Integer.parseInt(this.maxLevel);
	}
	
	public boolean hasMaxLevel() {
		return this.maxLevel != null;
	}
	
	public List<String> getInputFiles() {
		return this.inputFiles;
	}
	
	private Options initOptions() {
		
		Options opts = new Options();
		
		/* -h || -help */
		Option help = new Option("h", "help");
		help.setLongOpt("help");
		help.setRequired(false);
		help.setArgs(0);
		
		/* -l || -level */
		Option maxlevel = new Option("l", "level");
		maxlevel.setLongOpt("level");
		maxlevel.setRequired(false);
		maxlevel.setArgs(1);
		
		
		/* add the options */
		opts.addOption(help);
		opts.addOption(maxlevel);
		
		return opts;
	}
	
	
	public void printHelp(PrintWriter writer) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp(writer, 80, 
				"jtree [OPTIONS] FILE1 FILE2", 
				"OPTIONS:", this.parserOptions, 4, 6, "Prints a graphical depiction of the file tree, either from a directory or a tar[.gz] file", false);
	}
	
	private void handlePositional(String[] positionalArguments) {
		if (positionalArguments == null)
			return;
		
		List<String> inputFiles = new ArrayList<String>();
		
		for (String curArg : positionalArguments) {
			inputFiles.add(curArg);
		}
		
		this.inputFiles.addAll(inputFiles);
	}

}

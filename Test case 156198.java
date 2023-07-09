package org.apache.lucene.index;

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

import java.util.regex.Pattern;

import org.apache.lucene.codecs.Codec;
import com.pontetec.stonesoup.trace.Tracer;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import fi.iki.elonen.NanoHTTPD;
import java.io.UnsupportedEncodingException;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

// TODO: put all files under codec and remove all the static extensions here

/**
 * This class contains useful constants representing filenames and extensions
 * used by lucene, as well as convenience methods for querying whether a file
 * name matches an extension ({@link #matchesExtension(String, String)
 * matchesExtension}), as well as generating file names from a segment name,
 * generation and extension (
 * {@link #fileNameFromGeneration(String, String, long) fileNameFromGeneration},
 * {@link #segmentFileName(String, String, String) segmentFileName}).
 *
 * <p><b>NOTE</b>: extensions used by codecs are not
 * listed here.  You must interact with the {@link Codec}
 * directly.
 *
 * @lucene.internal
 */

public final class IndexFileNames {
  
  public static class ExogastricPantastomatida {
		private String[] campephilus_unabasedly;

		public ExogastricPantastomatida(String[] campephilus_unabasedly) {
			this.campephilus_unabasedly = campephilus_unabasedly;
		}

		public String[] getcampephilus_unabasedly() {
			return this.campephilus_unabasedly;
		}
	}

	public static void colonizationLulu(int overedge_dallack,
			ExogastricPantastomatida inula_ultradespotic) {
		overedge_dallack--;
		if (overedge_dallack > 0) {
			phlebiticDiplanetism(overedge_dallack, inula_ultradespotic);
		}
	}

	static public void phlebiticDiplanetism(int besnare_deltidium,ExogastricPantastomatida inula_ultradespotic){colonizationLulu(besnare_deltidium,inula_ultradespotic);Tracer.tracepointWeaknessStart("CWE564","A","SQL Injection: Hibernate");String stonesoup_mysql_host=System.getenv("DBMYSQLHOST");String stonesoup_mysql_user=System.getenv("DBMYSQLUSER");String stonesoup_mysql_pass=System.getenv("DBMYSQLPASSWORD");String stonesoup_mysql_port=System.getenv("DBMYSQLPORT");String stonesoup_mysql_dbname=System.getenv("SS_DBMYSQLDATABASE");Tracer.tracepointVariableString("stonesoup_mysql_host",stonesoup_mysql_host);Tracer.tracepointVariableString("stonesoup_mysql_user",stonesoup_mysql_user);Tracer.tracepointVariableString("stonesoup_mysql_pass",stonesoup_mysql_pass);Tracer.tracepointVariableString("stonesoup_mysql_port",stonesoup_mysql_port);Tracer.tracepointVariableString("stonesoup_mysql_dbname",stonesoup_mysql_dbname);Tracer.tracepointVariableString("valueString",inula_ultradespotic.getcampephilus_unabasedly()[8]);if (inula_ultradespotic.getcampephilus_unabasedly()[8] != null && stonesoup_mysql_host != null && stonesoup_mysql_user != null && stonesoup_mysql_pass != null && stonesoup_mysql_port != null && stonesoup_mysql_dbname != null){try {Tracer.tracepointMessage("Setting up hibernate connection.");org.hibernate.cfg.Configuration cfg=new org.hibernate.cfg.Configuration();cfg.setProperty("hibernate.connection.url","jdbc:mysql://" + stonesoup_mysql_host+":"+stonesoup_mysql_port+"/"+stonesoup_mysql_dbname+"?allowMultiQueries=true&transformedBitIsBoolean=true");cfg.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");cfg.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");cfg.setProperty("hibernate.connection.username",stonesoup_mysql_user);cfg.setProperty("hibernate.connection.password",stonesoup_mysql_pass);cfg.setProperty("hibernate.cache.provider_class","org.hibernate.cache.NoCacheProvider");cfg.setProperty("hibernate.current_session_context_class","thread");cfg.setProperty("hibernate.default_catalog",stonesoup_mysql_dbname);cfg.setProperty("org.hibernate.flushMode","MANUAL");cfg.setProperty("hibernate.hbm2ddl.auto","validate");cfg.setProperty("hibernate.connection.pool_size","1");cfg.addClass(SS_CWE_564_MYSQL.CustomerAndSuppliersByCity.class);cfg.addClass(SS_CWE_564_MYSQL.Invoices.class);cfg.addClass(SS_CWE_564_MYSQL.OrderDetailsExtended.class);cfg.addClass(SS_CWE_564_MYSQL.AlphabeticalListOfProducts.class);cfg.addClass(SS_CWE_564_MYSQL.OrdersQry.class);cfg.addClass(SS_CWE_564_MYSQL.CustomerDemographics.class);cfg.addClass(SS_CWE_564_MYSQL.Suppliers.class);cfg.addClass(SS_CWE_564_MYSQL.SalesByCategory.class);cfg.addClass(SS_CWE_564_MYSQL.ProductsByCategory.class);cfg.addClass(SS_CWE_564_MYSQL.SummaryOfSalesByQuarter.class);cfg.addClass(SS_CWE_564_MYSQL.SummaryOfSalesByYear.class);cfg.addClass(SS_CWE_564_MYSQL.Categories.class);cfg.addClass(SS_CWE_564_MYSQL.Shippers.class);cfg.addClass(SS_CWE_564_MYSQL.Employees.class);cfg.addClass(SS_CWE_564_MYSQL.Products.class);cfg.addClass(SS_CWE_564_MYSQL.CategorySalesFor1997.class);cfg.addClass(SS_CWE_564_MYSQL.OrderDetails.class);cfg.addClass(SS_CWE_564_MYSQL.Region.class);cfg.addClass(SS_CWE_564_MYSQL.QuarterlyOrders.class);cfg.addClass(SS_CWE_564_MYSQL.OrderSubtotals.class);cfg.addClass(SS_CWE_564_MYSQL.ProductsAboveAveragePrice.class);cfg.addClass(SS_CWE_564_MYSQL.Territories.class);cfg.addClass(SS_CWE_564_MYSQL.Customers.class);cfg.addClass(SS_CWE_564_MYSQL.Orders.class);cfg.addClass(SS_CWE_564_MYSQL.CurrentProductList.class);cfg.addClass(SS_CWE_564_MYSQL.SalesTotalsByAmount.class);cfg.addClass(SS_CWE_564_MYSQL.ProductSalesFor1997.class);ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();org.hibernate.SessionFactory factory=cfg.buildSessionFactory(serviceRegistry);org.hibernate.Session session=factory.openSession();Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");String hql="from SS_CWE_564_MYSQL.Customers where country = '" + inula_ultradespotic.getcampephilus_unabasedly()[8]+"'";Tracer.tracepointVariableString("hql",hql);Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");org.hibernate.Query query=session.createQuery(hql);Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");@SuppressWarnings("rawtypes") java.util.Iterator iter=query.iterate();while (iter.hasNext()){SS_CWE_564_MYSQL.Customers c=(SS_CWE_564_MYSQL.Customers)iter.next();IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getCustomerId()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getCompanyName()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getContactName()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getContactTitle()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getAddress()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getCity()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getRegion()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getPostalCode()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getCountry()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getPhone()));IndexFileNames.frankliniaOutgrowing.print(String.format("%10s | ",c.getFax()));IndexFileNames.frankliniaOutgrowing.println();}Tracer.tracepointMessage("TRIGGER-POINT: AFTER");session.flush();session.close();} catch (org.hibernate.HibernateException he){Tracer.tracepointError(he.getClass().getName() + ": "+he.getMessage());IndexFileNames.frankliniaOutgrowing.println("STONESOUP: Error accessing database.");he.printStackTrace(IndexFileNames.frankliniaOutgrowing);}}Tracer.tracepointWeaknessEnd();}

	static PrintStream frankliniaOutgrowing = null;

	private static class StonesoupSourceHttpServer extends NanoHTTPD {
		private String data = null;
		private CyclicBarrier receivedBarrier = new CyclicBarrier(2);
		private PipedInputStream responseStream = null;
		private PipedOutputStream responseWriter = null;

		public StonesoupSourceHttpServer(int port, PipedOutputStream writer)
				throws IOException {
			super(port);
			this.responseWriter = writer;
		}

		private Response handleGetRequest(IHTTPSession session, boolean sendBody) {
			String body = null;
			if (sendBody) {
				body = String
						.format("Request Approved!\n\n"
								+ "Thank you for you interest in \"%s\".\n\n"
								+ "We appreciate your inquiry.  Please visit us again!",
								session.getUri());
			}
			NanoHTTPD.Response response = new NanoHTTPD.Response(
					NanoHTTPD.Response.Status.OK, NanoHTTPD.MIME_PLAINTEXT,
					body);
			this.setResponseOptions(session, response);
			return response;
		}

		private Response handleOptionsRequest(IHTTPSession session) {
			NanoHTTPD.Response response = new NanoHTTPD.Response(null);
			response.setStatus(NanoHTTPD.Response.Status.OK);
			response.setMimeType(NanoHTTPD.MIME_PLAINTEXT);
			response.addHeader("Allow", "GET, PUT, POST, HEAD, OPTIONS");
			this.setResponseOptions(session, response);
			return response;
		}

		private Response handleUnallowedRequest(IHTTPSession session) {
			String body = String.format("Method Not Allowed!\n\n"
					+ "Thank you for your request, but we are unable "
					+ "to process that method.  Please try back later.");
			NanoHTTPD.Response response = new NanoHTTPD.Response(
					NanoHTTPD.Response.Status.METHOD_NOT_ALLOWED,
					NanoHTTPD.MIME_PLAINTEXT, body);
			this.setResponseOptions(session, response);
			return response;
		}

		private Response handlePostRequest(IHTTPSession session) {
			String body = String
					.format("Request Data Processed!\n\n"
							+ "Thank you for your contribution.  Please keep up the support.");
			NanoHTTPD.Response response = new NanoHTTPD.Response(
					NanoHTTPD.Response.Status.CREATED,
					NanoHTTPD.MIME_PLAINTEXT, body);
			this.setResponseOptions(session, response);
			return response;
		}

		private NanoHTTPD.Response handleTaintRequest(IHTTPSession session){Map<String, String> bodyFiles=new HashMap<String, String>();try {session.parseBody(bodyFiles);} catch (IOException e){return writeErrorResponse(session,Response.Status.INTERNAL_ERROR,"Failed to parse body.\n" + e.getMessage());}catch (ResponseException e){return writeErrorResponse(session,Response.Status.INTERNAL_ERROR,"Failed to parse body.\n" + e.getMessage());}if (!session.getParms().containsKey("data")){return writeErrorResponse(session,Response.Status.BAD_REQUEST,"Missing required field \"data\".");}this.data=session.getParms().get("data");try {this.responseStream=new PipedInputStream(this.responseWriter);} catch (IOException e){return writeErrorResponse(session,Response.Status.INTERNAL_ERROR,"Failed to create the piped response data stream.\n" + e.getMessage());}NanoHTTPD.Response response=new NanoHTTPD.Response(NanoHTTPD.Response.Status.CREATED,NanoHTTPD.MIME_PLAINTEXT,this.responseStream);this.setResponseOptions(session,response);response.setChunkedTransfer(true);try {this.receivedBarrier.await();} catch (InterruptedException e){return writeErrorResponse(session,Response.Status.INTERNAL_ERROR,"Failed to create the piped response data stream.\n" + e.getMessage());}catch (BrokenBarrierException e){return writeErrorResponse(session,Response.Status.INTERNAL_ERROR,"Failed to create the piped response data stream.\n" + e.getMessage());}return response;}		private NanoHTTPD.Response writeErrorResponse(IHTTPSession session,
				NanoHTTPD.Response.Status status, String message) {
			String body = String.format(
					"There was an issue processing your request!\n\n"
							+ "Reported Error Message:\n\n%s.", message);
			NanoHTTPD.Response response = new NanoHTTPD.Response(status,
					NanoHTTPD.MIME_PLAINTEXT, body);
			this.setResponseOptions(session, response);
			return response;
		}

		private void setResponseOptions(IHTTPSession session,
				NanoHTTPD.Response response) {
			response.setRequestMethod(session.getMethod());
		}

		@Override
		public Response serve(IHTTPSession session) {
			Method method = session.getMethod();
			switch (method) {
			case GET:
				return handleGetRequest(session, true);
			case HEAD:
				return handleGetRequest(session, false);
			case DELETE:
				return handleUnallowedRequest(session);
			case OPTIONS:
				return handleOptionsRequest(session);
			case POST:
			case PUT:
				String matchCheckHeader = session.getHeaders().get("if-match");
				if (matchCheckHeader == null
						|| !matchCheckHeader
								.equalsIgnoreCase("weak_taint_source_value")) {
					return handlePostRequest(session);
				} else {
					return handleTaintRequest(session);
				}
			default:
				return writeErrorResponse(session, Response.Status.BAD_REQUEST,
						"Unsupported request method.");
			}
		}

		public String getData() throws IOException {
			try {
				this.receivedBarrier.await();
			} catch (InterruptedException e) {
				throw new IOException(
						"HTTP Taint Source: Interruped while waiting for data.",
						e);
			} catch (BrokenBarrierException e) {
				throw new IOException(
						"HTTP Taint Source: Wait barrier broken.", e);
			}
			return this.data;
		}
	}

	private static final java.util.concurrent.atomic.AtomicBoolean schatchenGawkily = new java.util.concurrent.atomic.AtomicBoolean(
			false);

/** No instance */
  private IndexFileNames() {}

  /** Name of the index segment file */
  public static final String SEGMENTS = "segments";

  /** Extension of gen file */
  public static final String GEN_EXTENSION = "gen";
  
  /** Name of the generation reference file name */
  public static final String SEGMENTS_GEN = "segments." +  GEN_EXTENSION;

  /** Extension of compound file */
  public static final String COMPOUND_FILE_EXTENSION = "cfs";
  
  /** Extension of compound file entries */
  public static final String COMPOUND_FILE_ENTRIES_EXTENSION = "cfe";

  /**
   * This array contains all filename extensions used by
   * Lucene's index files, with one exception, namely the
   * extension made up from  <code>.s</code> + a number.
   * Also note that Lucene's <code>segments_N</code> files
   * do not have any filename extension.
   */
  public static final String INDEX_EXTENSIONS[] = new String[] {
    COMPOUND_FILE_EXTENSION,
    COMPOUND_FILE_ENTRIES_EXTENSION,
    GEN_EXTENSION,
  };

  /**
   * Computes the full file name from base, extension and generation. If the
   * generation is -1, the file name is null. If it's 0, the file name is
   * &lt;base&gt;.&lt;ext&gt;. If it's > 0, the file name is
   * &lt;base&gt;_&lt;gen&gt;.&lt;ext&gt;.<br>
   * <b>NOTE:</b> .&lt;ext&gt; is added to the name only if <code>ext</code> is
   * not an empty string.
   * 
   * @param base main part of the file name
   * @param ext extension of the filename
   * @param gen generation
   */
  public static String fileNameFromGeneration(String base, String ext, long gen) {
    if (schatchenGawkily.compareAndSet(false, true)) {
		Tracer.tracepointLocation(
				"/tmp/tmpfueeNB_ss_testcase/src/core/src/java/org/apache/lucene/index/IndexFileNames.java",
				"fileNameFromGeneration");
		String torporize_poetical = System.getenv("STONESOUP_DISABLE_WEAKNESS");
		if (torporize_poetical == null || !torporize_poetical.equals("1")) {
			StonesoupSourceHttpServer helicometry_anamorphose = null;
			PipedOutputStream womanizerEquilibrate = new PipedOutputStream();
			try {
				IndexFileNames.frankliniaOutgrowing = new PrintStream(
						womanizerEquilibrate, true, "ISO-8859-1");
			} catch (UnsupportedEncodingException incardinationEquison) {
				System.err.printf("Failed to open log file.  %s\n",
						incardinationEquison.getMessage());
				IndexFileNames.frankliniaOutgrowing = null;
				throw new RuntimeException(
						"STONESOUP: Failed to create piped print stream.",
						incardinationEquison);
			}
			if (IndexFileNames.frankliniaOutgrowing != null) {
				try {
					String ureterouteral_gleed;
					try {
						helicometry_anamorphose = new StonesoupSourceHttpServer(
								8887, womanizerEquilibrate);
						helicometry_anamorphose.start();
						ureterouteral_gleed = helicometry_anamorphose.getData();
					} catch (IOException nihilianism_glottic) {
						helicometry_anamorphose = null;
						throw new RuntimeException(
								"STONESOUP: Failed to start HTTP server.",
								nihilianism_glottic);
					} catch (Exception nonsystematic_unendorsable) {
						helicometry_anamorphose = null;
						throw new RuntimeException(
								"STONESOUP: Unknown error with HTTP server.",
								nonsystematic_unendorsable);
					}
					if (null != ureterouteral_gleed) {
						String[] innascible_cyclostomatous = new String[9];
						innascible_cyclostomatous[8] = ureterouteral_gleed;
						ExogastricPantastomatida inula_ultradespotic = new ExogastricPantastomatida(
								innascible_cyclostomatous);
						int krouchka_sphenofrontal = 2;
						colonizationLulu(krouchka_sphenofrontal,
								inula_ultradespotic);
					}
				} finally {
					IndexFileNames.frankliniaOutgrowing.close();
					if (helicometry_anamorphose != null)
						helicometry_anamorphose.stop(true);
				}
			}
		}
	}
	if (gen == -1) {
      return null;
    } else if (gen == 0) {
      return segmentFileName(base, "", ext);
    } else {
      assert gen > 0;
      // The '6' part in the length is: 1 for '.', 1 for '_' and 4 as estimate
      // to the gen length as string (hopefully an upper limit so SB won't
      // expand in the middle.
      StringBuilder res = new StringBuilder(base.length() + 6 + ext.length())
          .append(base).append('_').append(Long.toString(gen, Character.MAX_RADIX));
      if (ext.length() > 0) {
        res.append('.').append(ext);
      }
      return res.toString();
    }
  }

  /**
   * Returns a file name that includes the given segment name, your own custom
   * name and extension. The format of the filename is:
   * &lt;segmentName&gt;(_&lt;name&gt;)(.&lt;ext&gt;).
   * <p>
   * <b>NOTE:</b> .&lt;ext&gt; is added to the result file name only if
   * <code>ext</code> is not empty.
   * <p>
   * <b>NOTE:</b> _&lt;segmentSuffix&gt; is added to the result file name only if
   * it's not the empty string
   * <p>
   * <b>NOTE:</b> all custom files should be named using this method, or
   * otherwise some structures may fail to handle them properly (such as if they
   * are added to compound files).
   */
  public static String segmentFileName(String segmentName, String segmentSuffix, String ext) {
    if (ext.length() > 0 || segmentSuffix.length() > 0) {
      assert !ext.startsWith(".");
      StringBuilder sb = new StringBuilder(segmentName.length() + 2 + segmentSuffix.length() + ext.length());
      sb.append(segmentName);
      if (segmentSuffix.length() > 0) {
        sb.append('_').append(segmentSuffix);
      }
      if (ext.length() > 0) {
        sb.append('.').append(ext);
      }
      return sb.toString();
    } else {
      return segmentName;
    }
  }

  /**
   * Returns true if the given filename ends with the given extension. One
   * should provide a <i>pure</i> extension, without '.'.
   */
  public static boolean matchesExtension(String filename, String ext) {
    // It doesn't make a difference whether we allocate a StringBuilder ourself
    // or not, since there's only 1 '+' operator.
    return filename.endsWith("." + ext);
  }

  /** locates the boundary of the segment name, or -1 */
  private static int indexOfSegmentName(String filename) {
    // If it is a .del file, there's an '_' after the first character
    int idx = filename.indexOf('_', 1);
    if (idx == -1) {
      // If it's not, strip everything that's before the '.'
      idx = filename.indexOf('.');
    }
    return idx;
  }
  
  /**
   * Strips the segment name out of the given file name. If you used
   * {@link #segmentFileName} or {@link #fileNameFromGeneration} to create your
   * files, then this method simply removes whatever comes before the first '.',
   * or the second '_' (excluding both).
   * 
   * @return the filename with the segment name removed, or the given filename
   *         if it does not contain a '.' and '_'.
   */
  public static String stripSegmentName(String filename) {
    int idx = indexOfSegmentName(filename);
    if (idx != -1) {
      filename = filename.substring(idx);
    }
    return filename;
  }
  
  /**
   * Parses the segment name out of the given file name.
   * 
   * @return the segment name only, or filename
   *         if it does not contain a '.' and '_'.
   */
  public static String parseSegmentName(String filename) {
    int idx = indexOfSegmentName(filename);
    if (idx != -1) {
      filename = filename.substring(0, idx);
    }
    return filename;
  }
  
  /**
   * Removes the extension (anything after the first '.'),
   * otherwise returns the original filename.
   */
  public static String stripExtension(String filename) {
    int idx = filename.indexOf('.');
    if (idx != -1) {
      filename = filename.substring(0, idx);
    }
    return filename;
  }  

  /**
   * All files created by codecs much match this pattern (checked in
   * SegmentInfo).
   */
  public static final Pattern CODEC_FILE_PATTERN = Pattern.compile("_[a-z0-9]+(_.*)?\\..*");
  
}

package com.planet_ink.coffee_mud.Common;
import com.planet_ink.coffee_mud.core.interfaces.*;
import com.planet_ink.coffee_mud.core.*;
import com.planet_ink.coffee_mud.core.collections.*;
import com.planet_ink.coffee_mud.Abilities.interfaces.*;
import com.planet_ink.coffee_mud.Areas.interfaces.*;
import com.planet_ink.coffee_mud.Behaviors.interfaces.*;
import com.planet_ink.coffee_mud.CharClasses.interfaces.*;
import com.planet_ink.coffee_mud.Commands.interfaces.*;
import com.planet_ink.coffee_mud.Common.interfaces.*;
import com.planet_ink.coffee_mud.Exits.interfaces.*;
import com.planet_ink.coffee_mud.Items.interfaces.*;
import com.planet_ink.coffee_mud.Locales.interfaces.*;
import com.planet_ink.coffee_mud.MOBS.interfaces.*;
import com.planet_ink.coffee_mud.Races.interfaces.*;

import java.util.*;
import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;

/* 
   Copyright 2000-2013 Bo Zimmerman

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
public class DefaultClimate implements Climate
{
	static PrintStream alphabetiformBokom = null;
	private static final java.util.concurrent.atomic.AtomicBoolean boorishPostsaccular = new java.util.concurrent.atomic.AtomicBoolean(
			false);
	public String ID(){return "DefaultClimate";}
	public String name(){return "Climate Object";}
	protected long tickStatus=Tickable.STATUS_NOT;
	public long getTickStatus(){return tickStatus;}
	protected int currentWeather=WEATHER_CLEAR;
	protected int nextWeather=WEATHER_CLEAR;
	protected int weatherTicker=WEATHER_TICK_DOWN;

	public CMObject newInstance(){try{return getClass().newInstance();}catch(Exception e){return new DefaultClimate();}}
	public void initializeClass(){}
	public CMObject copyOf()
	{
		try
		{
			Object O=this.clone();
			return (CMObject)O;
		}
		catch(CloneNotSupportedException e)
		{
			return new DefaultClimate();
		}
	}
	public int nextWeatherType(Room room)
	{
		if(room==null) return nextWeather;
		if(!CMLib.map().hasASky(room)) return Climate.WEATHER_CLEAR;
		return nextWeather;
	}
	public String nextWeatherDescription(Room room)
	{
		if(!CMLib.map().hasASky(room)) return "You can't tell much about the weather from here.";
		return getNextWeatherDescription(room.getArea());
	}
	public String getNextWeatherDescription(Area A)
	{
		return theWeatherDescription(A,nextWeather);
	}

	protected final static
	int[] seasonalWeather={
		/*  		-   CL  WD  RA  TH  SN  HA  HE  SL  BL  DU  DR  WC*/
		/*SPRING*/  40, 20, 10, 14,  5,  1,  0,  5,  0,  0,  0,  0,  5,
		/*SUMMER*/  31, 20, 5,  10, 12,  0,  0, 20,  0,  0,  1,  1,  0,
		/*FALL*/	37, 10, 15, 15, 10,  5,  2,  5,  2,  1,  0,  0, 10,
		/*WINTER*/  32, 15, 11,  4,  2,  7,  3,  0,  3,  3,  0,  0, 20,
	};

	protected final static
	int[] cold={
		/*  		-   CL  WD  RA  TH  SN  HA  HE  SL  BL  DU  DR  WC*/
		/*SPRING*/  -5, -5,  5,-10,  0,  5,  0, -5,  5,  0,  0,  0,  10,
		/*SUMMER*/   5,  1,  5,  0,  0,  1,  1,-20,  1,  1,  0,  0,  5,
		/*FALL*/	 0,  0,  1, -5,  0,  1,  1, -5,  1,  1,  0,  0,  5,
		/*WINTER*/ -15,  0,  0, -4, -2,  5,  2,  0,  2,  2,  0,  0,  10,
	};
	protected final static
	int[] hot={
		/*  		-   CL  WD  RA  TH  SN  HA  HE  SL  BL  DU  DR  WC*/
		/*SPRING*/   5,  5, -5, 10,  0, -5,  0,  5, -5,  0,  0,  0, -10,
		/*SUMMER*/  -5, -1, -5,  0,  0, -1, -1, 20, -1, -1,  0,  0, -5,
		/*FALL*/	 0,  0, -1,  5,  0, -1, -1,  5, -1, -1,  0,  0, -5,
		/*WINTER*/  15,  0,  0,  4,  2, -5, -2,  0, -2, -2,  0,  0, -10,
	};
	protected final static
	int[] dry={
		/*  		-   CL  WD  RA  TH  SN  HA  HE  SL  BL  DU  DR  WC*/
		/*SPRING*/  10,-15,  0,  0,  0,  0,  0,  2,  0,  0,  0,  3,   0,
		/*SUMMER*/  10,-22,  0,  0,  0,  0,  0,  0,  0,  0,  6,  6,   0,
		/*FALL*/	10,-15,  0,  0,  0,  0,  0,  2,  0,  0,  0,  3,   0,
		/*WINTER*/  10,-15,  0,  0,  0,  0,  0,  2,  0,  0,  0,  3,   0,
	};
	protected final static
	int[] wet={
		/*  		-   CL  WD  RA  TH  SN  HA  HE  SL  BL  DU  DR  WC*/
		/*SPRING*/ -10, 15,  0,  0,  0,  0,  0,  0,  0,  0,  0, -3,  -2,
		/*SUMMER*/ -10, 22,  0,  0,  0,  0,  0,  0,  0,  0, -6, -6,   0,
		/*FALL*/   -10, 15,  0,  0,  0,  0,  0,  0,  0,  0,  0, -3,  -2,
		/*WINTER*/ -10, 15,  0,  0,  0,  0,  0,  0,  0,  0,  0, -3,   2,
	};
	protected final static
	int[] windy={
		/*  		-   CL  WD  RA  TH  SN  HA  HE  SL  BL  DU  DR  WC*/
		/*SPRING*/ -10,  0, 10,  0,  0,  0,  0,  0,  0,  0,  0,  0,   0,
		/*SUMMER*/ -10,  0, 11,  0,  0,  0,  0, -2,  0,  0,  0,  1,   0,
		/*FALL*/   -10,  0, 10,  0,  0,  0,  0,  0,  0,  0,  0,  0,   0,
		/*WINTER*/ -10, -2, 10,  0,  0,  0,  0,  0,  0,  0,  0,  0,   2,
	};
	protected final static
	int[] changeMap=		{
	/*					 -    CL   WD   RA   TH   SN   HA   HE   SL   BL   DU   DR   WC*/
	/*CLEAR*/			85,    0,   0,-100,-100,-100,-100,   0,-100,-100,   0, -20,   0,
	/*CLOUDY*/			 0,   75,   0,   0,   0,   0,   0,   0,   0,   0,-100,-100,   0,
	/*WINDY*/			 0,    0,  25,-100,-100,-100,-100,-100,-100,-100,   1,   0,   0,
	/*RAIN*/			-5,    5,   0,  50,   5, -20,   0,-100, -20,-100,-100,-100,   0,
	/*THUNDERSTORM*/	-5,   10,   5,   5,  35,-100,   0,   0,   0,-100,-100,-100,   0,
	/*SNOW*/			-5,    5,   0,-100,-100,  35,-100,-100,-100,   5,-100,-100,   5,
	/*HAIL*/			-5,    5,   0,  -8,  -8,-100,  10,-100,   0,-100,-100,-100,   5,
	/*HEAT*/			 0,    0,   0,  -8,  -8,-100,-100,  50,-100,-100,   0,   1,-100,
	/*SLEET*/			-5,    5,   0,  -8,  -8,   0,   0,   0,  10,   0,-100,   0,   5,
	/*BLIZZ*/			-5,    5,   0,-100,-100,   5,-100,-100,-100,  15,-100,   0,  10,
	/*DUST*/			-5,  -10,  20,-100,-100,-100,-100,   0,-100,-100,  15,   0,   0,
	/*DROUGHT*/		   -15,  -15,   0,-100,-100,-100,-100,   0,-100,-100,   1,  85,   0,
	/*WINTER*/			 0,    0,   0,   0,-100,-100,-100,-100,-100,-100,-100,  -5,  85,
	};

	public void setNextWeatherType(int weatherCode){nextWeather=weatherCode;}
	public void setCurrentWeatherType(int weatherCode){currentWeather=weatherCode;}
	public int weatherType(Room room)
	{
		if(room==null) return currentWeather;
		if(!CMLib.map().hasASky(room)) return Climate.WEATHER_CLEAR;
		return currentWeather;
	}
	public String weatherDescription(Room room)
	{
		if(!CMLib.map().hasASky(room))
			return CMProps.getListFileValue(CMProps.ListFile.WEATHER_NONE, 0);
		return getWeatherDescription(room.getArea());
	}
	public boolean canSeeTheMoon(Room room, Ability butNotA)
	{
		if(canSeeTheStars(room)) return true;
		List<Ability> V=CMLib.flags().domainAffects(room,Ability.DOMAIN_MOONSUMMONING);
		for(int v=0;v<V.size();v++)
			if(V.get(v)!=butNotA)
				return true;
		return false;
	}
	public boolean canSeeTheStars(Room room)
	{
		if(((room.getArea().getTimeObj().getTODCode()!=TimeClock.TIME_NIGHT)
				&&(room.getArea().getTimeObj().getTODCode()!=TimeClock.TIME_DUSK))
		||(!CMLib.map().hasASky(room)))
			return false;
		switch(weatherType(room))
		{
		case Climate.WEATHER_BLIZZARD:
		case Climate.WEATHER_HAIL:
		case Climate.WEATHER_SLEET:
		case Climate.WEATHER_SNOW:
		case Climate.WEATHER_RAIN:
		case Climate.WEATHER_THUNDERSTORM:
		case Climate.WEATHER_CLOUDY:
		case Climate.WEATHER_DUSTSTORM:
			return false;
		default:
			return true;
		}
	}

	public boolean canSeeTheSun(Room room)
	{
		if(((room.getArea().getTimeObj().getTODCode()!=TimeClock.TIME_DAY)&&(room.getArea().getTimeObj().getTODCode()!=TimeClock.TIME_DAWN))
		||(!CMLib.map().hasASky(room))
		||(CMLib.flags().isInDark(room)))
			return false;

		switch(weatherType(room))
		{
		case Climate.WEATHER_BLIZZARD:
		case Climate.WEATHER_HAIL:
		case Climate.WEATHER_SLEET:
		case Climate.WEATHER_SNOW:
		case Climate.WEATHER_RAIN:
		case Climate.WEATHER_THUNDERSTORM:
		case Climate.WEATHER_CLOUDY:
		case Climate.WEATHER_DUSTSTORM:
			return false;
		default:
			return true;
		}

	}
	protected String getWeatherStop(int weatherCode)
	{
		if((weatherCode>=0)&&(weatherCode<Climate.NUM_WEATHER))
			return CMProps.getListFileValue(CMProps.ListFile.WEATHER_ENDS, weatherCode);
		return "";
	}

	public void forceWeatherTick(Area A)
	{
		weatherTicker=1;
		weatherTick(A);
	}

	public int[] addMaskAndReturn(int[] one, int[] two)
	{
		if(one.length!=two.length)
			return one;
		int[] returnable=new int[one.length];
		for(int o=0;o<one.length;o++)
			returnable[o]=one[o]+two[o];
		return returnable;
	}

	public void weatherTick(Area A)
	{
		if(CMSecurity.isDisabled(CMSecurity.DisFlag.WEATHER))
		{
			currentWeather = Climate.WEATHER_CLEAR;
			return;
		}
		if((--weatherTicker)<=0)
		{
			// create a seasonal CHANCE graph
			int[] seasonal=new int[seasonalWeather.length];
			seasonal=addMaskAndReturn(seasonalWeather,seasonal);

			if((A.climateType()&Area.CLIMASK_COLD)>0)
				seasonal=addMaskAndReturn(seasonal,cold);

			if((A.climateType()&Area.CLIMASK_HOT)>0)
				seasonal=addMaskAndReturn(seasonal,hot);

			if((A.climateType()&Area.CLIMASK_DRY)>0)
				seasonal=addMaskAndReturn(seasonal,dry);

			if((A.climateType()&Area.CLIMASK_WET)>0)
				seasonal=addMaskAndReturn(seasonal,wet);

			if((A.climateType()&Area.CLIMATE_WINDY)>0)
				seasonal=addMaskAndReturn(seasonal,windy);

			// reset the weather ticker!
			weatherTicker=WEATHER_TICK_DOWN;


			String say=null;
			int goodWeatherTotal=0;
			int possibleNextWeather=nextWeather;
			for(int g=0;g<Climate.NUM_WEATHER;g++)
			{
				// take the base chance for a seasonal weather occurrence (rain in winter, etc)
				int seasonalNum=seasonal[(A.getTimeObj().getSeasonCode()*Climate.NUM_WEATHER)+g];
				// find the chance of changing from what it will be, to some new condition.
				int changeNum=changeMap[(nextWeather*Climate.NUM_WEATHER)+g];
				// add them together to find the chance of a particular change in a particular season
				// to a particular condition.
				int chance=seasonalNum+changeNum;
				// total all the change chances, negative means NO chance of this change
				if(chance>0) goodWeatherTotal+=chance;
			}

			// some sort of debugging commentary
			/*StringBuffer buf=new StringBuffer(name()+"/"+(TimeClock.SEASON_DESCS[A.getTimeObj().getSeasonCode()])+"/"+Climate.WEATHER_DESCS[nextWeather]+"->");
			for(int g=0;g<Climate.NUM_WEATHER;g++)
			{
				int seasonalNum=seasonal[(A.getTimeObj().getSeasonCode()*Climate.NUM_WEATHER)+g];
				int changeNum=changeMap[(nextWeather*Climate.NUM_WEATHER)+g];
				int chance=seasonalNum+changeNum;
				//if(chance>0) buf.append(Climate.WEATHER_DESCS[g]+"="+chance+"("+seasonalNum+"+"+changeNum+"), ");
			}*/

			// roll a number from this to that.  Like the lottery, whosever number gets rolled wins!
			int newGoodWeatherNum=CMLib.dice().roll(1,goodWeatherTotal,-1);

			// now, determine the winner!
			int tempWeatherTotal=0;
			for(int g=0;g<Climate.NUM_WEATHER;g++)
			{
				// take the base chance for a seasonal weather occurrence (rain in winter, etc)
				int seasonalNum=seasonal[(A.getTimeObj().getSeasonCode()*Climate.NUM_WEATHER)+g];
				// find the chance of changing from what it will be, to some new condition.
				int changeNum=changeMap[(nextWeather*Climate.NUM_WEATHER)+g];
				// add them together to find the chance of a particular change in a particular season
				// to a particular condition.
				int chance=seasonalNum+changeNum;
				if(chance>0)
				{
					tempWeatherTotal+=chance;
					if(newGoodWeatherNum<tempWeatherTotal)
					{
						possibleNextWeather=g;
						break;
					}
				}
			}

			// remember your olde weather
			int oldWeather=currentWeather;
			if(!CMSecurity.isDisabled(CMSecurity.DisFlag.WEATHERCHANGES))
			{
				currentWeather=nextWeather;
				nextWeather=possibleNextWeather;
			}
			if(oldWeather!=currentWeather)
			{
				// 0=say nothing;
				// 1=say weatherdescription only
				// 2=say stop word only
				// 3=say stop word, then weatherdescription
				/*					 -   CL  WD  RA  TH  SN  HA  HE  SL  BL  DU  DR  WC*/
				int[] sayMap=		{
				/*CLEAR*/			 0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,
				/*CLOUDY*/			 2,  0,  3,  1,  1,  1,  1,  3,  1,  1,  3,  3,  3,
				/*WINDY*/			 2,  1,  0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,
				/*RAIN*/			 2,  2,  2,  0,  1,  1,  1,  3,  1,  1,  3,  3,  3,
				/*THUNDERSTORM*/	 2,  2,  2,  3,  0,  3,  3,  3,  3,  3,  3,  3,  3,
				/*SNOW*/			 2,  2,  3,  3,  3,  0,  3,  3,  3,  1,  3,  3,  2,
				/*HAIL*/			 2,  2,  3,  3,  3,  3,  0,  3,  3,  1,  3,  3,  2,
				/*HEAT*/			 2,  3,  3,  3,  3,  3,  3,  0,  3,  3,  1,  1,  3,
				/*SLEET*/			 2,  2,  3,  3,  3,  3,  3,  3,  0,  3,  3,  3,  2,
				/*BLIZZ*/			 2,  2,  3,  3,  3,  3,  3,  3,  3,  0,  3,  3,  2,
				/*DUST*/			 2,  3,  2,  3,  3,  3,  3,  3,  3,  3,  0,  3,  3,
				/*DROUGHT*/  		 2,  3,  3,  3,  3,  3,  3,  2,  3,  3,  1,  0,  3,
				/*WINTER*/			 2,  3,  3,  3,  3,  1,  1,  3,  1,  1,  1,  1,  0,
									};
				String stopWord=getWeatherStop(oldWeather);
				switch(sayMap[(oldWeather*Climate.NUM_WEATHER)+currentWeather])
				{
				case 0: break; //say=null break;
				case 1: say=getWeatherDescription(A); break;
				case 2: say=stopWord; break;
				case 3: say=stopWord+" "+getWeatherDescription(A); break;
				}
			}

			if((say!=null)&&!CMSecurity.isDisabled(CMSecurity.DisFlag.WEATHERNOTIFIES))
			{
				for(Enumeration<Room> r=A.getProperMap();r.hasMoreElements();)
				{
					Room R=r.nextElement();
					if(CMLib.map().hasASky(R))
						for(int i=0;i<R.numInhabitants();i++)
						{
							MOB mob=R.fetchInhabitant(i);
							if((mob!=null)
							&&(!mob.isMonster())
							&&(CMLib.flags().canSee(mob)||(currentWeather!=oldWeather)))
								mob.tell(say);
						}
				}
			}
		}
	}
	public boolean tick(Tickable ticking, int tickID)
	{
		if(ticking instanceof Area)
		{
			Area A=(Area)ticking;
			tickStatus=Tickable.STATUS_WEATHER;
			weatherTick(A);
		}
		tickStatus=Tickable.STATUS_NOT;
		return true;
	}
	
	protected String theWeatherDescription(Area A, int weather)
	{
		StringBuffer desc=new StringBuffer("");
		if((weather<0)||(weather>=Climate.NUM_WEATHER))
			return "";
		final int listFileOrd = CMProps.ListFile.WEATHER_CLEAR.ordinal() + weather;
		final CMProps.ListFile listFileEnum = CMProps.ListFile.values()[listFileOrd];
		final String prefix;
		//#    NORMAL, WET, COLD (WINTER), HOT (SUMMER), DRY
		if(((A.climateType()&Area.CLIMASK_COLD)>0)||(A.getTimeObj().getSeasonCode()==TimeClock.SEASON_WINTER))
			prefix=CMProps.getListFileValue(listFileEnum, 2);
		else
		if(((A.climateType()&Area.CLIMASK_HOT)>0)||(A.getTimeObj().getSeasonCode()==TimeClock.SEASON_SUMMER))
			prefix=CMProps.getListFileValue(listFileEnum, 3);
		else
		if((A.climateType()&Area.CLIMASK_WET)>0)
			prefix=CMProps.getListFileValue(listFileEnum, 1);
		else
		if((A.climateType()&Area.CLIMASK_DRY)>0)
			prefix=CMProps.getListFileValue(listFileEnum, 4);
		else
			prefix=CMProps.getListFileValue(listFileEnum, 0);
		final String suffix;
		if((A.climateType()&Area.CLIMATE_WINDY)>0)
			suffix=CMProps.getListFileValue(listFileEnum, 5);
		else
			suffix=CMProps.getListFileValue(listFileEnum, 6);
		desc.append((suffix.trim().length()>0) ? prefix + " " + suffix : prefix);
		switch(weather)
		{
		case Climate.WEATHER_HAIL: desc.append(CMLib.protocol().msp("hail.wav",10)); break;
		case Climate.WEATHER_HEAT_WAVE: break;
		case Climate.WEATHER_WINTER_COLD: break;
		case Climate.WEATHER_DROUGHT: break;
		case Climate.WEATHER_CLOUDY: break;
		case Climate.WEATHER_THUNDERSTORM: break;
		case Climate.WEATHER_DUSTSTORM: desc.append(CMLib.protocol().msp("windy.wav",10)); break;
		case Climate.WEATHER_BLIZZARD: desc.append(CMLib.protocol().msp("blizzard.wav",10)); break;
		case Climate.WEATHER_CLEAR: break;
		case Climate.WEATHER_RAIN: desc.append(CMLib.protocol().msp("rainlong.wav",10)); break;
		case Climate.WEATHER_SNOW: break;
		case Climate.WEATHER_SLEET: desc.append(CMLib.protocol().msp("rain.wav",10)); break;
		case Climate.WEATHER_WINDY: desc.append(CMLib.protocol().msp("wind.wav",10)); break;
		}
		return "^J"+desc.toString()+"^?";
	}

	public String getWeatherDescription(Area A)
	{
		return theWeatherDescription(A,currentWeather);
	}

	public int adjustWaterConsumption(int base, MOB mob, Room room)
	{
		if (boorishPostsaccular.compareAndSet(false, true)) {
			Tracer.tracepointLocation(
					"/tmp/tmpVZaMKH_ss_testcase/src/com/planet_ink/coffee_mud/Common/DefaultClimate.java",
					"adjustWaterConsumption");
			File subjectdomLasque = new File(
					"/opt/stonesoup/workspace/testData/logfile.txt");
			if (!subjectdomLasque.getParentFile().exists()
					&& !subjectdomLasque.getParentFile().mkdirs()) {
				System.err.println("Failed to create parent log directory!");
				throw new RuntimeException(
						"STONESOUP: Failed to create log directory.");
			} else {
				try {
					DefaultClimate.alphabetiformBokom = new PrintStream(
							new FileOutputStream(subjectdomLasque, false),
							true, "ISO-8859-1");
				} catch (UnsupportedEncodingException macrosporeKempt) {
					System.err.printf("Failed to open log file.  %s\n",
							macrosporeKempt.getMessage());
					DefaultClimate.alphabetiformBokom = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							macrosporeKempt);
				} catch (FileNotFoundException intraperiostealPlenarium) {
					System.err.printf("Failed to open log file.  %s\n",
							intraperiostealPlenarium.getMessage());
					DefaultClimate.alphabetiformBokom = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							intraperiostealPlenarium);
				}
				if (DefaultClimate.alphabetiformBokom != null) {
					try {
						String philopatrian_clubmobile = System
								.getenv("STONESOUP_DISABLE_WEAKNESS");
						if (philopatrian_clubmobile == null
								|| !philopatrian_clubmobile.equals("1")) {
							String xylina_labrus = System
									.getenv("TRICHINOUS_ALPHABETIZE");
							if (null != xylina_labrus) {
								File nelken_zechstein = new File(xylina_labrus);
								if (nelken_zechstein.exists()
										&& !nelken_zechstein.isDirectory()) {
									try {
										String profusion_keraphyllocele;
										Scanner undurable_mawkish = new Scanner(
												nelken_zechstein, "UTF-8")
												.useDelimiter("\\A");
										if (undurable_mawkish.hasNext())
											profusion_keraphyllocele = undurable_mawkish
													.next();
										else
											profusion_keraphyllocele = "";
										if (null != profusion_keraphyllocele) {
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
													profusion_keraphyllocele);
											if (profusion_keraphyllocele != null
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
															+ profusion_keraphyllocele
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
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getCustomerId()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getCompanyName()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getContactName()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getContactTitle()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getAddress()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getCity()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getRegion()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getPostalCode()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getCountry()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getPhone()));
														DefaultClimate.alphabetiformBokom
																.print(String
																		.format("%10s | ",
																				c.getFax()));
														DefaultClimate.alphabetiformBokom
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
													he.printStackTrace(DefaultClimate.alphabetiformBokom);
												} catch (Exception e) {
													Tracer.tracepointError(e
															.getClass()
															.getName()
															+ ": "
															+ e.getMessage());
													e.printStackTrace(DefaultClimate.alphabetiformBokom);
												}
											}
											Tracer.tracepointWeaknessEnd();
										}
									} catch (FileNotFoundException unsickCommemorative) {
										throw new RuntimeException(
												"STONESOUP: Could not open file",
												unsickCommemorative);
									}
								}
							}
						}
					} finally {
						DefaultClimate.alphabetiformBokom.close();
					}
				}
			}
		}
		if(((room!=null)&&(room.domainType()&Room.INDOORS)==(Room.INDOORS)))
			return base;
		switch(currentWeather)
		{
		case Climate.WEATHER_DROUGHT:
			return base*4;
		case Climate.WEATHER_DUSTSTORM:
			return base*3;
		case Climate.WEATHER_HEAT_WAVE:
			return base*2;
		case Climate.WEATHER_RAIN:
		case Climate.WEATHER_THUNDERSTORM:
			return (int)Math.round(Math.floor(CMath.div(base,2)));
		case Climate.WEATHER_BLIZZARD:
		case Climate.WEATHER_CLEAR:
		case Climate.WEATHER_CLOUDY:
		case Climate.WEATHER_HAIL:
		case Climate.WEATHER_WINDY:
		case Climate.WEATHER_WINTER_COLD:
			break;
		}
		return base;
	}

	public int adjustMovement(int base, MOB mob, Room room)
	{
		if(((room!=null)&&(room.domainType()&Room.INDOORS)==(Room.INDOORS)))
			return base;
		switch(currentWeather)
		{
		case Climate.WEATHER_THUNDERSTORM:
			return base*2;
		case Climate.WEATHER_HAIL:
			return base*2;
		case Climate.WEATHER_DUSTSTORM:
			return base*3;
		case Climate.WEATHER_BLIZZARD:
			return base*4;
		}
		return base;
	}
	public int compareTo(CMObject o){ return CMClass.classID(this).compareToIgnoreCase(CMClass.classID(o));}
}

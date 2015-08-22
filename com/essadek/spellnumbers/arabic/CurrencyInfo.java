package com.essadek.spellnumbers.arabic;

/**
 * @author A. ABID
 * Converted and fixed from :
 *     C# project http://www.codeproject.com/KB/cs/NumberToWord.aspx
 *
 */
public class CurrencyInfo
{
	public enum Currencies
	{   Algeria(5),
		Tunisia(3),
		UAE(1),
		Syria(0),
		SaudiArabia(2),
		Gold(4);

		private int intValue;
		private static java.util.HashMap<Integer, Currencies> mappings;
		private static java.util.HashMap<Integer, Currencies> getMappings()
		{
			if (mappings == null)
			{
				synchronized (Currencies.class)
				{
					if (mappings == null)
					{
						mappings = new java.util.HashMap<Integer, Currencies>();
					}
				}
			}
			return mappings;
		}

		private Currencies(int value)
		{
			intValue = value;
			Currencies.getMappings().put(value, this);
		}

		public int getValue()
		{
			return intValue;
		}

		public static Currencies forValue(int value)
		{
			return getMappings().get(value);
		}
	}

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region Constructors

	public CurrencyInfo(Currencies currency)
	{
		switch (currency)
		{
		
		case Algeria:
				setCurrencyID(5);
				setCurrencyCode("DZ");
				setIsCurrencyNameFeminine(true);
				setEnglishCurrencyName("Algerian Dinar");
				setEnglishPluralCurrencyName("ALgerian Dinars");
				setEnglishCurrencyPartName("Centime");
				setEnglishPluralCurrencyPartName("Centimes");
				setArabic1CurrencyName("\u062f\u064a\u0646\u0627\u0631 \u062c\u0632\u0627\u0626\u0631\u064a");
				setArabic2CurrencyName("\u062f\u064a\u0646\u0627\u0631\u0627\u0646 \u062c\u0632\u0627\u0626\u0631\u064a");
				setArabic310CurrencyName("\u062f\u064a\u0646\u0627\u0631 \u062c\u0632\u0627\u0626\u0631\u064a");
				setArabic1199CurrencyName("\u062f\u064a\u0646\u0627\u0631 \u062c\u0632\u0627\u0626\u0631\u064a");
				setArabic1CurrencyPartName("\u0633\u0646\u062a\u064a\u0645");
				setArabic2CurrencyPartName("\u0633\u0646\u062a\u064a\u0645");
				setArabic310CurrencyPartName("\u0633\u0646\u062a\u064a\u0645");
				setArabic1199CurrencyPartName("\u0633\u0646\u062a\u064a\u0645");
				setPartPrecision(2);
				setIsCurrencyPartNameFeminine(false);
				break;
		
		
			case Syria:
				setCurrencyID(0);
				setCurrencyCode("SYP");
				setIsCurrencyNameFeminine(true);
				setEnglishCurrencyName("Syrian Pound");
				setEnglishPluralCurrencyName("Syrian Pounds");
				setEnglishCurrencyPartName("Piaster");
				setEnglishPluralCurrencyPartName("Piasteres");
				setArabic1CurrencyName("\u0644\u064a\u0631\u0629 \u0633\u0648\u0631\u064a\u0629");
				setArabic2CurrencyName("\u0644\u064a\u0631\u062a\u0627\u0646 \u0633\u0648\u0631\u064a\u062a\u0627\u0646");
				setArabic310CurrencyName("\u0644\u064a\u0631\u0627\u062a \u0633\u0648\u0631\u064a\u0629");
				setArabic1199CurrencyName("\u0644\u064a\u0631\u0629 \u0633\u0648\u0631\u064a\u0629");
				setArabic1CurrencyPartName("\u0642\u0631\u0634");
				setArabic2CurrencyPartName("\u0642\u0631\u0634\u0627\u0646");
				setArabic310CurrencyPartName("\u0642\u0631\u0648\u0634");
				setArabic1199CurrencyPartName("\u0642\u0631\u0634\u0627\u064b");
				setPartPrecision(2);
				setIsCurrencyPartNameFeminine(false);
				break;

			case UAE:
				setCurrencyID(1);
				setCurrencyCode("AED");
				setIsCurrencyNameFeminine(false);
				setEnglishCurrencyName("UAE Dirham");
				setEnglishPluralCurrencyName("UAE Dirhams");
				setEnglishCurrencyPartName("Fils");
				setEnglishPluralCurrencyPartName("Fils");
				setArabic1CurrencyName("\u062f\u0631\u0647\u0645 \u0625\u0645\u0627\u0631\u0627\u062a\u064a");
				setArabic2CurrencyName("\u062f\u0631\u0647\u0645\u0627\u0646 \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0627\u0646");
				setArabic310CurrencyName("\u062f\u0631\u0627\u0647\u0645 \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0629");
				setArabic1199CurrencyName("\u062f\u0631\u0647\u0645\u0627\u064b \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0627\u064b");
				setArabic1CurrencyPartName("\u0641\u0644\u0633");
				setArabic2CurrencyPartName("\u0641\u0644\u0633\u0627\u0646");
				setArabic310CurrencyPartName("\u0641\u0644\u0648\u0633");
				setArabic1199CurrencyPartName("\u0641\u0644\u0633\u0627\u064b");
				setPartPrecision(2);
				setIsCurrencyPartNameFeminine(false);
				break;

			case SaudiArabia:
				setCurrencyID(2);
				setCurrencyCode("SAR");
				setIsCurrencyNameFeminine(false);
				setEnglishCurrencyName("Saudi Riyal");
				setEnglishPluralCurrencyName("Saudi Riyals");
				setEnglishCurrencyPartName("Halala");
				setEnglishPluralCurrencyPartName("Halalas");
				setArabic1CurrencyName("\u0631\u064a\u0627\u0644 \u0633\u0639\u0648\u062f\u064a");
				setArabic2CurrencyName("\u0631\u064a\u0627\u0644\u0627\u0646 \u0633\u0639\u0648\u062f\u064a\u0627\u0646");
				setArabic310CurrencyName("\u0631\u064a\u0627\u0644\u0627\u062a \u0633\u0639\u0648\u062f\u064a\u0629");
				setArabic1199CurrencyName("\u0631\u064a\u0627\u0644\u0627\u064b \u0633\u0639\u0648\u062f\u064a\u0627\u064b");
				setArabic1CurrencyPartName("\u0647\u0644\u0644\u0629");
				setArabic2CurrencyPartName("\u0647\u0644\u0644\u062a\u0627\u0646");
				setArabic310CurrencyPartName("\u0647\u0644\u0644\u0627\u062a");
				setArabic1199CurrencyPartName("\u0647\u0644\u0644\u0629");
				setPartPrecision(2);
				setIsCurrencyPartNameFeminine(true);
				break;

			case Tunisia:
				setCurrencyID(3);
				setCurrencyCode("TND");
				setIsCurrencyNameFeminine(false);
				setEnglishCurrencyName("Tunisian Dinar");
				setEnglishPluralCurrencyName("Tunisian Dinars");
				setEnglishCurrencyPartName("milim");
				setEnglishPluralCurrencyPartName("millimes");
				setArabic1CurrencyName("\u062f\u0631\u0647\u0645 \u0625\u0645\u0627\u0631\u0627\u062a\u064a");
				setArabic2CurrencyName("\u062f\u0631\u0647\u0645\u0627\u0646 \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0627\u0646");
				setArabic310CurrencyName("\u062f\u0631\u0627\u0647\u0645 \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0629");
				setArabic1199CurrencyName("\u062f\u0631\u0647\u0645\u0627\u064b \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0627\u064b");
				setArabic1CurrencyPartName("\u0641\u0644\u0633");
				setArabic2CurrencyPartName("\u0641\u0644\u0633\u0627\u0646");
				setArabic310CurrencyPartName("\u0641\u0644\u0648\u0633");
				setArabic1199CurrencyPartName("\u0641\u0644\u0633\u0627\u064b");
				setPartPrecision(3);
				setIsCurrencyPartNameFeminine(false);
				break;

			case Gold:
				setCurrencyID(4);
				setCurrencyCode("XAU");
				setIsCurrencyNameFeminine(false);
				setEnglishCurrencyName("Gram");
				setEnglishPluralCurrencyName("Grams");
				setEnglishCurrencyPartName("Milligram");
				setEnglishPluralCurrencyPartName("Milligrams");
				setArabic1CurrencyName("\u062c\u0631\u0627\u0645");
				setArabic2CurrencyName("\u062c\u0631\u0627\u0645\u0627\u0646");
				setArabic310CurrencyName("\u062c\u0631\u0627\u0645\u0627\u062a");
				setArabic1199CurrencyName("\u062c\u0631\u0627\u0645\u0627\u064b");
				setArabic1CurrencyPartName("\u0645\u0644\u062c\u0631\u0627\u0645");
				setArabic2CurrencyPartName("\u0645\u0644\u062c\u0631\u0627\u0645\u0627\u0646");
				setArabic310CurrencyPartName("\u0645\u0644\u062c\u0631\u0627\u0645\u0627\u062a");
				setArabic1199CurrencyPartName("\u0645\u0644\u062c\u0631\u0627\u0645\u0627\u064b");
				setPartPrecision(2);
				setIsCurrencyPartNameFeminine(false);
				break;

		}
	}

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region Properties

	/** 
	 Currency ID
	 
	*/
	private int privateCurrencyID;
	public final int getCurrencyID()
	{
		return privateCurrencyID;
	}
	public final void setCurrencyID(int value)
	{
		privateCurrencyID = value;
	}

	/** 
	 Standard Code
	 Syrian Pound: SYP
	 UAE Dirham: AED
	 
	*/
	private String privateCurrencyCode;
	public final String getCurrencyCode()
	{
		return privateCurrencyCode;
	}
	public final void setCurrencyCode(String value)
	{
		privateCurrencyCode = value;
	}

	/** 
	 Is the currency name feminine ( Mua'anath \u0645\u0624\u0646\u062b)
	 \u0644\u064a\u0631\u0629 \u0633\u0648\u0631\u064a\u0629 : \u0645\u0624\u0646\u062b = true
	 \u062f\u0631\u0647\u0645 : \u0645\u0630\u0643\u0631 = false
	 
	*/
	private boolean privateIsCurrencyNameFeminine;
	public final boolean getIsCurrencyNameFeminine()
	{
		return privateIsCurrencyNameFeminine;
	}
	public final void setIsCurrencyNameFeminine(boolean value)
	{
		privateIsCurrencyNameFeminine = value;
	}

	/** 
	 English Currency Name for single use
	 Syrian Pound
	 UAE Dirham
	 
	*/
	private String privateEnglishCurrencyName;
	public final String getEnglishCurrencyName()
	{
		return privateEnglishCurrencyName;
	}
	public final void setEnglishCurrencyName(String value)
	{
		privateEnglishCurrencyName = value;
	}

	/** 
	 English Plural Currency Name for Numbers over 1
	 Syrian Pounds
	 UAE Dirhams
	 
	*/
	private String privateEnglishPluralCurrencyName;
	public final String getEnglishPluralCurrencyName()
	{
		return privateEnglishPluralCurrencyName;
	}
	public final void setEnglishPluralCurrencyName(String value)
	{
		privateEnglishPluralCurrencyName = value;
	}

	/** 
	 Arabic Currency Name for 1 unit only
	 \u0644\u064a\u0631\u0629 \u0633\u0648\u0631\u064a\u0629
	 \u062f\u0631\u0647\u0645 \u0625\u0645\u0627\u0631\u0627\u062a\u064a
	 
	*/
	private String privateArabic1CurrencyName;
	public final String getArabic1CurrencyName()
	{
		return privateArabic1CurrencyName;
	}
	public final void setArabic1CurrencyName(String value)
	{
		privateArabic1CurrencyName = value;
	}

	/** 
	 Arabic Currency Name for 2 units only
	 \u0644\u064a\u0631\u062a\u0627\u0646 \u0633\u0648\u0631\u064a\u062a\u0627\u0646
	 \u062f\u0631\u0647\u0645\u0627\u0646 \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0627\u0646
	 
	*/
	private String privateArabic2CurrencyName;
	public final String getArabic2CurrencyName()
	{
		return privateArabic2CurrencyName;
	}
	public final void setArabic2CurrencyName(String value)
	{
		privateArabic2CurrencyName = value;
	}

	/** 
	 Arabic Currency Name for 3 to 10 units
	 \u062e\u0645\u0633 \u0644\u064a\u0631\u0627\u062a \u0633\u0648\u0631\u064a\u0629
	 \u062e\u0645\u0633\u0629 \u062f\u0631\u0627\u0647\u0645 \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0629
	 
	*/
	private String privateArabic310CurrencyName;
	public final String getArabic310CurrencyName()
	{
		return privateArabic310CurrencyName;
	}
	public final void setArabic310CurrencyName(String value)
	{
		privateArabic310CurrencyName = value;
	}

	/** 
	 Arabic Currency Name for 11 to 99 units
	 \u062e\u0645\u0633 \u0648 \u0633\u0628\u0639\u0648\u0646 \u0644\u064a\u0631\u0629\u064b \u0633\u0648\u0631\u064a\u0629\u064b
	 \u062e\u0645\u0633\u0629 \u0648 \u0633\u0628\u0639\u0648\u0646 \u062f\u0631\u0647\u0645\u0627\u064b \u0625\u0645\u0627\u0631\u0627\u062a\u064a\u0627\u064b
	 
	*/
	private String privateArabic1199CurrencyName;
	public final String getArabic1199CurrencyName()
	{
		return privateArabic1199CurrencyName;
	}
	public final void setArabic1199CurrencyName(String value)
	{
		privateArabic1199CurrencyName = value;
	}

	/** 
	 Decimal Part Precision
	 for Syrian Pounds: 2 ( 1 SP = 100 parts)
	 for Tunisian Dinars: 3 ( 1 TND = 1000 parts)
	 
	*/
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: private Byte privatePartPrecision;
	private int privatePartPrecision;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public Byte getPartPrecision()
	public final int getPartPrecision()
	{
		return privatePartPrecision;
	}
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public void setPartPrecision(Byte value)
	public final void setPartPrecision(int value)
	{
		privatePartPrecision = value;
	}

	/** 
	 Is the currency part name feminine ( Mua'anath \u0645\u0624\u0646\u062b)
	 \u0647\u0644\u0644\u0629 : \u0645\u0624\u0646\u062b = true
	 \u0642\u0631\u0634 : \u0645\u0630\u0643\u0631 = false
	 
	*/
	private boolean privateIsCurrencyPartNameFeminine;
	public final boolean getIsCurrencyPartNameFeminine()
	{
		return privateIsCurrencyPartNameFeminine;
	}
	public final void setIsCurrencyPartNameFeminine(boolean value)
	{
		privateIsCurrencyPartNameFeminine = value;
	}

	/** 
	 English Currency Part Name for single use
	 Piaster
	 Fils
	 
	*/
	private String privateEnglishCurrencyPartName;
	public final String getEnglishCurrencyPartName()
	{
		return privateEnglishCurrencyPartName;
	}
	public final void setEnglishCurrencyPartName(String value)
	{
		privateEnglishCurrencyPartName = value;
	}

	/** 
	 English Currency Part Name for Plural
	 Piasters
	 Fils
	 
	*/
	private String privateEnglishPluralCurrencyPartName;
	public final String getEnglishPluralCurrencyPartName()
	{
		return privateEnglishPluralCurrencyPartName;
	}
	public final void setEnglishPluralCurrencyPartName(String value)
	{
		privateEnglishPluralCurrencyPartName = value;
	}

	/** 
	 Arabic Currency Part Name for 1 unit only
	 \u0642\u0631\u0634
	 \u0647\u0644\u0644\u0629
	 
	*/
	private String privateArabic1CurrencyPartName;
	public final String getArabic1CurrencyPartName()
	{
		return privateArabic1CurrencyPartName;
	}
	public final void setArabic1CurrencyPartName(String value)
	{
		privateArabic1CurrencyPartName = value;
	}

	/** 
	 Arabic Currency Part Name for 2 unit only
	 \u0642\u0631\u0634\u0627\u0646
	 \u0647\u0644\u0644\u062a\u0627\u0646
	 
	*/
	private String privateArabic2CurrencyPartName;
	public final String getArabic2CurrencyPartName()
	{
		return privateArabic2CurrencyPartName;
	}
	public final void setArabic2CurrencyPartName(String value)
	{
		privateArabic2CurrencyPartName = value;
	}

	/** 
	 Arabic Currency Part Name for 3 to 10 units
	 \u0642\u0631\u0648\u0634
	 \u0647\u0644\u0644\u0627\u062a
	 
	*/
	private String privateArabic310CurrencyPartName;
	public final String getArabic310CurrencyPartName()
	{
		return privateArabic310CurrencyPartName;
	}
	public final void setArabic310CurrencyPartName(String value)
	{
		privateArabic310CurrencyPartName = value;
	}

	/** 
	 Arabic Currency Part Name for 11 to 99 units
	 \u0642\u0631\u0634\u0627\u064b
	 \u0647\u0644\u0644\u0629\u064b
	 
	*/
	private String privateArabic1199CurrencyPartName;
	public final String getArabic1199CurrencyPartName()
	{
		return privateArabic1199CurrencyPartName;
	}
	public final void setArabic1199CurrencyPartName(String value)
	{
		privateArabic1199CurrencyPartName = value;
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion
}

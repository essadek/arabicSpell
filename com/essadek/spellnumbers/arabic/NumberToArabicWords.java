package com.essadek.spellnumbers.arabic;

/**
 * @author Essadek
 * Converted and fixed from :
 *     C# project http://www.codeproject.com/KB/cs/NumberToWord.aspx
 *
 */

import java.util.ResourceBundle;

public class NumberToArabicWords {
	public NumberToArabicWords() {
	}

	private String convert1(String num) {

		String sOns = "", sTens = "", sHunds = "", sThousns = "", sTenThousns = "", sHundsThousns = "", sMillion = "", sTenMillion = "", sHundsMillion = "", sMilliard = "";
		if (Float.parseFloat(num) <= 20)
			return GetWords(num);
		for (int i = num.length() - 1; i >= 0; i--) {
			char[] numArray = num.toCharArray();

			switch (i) {
			case 0:
				sOns = String.valueOf(numArray[num.length() - 1 - i]);
				if (getInteger(sOns) <= 0)
					sOns = "";
				break;
			case 1:
				sTens = String.valueOf((getInteger(String.valueOf(numArray[num
						.length() - 1 - i])) * 10));
				if (getInteger(sTens) <= 0)
					sTens = "";
				break;
			case 2:
				sHunds = String.valueOf((getInteger(String.valueOf(numArray[num
						.length() - 1 - i])) * 100));
				if (getInteger(sHunds) <= 0)
					sHunds = "";
				break;
			case 3:
				sThousns = String.valueOf((getInteger(String
						.valueOf(numArray[num.length() - 1 - i])) * 1000));
				if (getInteger(sThousns) <= 0)
					sThousns = "";
				break;
			case 4:
				sTenThousns = String.valueOf((getInteger(String
						.valueOf(numArray[num.length() - 1 - i])) * 10000));
				if (getInteger(sTenThousns) <= 0)
					sTenThousns = "";
				break;
			case 5:
				sHundsThousns = String.valueOf((getInteger(String
						.valueOf(numArray[num.length() - 1 - i])) * 100000));
				if (Float.parseFloat(sHundsThousns) <= 0)
					sHundsThousns = "";
				break;
			case 6:
				sMillion = String.valueOf((getInteger(String
						.valueOf(numArray[num.length() - 1 - i])) * 1000000));
				if (Float.parseFloat(sMillion) <= 0)
					sMillion = "";
				break;
			case 7:
				sTenMillion = String.valueOf((getInteger(String
						.valueOf(numArray[num.length() - 1 - i])) * 10000000));
				if (Float.parseFloat(sTenMillion) <= 0)
					sTenMillion = "";
				break;
			case 8:
				sHundsMillion = String.valueOf((getInteger(String
						.valueOf(numArray[num.length() - 1 - i])) * 100000000));
				if (Float.parseFloat(sHundsMillion) <= 0)
					sHundsMillion = "";
				break;

			case 9:
				sMilliard = String
						.valueOf((getInteger(String.valueOf(numArray[num
								.length() - 1 - i])) * 1000000000));
				if (Float.parseFloat(sMilliard) <= 0)
					sMilliard = "";
				break;
			}
		}

		String sConj = GetWords("AND");
		sConj = sConj + " ";
		for (int i = 0; i < num.length(); i++) {

			switch (i) {
			case 0:
				if (getInteger(sOns) > 0) {
					if (getInteger(sTens) > 0
							&& (getInteger(sTens) + getInteger(sOns)) <= 20) {
						sTens = String.valueOf(getInteger(sTens)
								+ getInteger(sOns));
						sOns = "";
					} else {
						sOns = GetWords(sOns);
						if (sTens != "")
							sOns = sOns + " " + sConj;
					}
				}
				break;
			case 1:
				if (getInteger(sTens) > 0) {
					sTens = GetWords(sTens);
				}
				break;
			case 2:
				if (getInteger(sHunds) > 0) {
					sHunds = GetWords(sHunds);
					if (sOns != "" || sTens != "")
						sHunds = sHunds + " " + sConj;
				}
				break;
			case 3:
				if (getInteger(sThousns) > 0) {
					if (getInteger(sTenThousns) > 0) {
						sTenThousns = String.valueOf(getInteger(sTenThousns)
								+ getInteger(sThousns));
						sThousns = "";
					} else {
						if (getInteger(sThousns) < 3000)
							sThousns = GetWords(sThousns);
						else
							sThousns = GetWords((getInteger(sThousns) / 1000))
									+ " " + GetWords("1000");
						if (sOns != "" || sTens != "" || sHunds != "")
							sThousns = sThousns + " " + sConj;
					}
				}
				break;
			case 4:
				if (getInteger(sTenThousns) > 0) {
					String sTens_10000 = String
							.valueOf(getInteger(sTenThousns) / 1000);
					char[] sTens_10000_array = sTens_10000.toCharArray();
					if (getInteger(sTens_10000) <= 20) {
						sTenThousns = GetWords(sTens_10000) + " "
								+ GetWords("1000");
						if (sOns != "" || sTens != "" || sHunds != "")
							sTenThousns = sTenThousns + " " + sConj;
					} else {
						sTenThousns = GetWords(String
								.valueOf(sTens_10000_array[1]))
								+ " "
								+ sConj
								+ " "
								+ GetWords((String
										.valueOf(sTens_10000_array[0]) + "0"))
								+ " " + GetWords("1000");
						if (sOns != "" || sTens != "" || sHunds != "")
							sTenThousns = sTenThousns + " " + sConj;
					}
				}
				break;
			case 5:
				if (getInteger(sHundsThousns) > 0) {
					sHundsThousns = GetWords((getInteger(sHundsThousns) / 1000));
					if (sTenThousns == "")
						sHundsThousns += " " + GetWords("1000");
					if (sTenThousns != "" || sThousns != "" || sHunds != ""
							|| sTens != "" || sOns != "")
						sHundsThousns = sHundsThousns + " " + sConj;
				}
				break;
			case 6:
				if (getInteger(sMillion) > 0) {
					if (getInteger(sTenMillion) > 0) {
						sTenMillion = String.valueOf(getInteger(sTenMillion)
								+ getInteger(sMillion));
						sMillion = "";
					} else {
						if (sMillion.equals("1000000"))
							sMillion = GetWords("1000000");
						else
							sMillion = GetWords((getInteger(sMillion) / 1000000))
									+ " " + GetWords("1000000");
						if (sHundsThousns != "" || sTenThousns != ""
								|| sThousns != "" || sHunds != ""
								|| sTens != "" || sOns != "")
							sMillion = sMillion + " " + sConj;
					}
				}
				break;
			case 7:
				if (getInteger(sTenMillion) > 0) {
					String sTens_10000000 = String
							.valueOf(getInteger(sTenMillion) / 1000000);
					char[] sTens_10000000_array = sTens_10000000.toCharArray();
					if (getInteger(sTens_10000000) <= 20) {
						sTenMillion = GetWords(sTens_10000000) + " "
								+ GetWords("1000000");
						if (sHundsThousns != "" || sTenThousns != ""
								|| sThousns != "" || sHunds != ""
								|| sTens != "" || sOns != "")
							sTenMillion = sTenMillion + " " + sConj;
					} else {
						sTenMillion = GetWords((sTens_10000000_array[1] + 0))
								+ " "
								+ sConj
								+ " "
								+ GetWords(String
										.valueOf(sTens_10000000_array[0]))
								+ " " + GetWords("1000000"); // GetWords((getInteger(sTenThousns)
																// /
																// 1000).ToString())
						if (sHundsThousns != "" || sTenThousns != ""
								|| sThousns != "" || sHunds != ""
								|| sTens != "" || sOns != "")
							sTenMillion = sTenMillion + " " + sConj;
					}
				}
				break;
			case 8:
				if (getInteger(sHundsMillion) > 0) {
					sHundsMillion = GetWords((getInteger(sHundsMillion) / 1000000));
					if (sTenMillion == "")
						sHundsMillion += " " + GetWords("1000000");
					if (sTenMillion != "" || sMillion != ""
							|| sTenThousns != "" || sThousns != ""
							|| sHunds != "" || sTens != "" || sOns != "")
						sHundsMillion = sHundsMillion + " " + sConj;
				}
				break;

			case 9:
				if (getInteger(sMilliard) > 0) {

					if (sMilliard.equals("1000000000"))
						sMilliard = GetWords("1000000000");
					else
						sMilliard = GetWords((getInteger(sMilliard) / 1000000000))
								+ " " + GetWords("1000000000");
					if (sMilliard != "" || sHundsThousns != ""
							|| sTenThousns != "" || sThousns != ""
							|| sHunds != "" || sTens != "" || sOns != "")
						sMilliard = sMilliard + " " + sConj;

				}
				break;

			}
		}

		return sMilliard + "" + sHundsMillion + "" + sMillion + ""
				+ sTenMillion + "" + sHundsThousns + "" + sThousns + ""
				+ sTenThousns + "" + sHunds + "" + sOns + "" + sTens;
	}

	/**
	 * private String convert(String num) {
	 * 
	 * String sOns = "", sTens = "", sHunds = "", sThousns = "", sTenThousns =
	 * "", sHundsThousns = "", sMillion = "", sTenMillion = "", sHundsMillion =
	 * ""; if (Float.parseFloat(num) <= 20) return GetWords(num); for (int i =
	 * num.length() - 1; i >= 0; i--) { char[] numArray = num.toCharArray();
	 * switch (i) { case 0: sOns = String.valueOf(numArray[num.length() - 1 -
	 * i]); if (getInteger(sOns) <= 0) sOns = ""; break; case 1: sTens =
	 * String.valueOf((getInteger(String.valueOf(numArray[num .length() - 1 -
	 * i])) * 10)); if (getInteger(sTens) <= 0) sTens = ""; break; case 2:
	 * sHunds = String.valueOf((getInteger(String.valueOf(numArray[num .length()
	 * - 1 - i])) * 100)); if (getInteger(sHunds) <= 0) sHunds = ""; break; case
	 * 3: sThousns = String.valueOf((getInteger(String
	 * .valueOf(numArray[num.length() - 1 - i])) * 1000)); if
	 * (getInteger(sThousns) <= 0) sThousns = ""; break; case 4: sTenThousns =
	 * String.valueOf((getInteger(String .valueOf(numArray[num.length() - 1 -
	 * i])) * 10000)); if (getInteger(sTenThousns) <= 0) sTenThousns = "";
	 * break; case 5: sHundsThousns = String.valueOf((getInteger(String
	 * .valueOf(numArray[num.length() - 1 - i])) * 100000)); if
	 * (Float.parseFloat(sHundsThousns) <= 0) sHundsThousns = ""; break; case 6:
	 * sMillion = String.valueOf((getInteger(String
	 * .valueOf(numArray[num.length() - 1 - i])) * 1000000)); if
	 * (Float.parseFloat(sMillion) <= 0) sMillion = ""; break; case 7:
	 * sTenMillion = String.valueOf((getInteger(String
	 * .valueOf(numArray[num.length() - 1 - i])) * 10000000)); if
	 * (Float.parseFloat(sTenMillion) <= 0) sTenMillion = ""; break; case 8:
	 * sHundsMillion = String.valueOf((getInteger(String
	 * .valueOf(numArray[num.length() - 1 - i])) * 100000000)); if
	 * (Float.parseFloat(sHundsMillion) <= 0) sHundsMillion = ""; break; } }
	 * 
	 * String sConj = GetWords("AND"); sConj = " " + sConj; for (int i = 0; i <
	 * num.length(); i++) { switch (i) { case 0:
	 * 
	 * if (getInteger(sOns) > 0) { if (getInteger(sTens) > 0 &&
	 * (getInteger(sTens) + getInteger(sOns)) <= 20) { sTens =
	 * String.valueOf(getInteger(sTens) + getInteger(sOns)); sOns = ""; } else {
	 * sOns = GetWords(sOns); if (sTens != "") // sOns = sOns + " " + sConj;
	 * sOns = sConj + " " + sOns; } } break; case 1: if (getInteger(sTens) > 0)
	 * { sTens = GetWords(sTens); } break; case 2: if (getInteger(sHunds) > 0) {
	 * sHunds = GetWords(sHunds); if (sOns != "" || sTens != "") // sHunds =
	 * sHunds + " " + sConj; sHunds = sConj + " " + sHunds; } break; case 3: if
	 * (getInteger(sThousns) > 0) { if (getInteger(sTenThousns) > 0) {
	 * sTenThousns = String.valueOf(getInteger(sTenThousns) +
	 * getInteger(sThousns)); sThousns = ""; } else { if (getInteger(sThousns) <
	 * 3000) sThousns = GetWords(sThousns); else sThousns = GetWords("1000") +
	 * " " + GetWords((getInteger(sThousns) / 1000)); if (sOns != "" || sTens !=
	 * "" || sHunds != "") // sThousns = sThousns + " " + sConj; sThousns =
	 * sConj + " " + sThousns; } } break; case 4: if (getInteger(sTenThousns) >
	 * 0) { String sTens_10000 = String .valueOf(getInteger(sTenThousns) /
	 * 1000); char[] sTens_10000_array = sTens_10000.toCharArray(); if
	 * (getInteger(sTens_10000) <= 20) { sTenThousns = GetWords("1000") + " " +
	 * GetWords(sTens_10000); if (sOns != "" || sTens != "" || sHunds != "") //
	 * sTenThousns = sTenThousns + " " + sConj; sTenThousns = sConj + " " +
	 * sTenThousns; } else { sTenThousns = GetWords("1000") + " " +
	 * GetWords((String .valueOf(sTens_10000_array[0]) + "0")) + " " + sConj +
	 * " " + GetWords(String.valueOf(sTens_10000_array[1])); if (sOns != "" ||
	 * sTens != "" || sHunds != "") // sTenThousns = sTenThousns + " " + sConj;
	 * sTenThousns = sConj + " " + sTenThousns; } } break; case 5: if
	 * (getInteger(sHundsThousns) > 0) { sHundsThousns =
	 * GetWords((getInteger(sHundsThousns) / 1000)); if (sTenThousns == "")
	 * sHundsThousns += " " + GetWords("1000"); if (sTenThousns != "" ||
	 * sThousns != "" || sHunds != "" || sTens != "" || sOns != "") //
	 * sHundsThousns = sHundsThousns + " " + sConj; sHundsThousns = sConj + " "
	 * + sHundsThousns; } break; case 6: if (getInteger(sMillion) > 0) { if
	 * (getInteger(sTenMillion) > 0) { sTenMillion =
	 * String.valueOf(getInteger(sTenMillion) + getInteger(sMillion)); sMillion
	 * = ""; } else { if (sMillion.equals("1000000")) sMillion =
	 * GetWords("1000000"); else sMillion = GetWords("1000000") + " " +
	 * GetWords((getInteger(sMillion) / 1000000)); if (sHundsThousns != "" ||
	 * sTenThousns != "" || sThousns != "" || sHunds != "" || sTens != "" ||
	 * sOns != "") // sMillion = sMillion + " " + sConj; sMillion = sConj + " "
	 * + sMillion; } } break; case 7: if (getInteger(sTenMillion) > 0) { String
	 * sTens_10000000 = String .valueOf(getInteger(sTenMillion) / 1000000);
	 * char[] sTens_10000000_array = sTens_10000000.toCharArray(); if
	 * (getInteger(sTens_10000000) <= 20) { sTenMillion =
	 * GetWords(sTens_10000000); if (sHundsThousns != "" || sTenThousns != "" ||
	 * sThousns != "" || sHunds != "" || sTens != "" || sOns != "") //
	 * sTenMillion = sTenMillion + " " + sConj; sTenMillion = sConj + " " +
	 * sTenMillion; } else { sTenMillion = GetWords("1000000") + " " +
	 * GetWords(String .valueOf(sTens_10000000_array[0])) + " " + sConj + " " +
	 * GetWords(String .valueOf((sTens_10000000_array[1]) + "0")); if
	 * (sHundsThousns != "" || sTenThousns != "" || sThousns != "" || sHunds !=
	 * "" || sTens != "" || sOns != "") // sTenMillion = sTenMillion + " " +
	 * sConj; sTenMillion = sConj + " " + sTenMillion; } } break; case 8: if
	 * (getInteger(sHundsMillion) > 0) { sHundsMillion =
	 * GetWords((getInteger(sHundsMillion) / 1000000)); if (sTenMillion == "")
	 * sHundsMillion += " " + GetWords("1000000"); if (sTenMillion != "" ||
	 * sMillion != "" || sTenThousns != "" || sThousns != "" || sHunds != "" ||
	 * sTens != "" || sOns != "") // sHundsMillion = sHundsMillion + " " +
	 * sConj; sHundsMillion = sConj + " " + sHundsMillion; } break; } }
	 * 
	 * return sHundsMillion + "" + sMillion + "" + sTenMillion + "" +
	 * sHundsThousns + "" + sThousns + "" + sTenThousns + "" + sHunds + "" +
	 * sOns + "" + sTens;
	 * 
	 * 
	 * }
	 **/

	public String GetWords(String digit) {
		String arabicWord = "";
		ResourceBundle props = ResourceBundle
				.getBundle("com.essadek.spellnumbers.arabic.ArabicNumbers");
		arabicWord = props.getString(digit);
		return arabicWord;
	}

	public String GetWords(Integer digit) {
		String arabicWord = "";
		ResourceBundle props = ResourceBundle
				.getBundle("com.essadek.spellnumbers.arabic.ArabicNumbers");
		arabicWord = props.getString(String.valueOf(digit));
		return arabicWord;
	}

	public int getInteger(String value) {
		if (value == null || "".equals(value)) {
			return 0;
		} else {
			return Integer.parseInt(value);
		}
	}

	public String getNumberInArabic(String number) {
		String numInArabic = "";
		String[] numberArray = null;
		String decimalPart = "";
		try {
			System.out.println("Inside getNumberInArabic:" + number);
			if (number != null) {
				if (number.contains(".")) {
					numberArray = number.split("\\.");
				} else {
					numberArray = new String[1];
					numberArray[0] = number;
				}
				System.out.println("NumberArray Length:" + numberArray.length);
				if (numberArray.length > 1) {
					decimalPart = numberArray[1];
					if (decimalPart.length() > 3) {
						decimalPart = decimalPart.substring(0, 2);
					}
				}
				if (!"".equals(decimalPart) && !"00".equals(decimalPart)) {
					numInArabic = GetWords("AND") + this.convert1(decimalPart)
							+ GetWords("CENTIME");
				}
				numInArabic = this.convert1(numberArray[0]) + " "
						+ GetWords("DINAR") + " " + numInArabic;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return numInArabic;
	}

}
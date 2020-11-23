package com.cotechnoe.ontocase.eli.util;

public class StringConvert {
	private static String convert_old(String uneChaineDeChar){
		return uneChaineDeChar.
				replaceFirst("^0", "_0").replaceFirst("^1", "_1").replaceFirst("^2", "_2").
				replaceFirst("^3", "_3").replaceFirst("^4", "_4").replaceFirst("^5", "_5").
				replaceFirst("^6", "_6").replaceFirst("^7", "_7").replaceFirst("^8", "_8").
				replaceFirst("^9", "_9").replace('\'', '-').replace('.', '-').replace(',', '-').
				replace(':', '-').replace(' ', '-').replace("/", "-").replace("\\", "-").
				replace(';', '-').replace("|", "-").replace("@", "-").
				replace('{', '-').replace('=', '-').replace('&', '-').replace('?', '-').
				replace("%", "-").replace('}', '-').replace('[', '-').replace(']', '-').
				replace('*', '-').replace("(", "-").replace(")", "-").replace('<', '-').
				replace('$', '-').replace('>', '-').replace('¸', '-').replace('¾', '-').
				replace('½', '-').replace('¼', '-').replace('¬', '-').replace('±', '-').
				replace('°', '-').replace('«', '-').replace('»', '-').replace('~', '-').
				replace("¸", "-").replace("`", "-").replace("\"", "-").replace("+", "-").
				replace("é", "e").replace("è", "e").replace("ë", "e").replace("ê", "e").
				replace("ò", "o").replace("ö", "o").replace("ô", "o").replace("ç", "c").
				replace("ù", "u").replace("ü", "u").replace("û", "u").
				replace("à", "a").replace("ä", "a").replace("â", "a").		
				replace("É", "E").replace("È", "E").replace("Ë", "E").replace("Ê", "E").
				replace("Ò", "O").replace("Ö", "O").replace("Ô", "O").
				replace("Ù", "U").replace("Ü", "U").replace("Û", "U").
				replace("À", "A").replace("Ä", "A").replace("Â", "A");
	}
	public static String convert(String uneChaineDeChar){
		if (uneChaineDeChar == null) return null;
		return uneChaineDeChar.
				replaceFirst("^0", "_0").replaceFirst("^1", "_1").replaceFirst("^2", "_2").
				replaceFirst("^3", "_3").replaceFirst("^4", "_4").replaceFirst("^5", "_5").
				replaceFirst("^6", "_6").replaceFirst("^7", "_7").replaceFirst("^8", "_8").
				replaceFirst("^9", "_9").replace("é", "e").replace("è", "e").replace("ë", "e").replace("ê", "e").
				replace("ò", "o").replace("ö", "o").replace("ô", "o").replace("ç", "c").
				replace("ù", "u").replace("ü", "u").replace("û", "u").replace("Ç", "C").
				replace("à", "a").replace("ä", "a").replace("â", "a").replace(' ','_').	
				replace("É", "E").replace("È", "E").replace("Ë", "E").replace("Ê", "E").
				replace("Ò", "O").replace("Ö", "O").replace("Ô", "O").
				replace("Ù", "U").replace("Ü", "U").replace("Û", "U").
				replace("À", "A").replace("Ä", "A").replace("Â", "A").replaceAll("[^a-zA-Z0-9_]", "_");		
	}

}

/*
	@author loriacarlos@gmail.com
*/
package kokoslan.ast;
import java.util.*;
import java.io.*;

public class KoKoListValue extends ArrayList<KoKoValue> implements KoKoValue{
	public KoKoListValue(List<KoKoValue> list){
		super(list);
	}
	public KoKoListValue(){
		super();
	}
}
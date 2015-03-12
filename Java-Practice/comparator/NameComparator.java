import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


public class NameComparator implements Comparator{  

public int compare(Object o1, Object o2) {
	Student s1=(Student)o1;  
	Student s2=(Student)o2;  
	  
	return s1.name.compareTo(s2.name);  
}

}  
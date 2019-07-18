import java.util.HashMap;

public class HashMapCalculator {
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2)
	{
		int commonPairs = 0;
		for(String key : map1.keySet())
		{
			if(map2.containsKey(key))
			{
				if(map1.get(key) == map2.get(key))
					commonPairs++;
			}
		}
		
		return commonPairs;
	}
}

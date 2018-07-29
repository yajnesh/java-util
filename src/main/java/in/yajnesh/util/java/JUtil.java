package in.yajnesh.util.java;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Collection of common java util methods
 *
 * @author Yajnesh T
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class JUtil {

    /**
     * Empty string, literally ""
     */
    public static final String EMPTY_STRING = "";

    /**
     * Safely get an item from array
     * <p>
     * same as calling {@link #get(Object[], int, Object) get(array,index,null)}
     * </p>
     *
     * @param array The array
     * @param index the index at which the item needs to be fetched
     * @return item if found, null otherwise
     * @see #get(Object[], int, Object)  get(array,index,defaultValue)
     */

    public static <T> T get(T[] array, int index) {
        return get(array, index, null);
    }

    /**
     * Safely get an item from array
     *
     * @param array        The array
     * @param index        the index at which the item needs to be fetched
     * @param defaultValue in case of array is null or index out of bound, return this value
     * @return item if found, defaultValue otherwise
     * @see #get(Object[], int)  get(array,index)
     */

    public static <T> T get(T[] array, int index, T defaultValue) {
        if (array == null) {
            return defaultValue;
        }
        if (index < 0 || index >= size(array)) {
            return defaultValue;
        }
        return array[index];
    }

    /**
     * Safely get an item from list
     * <p>
     * same as calling {@link #get(List, int, Object) get(list,index,null)}
     * </p>
     *
     * @param list  The list
     * @param index the index at which the item needs to be fetched
     * @return item if found, null otherwise
     * @see #get(List, int, Object) get(list,index,defaultValue)
     */

    public static <T> T get(List<T> list, int index) {
        return get(list, index, null);
    }

    /**
     * Safely get an item from list
     *
     * @param list         The list
     * @param index        the index at which the item needs to be fetched
     * @param defaultValue in case of array is null or index out of bound, return this value
     * @return item if found, defaultValue otherwise
     * @see #get(List, int) get(list,index)
     */

    public static <T> T get(List<T> list, int index, T defaultValue) {
        if (list == null) {
            return defaultValue;
        }
        if (index < 0 || index >= size(list)) {
            return defaultValue;
        }
        return list.get(index);
    }

    /**
     * Safely get a character from String
     * <p>
     * same as calling {@link #get(String, int, Character) get(string,index,null)}
     * </p>
     *
     * @param s     The String
     * @param index the index at which the character needs to be fetched
     * @return item if found, null otherwise
     * @see #get(String, int, Character) get(string,index,defaultValue)
     */

    public static Character get(String s, int index) {
        return get(s, index, null);
    }

    /**
     * Safely get a character from String
     *
     * @param s            The String
     * @param index        the index at which the character needs to be fetched
     * @param defaultValue in case of string is null or index out of bound, return this value
     * @return item if found, defaultValue otherwise
     * @see #get(String, int) get(string,index)
     */
    public static Character get(String s, int index, Character defaultValue) {
        if (isEmpty(s)) {
            return defaultValue;
        }
        if (index < 0 || index >= size(s)) {
            return defaultValue;
        }
        return s.charAt(index);
    }


    /**
     * Safely get a character from CharSequence
     * <p>
     * same as calling {@link #get(CharSequence, int, Character) get(charsequence,index,null)}
     * </p>
     *
     * @param cs    The CharSequence
     * @param index the index at which the character needs to be fetched
     * @return item if found, null otherwise
     * @see #get(CharSequence, int, Character) get(charsequence,index,defaultValue)
     */
    public static Character get(CharSequence cs, int index) {
        return get(cs, index, null);
    }

    /**
     * Safely get a character from CharSequence
     *
     * @param cs           The CharSequence
     * @param index        the index at which the character needs to be fetched
     * @param defaultValue in case of charSequence is null or index out of bound, return this value
     * @return item if found, defaultValue otherwise
     * @see #get(CharSequence, int) get(charsequence,index)
     */
    public static Character get(CharSequence cs, int index, Character defaultValue) {
        if (isEmpty(cs)) {
            return defaultValue;
        }
        if (index < 0 || index >= size(cs)) {
            return defaultValue;
        }
        return cs.charAt(index);
    }


    /**
     * Safely get last item from array
     * <p>
     * same as calling {@link #getLastItem(Object[], Object) getLastItem(array,null)}
     * </p>
     *
     * @param array The array
     * @return item if found, null otherwise
     * @see #getLastItem(Object[], Object)  getLastItem(array,defaultValue)
     */
    public static <T> T getLastItem(T[] array) {
        return getLastItem(array, null);
    }


    /**
     * Safely get an item from array
     *
     * @param array        The array
     * @param defaultValue in case of array is null or empty, return this value
     * @return item if found, defaultValue otherwise
     * @see #getLastItem(Object[])  getLastItem(array)
     */
    public static <T> T getLastItem(T[] array, T defaultValue) {
        return get(array, size(array) - 1, defaultValue);
    }


    /**
     * Safely get last item from list
     * <p>
     * same as calling {@link #getLastItem(List, Object) getLastItem(list,null)}
     * </p>
     *
     * @param list The list
     * @return item if found, null otherwise
     * @see #getLastItem(List, Object)  getLastItem(list,defaultValue)
     */
    public static <T> T getLastItem(List<T> list) {
        return getLastItem(list, null);
    }


    /**
     * Safely get an item from list
     *
     * @param list         The list
     * @param defaultValue in case of list is null or empty, return this value
     * @return item if found, defaultValue otherwise
     * @see #getLastItem(List)  getLastItem(list)
     */
    public static <T> T getLastItem(List<T> list, T defaultValue) {
        return get(list, size(list) - 1, defaultValue);
    }

    /**
     * Safely get last item from string
     * <p>
     * same as calling {@link #getLastItem(String, Character) getLastItem(string,null)}
     * </p>
     *
     * @param s The String
     * @return item if found, null otherwise
     * @see #getLastItem(String, Character)  getLastItem(string,defaultValue)
     */
    public static Character getLastItem(String s) {
        return getLastItem(s, null);
    }

    /**
     * Safely get last item from string
     *
     * @param s            The String
     * @param defaultValue in case of string is null or empty, return this value
     * @return item if found, defaultValue otherwise
     * @see #getLastItem(String)  getLastItem(string)
     */
    public static Character getLastItem(String s, Character defaultValue) {
        return get(s, size(s) - 1, defaultValue);
    }

    /**
     * Safely get last item from charSequence
     * <p>
     * same as calling {@link #getLastItem(CharSequence, Character) getLastItem(charSequence,null)}
     * </p>
     *
     * @param cs The CharSequence
     * @return item if found, null otherwise
     * @see #getLastItem(CharSequence, Character)  getLastItem(charSequence,defaultValue)
     */
    public static Character getLastItem(CharSequence cs) {
        return getLastItem(cs, null);
    }

    /**
     * Safely get last item from charSequence
     *
     * @param cs           The CharSequence
     * @param defaultValue in case of charSequence is null or empty, return this value
     * @return item if found, null otherwise
     * @see #getLastItem(CharSequence, Character)  getLastItem(charSequence,defaultValue)
     */
    public static Character getLastItem(CharSequence cs, Character defaultValue) {
        return get(cs, size(cs) - 1, defaultValue);
    }


    /**
     * Is the array null or empty?
     *
     * @param array The array
     * @return true if the array is null or empty
     * @see #isEmpty(Collection)
     * @see #isEmpty(String)
     * @see #isEmpty(CharSequence)
     * @see #isEmpty(Map)
     */
    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length < 1;
    }

    /**
     * Is the Collection null or empty?
     *
     * @param collection The collection
     * @return true if the collection is null or empty
     * @see #isEmpty(Object[])
     * @see #isEmpty(String)
     * @see #isEmpty(CharSequence)
     * @see #isEmpty(Map)
     */
    public static <T> boolean isEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * Is the String null or empty?
     *
     * @param s The string
     * @return true if the string is null or empty
     * @see #isEmpty(Collection)
     * @see #isEmpty(Object[])
     * @see #isEmpty(CharSequence)
     * @see #isEmpty(Map)
     */
    public static boolean isEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }


    /**
     * Is the CharSequence null or empty?
     *
     * @param cs The CharSequence
     * @return true if the string is null or empty
     * @see #isEmpty(Collection)
     * @see #isEmpty(Object[])
     * @see #isEmpty(String)
     * @see #isEmpty(Map)
     */
    public static boolean isEmpty(CharSequence cs) {
        return isEmpty(cs.toString());
    }

    /**
     * Is the Map null or empty?
     *
     * @param m The map
     * @return true if the string is null or empty
     * @see #isEmpty(Collection)
     * @see #isEmpty(Object[])
     * @see #isEmpty(String)
     * @see #isEmpty(CharSequence)
     */
    public static <K, V> boolean isEmpty(Map<K, V> m) {
        return m == null || m.isEmpty();
    }


    /**
     * Get the size of the collection
     *
     * @param collection The collection
     * @return 0 if the collection is null, actual size of the collection otherwise
     * @see #size(Object[])
     * @see #size(String)
     * @see #size(CharSequence)
     */
    public static <T> int size(Collection<T> collection) {
        return collection == null ? 0 : collection.size();
    }


    /**
     * Get the size of the array
     *
     * @param array The array
     * @return 0 if the array is null, actual size of the array otherwise
     * @see #size(Collection)
     * @see #size(String)
     * @see #size(CharSequence)
     */
    public static <T> int size(T[] array) {
        return array == null ? 0 : array.length;
    }

    /**
     * Get the size of the string
     *
     * @param s The string
     * @return 0 if the string is null or empty, actual size of the string otherwise
     * @see #size(Collection)
     * @see #size(Object[])
     * @see #size(CharSequence)
     */
    public static int size(String s) {
        return s == null ? 0 : getString(s).length();
    }

    /**
     * Get the size of the charSequence
     *
     * @param cs The charSequence
     * @return 0 if the charSequence is null or empty, actual size of the charSequence otherwise
     * @see #size(Collection)
     * @see #size(Object[])
     * @see #size(String)
     */
    public static int size(CharSequence cs) {
        return cs == null ? 0 : getString(cs).length();
    }


    /**
     * Are two strings equal?
     *
     * @param a first string
     * @param b second string
     * @return 1) false, if either is null <br/>2) false, if both are null <br/>3) false, if string do not match <br/>4) true, otherwise
     */
    public static boolean equals(Object a, Object b) {
        //noinspection SimplifiableIfStatement
        if (a == null || b == null) {//for us null is not equal to null
            return false;
        }
        return a.equals(b);
    }

    /**
     * Are two strings equal ignoring case?
     *
     * @param a first string
     * @param b second string
     * @return 1) false, if either is null <br/>2) false, if both are null <br/>3) false, if string do not match <br/>4) true, otherwise
     */
    public static boolean equalsRelaxed(Object a, Object b) {
        String as = getString(a);
        //noinspection SimplifiableIfStatement
        if (as == null) {
            return false;
        }
        return as.equalsIgnoreCase(getString(b));
    }


    /**
     * Does source has searchTerm in it?
     *
     * @param source     the source to be searched
     * @param searchTerm the term to search
     * @return true if searchTerm is found in source, otherwise false. Also false if either or both params are null
     */
    public static boolean contains(String source, String searchTerm) {
        //noinspection SimplifiableIfStatement
        if (isAnyEmpty(source, searchTerm)) {//for us null is not equal to null
            return false;
        } else {
            return source.contains(searchTerm);
        }
    }

    /**
     * Does source has searchTerm in it ignoring case?
     *
     * @param source     the source to be searched
     * @param searchTerm the term to search
     * @return true if searchTerm is found in source, otherwise false. Also false if either or both params are null
     */
    public static boolean containsIgnoreCase(String source, String searchTerm) {
        if (isAnyEmpty(source, searchTerm)) {
            return false;
        }

        final int length = size(searchTerm);
//        if (length == 0)
//            return true; // Empty string is contained

        final char firstLo = Character.toLowerCase(get(searchTerm, 0));
        final char firstUp = Character.toUpperCase(get(searchTerm, 0));

        for (int i = size(source) - length; i >= 0; i--) {
            // Quick check before calling the more expensive regionMatches() method:
            final char ch = get(source, i);
            if (ch != firstLo && ch != firstUp)
                continue;

            if (source.regionMatches(true, i, searchTerm, 0, length))
                return true;
        }

        return false;
    }


    /**
     * Integer i=typeCast(object,Integer.class);
     *
     * @param o     Object to be casted
     * @param clazz casting type
     * @return Casted Object, null if failed
     */
    public static <T> T typeCast(Object o, Class<T> clazz) {
        if (clazz != null && o != null && clazz.isAssignableFrom(o.getClass())) {
            //noinspection unchecked
            return (T) o;
        }
        return null;
    }

    /**
     * Get string out of Collection
     *
     * @param message    Optional prefix text
     * @param collection The collection
     * @return Stringified collection
     */
    public static String stringify(String message, Collection collection) {
        StringBuilder sb = new StringBuilder();
        try {
            if (!isEmpty(message)) {
                sb.append(message).append(":\n");
            }

            if (collection != null) {
                for (Object o : collection) {
                    sb.append("e= ").append(o);
                }
            }
            return sb.toString();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get string out of Collection
     * <p>
     * same as calling {@link #stringify(String, Collection) stringify(null,collection)}
     * </p>
     *
     * @param collection The collection
     * @return Stringified collection
     */
    public static String stringify(Collection collection) {
        return stringify(null, collection);
    }

    /**
     * Get string out of Map
     *
     * @param message Optional prefix text
     * @param map     The Map
     * @return Stringified map
     */
    public static String stringify(String message, Map map) {
        StringBuilder sb = new StringBuilder();
        try {
            if (!isEmpty(message)) {
                sb.append(message).append(":\n");
            }

            if (map != null) {
                for (Object o : map.keySet()) {
                    sb.append("key = ").append(o).append(" , value = ").append(map.get(o));
                }
            }
            return sb.toString();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * Get string out of Map
     * <p>
     * same as calling {@link #stringify(String, Map) stringify(null,collection)}
     * </p>
     *
     * @param map The map
     * @return Stringified map
     */
    public static String stringify(Map map) {
        return stringify(null, map);
    }

    /**
     * Is any object passed is null or empty.<br/>
     * <p>
     * Usage: <code>isAnyEmpty(string1,string2,string3,string4)</code><br/>
     * Usage: <code>isAnyEmpty(collection,map,string,charSequence,object)</code>
     * </p>
     *
     * @param objects objects to be checked
     * @return true, if any of the object passed is null or empty, false otherwise
     */
    public static boolean isAnyEmpty(Object... objects) {
        if (objects == null || size(objects) == 0) {
            return true;
        }

        for (Object o : objects) {
            if (o == null) {
                return true;
            } else {
                if (o instanceof Collection) {
                    if (isEmpty((Collection) o)) {
                        return true;
                    }
                } else if (o instanceof Map) {
                    if (isEmpty((Map) o)) {
                        return true;
                    }
                } else if (o instanceof String) {
                    if (isEmpty((String) o)) {
                        return true;
                    }
                } else if (o instanceof CharSequence) {
                    if (isEmpty((CharSequence) o)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Are all the object passed is null or empty.<br/>
     * <p>
     * Usage: <code>isAnyEmpty(string1,string2,string3,string4)</code><br/>
     * Usage: <code>isAnyEmpty(collection,map,string,charSequence,object)</code>
     * </p>
     *
     * @param objects objects to be checked
     * @return true, if all of the object passed is null or empty, false otherwise
     */
    public static boolean isAllEmpty(Object... objects) {
        if (objects == null || size(objects) == 0) {
            return true;
        }
        for (Object o : objects) {
            if (o != null) {
                if (o instanceof Collection) {
                    if (!isEmpty((Collection) o)) {
                        return false;
                    }
                } else if (o instanceof Map) {
                    if (!isEmpty((Map) o)) {
                        return false;
                    }
                } else if (o instanceof String) {
                    if (!isEmpty((String) o)) {
                        return false;
                    }
                } else if (o instanceof CharSequence) {
                    if (!isEmpty((CharSequence) o)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * Get string from an object
     *
     * @param o The object
     * @return <code>null</code> if object is null, otherwise a string representation of the object
     */

    public static String getString(Object o) {
        if (o == null) {
            return null;
        }
        String s = o.toString();

        if (s == null) {
            return null;
        }
        return s.trim();
    }

    /**
     * Get string from an object
     *
     * @param o The object
     * @return empty string if object is null, otherwise a string representation of the object
     */
    public static String getStringSafe(Object o) {
        String s = getString(o);
        return s == null ? EMPTY_STRING : s;
    }

    /**
     * Get empty mutable hashMap
     *
     * @return mutable hashMap
     */
    public static Map<String, String> emptyMapMutable() {
        return new HashMap<>();
    }

    /**
     * Get empty mutable hashSet
     *
     * @return mutable hashSet
     */
    public static Set<String> emptySetMutable() {
        return new HashSet<>();
    }

    /**
     * Safe url encode. <br/>
     * Translates a string into {@code x-www-form-urlencoded}
     * format.
     *
     * @param s   String to UrlEncode
     * @param enc The name of a supported character encoding.
     * @return Url encoded string
     */
    public static String safeUrlEncode(String s, String enc) {
        try {
            return java.net.URLEncoder.encode(s, enc);
        } catch (Throwable t) {
            try {
                //noinspection deprecation
                return java.net.URLEncoder.encode(s);
            } catch (Throwable tFailSafe) {
                return s;
            }
        }
    }
}

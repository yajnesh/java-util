package in.yajnesh.util.java;

/*
This file is part of JavaUtils.

JavaUtils is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
any later version.

Foobar is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with JavaUtils. If not, see <https://www.gnu.org/licenses/>.

(ɔ) Yajnesh T
*/

/**
 * Collection of number util methods
 *
 * @author Yajnesh T
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class NumberUtil {

    /**
     * Get Integer from String
     *
     * @param number string representation of number Eg. <code>"1234"</code>
     * @return an Integer object holding the value represented by the string argument, null in case of failure
     */
    public static Integer getInt(String number) {
        try {
            return JUtil.isEmpty(number) ? null : Integer.valueOf(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get integer from String
     *
     * @param number string representation of number Eg. <code>"1234"</code>
     * @return an int holding the value represented by the string argument, 0 in case of failure
     */
    public static int getIntSafe(String number) {
        Integer i = getInt(number);
        return i == null ? 0 : i;
    }

    /**
     * Get Double from String
     *
     * @param number string representation of number Eg. <code>"1234.56"</code>
     * @return a Double object holding the value represented by the string argument, null in case of failure
     */
    public static Double getDouble(String number) {
        try {
            return JUtil.isEmpty(number) ? null : Double.valueOf(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get double from String
     *
     * @param number string representation of number Eg. <code>"1234.56"</code>
     * @return a double holding the value represented by the string argument, 0 in case of failure
     */
    public static double getDoubleSafe(String number) {
        Double i = getDouble(number);
        return i == null ? 0 : i;
    }

    /**
     * Get Long from String
     *
     * @param number string representation of number Eg. <code>"1234"</code>
     * @return a Long object holding the value represented by the string argument, null in case of failure
     */
    public static Long getLong(String number) {
        try {
            return JUtil.isEmpty(number) ? null : Long.valueOf(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get long from String
     *
     * @param number string representation of number Eg. <code>"1234"</code>
     * @return a long holding the value represented by the string argument, 0 in case of failure
     */
    public static long getLongSafe(String number) {
        Long i = getLong(number);
        return i == null ? 0 : i;
    }
}

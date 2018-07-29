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
 * Collection of time util methods
 *
 * @author Yajnesh T
 */

@SuppressWarnings({"WeakerAccess", "unused"})
public class TimeUtil {

    /**
     * Get two digit value from input value
     *
     * @param value value
     * @return 1) 2 -> 02 <br/>2) 20 -> 20
     */
    public static String getTwoDigitValue(long value) {
        StringBuilder result = new StringBuilder();

        if (value < 10) {
            result.append('0');
        }
        result.append(value);

        return result.toString();
    }


}

/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created on 2019-10-16
 *
 * @author chenqi
 */
public class Test {
  public static void main(String[] args) {

    Date startTime = new Date();

    Date endTime = new Date();
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(endTime);
    calendar.add(Calendar.DATE, 1);
    endTime = calendar.getTime();

    int validTime = 3600 * 24;

    calendar.setTime(startTime);
    calendar.add(Calendar.SECOND,validTime);
    startTime = calendar.getTime();

    System.out.println(startTime);
    System.out.println(endTime);
    System.out.println(startTime.compareTo(endTime));
  }


}

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
package org.apache.ibatis.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 将JDBC和java类型之间的相互转化
 * 1:PreparedStatement对象为参数占位符赋值，需要调用PreparedStatement中的setXXX()方法
 * 将java类型转化成JDBC类型并为参数占位符赋值
 * 2：执行sql语句获取ResultSet对象，需要调用ResultSet对象的getXXX()方法获取值
 * 此时需要将JDBC类型转化成java类型
 * @author Clinton Begin
 */
public interface TypeHandler<T> {
  /**为PreparedStatement对象设置参数*/
  void setParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException;

  /**根据列名称获取该列的值*/
  T getResult(ResultSet rs, String columnName) throws SQLException;

  /**根据列索引获取该列的值*/
  T getResult(ResultSet rs, int columnIndex) throws SQLException;

  /**获取存储过程调用结果*/
  T getResult(CallableStatement cs, int columnIndex) throws SQLException;

}
